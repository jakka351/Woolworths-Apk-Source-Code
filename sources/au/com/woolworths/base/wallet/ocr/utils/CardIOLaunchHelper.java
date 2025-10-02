package au.com.woolworths.base.wallet.ocr.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import com.woolworths.R;
import io.card.payment.CardIOActivity;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/utils/CardIOLaunchHelper;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes3.dex */
public final class CardIOLaunchHelper {
    public static Intent a(Context context, Activities.RewardsWalletOcr.Origin origin) {
        Intent intent = new Intent(context, (Class<?>) CardIOActivity.class);
        intent.putExtra(CardIOActivity.EXTRA_SCAN_OVERLAY_LAYOUT_ID, R.layout.rewards_wallet_overlay_ocr_scan_card);
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true);
        intent.putExtra(CardIOActivity.EXTRA_SCAN_EXPIRY, true);
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, true);
        intent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        intent.putExtra(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, false);
        intent.putExtra(CardIOActivity.EXTRA_SCAN_INSTRUCTIONS, context.getString(R.string.rewards_wallet_ocr_scan_scheme_card_scanning_instruction));
        intent.putExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, true);
        intent.putExtra(CardIOActivity.EXTRA_GUIDE_COLOR, context.getColor(R.color.white));
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, true);
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_SCAN, false);
        intent.putExtra(CardIOActivity.EXTRA_RETURN_CARD_IMAGE, false);
        if (origin != null) {
            intent.putExtra("EXTRA_ORIGIN", origin);
        }
        return intent;
    }
}
