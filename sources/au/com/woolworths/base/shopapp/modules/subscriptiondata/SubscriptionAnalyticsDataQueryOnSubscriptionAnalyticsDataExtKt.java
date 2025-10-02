package au.com.woolworths.base.shopapp.modules.subscriptiondata;

import au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SubscriptionAnalyticsDataQueryOnSubscriptionAnalyticsDataExtKt {
    public static final SubscriptionAnalyticsData a(SubscriptionAnalyticsDataQuery.OnSubscriptionAnalyticsData onSubscriptionAnalyticsData) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List<String> list = onSubscriptionAnalyticsData.f9166a;
        ArrayList arrayList6 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = EmptyList.d;
        List list3 = arrayList == null ? list2 : arrayList;
        List<String> list4 = onSubscriptionAnalyticsData.b;
        if (list4 != null) {
            arrayList2 = new ArrayList();
            for (String str2 : list4) {
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
        } else {
            arrayList2 = null;
        }
        List list5 = arrayList2 == null ? list2 : arrayList2;
        List<String> list6 = onSubscriptionAnalyticsData.c;
        if (list6 != null) {
            arrayList3 = new ArrayList();
            for (String str3 : list6) {
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            }
        } else {
            arrayList3 = null;
        }
        List list7 = arrayList3 == null ? list2 : arrayList3;
        List<String> list8 = onSubscriptionAnalyticsData.d;
        if (list8 != null) {
            arrayList4 = new ArrayList();
            for (String str4 : list8) {
                if (str4 != null) {
                    arrayList4.add(str4);
                }
            }
        } else {
            arrayList4 = null;
        }
        List list9 = arrayList4 == null ? list2 : arrayList4;
        List<String> list10 = onSubscriptionAnalyticsData.e;
        if (list10 != null) {
            arrayList5 = new ArrayList();
            for (String str5 : list10) {
                if (str5 != null) {
                    arrayList5.add(str5);
                }
            }
        } else {
            arrayList5 = null;
        }
        List list11 = arrayList5 == null ? list2 : arrayList5;
        List<String> list12 = onSubscriptionAnalyticsData.f;
        if (list12 != null) {
            arrayList6 = new ArrayList();
            for (String str6 : list12) {
                if (str6 != null) {
                    arrayList6.add(str6);
                }
            }
        }
        return new SubscriptionAnalyticsData(list3, list5, list7, list9, list11, arrayList6 == null ? list2 : arrayList6);
    }
}
