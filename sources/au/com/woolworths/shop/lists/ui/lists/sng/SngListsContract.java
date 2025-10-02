package au.com.woolworths.shop.lists.ui.lists.sng;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract;", "", "ViewState", "Actions", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SngListsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract$Actions;", "", "ShowSnackbar", "Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract$Actions$ShowSnackbar;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackbar);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShowSnackbar(text=null)";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewState);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ViewState(isLoading=false)";
        }
    }
}
