package au.com.woolworths.feature.shop.shippingcalculator.data;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.PreferencesFactory;
import au.com.woolworths.feature.shop.shippingcalculator.data.ShippingCalculatorDataStoreImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CorruptionException it = (CorruptionException) obj;
        ShippingCalculatorDataStoreImpl.Companion companion = ShippingCalculatorDataStoreImpl.c;
        Intrinsics.h(it, "it");
        return PreferencesFactory.a();
    }
}
