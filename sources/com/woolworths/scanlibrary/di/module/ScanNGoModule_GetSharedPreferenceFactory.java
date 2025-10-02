package com.woolworths.scanlibrary.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ScanNGoModule_GetSharedPreferenceFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(ScanNGoModule scanNGoModule, Context context) {
        scanNGoModule.getClass();
        Intrinsics.h(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return defaultSharedPreferences;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
