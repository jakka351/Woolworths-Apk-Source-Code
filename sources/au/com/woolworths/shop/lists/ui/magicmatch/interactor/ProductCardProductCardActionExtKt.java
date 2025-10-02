package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardProductCardActionExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final ActionData a(ProductCard.ProductCardAction productCardAction) {
        Intrinsics.h(productCardAction, "<this>");
        String str = productCardAction.f8968a;
        ActionType actionType = productCardAction.b;
        Intrinsics.h(actionType, "<this>");
        int iOrdinal = actionType.ordinal();
        au.com.woolworths.sdui.model.action.ActionType actionType2 = (iOrdinal == 0 || iOrdinal != 1) ? au.com.woolworths.sdui.model.action.ActionType.e : au.com.woolworths.sdui.model.action.ActionType.d;
        String str2 = productCardAction.c;
        ProductCard.Analytics analytics = productCardAction.d;
        AnalyticsData analyticsData = null;
        List arrayList = 0;
        if (analytics != null) {
            AnalyticsFields analyticsFields = analytics.b;
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
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList, 1, (DefaultConstructorMarker) null);
        }
        return new ActionData(str, actionType2, str2, analyticsData);
    }
}
