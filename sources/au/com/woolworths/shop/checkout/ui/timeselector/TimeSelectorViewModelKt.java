package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TimeSelectorViewModelKt {
    public static final ArrayList a(List list, Integer num) {
        TimeOfDay timeOfDayA;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TimeOfDay timeOfDay = (TimeOfDay) obj;
            boolean z = timeOfDay.b;
            List list3 = timeOfDay.e;
            if (z) {
                List<FulfilmentSlot> list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list4, 10));
                for (FulfilmentSlot fulfilmentSlot : list4) {
                    arrayList2.add(FulfilmentSlot.a(fulfilmentSlot, num != null && fulfilmentSlot.f10671a == num.intValue()));
                }
                timeOfDayA = TimeOfDay.a(timeOfDay, false, arrayList2, 15);
            } else {
                List list5 = list3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList3.add(FulfilmentSlot.a((FulfilmentSlot) it.next(), false));
                }
                timeOfDayA = TimeOfDay.a(timeOfDay, false, arrayList3, 15);
            }
            arrayList.add(timeOfDayA);
            i = i2;
        }
        return arrayList;
    }
}
