package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle;", "", "Label", "Points", "Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle$Label;", "Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle$Points;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TrailingStyle {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle$Label;", "Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Label implements TrailingStyle {

        /* renamed from: a, reason: collision with root package name */
        public final String f6413a;

        public Label(String str) {
            this.f6413a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Label) && Intrinsics.c(this.f6413a, ((Label) obj).f6413a);
        }

        public final int hashCode() {
            return this.f6413a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Label(label=", this.f6413a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle$Points;", "Lau/com/woolworths/feature/rewards/offers/ui/details/TrailingStyle;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Points implements TrailingStyle {

        /* renamed from: a, reason: collision with root package name */
        public final String f6414a;
        public final String b;

        public Points(String str, String str2) {
            this.f6414a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Points)) {
                return false;
            }
            Points points = (Points) obj;
            return Intrinsics.c(this.f6414a, points.f6414a) && Intrinsics.c(this.b, points.b);
        }

        public final int hashCode() {
            String str = this.f6414a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return YU.a.j("Points(pointPrefix=", this.f6414a, ", points=", this.b, ")");
        }
    }
}
