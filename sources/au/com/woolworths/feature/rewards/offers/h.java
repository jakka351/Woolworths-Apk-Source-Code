package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ h(boolean z, int i) {
        this.d = i;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List offers = (List) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(offers, "offers");
                List list = offers;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(OfferViewItem.a((OfferViewItem) it.next(), this.e));
                }
                return arrayList;
            default:
                Intrinsics.h(offers, "offers");
                List list2 = offers;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(OfferViewItem.a((OfferViewItem) it2.next(), this.e));
                }
                return arrayList2;
        }
    }
}
