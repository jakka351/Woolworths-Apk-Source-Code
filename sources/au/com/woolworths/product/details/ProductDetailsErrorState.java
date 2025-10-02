package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductDetailsErrorState implements FullPageErrorCause {
    public static final ProductDetailsErrorState d;
    public static final ProductDetailsErrorState e;
    public static final /* synthetic */ ProductDetailsErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ProductDetailsErrorState productDetailsErrorState = new ProductDetailsErrorState() { // from class: au.com.woolworths.product.details.ProductDetailsErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.generic_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.server_error_heading);
            }
        };
        d = productDetailsErrorState;
        ProductDetailsErrorState productDetailsErrorState2 = new ProductDetailsErrorState() { // from class: au.com.woolworths.product.details.ProductDetailsErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return com.woolworths.R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.generic_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.no_network_heading);
            }
        };
        e = productDetailsErrorState2;
        ProductDetailsErrorState[] productDetailsErrorStateArr = {productDetailsErrorState, productDetailsErrorState2};
        f = productDetailsErrorStateArr;
        g = EnumEntriesKt.a(productDetailsErrorStateArr);
    }

    public static ProductDetailsErrorState valueOf(String str) {
        return (ProductDetailsErrorState) Enum.valueOf(ProductDetailsErrorState.class, str);
    }

    public static ProductDetailsErrorState[] values() {
        return (ProductDetailsErrorState[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getImageTintRes() {
        return com.woolworths.R.color.color_accent;
    }
}
