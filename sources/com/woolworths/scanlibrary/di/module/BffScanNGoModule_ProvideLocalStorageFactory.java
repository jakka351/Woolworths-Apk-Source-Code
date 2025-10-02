package com.woolworths.scanlibrary.di.module;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.woolworths.scanlibrary.data.source.local.persistent.ScanAndGoLaunchPersistent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class BffScanNGoModule_ProvideLocalStorageFactory implements Factory<ScanAndGoLaunchPersistent> {
    public static ScanAndGoLaunchPersistent a(BffScanNGoModule bffScanNGoModule, Gson gson, SharedPreferences preferences) {
        bffScanNGoModule.getClass();
        Intrinsics.h(preferences, "preferences");
        return new ScanAndGoLaunchPersistent(preferences, gson);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
