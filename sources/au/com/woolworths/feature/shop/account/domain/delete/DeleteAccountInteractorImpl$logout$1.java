package au.com.woolworths.feature.shop.account.domain.delete;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl", f = "DeleteAccountInteractor.kt", l = {47, 48, 49}, m = "logout")
/* loaded from: classes3.dex */
final class DeleteAccountInteractorImpl$logout$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DeleteAccountInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountInteractorImpl$logout$1(DeleteAccountInteractorImpl deleteAccountInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = deleteAccountInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
