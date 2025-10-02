package au.com.woolworths.shop.lists.data.repository;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository", f = "ShoppingListLocalRepository.kt", l = {328, 332, 341}, m = "applyDelta$shop_lists_data_release")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$applyDelta$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Iterator r;
    public Ref.IntRef s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ShoppingListLocalRepository v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$applyDelta$1(ShoppingListLocalRepository shoppingListLocalRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = shoppingListLocalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
