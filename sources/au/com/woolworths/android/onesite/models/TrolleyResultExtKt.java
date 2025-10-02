package au.com.woolworths.android.onesite.models;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.trolley.MarketplaceProductGroup;
import au.com.woolworths.android.onesite.models.trolley.MarketplaceProducts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"allGroceryAndMarketItems", "", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "getAllGroceryAndMarketItems", "(Lau/com/woolworths/android/onesite/models/TrolleyResult;)Ljava/util/List;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TrolleyResultExtKt {
    @NotNull
    public static final List<TrolleyResult.TrolleyItem> getAllGroceryAndMarketItems(@NotNull TrolleyResult trolleyResult) {
        List arrayList;
        List<MarketplaceProductGroup> groups;
        Intrinsics.h(trolleyResult, "<this>");
        MarketplaceProducts marketplaceProducts = trolleyResult.getMarketplaceProducts();
        if (marketplaceProducts == null || (groups = marketplaceProducts.getGroups()) == null) {
            arrayList = EmptyList.d;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((MarketplaceProductGroup) it.next()).getItems(), arrayList);
            }
        }
        return CollectionsKt.c0(arrayList, trolleyResult.getTrolleyItems());
    }
}
