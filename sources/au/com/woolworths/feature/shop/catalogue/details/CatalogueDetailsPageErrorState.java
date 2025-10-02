package au.com.woolworths.feature.shop.catalogue.details;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueDetailsPageErrorState implements FullPageErrorCause {
    public static final CatalogueDetailsPageErrorState d;
    public static final CatalogueDetailsPageErrorState e;
    public static final CatalogueDetailsPageErrorState f;
    public static final /* synthetic */ CatalogueDetailsPageErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState = new CatalogueDetailsPageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void a(CatalogueDetailsViewModel catalogueDetailsViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void b(CatalogueDetailsViewModel catalogueDetailsViewModel) {
                catalogueDetailsViewModel.s6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_details_connection_error);
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
        d = catalogueDetailsPageErrorState;
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState2 = new CatalogueDetailsPageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void a(CatalogueDetailsViewModel catalogueDetailsViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void b(CatalogueDetailsViewModel catalogueDetailsViewModel) {
                catalogueDetailsViewModel.s6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_details_server_error);
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
        e = catalogueDetailsPageErrorState2;
        CatalogueDetailsPageErrorState catalogueDetailsPageErrorState3 = new CatalogueDetailsPageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void a(CatalogueDetailsViewModel catalogueDetailsViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPageErrorState
            public final void b(CatalogueDetailsViewModel catalogueDetailsViewModel) {
                catalogueDetailsViewModel.s6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_no_catalogues;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_details_no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.catalogue_details_no_result_found_heading);
            }
        };
        f = catalogueDetailsPageErrorState3;
        CatalogueDetailsPageErrorState[] catalogueDetailsPageErrorStateArr = {catalogueDetailsPageErrorState, catalogueDetailsPageErrorState2, catalogueDetailsPageErrorState3};
        g = catalogueDetailsPageErrorStateArr;
        h = EnumEntriesKt.a(catalogueDetailsPageErrorStateArr);
    }

    public static CatalogueDetailsPageErrorState valueOf(String str) {
        return (CatalogueDetailsPageErrorState) Enum.valueOf(CatalogueDetailsPageErrorState.class, str);
    }

    public static CatalogueDetailsPageErrorState[] values() {
        return (CatalogueDetailsPageErrorState[]) g.clone();
    }

    public abstract void a(CatalogueDetailsViewModel catalogueDetailsViewModel);

    public abstract void b(CatalogueDetailsViewModel catalogueDetailsViewModel);
}
