package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.shop.lists.data.remote.SuggestedListsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedListsQuery$Item;", "shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedListsQueryItemExtKt {
    @NotNull
    public static final SuggestedListItem toUiModel(@NotNull SuggestedListsQuery.Item item) {
        Intrinsics.h(item, "<this>");
        return new SuggestedListItem(item.getId(), item.getName(), item.getImage());
    }
}
