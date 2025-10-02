package au.com.woolworths.shop.lists.data.sync.scheduler;

import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncSchedulerKt {
    public static final boolean a(ShoppingListsRepository shoppingListsRepository) {
        long jB = ListsDataUtilsKt.b() - ((Number) shoppingListsRepository.b.getValue(shoppingListsRepository, ShoppingListsRepository.j[0])).longValue();
        return jB > 1800000 || jB < 0;
    }
}
