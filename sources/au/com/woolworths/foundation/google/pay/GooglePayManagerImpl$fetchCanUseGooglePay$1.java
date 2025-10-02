package au.com.woolworths.foundation.google.pay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.google.pay.GooglePayManagerImpl", f = "GooglePayManagerImpl.kt", l = {60}, m = "fetchCanUseGooglePay")
/* loaded from: classes4.dex */
final class GooglePayManagerImpl$fetchCanUseGooglePay$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ GooglePayManagerImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayManagerImpl$fetchCanUseGooglePay$1(GooglePayManagerImpl googlePayManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = googlePayManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
