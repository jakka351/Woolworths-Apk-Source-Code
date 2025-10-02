package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListDetailsViewModelExtKt", f = "ShoppingListDetailsViewModelExt.kt", l = {170}, m = "addAllToCart")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModelExtKt$addAllToCart$1 extends ContinuationImpl {
    public Result p;
    public List q;
    public UpdateProductInCartExtras[] r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return ShoppingListDetailsViewModelExtKt.a(null, null, null, this);
    }
}
