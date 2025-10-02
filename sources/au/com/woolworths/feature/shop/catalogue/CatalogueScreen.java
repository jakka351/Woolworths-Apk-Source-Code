package au.com.woolworths.feature.shop.catalogue;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueScreen implements Screen {
    public static final CatalogueScreen d;
    public static final CatalogueScreen e;
    public static final CatalogueScreen f;
    public static final CatalogueScreen g;
    public static final CatalogueScreen h;
    public static final CatalogueScreen i;
    public static final CatalogueScreen j;
    public static final /* synthetic */ CatalogueScreen[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        CatalogueScreen catalogueScreen = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_BROWSE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "cataloguebrowse_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue Browse screen";
            }
        };
        d = catalogueScreen;
        CatalogueScreen catalogueScreen2 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "cataloguedetails_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue Details screen";
            }
        };
        e = catalogueScreen2;
        CatalogueScreen catalogueScreen3 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_HOME
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "cataloguehome_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue Home screen";
            }
        };
        f = catalogueScreen3;
        CatalogueScreen catalogueScreen4 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_LISTING
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "cataloguelist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue List screen";
            }
        };
        CatalogueScreen catalogueScreen5 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_MY_SPECIALS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "cataloguelanding_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue Landing screen";
            }
        };
        g = catalogueScreen5;
        CatalogueScreen catalogueScreen6 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_ONBOARDING
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "catalogueonboarding_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Catalogue Onboarding screen";
            }
        };
        h = catalogueScreen6;
        CatalogueScreen catalogueScreen7 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_PRODUCT_LIST
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "productlist_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Product List screen";
            }
        };
        i = catalogueScreen7;
        CatalogueScreen catalogueScreen8 = new CatalogueScreen() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueScreen.CATALOGUE_STORE_SELECTOR
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Catalogue";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "selectyourstore_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Select Your Store screen";
            }
        };
        j = catalogueScreen8;
        CatalogueScreen[] catalogueScreenArr = {catalogueScreen, catalogueScreen2, catalogueScreen3, catalogueScreen4, catalogueScreen5, catalogueScreen6, catalogueScreen7, catalogueScreen8};
        k = catalogueScreenArr;
        l = EnumEntriesKt.a(catalogueScreenArr);
    }

    public static CatalogueScreen valueOf(String str) {
        return (CatalogueScreen) Enum.valueOf(CatalogueScreen.class, str);
    }

    public static CatalogueScreen[] values() {
        return (CatalogueScreen[]) k.clone();
    }
}
