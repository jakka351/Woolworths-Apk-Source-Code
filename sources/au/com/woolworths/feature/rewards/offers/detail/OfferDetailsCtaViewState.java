package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState;", "", "StatefulCtaView", "StatelessCtaView", "OfferStatusView", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$OfferStatusView;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$StatefulCtaView;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$StatelessCtaView;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OfferDetailsCtaViewState {

    /* renamed from: a, reason: collision with root package name */
    public final String f6309a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$OfferStatusView;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferStatusView extends OfferDetailsCtaViewState {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferStatusView(String displayStatus) {
            super(displayStatus);
            Intrinsics.h(displayStatus, "displayStatus");
            this.b = displayStatus;
        }

        @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState
        /* renamed from: a, reason: from getter */
        public final String getF6309a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferStatusView) && Intrinsics.c(this.b, ((OfferStatusView) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return YU.a.h("OfferStatusView(displayStatus=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$StatefulCtaView;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatefulCtaView extends OfferDetailsCtaViewState {
        public final String b;
        public final StatefulButtonState c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatefulCtaView(String label, StatefulButtonState statefulButtonState, String str) {
            super(str);
            Intrinsics.h(label, "label");
            this.b = label;
            this.c = statefulButtonState;
            this.d = str;
        }

        @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState
        /* renamed from: a, reason: from getter */
        public final String getF6309a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatefulCtaView)) {
                return false;
            }
            StatefulCtaView statefulCtaView = (StatefulCtaView) obj;
            return Intrinsics.c(this.b, statefulCtaView.b) && this.c == statefulCtaView.c && Intrinsics.c(this.d, statefulCtaView.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatefulCtaView(label=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append(", displayStatus=");
            return YU.a.o(sb, this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState$StatelessCtaView;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsCtaViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatelessCtaView extends OfferDetailsCtaViewState {
        public final ContentCta b;
        public final String c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatelessCtaView(String str, String str2, ContentCta contentCta) {
            super(str2);
            Intrinsics.h(contentCta, "contentCta");
            this.b = contentCta;
            this.c = str;
            this.d = str2;
        }

        @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState
        /* renamed from: a, reason: from getter */
        public final String getF6309a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatelessCtaView)) {
                return false;
            }
            StatelessCtaView statelessCtaView = (StatelessCtaView) obj;
            return Intrinsics.c(this.b, statelessCtaView.b) && Intrinsics.c(this.c, statelessCtaView.c) && Intrinsics.c(this.d, statelessCtaView.d);
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatelessCtaView(contentCta=");
            sb.append(this.b);
            sb.append(", url=");
            sb.append(this.c);
            sb.append(", displayStatus=");
            return YU.a.o(sb, this.d, ")");
        }
    }

    public OfferDetailsCtaViewState(String str) {
        this.f6309a = str;
    }

    /* renamed from: a, reason: from getter */
    public String getF6309a() {
        return this.f6309a;
    }
}
