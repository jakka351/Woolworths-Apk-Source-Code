package au.com.woolworths.product.quantityselector;

import au.com.woolworths.product.models.ProductQuantityHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuantitySelectorInfoExtKt {
    public static final ArrayList a(QuantitySelectorInfo quantitySelectorInfo) {
        Intrinsics.h(quantitySelectorInfo, "<this>");
        IntRange intRange = new IntRange(MathKt.a(quantitySelectorInfo.getMinimum() / quantitySelectorInfo.getIncrement()) - 1, MathKt.a(quantitySelectorInfo.getMaximum() / quantitySelectorInfo.getIncrement()) - 1, 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRange, 10));
        IntProgressionIterator it = intRange.iterator();
        while (it.f) {
            arrayList.add(ProductQuantityHelper.INSTANCE.getQuantityLabel(it.nextInt(), quantitySelectorInfo.getIncrement(), quantitySelectorInfo.getUnitLabel()));
        }
        return arrayList;
    }
}
