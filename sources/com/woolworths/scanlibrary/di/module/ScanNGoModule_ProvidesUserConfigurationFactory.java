package com.woolworths.scanlibrary.di.module;

import android.content.SharedPreferences;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvidesUserConfigurationFactory implements Factory<UserConfigurations> {
    public static UserConfigurations a(ScanNGoModule scanNGoModule, SharedPreferences preferences) {
        scanNGoModule.getClass();
        Intrinsics.h(preferences, "preferences");
        return new UserConfigurations(preferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
