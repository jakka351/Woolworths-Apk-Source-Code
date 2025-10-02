package com.woolworths.scanlibrary.di.module;

import com.google.firebase.FirebaseApp;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvidesSignInUseCaseFactory implements Factory<SignInUC> {
    public static SignInUC a(ScanNGoModule scanNGoModule, FirebaseApp firebaseApp, ScanNGoRepository scanNGoRepository, DefaultLocalTokenProvider defaultLocalTokenProvider, AuthenticatedUser authenticatedUser, DeviceRegistrationUC deviceRegistrationUC, Scheduler scheduler, DeviceInfoProvider deviceInfoProvider, UserConfigurations userConfigurations, SurveyManager surveyManager) {
        scanNGoModule.getClass();
        Intrinsics.h(firebaseApp, "firebaseApp");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(surveyManager, "surveyManager");
        return new SignInUC(firebaseApp, scanNGoRepository, defaultLocalTokenProvider, deviceInfoProvider, deviceRegistrationUC, userConfigurations, authenticatedUser, surveyManager, scheduler);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
