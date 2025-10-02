package au.com.woolworths.shop.lists.ui.watchlist.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract;", "", "Action", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchlistBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action;", "", "OptInToPushNotification", "Dismiss", "Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action$Dismiss;", "Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action$OptInToPushNotification;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action$Dismiss;", "Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Dismiss extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f12489a = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return -599570570;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action$OptInToPushNotification;", "Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OptInToPushNotification extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f12490a;

            public OptInToPushNotification(boolean z) {
                this.f12490a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OptInToPushNotification) && this.f12490a == ((OptInToPushNotification) obj).f12490a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f12490a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("OptInToPushNotification(isSystemNotificationOn=", ")", this.f12490a);
            }
        }
    }
}
