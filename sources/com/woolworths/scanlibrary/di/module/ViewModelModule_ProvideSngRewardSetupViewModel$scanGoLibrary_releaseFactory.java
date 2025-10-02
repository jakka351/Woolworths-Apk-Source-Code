package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvideSngRewardSetupViewModel$scanGoLibrary_releaseFactory implements Factory<ViewModel> {
    public static SngRewardSetupViewModel a(ViewModelModule viewModelModule, RewardsAccountInteractor rewardsAccountInteractor, FetchScanAndGoInteractor fetchScanAndGoInteractor, SchedulersProvider schedulersProvider, NetworkExceptions networkExceptions, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager) {
        viewModelModule.getClass();
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        return new SngRewardSetupViewModel(rewardsAccountInteractor, fetchScanAndGoInteractor, schedulersProvider, networkExceptions, featureToggleManager, analyticsManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
