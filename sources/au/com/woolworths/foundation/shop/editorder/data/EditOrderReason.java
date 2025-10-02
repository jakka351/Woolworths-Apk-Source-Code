package au.com.woolworths.foundation.shop.editorder.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderReason;", "", "<init>", "(Ljava/lang/String;I)V", "WINDOW_CLOSED", "NOT_FOUND", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderReason {

    @SerializedName("NOT_FOUND")
    public static final EditOrderReason NOT_FOUND;

    @SerializedName("WINDOW_CLOSED")
    public static final EditOrderReason WINDOW_CLOSED;
    public static final EditOrderReason d;
    public static final /* synthetic */ EditOrderReason[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        EditOrderReason editOrderReason = new EditOrderReason("WINDOW_CLOSED", 0);
        WINDOW_CLOSED = editOrderReason;
        EditOrderReason editOrderReason2 = new EditOrderReason("NOT_FOUND", 1);
        NOT_FOUND = editOrderReason2;
        EditOrderReason editOrderReason3 = new EditOrderReason("UNKNOWN", 2);
        d = editOrderReason3;
        EditOrderReason[] editOrderReasonArr = {editOrderReason, editOrderReason2, editOrderReason3};
        e = editOrderReasonArr;
        f = EnumEntriesKt.a(editOrderReasonArr);
    }

    private EditOrderReason(String str, int i) {
    }

    public static EditOrderReason valueOf(String str) {
        return (EditOrderReason) Enum.valueOf(EditOrderReason.class, str);
    }

    public static EditOrderReason[] values() {
        return (EditOrderReason[]) e.clone();
    }
}
