package au.com.woolworths.feature.shop.wpay.data.mappers.payment;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.WpayPaymentResponse;
import com.woolworths.feature.shop.payment.PayMutation;
import com.woolworths.feature.shop.payment.fragment.Analytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayMutationPayExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final WpayPaymentResponse a(PayMutation.Pay pay) {
        PaymentResponse validationFail;
        PayMutation.OnWpayPaymentResponse onWpayPaymentResponse = pay.b;
        PayMutation.OnWpayPaymentSuccess onWpayPaymentSuccess = onWpayPaymentResponse.b;
        if (onWpayPaymentSuccess != null) {
            validationFail = new PaymentResponse.Success(onWpayPaymentSuccess.f20210a);
        } else {
            PayMutation.OnWpayPaymentFailure onWpayPaymentFailure = onWpayPaymentResponse.c;
            EmptyList emptyList = EmptyList.d;
            ?? arrayList = 0;
            ?? arrayList2 = 0;
            if (onWpayPaymentFailure != null) {
                String str = onWpayPaymentFailure.f20208a;
                Analytics analytics = onWpayPaymentFailure.b.b;
                String str2 = analytics.f20221a;
                String str3 = analytics.b;
                String str4 = analytics.c;
                String str5 = analytics.e;
                String str6 = analytics.f;
                String str7 = analytics.g;
                String str8 = analytics.d;
                String str9 = analytics.h;
                String str10 = analytics.i;
                List list = analytics.j;
                if (list != null) {
                    List list2 = list;
                    arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(AnalyticsExtraContentExtKt.a((Analytics.ExtraContent) it.next()));
                    }
                }
                validationFail = new PaymentResponse.Fail(onWpayPaymentFailure.c, str, new AnalyticsData((EventConfig) null, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null));
            } else {
                PayMutation.OnWpayPaymentValidationFailure onWpayPaymentValidationFailure = onWpayPaymentResponse.d;
                if (onWpayPaymentValidationFailure == null) {
                    throw new IllegalStateException("Error mapping `OnWpayPaymentResponse`: missing non-null synthetic field!");
                }
                String str11 = onWpayPaymentValidationFailure.b;
                String str12 = onWpayPaymentValidationFailure.f20211a;
                Analytics analytics2 = onWpayPaymentValidationFailure.c.b;
                String str13 = analytics2.f20221a;
                String str14 = analytics2.b;
                String str15 = analytics2.c;
                String str16 = analytics2.e;
                String str17 = analytics2.f;
                String str18 = analytics2.g;
                String str19 = analytics2.d;
                String str20 = analytics2.h;
                String str21 = analytics2.i;
                List list3 = analytics2.j;
                if (list3 != null) {
                    List list4 = list3;
                    arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(AnalyticsExtraContentExtKt.a((Analytics.ExtraContent) it2.next()));
                    }
                }
                validationFail = new PaymentResponse.ValidationFail(str11, str12, new AnalyticsData((EventConfig) null, str13, str14, str15, str16, str17, str18, str19, str20, str21, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null));
            }
        }
        return new WpayPaymentResponse(validationFail);
    }
}
