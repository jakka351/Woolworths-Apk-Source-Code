package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.ui.entry.SngEntryViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvideSngEntryViewModelFactory implements Factory<ViewModel> {
    public static SngEntryViewModel a(ViewModelModule viewModelModule, RewardsAccountInteractor rewardsAccountInteractor, UserConfigurations userConfigurations, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, DeviceFingerprintInteractor deviceFingerprintInteractor) {
        viewModelModule.getClass();
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        return new SngEntryViewModel(rewardsAccountInteractor, userConfigurations, analyticsManager, featureToggleManager, deviceFingerprintInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
