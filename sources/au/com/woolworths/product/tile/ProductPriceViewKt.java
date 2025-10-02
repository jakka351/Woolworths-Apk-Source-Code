package au.com.woolworths.product.tile;

import au.com.woolworths.android.onesite.extensions.IntExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductPriceViewKt {
    public static final void a(ProductPriceView view, Integer num, String str) {
        Intrinsics.h(view, "view");
        String strB = num != null ? IntExtKt.b(num.intValue()) : null;
        String strA = num != null ? IntExtKt.a(num.intValue()) : null;
        if (strB == null) {
            strB = "";
        }
        view.d(strB, strA, str);
    }
}
