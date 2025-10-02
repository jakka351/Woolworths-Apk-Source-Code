package au.com.woolworths.feature.shop.account.model.delete;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/delete/DeleteAccountResultData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteAccountResultData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6572a;

    public DeleteAccountResultData(boolean z) {
        this.f6572a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAccountResultData) && this.f6572a == ((DeleteAccountResultData) obj).f6572a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6572a);
    }

    public final String toString() {
        return a.n("DeleteAccountResultData(success=", ")", this.f6572a);
    }
}
