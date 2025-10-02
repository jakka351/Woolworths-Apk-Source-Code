package au.com.woolworths.feature.product.list.di;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.state.a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ProductListAppModule_ProvidesProductListFiltersSharedPrefsFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(ProductListAppModule productListAppModule, Application application) {
        productListAppModule.getClass();
        return a.b(application.getPackageName(), ".product_list_filters", application, 0, "getSharedPreferences(...)");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
