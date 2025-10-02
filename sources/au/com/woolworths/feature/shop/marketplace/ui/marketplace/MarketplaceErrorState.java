package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MarketplaceErrorState implements FullPageErrorCause {
    public static final MarketplaceErrorState d;
    public static final MarketplaceErrorState e;
    public static final MarketplaceErrorState f;
    public static final MarketplaceErrorState g;
    public static final MarketplaceErrorState h;
    public static final MarketplaceErrorState i;
    public static final /* synthetic */ MarketplaceErrorState[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        MarketplaceErrorState marketplaceErrorState = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.CONNECTION
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_marketplace_error_network);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_marketplace_error_network);
            }
        };
        d = marketplaceErrorState;
        MarketplaceErrorState marketplaceErrorState2 = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.SERVER
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_marketplace_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_marketplace_error_server);
            }
        };
        e = marketplaceErrorState2;
        MarketplaceErrorState marketplaceErrorState3 = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.PERSONALISED
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_marketplace_tab_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_personalised_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_personalised_error_server);
            }
        };
        f = marketplaceErrorState3;
        MarketplaceErrorState marketplaceErrorState4 = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.CATEGORY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_marketplace_tab_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_category_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_category_error_server);
            }
        };
        g = marketplaceErrorState4;
        MarketplaceErrorState marketplaceErrorState5 = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.BRAND
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_marketplace_tab_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_brand_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_brand_error_server);
            }
        };
        h = marketplaceErrorState5;
        MarketplaceErrorState marketplaceErrorState6 = new MarketplaceErrorState() { // from class: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.SELLER
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_marketplace_tab_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.message_seller_error_server);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.title_seller_error_server);
            }
        };
        i = marketplaceErrorState6;
        MarketplaceErrorState[] marketplaceErrorStateArr = {marketplaceErrorState, marketplaceErrorState2, marketplaceErrorState3, marketplaceErrorState4, marketplaceErrorState5, marketplaceErrorState6};
        j = marketplaceErrorStateArr;
        k = EnumEntriesKt.a(marketplaceErrorStateArr);
    }

    public static MarketplaceErrorState valueOf(String str) {
        return (MarketplaceErrorState) Enum.valueOf(MarketplaceErrorState.class, str);
    }

    public static MarketplaceErrorState[] values() {
        return (MarketplaceErrorState[]) j.clone();
    }
}
