package au.com.woolworths.shop.lists.data.workers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker", f = "ShoppingListsSyncWorker.kt", l = {46}, m = "syncLists")
/* loaded from: classes4.dex */
final class ShoppingListsSyncWorker$syncLists$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListsSyncWorker q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsSyncWorker$syncLists$1(ShoppingListsSyncWorker shoppingListsSyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingListsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
