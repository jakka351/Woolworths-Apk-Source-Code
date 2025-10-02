package au.com.woolworths.feature.rewards.account.settings.v2;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsInteractor", f = "AccountSettingsInteractor.kt", l = {33}, m = "fetchAccountMenu")
/* loaded from: classes3.dex */
final class AccountSettingsInteractor$fetchAccountMenu$1 extends ContinuationImpl {
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AccountSettingsInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsInteractor$fetchAccountMenu$1(AccountSettingsInteractor accountSettingsInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = accountSettingsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
