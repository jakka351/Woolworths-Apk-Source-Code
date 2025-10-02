package au.com.woolworths.product.models;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/analytics/model/AnalyticsData;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductCardAnalytics;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardProductCardAnalyticsExtKt {
    @NotNull
    public static final AnalyticsData toUiModel(@NotNull ProductCard.ProductCardAnalytics productCardAnalytics) {
        List arrayList;
        Intrinsics.h(productCardAnalytics, "<this>");
        AnalyticsFields analyticsFields = productCardAnalytics.b;
        String str = analyticsFields.f10032a;
        String str2 = analyticsFields.b;
        String str3 = analyticsFields.c;
        String str4 = analyticsFields.e;
        String str5 = analyticsFields.f;
        String str6 = analyticsFields.g;
        String str7 = analyticsFields.d;
        String str8 = analyticsFields.h;
        String str9 = analyticsFields.i;
        List list = analyticsFields.j;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = EmptyList.d;
        }
        return new AnalyticsData((EventConfig) null, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, 1, (DefaultConstructorMarker) null);
    }
}
