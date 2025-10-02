package au.com.woolworths.feature.shop.login;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.LoginInteractor", f = "LoginInteractor.kt", l = {50, 68}, m = "finalizeLogin")
/* loaded from: classes3.dex */
final class LoginInteractor$finalizeLogin$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LoginInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginInteractor$finalizeLogin$1(LoginInteractor loginInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = loginInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
