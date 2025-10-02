package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessageApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiDataExtKt;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutOrderTotalDetailsKt {
    public static final CheckoutOrderTotalDetails a(CheckoutContentSummary.OrderTotalDetails orderTotalDetails) {
        InlineMessage inlineMessage;
        int size;
        CheckoutRefundInfo checkoutRefundInfo;
        Iterator it;
        OrderDetailSectionMessage orderDetailSectionMessage;
        CheckoutContentSummary.InlineMessage inlineMessage2 = orderTotalDetails.f22272a;
        if (inlineMessage2 != null) {
            InlineMessageApiData inlineMessageApiData = new InlineMessageApiData(InsetBannerDisplayTypeExtKt.a(inlineMessage2.f22240a), inlineMessage2.b, null);
            inlineMessage = new InlineMessage(InsetBannerTypeApiDataExtKt.toInlineErrorType(inlineMessageApiData.getDisplayType()), new PlainText(inlineMessageApiData.getMessage()), inlineMessageApiData.getAnalytics());
        } else {
            inlineMessage = null;
        }
        ArrayList arrayList = orderTotalDetails.b;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<CheckoutContentSummary.Section1> list = (List) it2.next();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list, i));
            for (CheckoutContentSummary.Section1 section1 : list) {
                Intrinsics.h(section1, "<this>");
                String str = section1.f22292a;
                DetailsSectionValueType detailsSectionValueTypeA = CheckoutSummaryValueTypeExtKt.a(section1.b);
                String str2 = section1.c;
                DetailsSectionValueType detailsSectionValueTypeA2 = CheckoutSummaryValueTypeExtKt.a(section1.d);
                String str3 = section1.e;
                CheckoutContentSummary.Message2 message2 = section1.f;
                if (message2 != null) {
                    String str4 = message2.f22246a;
                    String str5 = message2.b;
                    String str6 = message2.c;
                    it = it2;
                    orderDetailSectionMessage = new OrderDetailSectionMessage(str4, str5, Intrinsics.c(str6, "Info") ? MessageType.e : Intrinsics.c(str6, "Help") ? MessageType.f : MessageType.d);
                } else {
                    it = it2;
                    orderDetailSectionMessage = null;
                }
                arrayList3.add(new OrderTotalDetailsSection(str, detailsSectionValueTypeA, str2, detailsSectionValueTypeA2, str3, orderDetailSectionMessage));
                it2 = it;
            }
            arrayList2.add(arrayList3);
            i = 10;
        }
        CheckoutContentSummary.Total total = orderTotalDetails.c;
        String str7 = total.f22294a;
        String str8 = total.b;
        double d = total.c;
        String str9 = total.d;
        CheckoutProgressId checkoutProgressId = total.e;
        OrderTotalDetailsTotal orderTotalDetailsTotal = new OrderTotalDetailsTotal(str7, str8, d, str9, checkoutProgressId != null ? CheckoutProgressIdExtKt.a(checkoutProgressId) : null, total.f);
        CheckoutContentSummary.ReviewProducts reviewProducts = orderTotalDetails.e;
        int size2 = (reviewProducts != null ? reviewProducts.f22285a.size() : 0) + (reviewProducts != null ? reviewProducts.b.size() : 0);
        if (reviewProducts != null) {
            Iterator it3 = reviewProducts.c.iterator();
            size = 0;
            while (it3.hasNext()) {
                size += ((CheckoutContentSummary.ExceededSupplyLimitProductGroup) it3.next()).f22234a.size();
            }
        } else {
            size = 0;
        }
        int size3 = size2 + size + (reviewProducts != null ? reviewProducts.d.size() : 0) + (reviewProducts != null ? reviewProducts.e.size() : 0);
        CheckoutContentSummary.RefundInfo refundInfo = orderTotalDetails.d;
        if (refundInfo != null) {
            String str10 = refundInfo.f22280a;
            String str11 = refundInfo.b;
            CheckoutContentSummary.PrimaryCta primaryCta = refundInfo.c;
            checkoutRefundInfo = new CheckoutRefundInfo(null, str10, str11, primaryCta != null ? new ContentCta(primaryCta.f22274a, (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, null, null, null, null, 241, null);
        } else {
            checkoutRefundInfo = null;
        }
        return new CheckoutOrderTotalDetails(inlineMessage, arrayList2, orderTotalDetailsTotal, size3, checkoutRefundInfo, orderTotalDetails.f);
    }
}
