package au.com.woolworths.feature.shop.bundles.data;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesExtKt {
    public static final ArrayList a(Bundle bundle) {
        Intrinsics.h(bundle, "<this>");
        ArrayList arrayListA = BundlesDataKt.a(bundle.b);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((BundleProductCard) it.next()).f6758a.getProductId());
        }
        return arrayList;
    }

    public static final MapBuilder b(Bundle bundle, int i) {
        Double inTrolley;
        Intrinsics.h(bundle, "<this>");
        BundleQuantityStepper bundleQuantityStepper = bundle.c;
        MapBuilder mapBuilder = new MapBuilder();
        ArrayList arrayListA = BundlesDataKt.a(bundle.b);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ProductCard productCard = ((BundleProductCard) it.next()).f6758a;
            String productId = productCard.getProductId();
            ProductTrolleyData trolley = productCard.getTrolley();
            double dDoubleValue = (trolley == null || (inTrolley = trolley.getInTrolley()) == null) ? 0.0d : inTrolley.doubleValue();
            double d = bundleQuantityStepper.c;
            ProductTrolleyData trolley2 = productCard.getTrolley();
            arrayList.add((Double) mapBuilder.put(productId, Double.valueOf(Math.max((d * (trolley2 != null ? trolley2.getIncrement() : 0.0d) * (i - bundleQuantityStepper.d)) + dDoubleValue, 0.0d))));
        }
        return mapBuilder.b();
    }
}
