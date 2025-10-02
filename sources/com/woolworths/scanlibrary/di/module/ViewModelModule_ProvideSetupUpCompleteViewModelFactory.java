package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupUpCompleteViewModel;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvideSetupUpCompleteViewModelFactory implements Factory<ViewModel> {
    public static SetupUpCompleteViewModel a(ViewModelModule viewModelModule, FeatureToggleManager featureToggleManager, UserConfigurations userConfigurations, DeviceInfoProvider deviceInfoProvider, AnalyticsManager analyticsManager) {
        viewModelModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        return new SetupUpCompleteViewModel(featureToggleManager, userConfigurations, deviceInfoProvider, analyticsManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
