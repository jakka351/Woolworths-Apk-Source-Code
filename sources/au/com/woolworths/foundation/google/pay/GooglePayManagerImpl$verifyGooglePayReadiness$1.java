package au.com.woolworths.foundation.google.pay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.google.pay.GooglePayManagerImpl", f = "GooglePayManagerImpl.kt", l = {43}, m = "verifyGooglePayReadiness")
/* loaded from: classes4.dex */
final class GooglePayManagerImpl$verifyGooglePayReadiness$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ GooglePayManagerImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayManagerImpl$verifyGooglePayReadiness$1(GooglePayManagerImpl googlePayManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = googlePayManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(null, this);
    }
}
