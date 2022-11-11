package com.example.rockpaperscissors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

enum class GameOutcome {
    ROCK,
    PAPER,
    SCISSORS
}

class MainViewModel : ViewModel() {

    private val outcomes = GameOutcome.values()

    private val _playerOutcome = MutableLiveData<String>()
    val playerOutcome: LiveData<String>
        get() = _playerOutcome

    private val _computerOutcome = MutableLiveData<String>()
    val computerOutcome: LiveData<String>
        get() = _computerOutcome

    private val _result = MutableLiveData<String>()
    val result : LiveData<String>
    get() = _result

    init {
        _playerOutcome.value="_"
        _computerOutcome.value="_"
        _result.value = "?"
    }

    fun playGame (playerOutcome : Int)
    {
        _playerOutcome.value = when (playerOutcome) {
            1 -> GameOutcome.ROCK.name
            2 -> GameOutcome.PAPER.name
            3 -> GameOutcome.SCISSORS.name
            else -> GameOutcome.ROCK.name
        }
        _computerOutcome.value = outcomes[Random.nextInt(3)].name

        when (_playerOutcome.value) {
            GameOutcome.ROCK.name -> {
                when (_computerOutcome.value) {
                    GameOutcome.ROCK.name -> gameTie()
                    GameOutcome.PAPER.name -> computerWins()
                    GameOutcome.SCISSORS.name -> playerWins()
                    else -> {}
                }
            }

            GameOutcome.PAPER.name -> {
                when (_computerOutcome.value) {
                    GameOutcome.ROCK.name -> playerWins()
                    GameOutcome.PAPER.name -> gameTie()
                    GameOutcome.SCISSORS.name -> computerWins()
                    else -> {}
                }
            }

            GameOutcome.SCISSORS.name -> {
                when (_computerOutcome.value) {
                    GameOutcome.ROCK.name -> computerWins()
                    GameOutcome.PAPER.name -> playerWins()
                    GameOutcome.SCISSORS.name -> gameTie()
                    else -> {}
                }
            }

            else -> {}
        }
    }

    private fun playerWins() {
        _result.value = "You Win!"
    }

    private fun computerWins() {
        _result.value = "Computer Won"
    }

    private fun gameTie() {
        _result.value = "Tie"
    }
}