package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState;", "", "Uninitialized", "Available", "Unavailable", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Available;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Unavailable;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Uninitialized;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GooglePayUiState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Available;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Available implements GooglePayUiState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8364a;
        public final Object b;
        public final String c;

        public Available(String priceLabel, List list, String str) {
            Intrinsics.h(priceLabel, "priceLabel");
            this.f8364a = priceLabel;
            this.b = list;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Available)) {
                return false;
            }
            Available available = (Available) obj;
            return Intrinsics.c(this.f8364a, available.f8364a) && this.b.equals(available.b) && this.c.equals(available.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + android.support.v4.media.session.a.e(this.f8364a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Available(priceLabel=");
            sb.append(this.f8364a);
            sb.append(", allowedCardNetworks=");
            sb.append(this.b);
            sb.append(", allowedPaymentMethods=");
            return YU.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Unavailable;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unavailable implements GooglePayUiState {

        /* renamed from: a, reason: collision with root package name */
        public static final Unavailable f8365a = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return -1072598627;
        }

        public final String toString() {
            return "Unavailable";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState$Uninitialized;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GooglePayUiState;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Uninitialized implements GooglePayUiState {

        /* renamed from: a, reason: collision with root package name */
        public static final Uninitialized f8366a = new Uninitialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninitialized);
        }

        public final int hashCode() {
            return -2130761560;
        }

        public final String toString() {
            return "Uninitialized";
        }
    }
}
