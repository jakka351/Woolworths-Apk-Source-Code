package au.com.woolworths.rewards.tooltip;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/rewards/tooltip/Tooltip;", "", "BalanceIndicator", "ChristmasFunds", "WalletAddCard", "BottomNavigationTab", "Lau/com/woolworths/rewards/tooltip/Tooltip$BalanceIndicator;", "Lau/com/woolworths/rewards/tooltip/Tooltip$BottomNavigationTab;", "Lau/com/woolworths/rewards/tooltip/Tooltip$ChristmasFunds;", "Lau/com/woolworths/rewards/tooltip/Tooltip$WalletAddCard;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Tooltip {

    /* renamed from: a, reason: collision with root package name */
    public final int f9967a;
    public final int b;
    public final String c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/tooltip/Tooltip$BalanceIndicator;", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BalanceIndicator extends Tooltip {
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceIndicator(String text) {
            super(80, R.id.balance_circle_indicator, text);
            Intrinsics.h(text, "text");
            this.d = text;
        }

        @Override // au.com.woolworths.rewards.tooltip.Tooltip
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BalanceIndicator) && Intrinsics.c(this.d, ((BalanceIndicator) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("BalanceIndicator(text=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/tooltip/Tooltip$BottomNavigationTab;", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomNavigationTab extends Tooltip {
        public final int d;
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomNavigationTab(int i, String text) {
            super(48, i, text);
            Intrinsics.h(text, "text");
            this.d = i;
            this.e = text;
        }

        @Override // au.com.woolworths.rewards.tooltip.Tooltip
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomNavigationTab)) {
                return false;
            }
            BottomNavigationTab bottomNavigationTab = (BottomNavigationTab) obj;
            return this.d == bottomNavigationTab.d && Intrinsics.c(this.e, bottomNavigationTab.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
        }

        public final String toString() {
            return "BottomNavigationTab(anchorViewId=" + this.d + ", text=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/tooltip/Tooltip$ChristmasFunds;", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChristmasFunds extends Tooltip {
        @Override // au.com.woolworths.rewards.tooltip.Tooltip
        /* renamed from: a */
        public final String getC() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChristmasFunds);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ChristmasFunds(text=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/tooltip/Tooltip$WalletAddCard;", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WalletAddCard extends Tooltip {
        @Override // au.com.woolworths.rewards.tooltip.Tooltip
        /* renamed from: a */
        public final String getC() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WalletAddCard);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WalletAddCard(text=null, onShow=null, onDismiss=null, centerAlignText=false)";
        }
    }

    public Tooltip(int i, int i2, String str) {
        this.f9967a = i;
        this.b = i2;
        this.c = str;
    }

    /* renamed from: a, reason: from getter */
    public String getC() {
        return this.c;
    }
}
