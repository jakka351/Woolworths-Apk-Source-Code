package au.com.woolworths.feature.shop.myorders.editdriverinstruction.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/models/EditDriverInstructionsResponse;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EditDriverInstructionsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7834a;
    public final EditDriverInstructionsReason b;
    public final String c;

    public EditDriverInstructionsResponse(boolean z, EditDriverInstructionsReason editDriverInstructionsReason, String str) {
        this.f7834a = z;
        this.b = editDriverInstructionsReason;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDriverInstructionsResponse)) {
            return false;
        }
        EditDriverInstructionsResponse editDriverInstructionsResponse = (EditDriverInstructionsResponse) obj;
        return this.f7834a == editDriverInstructionsResponse.f7834a && this.b == editDriverInstructionsResponse.b && Intrinsics.c(this.c, editDriverInstructionsResponse.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7834a) * 31;
        EditDriverInstructionsReason editDriverInstructionsReason = this.b;
        int iHashCode2 = (iHashCode + (editDriverInstructionsReason == null ? 0 : editDriverInstructionsReason.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditDriverInstructionsResponse(success=");
        sb.append(this.f7834a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", message=");
        return a.o(sb, this.c, ")");
    }
}
