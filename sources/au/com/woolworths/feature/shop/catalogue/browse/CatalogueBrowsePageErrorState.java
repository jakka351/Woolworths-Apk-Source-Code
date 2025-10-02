package au.com.woolworths.feature.shop.catalogue.browse;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowsePageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueBrowsePageErrorState implements FullPageErrorCause {
    public static final CatalogueBrowsePageErrorState d;
    public static final CatalogueBrowsePageErrorState e;
    public static final /* synthetic */ CatalogueBrowsePageErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CatalogueBrowsePageErrorState catalogueBrowsePageErrorState = new CatalogueBrowsePageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowsePageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.catalogue_my_specials_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = catalogueBrowsePageErrorState;
        CatalogueBrowsePageErrorState catalogueBrowsePageErrorState2 = new CatalogueBrowsePageErrorState() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowsePageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.catalogue_my_specials_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = catalogueBrowsePageErrorState2;
        CatalogueBrowsePageErrorState[] catalogueBrowsePageErrorStateArr = {catalogueBrowsePageErrorState, catalogueBrowsePageErrorState2};
        f = catalogueBrowsePageErrorStateArr;
        g = EnumEntriesKt.a(catalogueBrowsePageErrorStateArr);
    }

    public static CatalogueBrowsePageErrorState valueOf(String str) {
        return (CatalogueBrowsePageErrorState) Enum.valueOf(CatalogueBrowsePageErrorState.class, str);
    }

    public static CatalogueBrowsePageErrorState[] values() {
        return (CatalogueBrowsePageErrorState[]) f.clone();
    }
}
