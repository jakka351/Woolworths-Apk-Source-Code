package au.com.woolworths.shop.lists.data.workers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker", f = "ShoppingListItemsSyncWorker.kt", l = {91}, m = "syncSingleListItems")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncWorker$syncSingleListItems$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListItemsSyncWorker q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker$syncSingleListItems$1(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingListItemsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(false, null, this);
    }
}
