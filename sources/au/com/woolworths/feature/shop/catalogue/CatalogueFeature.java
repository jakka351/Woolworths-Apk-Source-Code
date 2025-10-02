package au.com.woolworths.feature.shop.catalogue;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CatalogueFeature implements Feature {
    public static final CatalogueFeature d;
    public static final CatalogueFeature e;
    public static final CatalogueFeature f;
    public static final CatalogueFeature g;
    public static final /* synthetic */ CatalogueFeature[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        CatalogueFeature catalogueFeature = new CatalogueFeature() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueFeature.CATALOGUE_BROWSE_PROMOTION_PAGE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_catalogue_promotion_page";
            }
        };
        d = catalogueFeature;
        CatalogueFeature catalogueFeature2 = new CatalogueFeature() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueFeature.CATALOGUE_CONTENTS_ACTIONABLE_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_catalogue_landing_actionable_card";
            }
        };
        e = catalogueFeature2;
        CatalogueFeature catalogueFeature3 = new CatalogueFeature() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueFeature.CATALOGUE_HOME_AEM
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_catalogue_home_aem";
            }
        };
        f = catalogueFeature3;
        CatalogueFeature catalogueFeature4 = new CatalogueFeature() { // from class: au.com.woolworths.feature.shop.catalogue.CatalogueFeature.PROMOTION_DETAILS_WATCHLIST
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_promotion_details_watchlist";
            }

            @Override // au.com.woolworths.feature.shop.catalogue.CatalogueFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = catalogueFeature4;
        CatalogueFeature[] catalogueFeatureArr = {catalogueFeature, catalogueFeature2, catalogueFeature3, catalogueFeature4};
        h = catalogueFeatureArr;
        i = EnumEntriesKt.a(catalogueFeatureArr);
    }

    public static CatalogueFeature valueOf(String str) {
        return (CatalogueFeature) Enum.valueOf(CatalogueFeature.class, str);
    }

    public static CatalogueFeature[] values() {
        return (CatalogueFeature[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
