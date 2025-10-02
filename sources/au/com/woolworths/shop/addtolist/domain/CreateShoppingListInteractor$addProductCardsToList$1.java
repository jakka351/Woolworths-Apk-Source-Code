package au.com.woolworths.shop.addtolist.domain;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor", f = "CreateShoppingListInteractor.kt", l = {67, 72}, m = "addProductCardsToList")
/* loaded from: classes4.dex */
final class CreateShoppingListInteractor$addProductCardsToList$1 extends ContinuationImpl {
    public String p;
    public Map q;
    public Iterator r;
    public /* synthetic */ Object s;
    public final /* synthetic */ CreateShoppingListInteractor t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListInteractor$addProductCardsToList$1(CreateShoppingListInteractor createShoppingListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = createShoppingListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, null, this);
    }
}
