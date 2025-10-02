package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.woolworths.product.list.legacy.fragment.VideoAdBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VideoAdBottomSheetImpressionAnalyticsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final AnalyticsData a(VideoAdBottomSheet.ImpressionAnalytics impressionAnalytics) {
        List arrayList;
        String str = impressionAnalytics.getAnalyticsFields().f10032a;
        String str2 = impressionAnalytics.getAnalyticsFields().b;
        String str3 = impressionAnalytics.getAnalyticsFields().c;
        String str4 = impressionAnalytics.getAnalyticsFields().e;
        String str5 = impressionAnalytics.getAnalyticsFields().f;
        String str6 = impressionAnalytics.getAnalyticsFields().g;
        String str7 = impressionAnalytics.getAnalyticsFields().d;
        String str8 = impressionAnalytics.getAnalyticsFields().h;
        String str9 = impressionAnalytics.getAnalyticsFields().i;
        List list = impressionAnalytics.getAnalyticsFields().j;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(au.com.woolworths.product.models.AnalyticsFieldsExtraContentExtKt.toUiModel((AnalyticsFields.ExtraContent) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new AnalyticsData((EventConfig) null, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, 1, (DefaultConstructorMarker) null);
    }
}
