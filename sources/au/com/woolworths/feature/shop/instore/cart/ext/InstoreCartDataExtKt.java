package au.com.woolworths.feature.shop.instore.cart.ext;

import au.com.woolworths.feature.shop.instore.cart.data.InstoreCartData;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreCartDataExtKt {
    public static final ArrayList a(InstoreCartData instoreCartData) {
        List list = instoreCartData.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
