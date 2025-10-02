package au.com.woolworths.shop.aem.components.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/CatalogueCardType;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CatalogueCardType {
    public static final CatalogueCardType d;
    public static final CatalogueCardType e;
    public static final /* synthetic */ CatalogueCardType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CatalogueCardType catalogueCardType = new CatalogueCardType("CURRENT", 0);
        d = catalogueCardType;
        CatalogueCardType catalogueCardType2 = new CatalogueCardType("SNEAK_PEEK", 1);
        e = catalogueCardType2;
        CatalogueCardType[] catalogueCardTypeArr = {catalogueCardType, catalogueCardType2};
        f = catalogueCardTypeArr;
        g = EnumEntriesKt.a(catalogueCardTypeArr);
    }

    public static CatalogueCardType valueOf(String str) {
        return (CatalogueCardType) Enum.valueOf(CatalogueCardType.class, str);
    }

    public static CatalogueCardType[] values() {
        return (CatalogueCardType[]) f.clone();
    }
}
