package `in`.mvpstarter.sample.injection.component

import android.app.Application
import android.content.Context

import javax.inject.Singleton

import dagger.Component
import `in`.mvpstarter.sample.data.DataManager
import `in`.mvpstarter.sample.data.remote.MvpStarterService
import `in`.mvpstarter.sample.injection.ApplicationContext
import `in`.mvpstarter.sample.injection.module.ApplicationModule

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun mvpBoilerplateService(): MvpStarterService
}
