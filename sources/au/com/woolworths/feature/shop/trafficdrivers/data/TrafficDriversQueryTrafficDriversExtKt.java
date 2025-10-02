package au.com.woolworths.feature.shop.trafficdrivers.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.TagStyle;
import com.woolworths.shop.brandedshop.TrafficDriversQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TrafficDriversQueryTrafficDriversExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    public static final TrafficDrivers a(TrafficDriversQuery.TrafficDrivers trafficDrivers) {
        EmptyList emptyList;
        AnalyticsData analyticsData;
        EmptyList emptyList2;
        Iterator it;
        EmptyList emptyList3;
        String str;
        AnalyticsData analyticsData2;
        TagLabel tagLabel;
        TagLabel tagLabel2;
        AnalyticsData analyticsData3;
        String str2;
        String str3;
        String str4;
        EmptyList emptyList4;
        String str5;
        ?? arrayList;
        int i = trafficDrivers.b;
        int i2 = trafficDrivers.c;
        ArrayList arrayList2 = trafficDrivers.e;
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            TrafficDriversQuery.Item item = (TrafficDriversQuery.Item) it2.next();
            Intrinsics.h(item, "<this>");
            String str6 = item.b;
            String str7 = item.c;
            String str8 = item.d;
            ArrayList arrayList4 = item.e;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, i3));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add((String) it3.next());
            }
            TrafficDriversQuery.Action action = item.f;
            String str9 = action.c;
            ActionType uiModel = au.com.woolworths.product.models.ActionTypeExtKt.toUiModel(action.b);
            String str10 = action.d;
            TrafficDriversQuery.Analytics1 analytics1 = action.e;
            if (analytics1 != null) {
                AnalyticsFields analyticsFields = analytics1.b;
                it = it2;
                String str11 = analyticsFields.f10032a;
                String str12 = analyticsFields.b;
                String str13 = analyticsFields.c;
                String str14 = analyticsFields.e;
                String str15 = analyticsFields.f;
                String str16 = analyticsFields.g;
                String str17 = analyticsFields.d;
                String str18 = analyticsFields.h;
                String str19 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    str5 = str19;
                    emptyList3 = emptyList;
                    str = str6;
                    arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it4.next()));
                    }
                } else {
                    str5 = str19;
                    emptyList3 = emptyList;
                    str = str6;
                    arrayList = 0;
                }
                analyticsData2 = new AnalyticsData((EventConfig) null, str11, str12, str13, str14, str15, str16, str17, str18, str5, arrayList == 0 ? emptyList3 : arrayList, 1, (DefaultConstructorMarker) null);
            } else {
                it = it2;
                emptyList3 = emptyList;
                str = str6;
                analyticsData2 = null;
            }
            ActionData actionData = new ActionData(str9, uiModel, str10, analyticsData2);
            TrafficDriversQuery.Tag tag = item.g;
            if (tag != null) {
                String str20 = tag.f21439a;
                TagStyle tagStyle = tag.b;
                tagLabel = new TagLabel(str20, tagStyle != null ? au.com.woolworths.product.models.TagStyleExtKt.toUiModel(tagStyle) : null);
            } else {
                tagLabel = null;
            }
            TrafficDriversQuery.ImpressionAnalytics impressionAnalytics = item.h;
            if (impressionAnalytics != null) {
                AnalyticsFields analyticsFields2 = impressionAnalytics.b;
                String str21 = analyticsFields2.f10032a;
                String str22 = analyticsFields2.b;
                String str23 = analyticsFields2.c;
                String str24 = analyticsFields2.e;
                String str25 = analyticsFields2.f;
                String str26 = analyticsFields2.g;
                tagLabel2 = tagLabel;
                String str27 = analyticsFields2.d;
                String str28 = analyticsFields2.h;
                String str29 = analyticsFields2.i;
                List list3 = analyticsFields2.j;
                if (list3 != null) {
                    List list4 = list3;
                    str2 = str29;
                    str3 = str21;
                    str4 = str22;
                    ?? arrayList6 = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it5.next()));
                    }
                    emptyList4 = arrayList6;
                } else {
                    str2 = str29;
                    str3 = str21;
                    str4 = str22;
                    emptyList4 = null;
                }
                analyticsData3 = new AnalyticsData((EventConfig) null, str3, str4, str23, str24, str25, str26, str27, str28, str2, emptyList4 == null ? emptyList3 : emptyList4, 1, (DefaultConstructorMarker) null);
            } else {
                tagLabel2 = tagLabel;
                analyticsData3 = null;
            }
            arrayList3.add(new TrafficDriverItem(str, str7, str8, arrayList5, actionData, tagLabel2, analyticsData3));
            it2 = it;
            i3 = 10;
        }
        TrafficDriversQuery.Analytics analytics = trafficDrivers.d;
        if (analytics != null) {
            AnalyticsFields analyticsFields3 = analytics.b;
            String str30 = analyticsFields3.f10032a;
            String str31 = analyticsFields3.b;
            String str32 = analyticsFields3.c;
            String str33 = analyticsFields3.e;
            String str34 = analyticsFields3.f;
            String str35 = analyticsFields3.g;
            String str36 = analyticsFields3.d;
            String str37 = analyticsFields3.h;
            String str38 = analyticsFields3.i;
            List list5 = analyticsFields3.j;
            if (list5 != null) {
                List list6 = list5;
                ?? arrayList7 = new ArrayList(CollectionsKt.s(list6, 10));
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it6.next()));
                }
                emptyList2 = arrayList7;
            } else {
                emptyList2 = null;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str30, str31, str32, str33, str34, str35, str36, str37, str38, emptyList2 == null ? emptyList : emptyList2, 1, (DefaultConstructorMarker) null);
        } else {
            analyticsData = null;
        }
        return new TrafficDrivers(i, i2, arrayList3, analyticsData);
    }
}
