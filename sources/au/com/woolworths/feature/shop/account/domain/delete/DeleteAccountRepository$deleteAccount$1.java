package au.com.woolworths.feature.shop.account.domain.delete;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountRepository", f = "DeleteAccountRepository.kt", l = {33}, m = "deleteAccount")
/* loaded from: classes3.dex */
final class DeleteAccountRepository$deleteAccount$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DeleteAccountRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountRepository$deleteAccount$1(DeleteAccountRepository deleteAccountRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = deleteAccountRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
