package au.com.woolworths.android.onesite.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ReleaseModule_ProvideAemContentOkHttpClientFactory implements Factory<OkHttpClient> {
    public static void a(ReleaseModule releaseModule, OkHttpClient okHttpClient) {
        releaseModule.getClass();
        Intrinsics.h(okHttpClient, "okHttpClient");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
