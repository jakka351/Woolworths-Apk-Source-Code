package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CategoriesType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CategoriesType {
    public static final Companion e;
    public static final CategoriesType f;
    public static final CategoriesType g;
    public static final CategoriesType h;
    public static final CategoriesType i;
    public static final /* synthetic */ CategoriesType[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CategoriesType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CategoriesType categoriesType = new CategoriesType("SPECIALS", 0, "SPECIALS");
        f = categoriesType;
        CategoriesType categoriesType2 = new CategoriesType("PRODUCTS", 1, "PRODUCTS");
        g = categoriesType2;
        CategoriesType categoriesType3 = new CategoriesType("PRODUCTS_EM", 2, "PRODUCTS_EM");
        h = categoriesType3;
        CategoriesType categoriesType4 = new CategoriesType("UNKNOWN__", 3, "UNKNOWN__");
        i = categoriesType4;
        CategoriesType[] categoriesTypeArr = {categoriesType, categoriesType2, categoriesType3, categoriesType4};
        j = categoriesTypeArr;
        k = EnumEntriesKt.a(categoriesTypeArr);
        e = new Companion();
        CollectionsKt.R("SPECIALS", "PRODUCTS", "PRODUCTS_EM");
    }

    public CategoriesType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CategoriesType valueOf(String str) {
        return (CategoriesType) Enum.valueOf(CategoriesType.class, str);
    }

    public static CategoriesType[] values() {
        return (CategoriesType[]) j.clone();
    }
}
