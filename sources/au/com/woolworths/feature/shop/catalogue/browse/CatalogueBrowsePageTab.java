package au.com.woolworths.feature.shop.catalogue.browse;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowsePageTab;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueBrowsePageTab {
    public static final CatalogueBrowsePageTab e;
    public static final CatalogueBrowsePageTab f;
    public static final /* synthetic */ CatalogueBrowsePageTab[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int d;

    static {
        CatalogueBrowsePageTab catalogueBrowsePageTab = new CatalogueBrowsePageTab("BROWSE", 0, R.string.catalogue_browse_browse_tab);
        e = catalogueBrowsePageTab;
        CatalogueBrowsePageTab catalogueBrowsePageTab2 = new CatalogueBrowsePageTab("CONTENTS", 1, R.string.catalogue_browse_contents_tab);
        f = catalogueBrowsePageTab2;
        CatalogueBrowsePageTab[] catalogueBrowsePageTabArr = {catalogueBrowsePageTab, catalogueBrowsePageTab2};
        g = catalogueBrowsePageTabArr;
        h = EnumEntriesKt.a(catalogueBrowsePageTabArr);
    }

    public CatalogueBrowsePageTab(String str, int i, int i2) {
        this.d = i2;
    }

    public static CatalogueBrowsePageTab valueOf(String str) {
        return (CatalogueBrowsePageTab) Enum.valueOf(CatalogueBrowsePageTab.class, str);
    }

    public static CatalogueBrowsePageTab[] values() {
        return (CatalogueBrowsePageTab[]) g.clone();
    }
}
