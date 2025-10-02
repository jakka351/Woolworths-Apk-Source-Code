package com.woolworths.scanlibrary.di.module;

import android.content.SharedPreferences;
import com.woolworths.scanlibrary.data.ApiEndpoints;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetHostUrlFactory implements Factory<String> {
    public static String a(ScanNGoModule scanNGoModule, SharedPreferences preferences, ScanAndGoConfig config) throws NumberFormatException {
        String l;
        ApiEndpoints apiEndpoints;
        scanNGoModule.getClass();
        Intrinsics.h(preferences, "preferences");
        Intrinsics.h(config, "config");
        if (preferences.contains("key_environment")) {
            ApiEndpoints.Companion companion = ApiEndpoints.f;
            String string = preferences.getString("key_environment", "");
            Intrinsics.e(string);
            int i = Integer.parseInt(string);
            companion.getClass();
            ApiEndpoints[] apiEndpointsArrValues = ApiEndpoints.values();
            int length = apiEndpointsArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    apiEndpoints = ApiEndpoints.g;
                    break;
                }
                apiEndpoints = apiEndpointsArrValues[i2];
                if (Integer.valueOf(apiEndpoints.e).equals(Integer.valueOf(i))) {
                    break;
                }
                i2++;
            }
            l = apiEndpoints.d;
        } else {
            l = config.getL();
        }
        Preconditions.d(l);
        return l;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
