package au.com.woolworths.foundation.shop.editorder.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderStatus;", "", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "mode", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderDetails;", ErrorBundle.DETAIL_ENTRY, "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMessage;", "message", "<init>", "(Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderDetails;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMessage;)V", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "d", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderDetails;", "b", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderDetails;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMessage;", "c", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMessage;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EditOrderStatus {

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @Nullable
    private final EditOrderDetails details;

    @SerializedName("message")
    @Nullable
    private final EditOrderMessage message;

    @SerializedName("mode")
    @NotNull
    private final EditOrderMode mode;

    public EditOrderStatus(@NotNull EditOrderMode mode, @Nullable EditOrderDetails editOrderDetails, @Nullable EditOrderMessage editOrderMessage) {
        Intrinsics.h(mode, "mode");
        this.mode = mode;
        this.details = editOrderDetails;
        this.message = editOrderMessage;
    }

    public static EditOrderStatus a(EditOrderStatus editOrderStatus, EditOrderMode mode, int i) {
        if ((i & 1) != 0) {
            mode = editOrderStatus.mode;
        }
        EditOrderDetails editOrderDetails = editOrderStatus.details;
        EditOrderMessage editOrderMessage = (i & 4) != 0 ? editOrderStatus.message : null;
        Intrinsics.h(mode, "mode");
        return new EditOrderStatus(mode, editOrderDetails, editOrderMessage);
    }

    /* renamed from: b, reason: from getter */
    public final EditOrderDetails getDetails() {
        return this.details;
    }

    /* renamed from: c, reason: from getter */
    public final EditOrderMessage getMessage() {
        return this.message;
    }

    /* renamed from: d, reason: from getter */
    public final EditOrderMode getMode() {
        return this.mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderStatus)) {
            return false;
        }
        EditOrderStatus editOrderStatus = (EditOrderStatus) obj;
        return this.mode == editOrderStatus.mode && Intrinsics.c(this.details, editOrderStatus.details) && Intrinsics.c(this.message, editOrderStatus.message);
    }

    public final int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        EditOrderDetails editOrderDetails = this.details;
        int iHashCode2 = (iHashCode + (editOrderDetails == null ? 0 : editOrderDetails.hashCode())) * 31;
        EditOrderMessage editOrderMessage = this.message;
        return iHashCode2 + (editOrderMessage != null ? editOrderMessage.hashCode() : 0);
    }

    public final String toString() {
        return "EditOrderStatus(mode=" + this.mode + ", details=" + this.details + ", message=" + this.message + ")";
    }
}
