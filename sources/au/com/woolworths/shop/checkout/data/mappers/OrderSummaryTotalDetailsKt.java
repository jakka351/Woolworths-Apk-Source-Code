package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderSummaryTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderSummaryTotalDetailsKt {
    public static final OrderSummaryTotalDetails a(CheckoutContentSummary.OnCheckoutOrderSummary onCheckoutOrderSummary) {
        Iterator it;
        OrderDetailSectionMessage orderDetailSectionMessage;
        Intrinsics.h(onCheckoutOrderSummary, "<this>");
        String str = onCheckoutOrderSummary.f22254a;
        ArrayList arrayList = onCheckoutOrderSummary.b;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<CheckoutContentSummary.Section> list = (List) it2.next();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list, i));
            for (CheckoutContentSummary.Section section : list) {
                Intrinsics.h(section, "<this>");
                String str2 = section.f22291a;
                DetailsSectionValueType detailsSectionValueTypeA = CheckoutSummaryValueTypeExtKt.a(section.b);
                String str3 = section.c;
                DetailsSectionValueType detailsSectionValueTypeA2 = CheckoutSummaryValueTypeExtKt.a(section.d);
                String str4 = section.e;
                CheckoutContentSummary.Message1 message1 = section.f;
                if (message1 != null) {
                    String str5 = message1.f22245a;
                    String str6 = message1.b;
                    String str7 = message1.c;
                    it = it2;
                    orderDetailSectionMessage = new OrderDetailSectionMessage(str5, str6, Intrinsics.c(str7, "Info") ? MessageType.e : Intrinsics.c(str7, "Help") ? MessageType.f : MessageType.d);
                } else {
                    it = it2;
                    orderDetailSectionMessage = null;
                }
                arrayList3.add(new OrderTotalDetailsSection(str2, detailsSectionValueTypeA, str3, detailsSectionValueTypeA2, str4, orderDetailSectionMessage));
                it2 = it;
            }
            arrayList2.add(arrayList3);
            i = 10;
        }
        return new OrderSummaryTotalDetails(str, arrayList2);
    }
}
