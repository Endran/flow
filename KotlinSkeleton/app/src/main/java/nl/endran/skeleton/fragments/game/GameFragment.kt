/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.skeleton.fragments.game

import nl.endran.skeleton.fragments.game.GameFragmentPresenter
import nl.endran.skeleton.fragments.game.GameFragmentView
import nl.endran.skeleton.injections.AppComponent
import nl.endran.skeleton.mvp.BaseFragment

class GameFragment : BaseFragment<GameFragmentPresenter.ViewModel, GameFragmentPresenter, GameFragmentView>() {

    companion object {
        fun createInstance() = GameFragment()
    }

    override fun createView(appComponent: AppComponent): GameFragmentView {
        return appComponent.gameFragmentView
    }

    override fun createPresenter(appComponent: AppComponent): GameFragmentPresenter {
        return appComponent.gameFragmentPresenter
    }
}
