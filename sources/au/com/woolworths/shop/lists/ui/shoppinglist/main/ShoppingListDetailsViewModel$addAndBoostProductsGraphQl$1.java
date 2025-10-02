package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel", f = "ShoppingListDetailsViewModel.kt", l = {1254}, m = "addAndBoostProductsGraphQl")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1 extends ContinuationImpl {
    public ArrayList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListDetailsViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shoppingListDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v6(null, this);
    }
}
