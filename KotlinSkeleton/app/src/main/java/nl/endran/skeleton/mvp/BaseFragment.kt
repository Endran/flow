/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.skeleton.mvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nl.endran.skeleton.getAppComponent
import nl.endran.skeleton.injections.AppComponent

abstract class BaseFragment<VM, P : BaseFragmentPresenter<VM>, V : BaseFragmentView<VM, P>> : Fragment() {

    var view: V? = null
    var presenter: P? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = createView(inflater!!.context.getAppComponent())
        return view!!.inflate(inflater, container!!, savedInstanceState)
    }

    override fun onViewCreated(androidView: View?, savedInstanceState: Bundle?) {
        view?.androidViewReady()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        view?.deflate()
        view = null
    }

    override fun onResume() {
        super.onResume()
        if (view != null) {
            presenter = createPresenter(context.getAppComponent())
            view?.start(presenter!!)
        }
    }

    override fun onPause() {
        super.onPause()
        view?.stop()
        presenter = null
    }

    abstract fun createView(appComponent: AppComponent): V
    abstract fun createPresenter(appComponent: AppComponent): P
}
