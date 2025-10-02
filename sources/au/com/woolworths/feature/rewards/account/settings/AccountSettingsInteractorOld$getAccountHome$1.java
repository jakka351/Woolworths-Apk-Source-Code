package au.com.woolworths.feature.rewards.account.settings;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsInteractorOld", f = "AccountSettingsInteractorOld.kt", l = {39}, m = "getAccountHome")
/* loaded from: classes3.dex */
final class AccountSettingsInteractorOld$getAccountHome$1 extends ContinuationImpl {
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AccountSettingsInteractorOld r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsInteractorOld$getAccountHome$1(AccountSettingsInteractorOld accountSettingsInteractorOld, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = accountSettingsInteractorOld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
