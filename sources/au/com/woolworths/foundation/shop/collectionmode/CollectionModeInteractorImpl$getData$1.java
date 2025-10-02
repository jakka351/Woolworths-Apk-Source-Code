package au.com.woolworths.foundation.shop.collectionmode;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl", f = "CollectionModeInteractorImpl.kt", l = {234}, m = "getData")
/* loaded from: classes4.dex */
final class CollectionModeInteractorImpl$getData$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CollectionModeInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionModeInteractorImpl$getData$1(CollectionModeInteractorImpl collectionModeInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = collectionModeInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.T(this);
    }
}
