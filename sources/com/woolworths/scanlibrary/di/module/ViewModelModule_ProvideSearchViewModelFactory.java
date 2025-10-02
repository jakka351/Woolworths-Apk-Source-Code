package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.ui.productsearch.SearchViewModel;
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
public final class ViewModelModule_ProvideSearchViewModelFactory implements Factory<ViewModel> {
    public static SearchViewModel a(ViewModelModule viewModelModule, UserManager userManager, AnalyticsProvider analyticsAggregator, ResourceResolverImpl resourceResolverImpl) {
        viewModelModule.getClass();
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        UserComponent userComponent = userManager.k;
        Intrinsics.e(userComponent);
        ProductSearchUC productSearchUCB = userComponent.b();
        UserComponent userComponent2 = userManager.k;
        Intrinsics.e(userComponent2);
        return new SearchViewModel(productSearchUCB, userComponent2.a(), analyticsAggregator, resourceResolverImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
