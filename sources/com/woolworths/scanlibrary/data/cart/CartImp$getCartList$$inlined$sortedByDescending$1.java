package com.woolworths.scanlibrary.data.cart;

import com.woolworths.scanlibrary.models.product.Item;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CartImp$getCartList$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(((Item) obj2).getUpdated(), ((Item) obj).getUpdated());
    }
}
