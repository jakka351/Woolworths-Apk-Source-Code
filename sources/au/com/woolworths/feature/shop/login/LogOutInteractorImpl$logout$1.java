package au.com.woolworths.feature.shop.login;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.LogOutInteractorImpl", f = "LogOutInteractorImpl.kt", l = {45, 47, 51, 59}, m = "logout")
/* loaded from: classes3.dex */
final class LogOutInteractorImpl$logout$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LogOutInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogOutInteractorImpl$logout$1(LogOutInteractorImpl logOutInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = logOutInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
