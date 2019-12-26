package com.hujz.mvvmrhinedemo

import android.app.Application
import android.content.Context
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

/**
 * <pre>
 *     @author : 18000
 *     time   : 2019/12/26
 *     desc   :
 * </pre>
 */
class App : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        bind<Context>() with singleton { this@App }

    }


}