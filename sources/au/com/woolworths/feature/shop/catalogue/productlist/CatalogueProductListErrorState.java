package au.com.woolworths.feature.shop.catalogue.productlist;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueProductListErrorState implements FullPageErrorCause {
    public static final CatalogueProductListErrorState d;
    public static final CatalogueProductListErrorState e;
    public static final CatalogueProductListErrorState f;
    public static final /* synthetic */ CatalogueProductListErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CatalogueProductListErrorState catalogueProductListErrorState = new CatalogueProductListErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void a(CatalogueProductListViewModel catalogueProductListViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void b(CatalogueProductListViewModel catalogueProductListViewModel) {
                catalogueProductListViewModel.v6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_product_list_connection_error);
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
        d = catalogueProductListErrorState;
        CatalogueProductListErrorState catalogueProductListErrorState2 = new CatalogueProductListErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void a(CatalogueProductListViewModel catalogueProductListViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void b(CatalogueProductListViewModel catalogueProductListViewModel) {
                catalogueProductListViewModel.v6();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_product_list_server_error);
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
        e = catalogueProductListErrorState2;
        CatalogueProductListErrorState catalogueProductListErrorState3 = new CatalogueProductListErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState.NO_RESULT_FOUND
            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void a(CatalogueProductListViewModel catalogueProductListViewModel) {
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState
            public final void b(CatalogueProductListViewModel catalogueProductListViewModel) {
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_no_catalogues_product_list;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.catalogue_product_list_no_result_found_subtext);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.catalogue_product_list_no_result_found_heading);
            }
        };
        f = catalogueProductListErrorState3;
        CatalogueProductListErrorState[] catalogueProductListErrorStateArr = {catalogueProductListErrorState, catalogueProductListErrorState2, catalogueProductListErrorState3};
        g = catalogueProductListErrorStateArr;
        h = EnumEntriesKt.a(catalogueProductListErrorStateArr);
    }

    public static CatalogueProductListErrorState valueOf(String str) {
        return (CatalogueProductListErrorState) Enum.valueOf(CatalogueProductListErrorState.class, str);
    }

    public static CatalogueProductListErrorState[] values() {
        return (CatalogueProductListErrorState[]) g.clone();
    }

    public abstract void a(CatalogueProductListViewModel catalogueProductListViewModel);

    public abstract void b(CatalogueProductListViewModel catalogueProductListViewModel);
}
