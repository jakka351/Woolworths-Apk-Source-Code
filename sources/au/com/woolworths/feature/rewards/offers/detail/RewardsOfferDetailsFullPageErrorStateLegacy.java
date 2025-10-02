package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "CustomErrorWithBackButtonLegacy", "NoConnectivity", "ServerErrorLegacy", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$CustomErrorWithBackButtonLegacy;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$NoConnectivity;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$ServerErrorLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsOfferDetailsFullPageErrorStateLegacy implements FullPageErrorCause {
    public final Text d;
    public final Text e;
    public final int f;
    public final int g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$CustomErrorWithBackButtonLegacy;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class CustomErrorWithBackButtonLegacy extends RewardsOfferDetailsFullPageErrorStateLegacy {
        public final Text h;

        public CustomErrorWithBackButtonLegacy(Text text) {
            super(null, text, R.string.back, 0);
            this.h = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomErrorWithBackButtonLegacy) && Intrinsics.c(this.h, ((CustomErrorWithBackButtonLegacy) obj).h);
        }

        public final int hashCode() {
            return this.h.hashCode() * 31;
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.h("CustomErrorWithBackButtonLegacy(text=", this.h, ", title=null)");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$NoConnectivity;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoConnectivity extends RewardsOfferDetailsFullPageErrorStateLegacy {
        public static final NoConnectivity h = new NoConnectivity(new ResText(R.string.default_connection_error_title_rewards), new ResText(R.string.rewards_offer_connection_error_message), R.string.try_again_button_text, R.drawable.ic_rewards_connection_error);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoConnectivity);
        }

        public final int hashCode() {
            return -1997560191;
        }

        public final String toString() {
            return "NoConnectivity";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy$ServerErrorLegacy;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsFullPageErrorStateLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerErrorLegacy extends RewardsOfferDetailsFullPageErrorStateLegacy {
        public static final ServerErrorLegacy h = new ServerErrorLegacy(new ResText(R.string.server_error_heading), new ResText(R.string.rewards_offer_server_error_message), R.string.try_again_button_text, R.drawable.ic_rewards_server_error);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerErrorLegacy);
        }

        public final int hashCode() {
            return -1995820123;
        }

        public final String toString() {
            return "ServerErrorLegacy";
        }
    }

    public RewardsOfferDetailsFullPageErrorStateLegacy(Text text, Text text2, int i, int i2) {
        this.d = text;
        this.e = text2;
        this.f = i;
        this.g = i2;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getDrawableRes, reason: from getter */
    public final int getG() {
        return this.g;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getMessage, reason: from getter */
    public final Text getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getSecondaryActionRes, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getTitle, reason: from getter */
    public final Text getD() {
        return this.d;
    }
}
