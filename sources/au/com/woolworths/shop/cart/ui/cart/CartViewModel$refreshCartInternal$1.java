package au.com.woolworths.shop.cart.ui.cart;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel", f = "CartViewModel.kt", l = {636}, m = "refreshCartInternal")
/* loaded from: classes4.dex */
final class CartViewModel$refreshCartInternal$1 extends ContinuationImpl {
    public Function0 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CartViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$refreshCartInternal$1(CartViewModel cartViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = cartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return CartViewModel.p6(this.r, null, this);
    }
}
