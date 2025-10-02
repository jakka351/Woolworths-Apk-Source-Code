package au.com.woolworths.shop.deliveryunlimited.signup.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedSubscriptionWpayResponse;
import com.woolworths.shop.deliveryunlimited.payment.DeliveryUnlimitedSubscribeWpayMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSubscribeWpayMutationDeliveryUnlimitedSubscribeWpayExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final DeliveryUnlimitedSubscriptionWpayResponse a(DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay deliveryUnlimitedSubscribeWpay) {
        boolean z = deliveryUnlimitedSubscribeWpay.f22590a;
        String str = deliveryUnlimitedSubscribeWpay.b;
        DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics errorAnalytics = deliveryUnlimitedSubscribeWpay.c;
        AnalyticsData analyticsData = null;
        List arrayList = 0;
        if (errorAnalytics != null) {
            AnalyticsFields analyticsFields = errorAnalytics.b;
            String str2 = analyticsFields.f10032a;
            String str3 = analyticsFields.b;
            String str4 = analyticsFields.c;
            String str5 = analyticsFields.e;
            String str6 = analyticsFields.f;
            String str7 = analyticsFields.g;
            String str8 = analyticsFields.d;
            String str9 = analyticsFields.h;
            String str10 = analyticsFields.i;
            List list = analyticsFields.j;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it.next()));
                }
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, 1, (DefaultConstructorMarker) null);
        }
        return new DeliveryUnlimitedSubscriptionWpayResponse(z, str, analyticsData);
    }
}
