package au.com.woolworths.feature.shop.catalogue.intro.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/intro/analytics/CatalogueIntroActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueIntroActions implements Action {
    public static final CatalogueIntroActions e;
    public static final /* synthetic */ CatalogueIntroActions[] f;
    public static final /* synthetic */ EnumEntries g;
    public final Screen d = CatalogueScreen.h;

    static {
        CatalogueIntroActions catalogueIntroActions = new CatalogueIntroActions() { // from class: au.com.woolworths.feature.shop.catalogue.intro.analytics.CatalogueIntroActions.SELECT_YOUR_STORE_CLICK
            public final Category h = Category.m;
            public final String i = "Select Your Store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.h;
            }
        };
        e = catalogueIntroActions;
        CatalogueIntroActions[] catalogueIntroActionsArr = {catalogueIntroActions};
        f = catalogueIntroActionsArr;
        g = EnumEntriesKt.a(catalogueIntroActionsArr);
    }

    public static CatalogueIntroActions valueOf(String str) {
        return (CatalogueIntroActions) Enum.valueOf(CatalogueIntroActions.class, str);
    }

    public static CatalogueIntroActions[] values() {
        return (CatalogueIntroActions[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
