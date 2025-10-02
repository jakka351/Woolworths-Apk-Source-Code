package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl", f = "CredentialsInteractor.kt", l = {26}, m = "apiAuthenticate")
/* loaded from: classes3.dex */
final class CredentialsInteractorImpl$apiAuthenticate$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CredentialsInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsInteractorImpl$apiAuthenticate$1(CredentialsInteractorImpl credentialsInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = credentialsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
