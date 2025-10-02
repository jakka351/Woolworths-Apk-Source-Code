package au.com.woolworths.shop.addtolist.domain;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor", f = "CreateShoppingListInteractor.kt", l = {85}, m = "addProductIdsToList")
/* loaded from: classes4.dex */
final class CreateShoppingListInteractor$addProductIdsToList$1 extends ContinuationImpl {
    public String p;
    public Iterator q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CreateShoppingListInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListInteractor$addProductIdsToList$1(CreateShoppingListInteractor createShoppingListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = createShoppingListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, this);
    }
}
