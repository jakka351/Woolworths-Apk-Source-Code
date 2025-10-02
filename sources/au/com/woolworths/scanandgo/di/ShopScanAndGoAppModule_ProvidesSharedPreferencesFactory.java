package au.com.woolworths.scanandgo.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(ShopScanAndGoAppModule shopScanAndGoAppModule, Application application) {
        shopScanAndGoAppModule.getClass();
        SharedPreferences sharedPreferences = application.getSharedPreferences("au.com.woolworths.scanandgo.shopScanAndGo", 0);
        Intrinsics.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
