package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor", f = "ShoppingListItemsSyncInteractor.kt", l = {154}, m = "syncProducts$shop_lists_data_release")
/* loaded from: classes.dex */
final class ShoppingListItemsSyncInteractor$syncProducts$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListItemsSyncInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncInteractor$syncProducts$1(ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingListItemsSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
