package au.com.woolworths.feature.product.list.legacy.di;

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
/* loaded from: classes3.dex */
public final class ProductListAppModule_ProvidesProductsSharedPrefsFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(ProductListAppModule productListAppModule, Application application) {
        productListAppModule.getClass();
        SharedPreferences sharedPreferences = application.getSharedPreferences("au.com.woolworths.feature.product.list.legacy", 0);
        Intrinsics.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
