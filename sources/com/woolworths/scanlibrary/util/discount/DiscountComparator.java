package com.woolworths.scanlibrary.util.discount;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.discount.Discount;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/util/discount/DiscountComparator;", "Ljava/util/Comparator;", "Lcom/woolworths/scanlibrary/models/discount/Discount;", "Lkotlin/Comparator;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiscountComparator implements Comparator<Discount> {
    @Override // java.util.Comparator
    public final int compare(Discount discount, Discount discount2) {
        Discount discount1 = discount;
        Discount discount22 = discount2;
        Intrinsics.h(discount1, "discount1");
        Intrinsics.h(discount22, "discount2");
        if (discount1.getOrder() == discount22.getOrder()) {
            return 0;
        }
        return discount1.getOrder() > discount22.getOrder() ? 1 : -1;
    }
}
