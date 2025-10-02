package au.com.woolworths.feature.shop.catalogue.storeselector.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/analytics/CatalogueStoreSelectorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueStoreSelectorActions implements Action {
    public static final CatalogueStoreSelectorActions e;
    public static final CatalogueStoreSelectorActions f;
    public static final CatalogueStoreSelectorActions g;
    public static final CatalogueStoreSelectorActions h;
    public static final CatalogueStoreSelectorActions i;
    public static final CatalogueStoreSelectorActions j;
    public static final /* synthetic */ CatalogueStoreSelectorActions[] k;
    public static final /* synthetic */ EnumEntries l;
    public final Screen d = CatalogueScreen.j;

    static {
        CatalogueStoreSelectorActions catalogueStoreSelectorActions = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.API_NETWORK_ERROR
            public final Category m = Category.v;
            public final String n = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        e = catalogueStoreSelectorActions;
        CatalogueStoreSelectorActions catalogueStoreSelectorActions2 = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.API_NO_RESULTS
            public final Category m = Category.v;
            public final String n = "No Results Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        f = catalogueStoreSelectorActions2;
        CatalogueStoreSelectorActions catalogueStoreSelectorActions3 = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.API_SERVER_ERROR
            public final Category m = Category.v;
            public final String n = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        g = catalogueStoreSelectorActions3;
        CatalogueStoreSelectorActions catalogueStoreSelectorActions4 = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.CHOOSE_STORE
            public final Category m = Category.m;
            public final String n = "Select Store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        h = catalogueStoreSelectorActions4;
        CatalogueStoreSelectorActions catalogueStoreSelectorActions5 = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.SEARCH_FOR_STORE
            public final Category m = Category.d0;
            public final String n = "Search";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        i = catalogueStoreSelectorActions5;
        CatalogueStoreSelectorActions catalogueStoreSelectorActions6 = new CatalogueStoreSelectorActions() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions.TRY_AGAIN
            public final Category m = Category.m;
            public final String n = "Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getM() {
                return this.m;
            }
        };
        j = catalogueStoreSelectorActions6;
        CatalogueStoreSelectorActions[] catalogueStoreSelectorActionsArr = {catalogueStoreSelectorActions, catalogueStoreSelectorActions2, catalogueStoreSelectorActions3, catalogueStoreSelectorActions4, catalogueStoreSelectorActions5, catalogueStoreSelectorActions6};
        k = catalogueStoreSelectorActionsArr;
        l = EnumEntriesKt.a(catalogueStoreSelectorActionsArr);
    }

    public CatalogueStoreSelectorActions(String str, int i2) {
    }

    public static CatalogueStoreSelectorActions valueOf(String str) {
        return (CatalogueStoreSelectorActions) Enum.valueOf(CatalogueStoreSelectorActions.class, str);
    }

    public static CatalogueStoreSelectorActions[] values() {
        return (CatalogueStoreSelectorActions[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
