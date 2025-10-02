package com.woolworths.scanlibrary.di.module;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.login.RewardSignInPreAuthUC;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideUserManagerFactory implements Factory<UserManager> {
    public static UserManager a(ScanNGoModule scanNGoModule, DefaultLocalTokenProvider defaultLocalTokenProvider, SignInUC signInUC, RewardSignInPreAuthUC rewardSignInPreAuthUC, AuthenticatedUser authenticatedUser, UserComponent.Builder builder, DigitalPayProvider digitalPayConfigurationProvider, FirebaseCrashlytics firebaseCrashlytics) {
        scanNGoModule.getClass();
        Intrinsics.h(digitalPayConfigurationProvider, "digitalPayConfigurationProvider");
        return new UserManager(signInUC, rewardSignInPreAuthUC, defaultLocalTokenProvider, authenticatedUser, builder, digitalPayConfigurationProvider, firebaseCrashlytics);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
