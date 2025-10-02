package au.com.woolworths.shop.lists.ui.magicmatch;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract;", "", "ViewState", "Action", "Listener", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MagicMatchContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Action;", "", "FinishWithResult", "Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Action$FinishWithResult;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Action$FinishWithResult;", "Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithResult implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final FinishWithResult f12355a = new FinishWithResult();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FinishWithResult);
            }

            public final int hashCode() {
                return 686643242;
            }

            public final String toString() {
                return "FinishWithResult";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Listener;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void s();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12356a;

        public ViewState(boolean z) {
            this.f12356a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f12356a == ((ViewState) obj).f12356a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12356a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("ViewState(isLoading=", ")", this.f12356a);
        }
    }
}
