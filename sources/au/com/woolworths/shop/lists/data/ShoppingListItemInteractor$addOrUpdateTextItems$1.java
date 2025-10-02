package au.com.woolworths.shop.lists.data;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemInteractor", f = "ShoppingListItemInteractor.kt", l = {163, 183, BERTags.PRIVATE}, m = "addOrUpdateTextItems")
/* loaded from: classes4.dex */
final class ShoppingListItemInteractor$addOrUpdateTextItems$1 extends ContinuationImpl {
    public Object p;
    public List q;
    public Iterator r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ShoppingListItemInteractor u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemInteractor$addOrUpdateTextItems$1(ShoppingListItemInteractor shoppingListItemInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = shoppingListItemInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(null, null, this);
    }
}
