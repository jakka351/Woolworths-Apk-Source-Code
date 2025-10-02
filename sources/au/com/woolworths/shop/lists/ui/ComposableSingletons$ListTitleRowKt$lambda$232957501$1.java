package au.com.woolworths.shop.lists.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.ComposableSingletons$ListTitleRowKt$lambda$-232957501$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListTitleRowKt$lambda$232957501$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ListTitleRowKt.a(new ShoppingListWithItems(new ShoppingList(null, "My watch list", 0, 0L, Boolean.TRUE, null, 37, null), ListTitleRowKt.d(), EmptyList.d), null, null, null, composer, 0, 14);
        }
        return Unit.f24250a;
    }
}
