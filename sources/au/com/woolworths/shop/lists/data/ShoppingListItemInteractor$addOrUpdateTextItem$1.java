package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemInteractor", f = "ShoppingListItemInteractor.kt", l = {123, 132, 141}, m = "addOrUpdateTextItem")
/* loaded from: classes4.dex */
final class ShoppingListItemInteractor$addOrUpdateTextItem$1 extends ContinuationImpl {
    public Object p;
    public String q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ShoppingListItemInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemInteractor$addOrUpdateTextItem$1(ShoppingListItemInteractor shoppingListItemInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = shoppingListItemInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, null, this);
    }
}
