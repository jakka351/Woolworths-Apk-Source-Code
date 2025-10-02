package au.com.woolworths.shop.aem.components.model.recipe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RecipeCardSummaryConfigKt {
    public static final RecipeCardSummaryConfig a(List list) {
        boolean z;
        Intrinsics.h(list, "<this>");
        List list2 = list;
        boolean z2 = list2 instanceof Collection;
        boolean z3 = true;
        if (z2 && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (RecipeCardSummaryDataKt.a((RecipeCardSummaryData) it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z2 && list2.isEmpty()) {
            z3 = false;
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((RecipeCardSummaryData) it2.next()).getCostPerServe() != null) {
                    break;
                }
            }
            z3 = false;
        }
        return new RecipeCardSummaryConfig(z, z3);
    }
}
