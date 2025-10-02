package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.graphql.DefaultValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsType;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "SPECIALS", "REWARDS", "UNKNOWN", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlternativeProductsType[] $VALUES;
    public static final AlternativeProductsType PRICE = new AlternativeProductsType("PRICE", 0);
    public static final AlternativeProductsType SPECIALS = new AlternativeProductsType("SPECIALS", 1);
    public static final AlternativeProductsType REWARDS = new AlternativeProductsType("REWARDS", 2);

    @DefaultValue
    public static final AlternativeProductsType UNKNOWN = new AlternativeProductsType("UNKNOWN", 3);

    private static final /* synthetic */ AlternativeProductsType[] $values() {
        return new AlternativeProductsType[]{PRICE, SPECIALS, REWARDS, UNKNOWN};
    }

    static {
        AlternativeProductsType[] alternativeProductsTypeArr$values = $values();
        $VALUES = alternativeProductsTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(alternativeProductsTypeArr$values);
    }

    private AlternativeProductsType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlternativeProductsType> getEntries() {
        return $ENTRIES;
    }

    public static AlternativeProductsType valueOf(String str) {
        return (AlternativeProductsType) Enum.valueOf(AlternativeProductsType.class, str);
    }

    public static AlternativeProductsType[] values() {
        return (AlternativeProductsType[]) $VALUES.clone();
    }
}
