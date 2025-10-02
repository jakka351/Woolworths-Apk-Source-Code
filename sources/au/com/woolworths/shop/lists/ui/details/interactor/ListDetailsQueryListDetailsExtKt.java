package au.com.woolworths.shop.lists.ui.details.interactor;

import au.com.woolworths.shop.lists.ListDetailsQuery;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsPotentialSavings;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsProductAction;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsRewardsSummary;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotal;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalDisclaimer;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalOverview;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionHeader;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsQueryListDetailsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final ListDetails a(ListDetailsQuery.ListDetails listDetails) {
        ListDetailsTotal listDetailsTotal;
        ListDetailsTotalSummary listDetailsTotalSummary;
        Object listDetailsRewardsSummary;
        ListDetailsQuery.Total total = listDetails.f12218a;
        ?? arrayList = 0;
        if (total != null) {
            ListDetailsQuery.Overview overview = total.c;
            ListDetailsTotalOverview listDetailsTotalOverview = overview != null ? new ListDetailsTotalOverview(overview.f12222a, overview.b, overview.c) : null;
            ListDetailsQuery.Summary summary = total.f12226a;
            if (summary != null) {
                ArrayList<ListDetailsQuery.Section> arrayList2 = summary.f12225a;
                ArrayList arrayList3 = new ArrayList();
                for (ListDetailsQuery.Section section : arrayList2) {
                    ListDetailsQuery.OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeader = section.b;
                    if (onListDetailsTotalSectionHeader != null) {
                        listDetailsRewardsSummary = new ListDetailsTotalSectionHeader(onListDetailsTotalSectionHeader.f12221a, onListDetailsTotalSectionHeader.b, null);
                    } else {
                        ListDetailsQuery.OnListDetailsPotentialSavings onListDetailsPotentialSavings = section.c;
                        if (onListDetailsPotentialSavings != null) {
                            listDetailsRewardsSummary = new ListDetailsPotentialSavings(onListDetailsPotentialSavings.f12219a, onListDetailsPotentialSavings.b);
                        } else {
                            ListDetailsQuery.OnListDetailsRewardsSummary onListDetailsRewardsSummary = section.d;
                            listDetailsRewardsSummary = onListDetailsRewardsSummary != null ? new ListDetailsRewardsSummary(onListDetailsRewardsSummary.f12220a, onListDetailsRewardsSummary.b, onListDetailsRewardsSummary.c) : null;
                        }
                    }
                    if (listDetailsRewardsSummary != null) {
                        arrayList3.add(listDetailsRewardsSummary);
                    }
                }
                listDetailsTotalSummary = new ListDetailsTotalSummary(arrayList3);
            } else {
                listDetailsTotalSummary = null;
            }
            ListDetailsQuery.Disclaimer disclaimer = total.b;
            listDetailsTotal = new ListDetailsTotal(listDetailsTotalOverview, listDetailsTotalSummary, disclaimer != null ? new ListDetailsTotalDisclaimer(disclaimer.f12217a) : null);
        } else {
            listDetailsTotal = null;
        }
        List list = listDetails.b;
        if (list != null) {
            List<ListDetailsQuery.ProductAction> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (ListDetailsQuery.ProductAction productAction : list2) {
                Intrinsics.h(productAction, "<this>");
                arrayList.add(new ListDetailsProductAction(productAction.f12223a, productAction.b, productAction.c));
            }
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new ListDetails(listDetailsTotal, arrayList);
    }
}
