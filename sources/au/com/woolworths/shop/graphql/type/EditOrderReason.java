package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/EditOrderReason;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderReason {
    public static final Companion e;
    public static final EnumType f;
    public static final EditOrderReason g;
    public static final /* synthetic */ EditOrderReason[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/EditOrderReason$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        EditOrderReason editOrderReason = new EditOrderReason("WINDOW_CLOSED", 0, "WINDOW_CLOSED");
        EditOrderReason editOrderReason2 = new EditOrderReason("NOT_FOUND", 1, "NOT_FOUND");
        EditOrderReason editOrderReason3 = new EditOrderReason("IS_ALREADY_AMENDING", 2, "IS_ALREADY_AMENDING");
        EditOrderReason editOrderReason4 = new EditOrderReason("UNKNOWN__", 3, "UNKNOWN__");
        g = editOrderReason4;
        EditOrderReason[] editOrderReasonArr = {editOrderReason, editOrderReason2, editOrderReason3, editOrderReason4};
        h = editOrderReasonArr;
        i = EnumEntriesKt.a(editOrderReasonArr);
        e = new Companion();
        f = new EnumType("EditOrderReason", CollectionsKt.R("WINDOW_CLOSED", "NOT_FOUND", "IS_ALREADY_AMENDING"));
    }

    public EditOrderReason(String str, int i2, String str2) {
        this.d = str2;
    }

    public static EditOrderReason valueOf(String str) {
        return (EditOrderReason) Enum.valueOf(EditOrderReason.class, str);
    }

    public static EditOrderReason[] values() {
        return (EditOrderReason[]) h.clone();
    }
}
