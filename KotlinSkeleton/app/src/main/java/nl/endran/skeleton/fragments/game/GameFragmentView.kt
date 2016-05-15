/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.skeleton.fragments.game

import android.view.View
import nl.endran.skeleton.R
import nl.endran.skeleton.mvp.BaseFragmentView
import javax.inject.Inject

class GameFragmentView @Inject constructor() : BaseFragmentView<GameFragmentPresenter.ViewModel, GameFragmentPresenter>() {

    override fun getViewId() = R.layout.fragment_game

    override fun prepare(rootView: View) {
    }

    override fun getViewModel() = object : GameFragmentPresenter.ViewModel {
    }
}
