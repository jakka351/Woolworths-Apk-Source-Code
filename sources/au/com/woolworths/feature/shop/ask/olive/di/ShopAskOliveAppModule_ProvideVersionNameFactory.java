package au.com.woolworths.feature.shop.ask.olive.di;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopAskOliveAppModule_ProvideVersionNameFactory implements Factory<String> {
    public static String a(ShopAskOliveAppModule shopAskOliveAppModule, Context context) throws PackageManager.NameNotFoundException {
        shopAskOliveAppModule.getClass();
        Intrinsics.h(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.g(packageInfo, "getPackageInfo(...)");
        String str = packageInfo.versionName;
        return str == null ? "" : str;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
