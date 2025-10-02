package au.com.woolworths.shop.lists.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListTitleRowKt$lambda$1671159417$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShoppingList shoppingList = new ShoppingList(null, "My watch list", 0, 0L, Boolean.TRUE, null, 37, null);
            EmptyList emptyList = EmptyList.d;
            ListTitleRowKt.a(new ShoppingListWithItems(shoppingList, emptyList, emptyList), null, StringResources_androidKt.c(composer, R.string.shop_lists_watchlist_subtitle), null, composer, 0, 10);
        }
        return Unit.f24250a;
    }
}
