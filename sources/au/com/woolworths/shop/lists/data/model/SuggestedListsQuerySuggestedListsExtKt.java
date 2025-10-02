package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.shop.lists.data.remote.SuggestedListsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/lists/data/model/SuggestedLists;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$SuggestedLists;", "shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListsQuerySuggestedListsExtKt {
    @NotNull
    public static final SuggestedLists toUiModel(@NotNull SuggestedListsQuery.SuggestedLists suggestedLists) {
        Intrinsics.h(suggestedLists, "<this>");
        int totalItemCount = suggestedLists.getTotalItemCount();
        Integer nextPage = suggestedLists.getNextPage();
        List<SuggestedListsQuery.Item> items = suggestedLists.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(SuggestedListsQueryItemExtKt.toUiModel((SuggestedListsQuery.Item) it.next()));
        }
        return new SuggestedLists(totalItemCount, nextPage, arrayList);
    }
}
