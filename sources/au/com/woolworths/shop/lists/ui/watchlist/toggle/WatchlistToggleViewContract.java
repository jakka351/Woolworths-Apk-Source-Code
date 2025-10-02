package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract;", "", "ViewState", "Actions", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WatchlistToggleViewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$Actions;", "", "ShowBottomSheet", "Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$Actions$ShowBottomSheet;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$Actions$ShowBottomSheet;", "Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowBottomSheet f12493a = new ShowBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowBottomSheet);
            }

            public final int hashCode() {
                return -794582195;
            }

            public final String toString() {
                return "ShowBottomSheet";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f12494a;
        public final boolean b;
        public final boolean c;

        public ViewState(String str, boolean z, boolean z2) {
            this.f12494a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12494a, viewState.f12494a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            String str = this.f12494a;
            return Boolean.hashCode(this.c) + b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return a.k(")", androidx.constraintlayout.core.state.a.q("ViewState(listId=", this.f12494a, ", isToggleOn=", ", isLoading=", this.b), this.c);
        }

        public /* synthetic */ ViewState(boolean z, int i) {
            this((i & 1) != 0 ? null : "", (i & 2) != 0 ? false : z, false);
        }
    }
}
