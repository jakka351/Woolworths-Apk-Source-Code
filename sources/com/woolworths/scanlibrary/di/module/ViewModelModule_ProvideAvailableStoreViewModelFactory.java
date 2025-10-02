package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.domain.stores.GetAvailableStoresUC;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvideAvailableStoreViewModelFactory implements Factory<ViewModel> {
    public static AvailableStoreViewModel a(ViewModelModule viewModelModule, GetAvailableStoresUC getAvailableStoresUC, AnalyticsManager analyticsManager, ResourceResolverImpl resourceResolverImpl, FeatureToggleManager featureToggleManager) {
        viewModelModule.getClass();
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new AvailableStoreViewModel(getAvailableStoresUC, analyticsManager, resourceResolverImpl, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
