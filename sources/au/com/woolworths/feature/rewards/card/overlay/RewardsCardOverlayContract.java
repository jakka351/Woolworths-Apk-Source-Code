package au.com.woolworths.feature.rewards.card.overlay;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract;", "", "ViewState", "Action", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsCardOverlayContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "", "Close", "ShowCardNumberCopiedMessage", "CopyCardNumberToClipboard", "SaveToGoogleWallet", "ShowSnackbarMessage", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$Close;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$CopyCardNumberToClipboard;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$SaveToGoogleWallet;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$ShowCardNumberCopiedMessage;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$ShowSnackbarMessage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$Close;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Close extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Close f5827a = new Close();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Close);
            }

            public final int hashCode() {
                return 1320756019;
            }

            public final String toString() {
                return "Close";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$CopyCardNumberToClipboard;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyCardNumberToClipboard extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5828a;

            public CopyCardNumberToClipboard(String cardNumber) {
                Intrinsics.h(cardNumber, "cardNumber");
                this.f5828a = cardNumber;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CopyCardNumberToClipboard) && Intrinsics.c(this.f5828a, ((CopyCardNumberToClipboard) obj).f5828a);
            }

            public final int hashCode() {
                return this.f5828a.hashCode();
            }

            public final String toString() {
                return a.h("CopyCardNumberToClipboard(cardNumber=", this.f5828a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$SaveToGoogleWallet;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SaveToGoogleWallet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5829a;

            public SaveToGoogleWallet(String str) {
                this.f5829a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SaveToGoogleWallet) && Intrinsics.c(this.f5829a, ((SaveToGoogleWallet) obj).f5829a);
            }

            public final int hashCode() {
                return this.f5829a.hashCode();
            }

            public final String toString() {
                return a.h("SaveToGoogleWallet(token=", this.f5829a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$ShowCardNumberCopiedMessage;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCardNumberCopiedMessage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowCardNumberCopiedMessage f5830a = new ShowCardNumberCopiedMessage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCardNumberCopiedMessage);
            }

            public final int hashCode() {
                return -745010712;
            }

            public final String toString() {
                return "ShowCardNumberCopiedMessage";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action$ShowSnackbarMessage;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$Action;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f5831a;

            public ShowSnackbarMessage(int i) {
                this.f5831a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && this.f5831a == ((ShowSnackbarMessage) obj).f5831a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f5831a);
            }

            public final String toString() {
                return a.e(this.f5831a, "ShowSnackbarMessage(messageResId=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$ViewState;", "", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState d = new ViewState(new RewardsCardData("", "", "", RewardsCardTypeData.LOYALTY_CARD, null, "DEFAULT", null, 64, null), false, true);

        /* renamed from: a, reason: collision with root package name */
        public final RewardsCardData f5832a;
        public final boolean b;
        public final boolean c;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$ViewState$Companion;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(RewardsCardData rewardsCardData, boolean z, boolean z2) {
            this.f5832a = rewardsCardData;
            this.b = z;
            this.c = z2;
        }

        public static ViewState a(ViewState viewState, RewardsCardData cardData, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                cardData = viewState.f5832a;
            }
            if ((i & 2) != 0) {
                z = viewState.b;
            }
            if ((i & 4) != 0) {
                z2 = viewState.c;
            }
            viewState.getClass();
            Intrinsics.h(cardData, "cardData");
            return new ViewState(cardData, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f5832a, viewState.f5832a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.e(this.f5832a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(cardData=");
            sb.append(this.f5832a);
            sb.append(", isAddingToGooglePay=");
            sb.append(this.b);
            sb.append(", showAddToGoogleWallet=");
            return a.k(")", sb, this.c);
        }
    }
}
