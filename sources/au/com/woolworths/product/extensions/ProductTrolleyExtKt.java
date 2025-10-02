package au.com.woolworths.product.extensions;

import YU.a;
import au.com.woolworths.product.models.ProductTrolleyData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTrolleyExtKt {
    public static final String a(ProductTrolleyData productTrolleyData, float f) {
        Intrinsics.h(productTrolleyData, "<this>");
        String strValueOf = f - ((float) Math.floor((double) f)) == BitmapDescriptorFactory.HUE_RED ? String.valueOf((int) f) : String.valueOf(f);
        String unitLabel = productTrolleyData.getUnitLabel();
        if (unitLabel == null) {
            unitLabel = "";
        }
        return a.g(strValueOf, unitLabel);
    }
}
