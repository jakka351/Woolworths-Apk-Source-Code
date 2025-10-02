package au.com.woolworths.feature.shop.instore.cart.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepositoryImpl", f = "InstoreCartRepositoryImpl.kt", l = {27}, m = "fetchInstoreCartData")
/* loaded from: classes3.dex */
final class InstoreCartRepositoryImpl$fetchInstoreCartData$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InstoreCartRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreCartRepositoryImpl$fetchInstoreCartData$1(InstoreCartRepositoryImpl instoreCartRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = instoreCartRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
