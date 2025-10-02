package au.com.woolworths.feature.rewards.offers.domain.model;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentCtaFieldsOnCtaClickAnalyticsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public static final AnalyticsData a(ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics) {
        List list;
        Iterator it;
        String str;
        List list2;
        char c;
        ?? arrayList;
        String str2 = "<this>";
        Intrinsics.h(onCtaClickAnalytics, "<this>");
        AnalyticsFields analyticsFields = onCtaClickAnalytics.b;
        String str3 = analyticsFields.f10020a;
        String str4 = analyticsFields.b;
        String str5 = analyticsFields.c;
        String str6 = analyticsFields.e;
        String str7 = analyticsFields.f;
        String str8 = analyticsFields.g;
        String str9 = analyticsFields.d;
        String str10 = analyticsFields.h;
        String str11 = analyticsFields.i;
        List list3 = analyticsFields.j;
        List list4 = EmptyList.d;
        if (list3 != null) {
            List list5 = list3;
            List arrayList2 = new ArrayList(CollectionsKt.s(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                AnalyticsFields.ExtraContent extraContent = (AnalyticsFields.ExtraContent) it2.next();
                Intrinsics.h(extraContent, str2);
                String str12 = extraContent.f10021a;
                String str13 = extraContent.b;
                List list6 = extraContent.c;
                if (list6 != null) {
                    List list7 = list6;
                    it = it2;
                    str = str2;
                    list2 = list4;
                    c = '\n';
                    arrayList = new ArrayList(CollectionsKt.s(list7, 10));
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((String) it3.next());
                    }
                } else {
                    it = it2;
                    str = str2;
                    list2 = list4;
                    c = '\n';
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = list2;
                }
                arrayList2.add(new AnalyticsExtraContent(str12, str13, arrayList));
                list4 = list2;
                it2 = it;
                str2 = str;
            }
            list = arrayList2;
        } else {
            list = null;
        }
        return new AnalyticsData((EventConfig) null, str3, str4, str5, str6, str7, str8, str9, str10, str11, list == null ? list4 : list, 1, (DefaultConstructorMarker) null);
    }
}
