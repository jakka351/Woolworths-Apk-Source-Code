package au.com.woolworths.feature.product.list.legacy.compose.productsearch;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/compose/productsearch/SearchTile;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchTile {
    public static final SearchTile d;
    public static final SearchTile e;
    public static final SearchTile f;
    public static final SearchTile g;
    public static final SearchTile h;
    public static final /* synthetic */ SearchTile[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        SearchTile searchTile = new SearchTile("VpsAndBarcodeSquareTilesRow", 0);
        d = searchTile;
        SearchTile searchTile2 = new SearchTile("BuyAgainAndOliveSquareTilesRow", 1);
        e = searchTile2;
        SearchTile searchTile3 = new SearchTile("BarcodeHorizontalRow", 2);
        f = searchTile3;
        SearchTile searchTile4 = new SearchTile("BuyAgainHorizontalRow", 3);
        g = searchTile4;
        SearchTile searchTile5 = new SearchTile("OliveHorizontalRow", 4);
        h = searchTile5;
        SearchTile[] searchTileArr = {searchTile, searchTile2, searchTile3, searchTile4, searchTile5};
        i = searchTileArr;
        j = EnumEntriesKt.a(searchTileArr);
    }

    public static SearchTile valueOf(String str) {
        return (SearchTile) Enum.valueOf(SearchTile.class, str);
    }

    public static SearchTile[] values() {
        return (SearchTile[]) i.clone();
    }
}
