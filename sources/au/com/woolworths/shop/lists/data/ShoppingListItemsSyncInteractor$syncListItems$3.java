package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor", f = "ShoppingListItemsSyncInteractor.kt", l = {73}, m = "syncListItems")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncInteractor$syncListItems$3 extends ContinuationImpl {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListItemsSyncInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncInteractor$syncListItems$3(ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shoppingListItemsSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, null, this);
    }
}
