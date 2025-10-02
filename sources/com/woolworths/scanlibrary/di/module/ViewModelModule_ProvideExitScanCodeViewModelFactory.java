package com.woolworths.scanlibrary.di.module;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepositoryImpl;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.GetProfileUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
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
public final class ViewModelModule_ProvideExitScanCodeViewModelFactory implements Factory<ViewModel> {
    public static ExitScanCodeViewModel a(ViewModelModule viewModelModule, UserManager userManager, AnalyticsManager analyticsManager, ResourceResolverImpl resourceResolverImpl, FeatureToggleManager featureToggleManager, FirebaseCrashlytics firebaseCrashlytics) {
        viewModelModule.getClass();
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        AuthenticatedUser authenticatedUser = userManager.g;
        UserComponent userComponent = userManager.k;
        Intrinsics.e(userComponent);
        CartSessionManager cartSessionManagerE = userComponent.e();
        UserComponent userComponent2 = userManager.k;
        Intrinsics.e(userComponent2);
        SessionInfo sessionInfoD = userComponent2.d();
        UserComponent userComponent3 = userManager.k;
        Intrinsics.e(userComponent3);
        GetProfileUC getProfileUCH = userComponent3.h();
        UserComponent userComponent4 = userManager.k;
        Intrinsics.e(userComponent4);
        FireStoreDataRepositoryImpl fireStoreDataRepositoryImplI = userComponent4.i();
        UserComponent userComponent5 = userManager.k;
        Intrinsics.e(userComponent5);
        GetReceiptWithCartIdUC getReceiptWithCartIdUCG = userComponent5.g();
        UserComponent userComponent6 = userManager.k;
        Intrinsics.e(userComponent6);
        return new ExitScanCodeViewModel(authenticatedUser, cartSessionManagerE, sessionInfoD, getProfileUCH, fireStoreDataRepositoryImplI, getReceiptWithCartIdUCG, userComponent6.f(), analyticsManager, resourceResolverImpl, featureToggleManager, firebaseCrashlytics);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
