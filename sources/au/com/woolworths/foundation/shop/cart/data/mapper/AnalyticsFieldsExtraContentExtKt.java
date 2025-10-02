package au.com.woolworths.foundation.shop.cart.data.mapper;

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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnalyticsFieldsExtraContentExtKt {
    public static final AnalyticsExtraContent a(AnalyticsFields.ExtraContent extraContent) {
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
