package com.woolworths.scanlibrary.util.extensions;

import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.cart.PromotionType;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.Badge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemExtKt {
    public static final ArrayList a(Item item, List list) {
        ArrayList arrayList = new ArrayList();
        if (item.getItemIs().getIntervention()) {
            arrayList.add(Badge.i);
        }
        if (item.getItemIs().getReducedtoclear()) {
            arrayList.add(Badge.g);
        }
        if (item.getItemIs().getWeightrequired() && !item.getItemIs().getWeighed()) {
            arrayList.add(Badge.f);
        }
        if (list != null) {
            Iterator it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Promotion promotion = (Promotion) it.next();
                List<String> triggeredLineNumbers = promotion.getTriggeredLineNumbers();
                if (triggeredLineNumbers != null) {
                    Iterator<String> it2 = triggeredLineNumbers.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(item.getLinenumber(), it2.next()) && promotion.getPromotionType() == PromotionType.ITEM_PROMOTION) {
                            arrayList.add(Badge.h);
                            break loop0;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Item item) {
        Intrinsics.h(item, "<this>");
        return item.getItemIs().getPromotionalitem() || item.getItemIs().getLinkedpromo();
    }

    public static final boolean c(Item item) {
        Intrinsics.h(item, "<this>");
        return (!b(item) || item.getItemIs().getAssistancerequired() || item.getItemIs().getIntervention()) ? false : true;
    }
}
