/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.skeleton.fragments.game

import nl.endran.skeleton.mvp.BaseFragmentPresenter
import javax.inject.Inject

class GameFragmentPresenter @Inject constructor()
: BaseFragmentPresenter<GameFragmentPresenter.ViewModel>() {

    interface ViewModel {
    }

    override fun onStart() {
        // Use this callback to start some operation, like database a query
    }

    override fun onStop() {
        // Stop any running operation that might be busy in the background
    }
}
