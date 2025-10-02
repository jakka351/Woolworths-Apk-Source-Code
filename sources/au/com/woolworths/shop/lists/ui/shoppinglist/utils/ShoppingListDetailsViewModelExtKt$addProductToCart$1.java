package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListDetailsViewModelExtKt", f = "ShoppingListDetailsViewModelExt.kt", l = {116}, m = "addProductToCart")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModelExtKt$addProductToCart$1 extends ContinuationImpl {
    public Result p;
    public ProductItemUiModel q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return ShoppingListDetailsViewModelExtKt.b(null, null, null, this);
    }
}
