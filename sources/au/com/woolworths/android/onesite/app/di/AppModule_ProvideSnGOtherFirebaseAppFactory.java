package au.com.woolworths.android.onesite.app.di;

import android.content.Context;
import android.util.Base64;
import au.com.woolworths.android.onesite.appdata.FirebaseConfigBuilder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideSnGOtherFirebaseAppFactory implements Factory<FirebaseApp> {
    public static FirebaseApp a(AppModule appModule, Context context, FirebaseConfigBuilder sngFirebaseConfigBuilder) {
        appModule.getClass();
        Intrinsics.h(context, "context");
        Intrinsics.h(sngFirebaseConfigBuilder, "sngFirebaseConfigBuilder");
        FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
        builder.b = sngFirebaseConfigBuilder.f;
        builder.f15173a = Preconditions.checkNotEmpty(sngFirebaseConfigBuilder.d, "ApplicationId must be set.");
        byte[] bArrDecode = Base64.decode(sngFirebaseConfigBuilder.c, 2);
        Intrinsics.g(bArrDecode, "decode(...)");
        String strCheckNotEmpty = Preconditions.checkNotEmpty(new String(bArrDecode, Charsets.f24671a), "ApiKey must be set.");
        String str = sngFirebaseConfigBuilder.f4223a;
        String str2 = sngFirebaseConfigBuilder.e;
        return FirebaseApp.i(context, new FirebaseOptions(builder.f15173a, strCheckNotEmpty, str, null, sngFirebaseConfigBuilder.b, str2, builder.b), "ScanAndGo");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
