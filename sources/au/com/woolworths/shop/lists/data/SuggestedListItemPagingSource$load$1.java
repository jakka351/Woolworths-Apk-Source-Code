package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource", f = "SuggestedListsInteractor.kt", l = {66}, m = "load")
/* loaded from: classes4.dex */
final class SuggestedListItemPagingSource$load$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SuggestedListItemPagingSource q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedListItemPagingSource$load$1(SuggestedListItemPagingSource suggestedListItemPagingSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = suggestedListItemPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
