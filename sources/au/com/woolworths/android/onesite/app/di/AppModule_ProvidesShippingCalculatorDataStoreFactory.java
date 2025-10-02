package au.com.woolworths.android.onesite.app.di;

import android.content.Context;
import au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesShippingCalculatorDataStoreFactory implements Factory<ShippingCalculatorDataStore> {
    public static ShippingCalculatorDataStoreImpl a(AppModule appModule, Context context) {
        appModule.getClass();
        Intrinsics.h(context, "context");
        return new ShippingCalculatorDataStoreImpl(context);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
