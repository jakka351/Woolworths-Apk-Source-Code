package au.com.woolworths.feature.shop.account.viewmodel.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel", f = "AccountDetailsViewModel.kt", l = {71}, m = "openMagicLinkWithAuthUpliftCheck")
/* loaded from: classes3.dex */
final class AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AccountDetailsViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsViewModel$openMagicLinkWithAuthUpliftCheck$1(AccountDetailsViewModel accountDetailsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = accountDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return AccountDetailsViewModel.p6(this.r, null, this);
    }
}
