package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.product.list.ProductListQuery;
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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/analytics/model/AnalyticsData;", "Lcom/woolworths/product/list/ProductListQuery$BannerAnalytics;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryBannerAnalyticsExtKt {
    @NotNull
    public static final AnalyticsData toUiModel(@NotNull ProductListQuery.BannerAnalytics bannerAnalytics) {
        List arrayList;
        Intrinsics.h(bannerAnalytics, "<this>");
        String str = bannerAnalytics.getAnalyticsFields().f10032a;
        String str2 = bannerAnalytics.getAnalyticsFields().b;
        String str3 = bannerAnalytics.getAnalyticsFields().c;
        String str4 = bannerAnalytics.getAnalyticsFields().e;
        String str5 = bannerAnalytics.getAnalyticsFields().f;
        String str6 = bannerAnalytics.getAnalyticsFields().g;
        String str7 = bannerAnalytics.getAnalyticsFields().d;
        String str8 = bannerAnalytics.getAnalyticsFields().h;
        String str9 = bannerAnalytics.getAnalyticsFields().i;
        List list = bannerAnalytics.getAnalyticsFields().j;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it.next()));
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
