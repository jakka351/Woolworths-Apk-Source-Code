package com.woolworths.scanlibrary.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import au.com.woolworths.shop.securedpreference.preference.SecuredPreferenceManager;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetSecuredSharedPreferenceFactory implements Factory<SharedPreferences> {
    public static SecuredSharedPreference a(ScanNGoModule scanNGoModule, Context context) {
        scanNGoModule.getClass();
        Intrinsics.h(context, "context");
        return SecuredPreferenceManager.a(context);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
