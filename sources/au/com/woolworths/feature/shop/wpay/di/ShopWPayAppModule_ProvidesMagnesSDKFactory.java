package au.com.woolworths.feature.shop.wpay.di;

import android.content.Context;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import org.json.JSONException;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopWPayAppModule_ProvidesMagnesSDKFactory implements Factory<MagnesSDK> {
    public static MagnesSDK a(ShopWPayAppModule shopWPayAppModule, Context context, AppConfig appConfig) throws JSONException {
        Environment environment;
        shopWPayAppModule.getClass();
        Intrinsics.h(context, "context");
        Intrinsics.h(appConfig, "appConfig");
        MagnesSDK magnesSDKB = MagnesSDK.b();
        MagnesSettings.Builder builder = new MagnesSettings.Builder(context);
        int iOrdinal = appConfig.getW().ordinal();
        if (iOrdinal == 0) {
            environment = Environment.e;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            environment = Environment.d;
        }
        builder.d = environment;
        magnesSDKB.c(builder.a());
        return magnesSDKB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
