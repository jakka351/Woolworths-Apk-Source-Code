package au.com.woolworths.shop.lists.data;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemInteractor", f = "ShoppingListItemInteractor.kt", l = {DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 216, BERTags.FLAGS, 237}, m = "duplicateItems")
/* loaded from: classes4.dex */
final class ShoppingListItemInteractor$duplicateItems$1 extends ContinuationImpl {
    public String p;
    public Object q;
    public Iterator r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ShoppingListItemInteractor t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemInteractor$duplicateItems$1(ShoppingListItemInteractor shoppingListItemInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = shoppingListItemInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(null, null, this);
    }
}
