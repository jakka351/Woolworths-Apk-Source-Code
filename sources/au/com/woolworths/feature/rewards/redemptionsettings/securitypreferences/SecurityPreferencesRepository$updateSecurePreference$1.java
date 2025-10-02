package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesRepository", f = "SecurityPreferencesRepository.kt", l = {69}, m = "updateSecurePreference")
/* loaded from: classes3.dex */
final class SecurityPreferencesRepository$updateSecurePreference$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SecurityPreferencesRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPreferencesRepository$updateSecurePreference$1(SecurityPreferencesRepository securityPreferencesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = securityPreferencesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(false, this);
    }
}
