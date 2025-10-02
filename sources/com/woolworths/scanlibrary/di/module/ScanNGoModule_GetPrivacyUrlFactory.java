package com.woolworths.scanlibrary.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Arrays;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetPrivacyUrlFactory implements Factory<String> {
    public static String a(ScanNGoModule scanNGoModule, String str) {
        scanNGoModule.getClass();
        return String.format("%s/scan/go/privacypolicy", Arrays.copyOf(new Object[]{str}, 1));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
