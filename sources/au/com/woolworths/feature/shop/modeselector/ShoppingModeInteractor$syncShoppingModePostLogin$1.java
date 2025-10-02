package au.com.woolworths.feature.shop.modeselector;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor", f = "ShoppingModeInteractor.kt", l = {71}, m = "syncShoppingModePostLogin")
/* loaded from: classes3.dex */
final class ShoppingModeInteractor$syncShoppingModePostLogin$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingModeInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingModeInteractor$syncShoppingModePostLogin$1(ShoppingModeInteractor shoppingModeInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingModeInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.W(this);
    }
}
