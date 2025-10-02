package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayPayCustomerType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayPayCustomerType {
    public static final Companion e;
    public static final EverydayPayCustomerType f;
    public static final /* synthetic */ EverydayPayCustomerType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayPayCustomerType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        EverydayPayCustomerType everydayPayCustomerType = new EverydayPayCustomerType("UNKNOWN", 0, "UNKNOWN");
        EverydayPayCustomerType everydayPayCustomerType2 = new EverydayPayCustomerType("NEW_CUSTOMER", 1, "NEW_CUSTOMER");
        EverydayPayCustomerType everydayPayCustomerType3 = new EverydayPayCustomerType("EXISTING_CUSTOMER", 2, "EXISTING_CUSTOMER");
        EverydayPayCustomerType everydayPayCustomerType4 = new EverydayPayCustomerType("UNKNOWN__", 3, "UNKNOWN__");
        f = everydayPayCustomerType4;
        EverydayPayCustomerType[] everydayPayCustomerTypeArr = {everydayPayCustomerType, everydayPayCustomerType2, everydayPayCustomerType3, everydayPayCustomerType4};
        g = everydayPayCustomerTypeArr;
        h = EnumEntriesKt.a(everydayPayCustomerTypeArr);
        e = new Companion();
        CollectionsKt.R("UNKNOWN", "NEW_CUSTOMER", "EXISTING_CUSTOMER");
    }

    public EverydayPayCustomerType(String str, int i, String str2) {
        this.d = str2;
    }

    public static EverydayPayCustomerType valueOf(String str) {
        return (EverydayPayCustomerType) Enum.valueOf(EverydayPayCustomerType.class, str);
    }

    public static EverydayPayCustomerType[] values() {
        return (EverydayPayCustomerType[]) g.clone();
    }
}
