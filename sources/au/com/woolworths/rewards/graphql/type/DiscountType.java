package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DiscountType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiscountType {
    public static final Companion e;
    public static final DiscountType f;
    public static final /* synthetic */ DiscountType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DiscountType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DiscountType discountType = new DiscountType("TOPUP_PERCENT", 0, "TOPUP_PERCENT");
        DiscountType discountType2 = new DiscountType("PERCENT", 1, "PERCENT");
        DiscountType discountType3 = new DiscountType("TOPUP_FIXED", 2, "TOPUP_FIXED");
        DiscountType discountType4 = new DiscountType("ABSOLUTE", 3, "ABSOLUTE");
        DiscountType discountType5 = new DiscountType("UNKNOWN__", 4, "UNKNOWN__");
        f = discountType5;
        DiscountType[] discountTypeArr = {discountType, discountType2, discountType3, discountType4, discountType5};
        g = discountTypeArr;
        h = EnumEntriesKt.a(discountTypeArr);
        e = new Companion();
        CollectionsKt.R("TOPUP_PERCENT", "PERCENT", "TOPUP_FIXED", "ABSOLUTE");
    }

    public DiscountType(String str, int i, String str2) {
        this.d = str2;
    }

    public static DiscountType valueOf(String str) {
        return (DiscountType) Enum.valueOf(DiscountType.class, str);
    }

    public static DiscountType[] values() {
        return (DiscountType[]) g.clone();
    }
}
