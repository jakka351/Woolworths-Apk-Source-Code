package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsType {
    public static final Companion e;
    public static final EnumType f;
    public static final AlternativeProductsType g;
    public static final /* synthetic */ AlternativeProductsType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        AlternativeProductsType alternativeProductsType = new AlternativeProductsType("PRICE", 0, "PRICE");
        AlternativeProductsType alternativeProductsType2 = new AlternativeProductsType("SPECIALS", 1, "SPECIALS");
        AlternativeProductsType alternativeProductsType3 = new AlternativeProductsType("REWARDS", 2, "REWARDS");
        AlternativeProductsType alternativeProductsType4 = new AlternativeProductsType("UNKNOWN__", 3, "UNKNOWN__");
        g = alternativeProductsType4;
        AlternativeProductsType[] alternativeProductsTypeArr = {alternativeProductsType, alternativeProductsType2, alternativeProductsType3, alternativeProductsType4};
        h = alternativeProductsTypeArr;
        i = EnumEntriesKt.a(alternativeProductsTypeArr);
        e = new Companion();
        f = new EnumType("AlternativeProductsType", CollectionsKt.R("PRICE", "SPECIALS", "REWARDS"));
    }

    public AlternativeProductsType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static AlternativeProductsType valueOf(String str) {
        return (AlternativeProductsType) Enum.valueOf(AlternativeProductsType.class, str);
    }

    public static AlternativeProductsType[] values() {
        return (AlternativeProductsType[]) h.clone();
    }
}
