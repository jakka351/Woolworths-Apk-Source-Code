package au.com.woolworths.foundation.shop.editorder.data;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/SetEditOrderStatusResponse;", "", "", "success", "", "message", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderReason;", "reason", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "currentMode", "<init>", "(ZLjava/lang/String;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderReason;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;)V", "Z", "d", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderReason;", "c", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderReason;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "a", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetEditOrderStatusResponse {

    @SerializedName("currentMode")
    @NotNull
    private final EditOrderMode currentMode;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("reason")
    @Nullable
    private final EditOrderReason reason;

    @SerializedName("success")
    private final boolean success;

    public SetEditOrderStatusResponse(boolean z, @Nullable String str, @Nullable EditOrderReason editOrderReason, @NotNull EditOrderMode currentMode) {
        Intrinsics.h(currentMode, "currentMode");
        this.success = z;
        this.message = str;
        this.reason = editOrderReason;
        this.currentMode = currentMode;
    }

    /* renamed from: a, reason: from getter */
    public final EditOrderMode getCurrentMode() {
        return this.currentMode;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final EditOrderReason getReason() {
        return this.reason;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetEditOrderStatusResponse)) {
            return false;
        }
        SetEditOrderStatusResponse setEditOrderStatusResponse = (SetEditOrderStatusResponse) obj;
        return this.success == setEditOrderStatusResponse.success && Intrinsics.c(this.message, setEditOrderStatusResponse.message) && this.reason == setEditOrderStatusResponse.reason && this.currentMode == setEditOrderStatusResponse.currentMode;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EditOrderReason editOrderReason = this.reason;
        return this.currentMode.hashCode() + ((iHashCode2 + (editOrderReason != null ? editOrderReason.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z = this.success;
        String str = this.message;
        EditOrderReason editOrderReason = this.reason;
        EditOrderMode editOrderMode = this.currentMode;
        StringBuilder sbT = a.t("SetEditOrderStatusResponse(success=", ", message=", str, ", reason=", z);
        sbT.append(editOrderReason);
        sbT.append(", currentMode=");
        sbT.append(editOrderMode);
        sbT.append(")");
        return sbT.toString();
    }
}
