package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/analytics/model/AnalyticsExtraContent;", "Lau/com/woolworths/sdui/shop/fragment/AnalyticsFields$ExtraContent;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnalyticsFieldsExtraContentExtKt {
    @NotNull
    public static final AnalyticsExtraContent toUiModel(@NotNull AnalyticsFields.ExtraContent extraContent) {
        List arrayList;
        Intrinsics.h(extraContent, "<this>");
        String str = extraContent.f10033a;
        String str2 = extraContent.b;
        List list = extraContent.c;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = EmptyList.d;
        }
        return new AnalyticsExtraContent(str, str2, arrayList);
    }
}
