package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/LineItemStatus;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LineItemStatus {
    public static final Companion e;
    public static final LineItemStatus f;
    public static final /* synthetic */ LineItemStatus[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/LineItemStatus$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        LineItemStatus lineItemStatus = new LineItemStatus("OPEN", 0, "OPEN");
        LineItemStatus lineItemStatus2 = new LineItemStatus("CONFIRMED", 1, "CONFIRMED");
        LineItemStatus lineItemStatus3 = new LineItemStatus("SHIPPED", 2, "SHIPPED");
        LineItemStatus lineItemStatus4 = new LineItemStatus("CANCELLED", 3, "CANCELLED");
        LineItemStatus lineItemStatus5 = new LineItemStatus("PARTIALLY_REFUNDED", 4, "PARTIALLY_REFUNDED");
        LineItemStatus lineItemStatus6 = new LineItemStatus("FULLY_REFUNDED", 5, "FULLY_REFUNDED");
        LineItemStatus lineItemStatus7 = new LineItemStatus("UNKNOWN__", 6, "UNKNOWN__");
        f = lineItemStatus7;
        LineItemStatus[] lineItemStatusArr = {lineItemStatus, lineItemStatus2, lineItemStatus3, lineItemStatus4, lineItemStatus5, lineItemStatus6, lineItemStatus7};
        g = lineItemStatusArr;
        h = EnumEntriesKt.a(lineItemStatusArr);
        e = new Companion();
        CollectionsKt.R("OPEN", "CONFIRMED", "SHIPPED", "CANCELLED", "PARTIALLY_REFUNDED", "FULLY_REFUNDED");
    }

    public LineItemStatus(String str, int i, String str2) {
        this.d = str2;
    }

    public static LineItemStatus valueOf(String str) {
        return (LineItemStatus) Enum.valueOf(LineItemStatus.class, str);
    }

    public static LineItemStatus[] values() {
        return (LineItemStatus[]) g.clone();
    }
}
