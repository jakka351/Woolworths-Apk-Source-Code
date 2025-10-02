package au.com.woolworths.feature.product.list.ui;

import au.com.woolworths.feature.product.list.data.FilterInsetBannerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterOptionKt {
    public static final ArrayList a(List list) {
        Intrinsics.h(list, "<this>");
        List<FilterOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (FilterOption filterOption : list2) {
            List list3 = filterOption.f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(FilterMenuItem.a((FilterMenuItem) it.next()));
            }
            String key = filterOption.d;
            String headerTitle = filterOption.e;
            int i = filterOption.g;
            FilterInsetBannerData filterInsetBannerData = filterOption.h;
            Intrinsics.h(key, "key");
            Intrinsics.h(headerTitle, "headerTitle");
            arrayList.add(new FilterOption(key, headerTitle, arrayList2, i, filterInsetBannerData));
        }
        return arrayList;
    }
}
