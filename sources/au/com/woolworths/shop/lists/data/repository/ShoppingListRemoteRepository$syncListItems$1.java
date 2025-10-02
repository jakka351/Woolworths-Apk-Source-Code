package au.com.woolworths.shop.lists.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository", f = "ShoppingListRemoteRepository.kt", l = {91}, m = "syncListItems")
/* loaded from: classes4.dex */
final class ShoppingListRemoteRepository$syncListItems$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListRemoteRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListRemoteRepository$syncListItems$1(ShoppingListRemoteRepository shoppingListRemoteRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingListRemoteRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
