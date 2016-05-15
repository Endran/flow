/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.core

import nl.endran.core.collaborators.Engine
import timber.log.Timber

class Core(vararg private val engines: Engine) : Engine {

    override fun start() {
        Timber.i("Start Core")
        engines.forEach { it.start() }
    }

    override fun stop() {
        Timber.i("Stop Core")
        engines.forEach { it.stop() }
    }
}