package au.com.woolworths.feature.shop.wpay.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.feature.shop.wpay.AddCreditCardQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddCreditCardQueryAddCreditCardExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public static final AddCreditCardResponse a(AddCreditCardQuery.AddCreditCard addCreditCard) {
        List arrayList;
        String str = addCreditCard.f20356a;
        boolean z = addCreditCard.b;
        String str2 = addCreditCard.c;
        AnalyticsFields analyticsFields = addCreditCard.d.b;
        String str3 = analyticsFields.f10032a;
        String str4 = analyticsFields.b;
        String str5 = analyticsFields.c;
        String str6 = analyticsFields.e;
        String str7 = analyticsFields.f;
        String str8 = analyticsFields.g;
        String str9 = analyticsFields.d;
        String str10 = analyticsFields.h;
        String str11 = analyticsFields.i;
        List list = analyticsFields.j;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new AddCreditCardResponse(str, EmptyMap.d, z, str2, new AnalyticsData((EventConfig) null, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList, 1, (DefaultConstructorMarker) null));
    }
}
