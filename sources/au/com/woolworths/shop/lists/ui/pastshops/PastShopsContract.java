package au.com.woolworths.shop.lists.ui.pastshops;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract;", "", "Actions", "ViewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PastShopsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions;", "", "PastShopClicked", "Retry", "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions$PastShopClicked;", "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions$Retry;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions$PastShopClicked;", "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PastShopClicked extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PurchaseHistoryEvent f12365a;

            public PastShopClicked(PurchaseHistoryEvent item) {
                Intrinsics.h(item, "item");
                this.f12365a = item;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PastShopClicked) && Intrinsics.c(this.f12365a, ((PastShopClicked) obj).f12365a);
            }

            public final int hashCode() {
                return this.f12365a.hashCode();
            }

            public final String toString() {
                return "PastShopClicked(item=" + this.f12365a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions$Retry;", "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Retry extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Retry f12366a = new Retry();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12367a;
        public final int b;
        public final PastShopsFullPageError c;

        public ViewState(boolean z, int i, PastShopsFullPageError pastShopsFullPageError) {
            this.f12367a = z;
            this.b = i;
            this.c = pastShopsFullPageError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12367a == viewState.f12367a && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            int iA = androidx.camera.core.impl.b.a(this.b, Boolean.hashCode(this.f12367a) * 31, 31);
            PastShopsFullPageError pastShopsFullPageError = this.c;
            return iA + (pastShopsFullPageError == null ? 0 : pastShopsFullPageError.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12367a + ", totalCount=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
