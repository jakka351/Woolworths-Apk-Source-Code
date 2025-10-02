package au.com.woolworths.feature.shop.account.domain.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.domain.details.AccountDetailsRepository", f = "AccountDetailsRepository.kt", l = {23}, m = "fetchAccountDetails")
/* loaded from: classes3.dex */
final class AccountDetailsRepository$fetchAccountDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AccountDetailsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsRepository$fetchAccountDetails$1(AccountDetailsRepository accountDetailsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = accountDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
