package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainListServerErrorOld;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyAgainListServerErrorOld implements FullPageErrorCause {
    public static final BuyAgainListServerErrorOld d = new BuyAgainListServerErrorOld();

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return R.drawable.empty_server_error;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new ResText(R.string.buy_again_page_server_error_body);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return R.string.buy_again_page_server_error_action;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(R.string.buy_again_page_server_error_title);
    }
}
