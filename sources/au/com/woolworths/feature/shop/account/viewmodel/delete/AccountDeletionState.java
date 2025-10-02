package au.com.woolworths.feature.shop.account.viewmodel.delete;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountResultData;
import au.com.woolworths.feature.shop.account.ui.model.DeletionError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/AccountDeletionState;", "", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountDeletionState {
    public static final AccountDeletionState d = new AccountDeletionState(null, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final DeleteAccountResultData f6588a;
    public final boolean b;
    public final DeletionError c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/AccountDeletionState$Companion;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AccountDeletionState(DeleteAccountResultData deleteAccountResultData, boolean z, DeletionError deletionError) {
        this.f6588a = deleteAccountResultData;
        this.b = z;
        this.c = deletionError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDeletionState)) {
            return false;
        }
        AccountDeletionState accountDeletionState = (AccountDeletionState) obj;
        return Intrinsics.c(this.f6588a, accountDeletionState.f6588a) && this.b == accountDeletionState.b && Intrinsics.c(this.c, accountDeletionState.c);
    }

    public final int hashCode() {
        DeleteAccountResultData deleteAccountResultData = this.f6588a;
        int iE = b.e((deleteAccountResultData == null ? 0 : Boolean.hashCode(deleteAccountResultData.f6572a)) * 31, 31, this.b);
        DeletionError deletionError = this.c;
        return iE + (deletionError != null ? deletionError.hashCode() : 0);
    }

    public final String toString() {
        return "AccountDeletionState(deletionResult=" + this.f6588a + ", deleting=" + this.b + ", deletionError=" + this.c + ")";
    }
}
