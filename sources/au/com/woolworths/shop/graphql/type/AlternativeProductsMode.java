package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsMode;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsMode {
    public static final Companion e;
    public static final AlternativeProductsMode f;
    public static final AlternativeProductsMode g;
    public static final AlternativeProductsMode h;
    public static final AlternativeProductsMode i;
    public static final /* synthetic */ AlternativeProductsMode[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsMode$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        AlternativeProductsMode alternativeProductsMode = new AlternativeProductsMode("VALUE_SWAPS", 0, "VALUE_SWAPS");
        f = alternativeProductsMode;
        AlternativeProductsMode alternativeProductsMode2 = new AlternativeProductsMode("SMART_ALTERNATIVES", 1, "SMART_ALTERNATIVES");
        g = alternativeProductsMode2;
        AlternativeProductsMode alternativeProductsMode3 = new AlternativeProductsMode("UNIVERSAL", 2, "UNIVERSAL");
        h = alternativeProductsMode3;
        AlternativeProductsMode alternativeProductsMode4 = new AlternativeProductsMode("UNKNOWN__", 3, "UNKNOWN__");
        i = alternativeProductsMode4;
        AlternativeProductsMode[] alternativeProductsModeArr = {alternativeProductsMode, alternativeProductsMode2, alternativeProductsMode3, alternativeProductsMode4};
        j = alternativeProductsModeArr;
        k = EnumEntriesKt.a(alternativeProductsModeArr);
        e = new Companion();
        CollectionsKt.R("VALUE_SWAPS", "SMART_ALTERNATIVES", "UNIVERSAL");
    }

    public AlternativeProductsMode(String str, int i2, String str2) {
        this.d = str2;
    }

    public static AlternativeProductsMode valueOf(String str) {
        return (AlternativeProductsMode) Enum.valueOf(AlternativeProductsMode.class, str);
    }

    public static AlternativeProductsMode[] values() {
        return (AlternativeProductsMode[]) j.clone();
    }
}
