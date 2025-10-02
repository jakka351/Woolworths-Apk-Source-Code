package au.com.woolworths.feature.shop.catalogue.storeselector;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueStoreSelectorErrorState implements FullPageErrorCause {
    public static final CatalogueStoreSelectorErrorState d;
    public static final CatalogueStoreSelectorErrorState e;
    public static final CatalogueStoreSelectorErrorState f;
    public static final /* synthetic */ CatalogueStoreSelectorErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState = new CatalogueStoreSelectorErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void a(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void b(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
                catalogueStoreSelectorViewModel.s6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_store_selector_connection_error);
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
        d = catalogueStoreSelectorErrorState;
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState2 = new CatalogueStoreSelectorErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void a(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void b(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
                catalogueStoreSelectorViewModel.s6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_store_selector_server_error_subtext);
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
        e = catalogueStoreSelectorErrorState2;
        CatalogueStoreSelectorErrorState catalogueStoreSelectorErrorState3 = new CatalogueStoreSelectorErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void a(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorErrorState
            public final void b(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) {
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_pick_up_location_no_result_found;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_store_selector_no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.catalogue_store_selector_no_result_found_heading);
            }
        };
        f = catalogueStoreSelectorErrorState3;
        CatalogueStoreSelectorErrorState[] catalogueStoreSelectorErrorStateArr = {catalogueStoreSelectorErrorState, catalogueStoreSelectorErrorState2, catalogueStoreSelectorErrorState3};
        g = catalogueStoreSelectorErrorStateArr;
        h = EnumEntriesKt.a(catalogueStoreSelectorErrorStateArr);
    }

    public static CatalogueStoreSelectorErrorState valueOf(String str) {
        return (CatalogueStoreSelectorErrorState) Enum.valueOf(CatalogueStoreSelectorErrorState.class, str);
    }

    public static CatalogueStoreSelectorErrorState[] values() {
        return (CatalogueStoreSelectorErrorState[]) g.clone();
    }

    public abstract void a(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel);

    public abstract void b(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel);
}
