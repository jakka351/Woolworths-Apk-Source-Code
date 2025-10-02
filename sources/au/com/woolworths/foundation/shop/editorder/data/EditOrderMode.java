package au.com.woolworths.foundation.shop.editorder.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMode;", "", "<init>", "(Ljava/lang/String;I)V", "EDITING", "NOT_EDITING", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditOrderMode {

    @SerializedName("EDITING")
    public static final EditOrderMode EDITING;

    @DefaultValue
    @SerializedName("NOT_EDITING")
    public static final EditOrderMode NOT_EDITING;
    public static final /* synthetic */ EditOrderMode[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        EditOrderMode editOrderMode = new EditOrderMode("EDITING", 0);
        EDITING = editOrderMode;
        EditOrderMode editOrderMode2 = new EditOrderMode("NOT_EDITING", 1);
        NOT_EDITING = editOrderMode2;
        EditOrderMode[] editOrderModeArr = {editOrderMode, editOrderMode2};
        d = editOrderModeArr;
        e = EnumEntriesKt.a(editOrderModeArr);
    }

    private EditOrderMode(String str, int i) {
    }

    public static EditOrderMode valueOf(String str) {
        return (EditOrderMode) Enum.valueOf(EditOrderMode.class, str);
    }

    public static EditOrderMode[] values() {
        return (EditOrderMode[]) d.clone();
    }
}
