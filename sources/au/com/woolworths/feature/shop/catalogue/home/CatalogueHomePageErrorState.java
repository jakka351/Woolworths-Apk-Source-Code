package au.com.woolworths.feature.shop.catalogue.home;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomePageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueHomePageErrorState implements FullPageErrorCause {
    public static final CatalogueHomePageErrorState d;
    public static final CatalogueHomePageErrorState e;
    public static final CatalogueHomePageErrorState f;
    public static final /* synthetic */ CatalogueHomePageErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CatalogueHomePageErrorState catalogueHomePageErrorState = new CatalogueHomePageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void a(CatalogueHomeViewModel catalogueHomeViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void b(CatalogueHomeViewModel catalogueHomeViewModel) {
                catalogueHomeViewModel.g3();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_home_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = catalogueHomePageErrorState;
        CatalogueHomePageErrorState catalogueHomePageErrorState2 = new CatalogueHomePageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void a(CatalogueHomeViewModel catalogueHomeViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void b(CatalogueHomeViewModel catalogueHomeViewModel) {
                catalogueHomeViewModel.g3();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_home_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = catalogueHomePageErrorState2;
        CatalogueHomePageErrorState catalogueHomePageErrorState3 = new CatalogueHomePageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void a(CatalogueHomeViewModel catalogueHomeViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState
            public final void b(CatalogueHomeViewModel catalogueHomeViewModel) {
                catalogueHomeViewModel.q6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_no_catalogues;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_home_no_catalogue_desc);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.catalogue_home_change_store_button;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.catalogue_home_no_catalogue_available);
            }
        };
        f = catalogueHomePageErrorState3;
        CatalogueHomePageErrorState[] catalogueHomePageErrorStateArr = {catalogueHomePageErrorState, catalogueHomePageErrorState2, catalogueHomePageErrorState3};
        g = catalogueHomePageErrorStateArr;
        h = EnumEntriesKt.a(catalogueHomePageErrorStateArr);
    }

    public static CatalogueHomePageErrorState valueOf(String str) {
        return (CatalogueHomePageErrorState) Enum.valueOf(CatalogueHomePageErrorState.class, str);
    }

    public static CatalogueHomePageErrorState[] values() {
        return (CatalogueHomePageErrorState[]) g.clone();
    }

    public abstract void a(CatalogueHomeViewModel catalogueHomeViewModel);

    public abstract void b(CatalogueHomeViewModel catalogueHomeViewModel);
}
