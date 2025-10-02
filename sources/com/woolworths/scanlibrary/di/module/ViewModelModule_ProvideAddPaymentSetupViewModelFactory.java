package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvideAddPaymentSetupViewModelFactory implements Factory<ViewModel> {
    public static AddPaymentSetupViewModel a(ViewModelModule viewModelModule, AnalyticsManager analyticsManager) {
        viewModelModule.getClass();
        Intrinsics.h(analyticsManager, "analyticsManager");
        return new AddPaymentSetupViewModel(analyticsManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
