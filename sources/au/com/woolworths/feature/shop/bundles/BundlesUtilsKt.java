package au.com.woolworths.feature.shop.bundles;

import au.com.woolworths.feature.shop.bundles.data.BundleCartQuantityUpdate;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesUtilsKt {
    public static final ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            ProductCard productCard = (ProductCard) entry.getKey();
            double dDoubleValue = ((Number) entry.getValue()).doubleValue();
            ProductTrolleyData trolley = productCard.getTrolley();
            arrayList.add(trolley != null ? new BundleCartQuantityUpdate(productCard.getProductId(), dDoubleValue, productCard.getAdId(), productCard.getSource(), trolley.getMaximum(), trolley.getIncrement()) : null);
        }
        return CollectionsKt.B(arrayList);
    }
}
