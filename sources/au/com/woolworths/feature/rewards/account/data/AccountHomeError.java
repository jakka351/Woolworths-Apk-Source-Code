package au.com.woolworths.feature.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsErrorStateOld;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeError;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeError {

    /* renamed from: a, reason: collision with root package name */
    public final AccountSettingsErrorStateOld f5700a;

    public AccountHomeError(AccountSettingsErrorStateOld accountSettingsErrorStateOld) {
        this.f5700a = accountSettingsErrorStateOld;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountHomeError) && this.f5700a == ((AccountHomeError) obj).f5700a;
    }

    public final int hashCode() {
        return this.f5700a.hashCode();
    }

    public final String toString() {
        return "AccountHomeError(errorState=" + this.f5700a + ")";
    }
}
