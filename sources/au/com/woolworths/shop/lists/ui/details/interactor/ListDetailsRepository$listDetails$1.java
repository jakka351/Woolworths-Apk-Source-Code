package au.com.woolworths.shop.lists.ui.details.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsRepository", f = "ListDetailsRepository.kt", l = {77}, m = "listDetails")
/* loaded from: classes4.dex */
final class ListDetailsRepository$listDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ListDetailsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListDetailsRepository$listDetails$1(ListDetailsRepository listDetailsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = listDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
