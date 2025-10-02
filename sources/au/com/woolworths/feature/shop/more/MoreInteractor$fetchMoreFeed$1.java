package au.com.woolworths.feature.shop.more;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreInteractor", f = "MoreInteractor.kt", l = {38, 40}, m = "fetchMoreFeed$more_release")
/* loaded from: classes3.dex */
final class MoreInteractor$fetchMoreFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MoreInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreInteractor$fetchMoreFeed$1(MoreInteractor moreInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = moreInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
