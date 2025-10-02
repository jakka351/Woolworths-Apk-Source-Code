package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ControlType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ControlType {
    public static final Companion e;
    public static final ControlType f;
    public static final /* synthetic */ ControlType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ControlType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ControlType controlType = new ControlType("CardGroup", 0, "CardGroup");
        ControlType controlType2 = new ControlType("CardNo", 1, "CardNo");
        ControlType controlType3 = new ControlType("CardExpiry", 2, "CardExpiry");
        ControlType controlType4 = new ControlType("CardCVV", 3, "CardCVV");
        ControlType controlType5 = new ControlType("ValidateCard", 4, "ValidateCard");
        ControlType controlType6 = new ControlType("UNKNOWN__", 5, "UNKNOWN__");
        f = controlType6;
        ControlType[] controlTypeArr = {controlType, controlType2, controlType3, controlType4, controlType5, controlType6};
        g = controlTypeArr;
        h = EnumEntriesKt.a(controlTypeArr);
        e = new Companion();
        CollectionsKt.R("CardGroup", "CardNo", "CardExpiry", "CardCVV", "ValidateCard");
    }

    public ControlType(String str, int i, String str2) {
        this.d = str2;
    }

    public static ControlType valueOf(String str) {
        return (ControlType) Enum.valueOf(ControlType.class, str);
    }

    public static ControlType[] values() {
        return (ControlType[]) g.clone();
    }
}
