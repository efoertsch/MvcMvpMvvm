package com.fisincorporated.dagger;


import com.fisincorporated.mockito.TestMvpEngineeringPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestAppModule.class})  // comma separated list of classes
public interface TestDiComponent {

    void inject(TestMvpEngineeringPresenter testMvpEngineeringPresenter);

}