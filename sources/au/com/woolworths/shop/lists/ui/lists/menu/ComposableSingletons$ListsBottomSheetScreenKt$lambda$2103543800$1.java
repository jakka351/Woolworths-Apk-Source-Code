package au.com.woolworths.shop.lists.ui.lists.menu;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import au.com.woolworths.shop.lists.ui.utils.MenuItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.lists.ui.lists.menu.ComposableSingletons$ListsBottomSheetScreenKt$lambda$-2103543800$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListsBottomSheetScreenKt$lambda$2103543800$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new MenuItem.AddAllToCart(true), new MenuItem.Edit(), new MenuItem.Duplicate(), new MenuItem.Delete(true), new MenuItem.RemoveAll(true));
            ShoppingList shoppingList = new ShoppingList(null, "My shopping list", -1237980, 0L, null, null, 49, null);
            EmptyList emptyList = EmptyList.d;
            ListsBottomSheetContract.ViewState viewState = new ListsBottomSheetContract.ViewState(listR, new ShoppingListWithItems(shoppingList, emptyList, emptyList));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(18);
                composer.A(objG);
            }
            composer.l();
            ListsBottomSheetScreenKt.a(viewState, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
