package au.com.woolworths.shop.lists.ui.snapalist.main;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract;", "", "ViewState", "Action", "DialogMessage", "Listener", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProcessorContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action;", "", "FinishWithResult", "OpenAppSettings", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action$FinishWithResult;", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action$OpenAppSettings;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action$FinishWithResult;", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithResult implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final List f12458a;

            public FinishWithResult(List list) {
                this.f12458a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishWithResult) && Intrinsics.c(this.f12458a, ((FinishWithResult) obj).f12458a);
            }

            public final int hashCode() {
                return this.f12458a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.l("FinishWithResult(productList=", ")", this.f12458a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action$OpenAppSettings;", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Action;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAppSettings implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenAppSettings f12459a = new OpenAppSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenAppSettings);
            }

            public final int hashCode() {
                return -1393818510;
            }

            public final String toString() {
                return "OpenAppSettings";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$DialogMessage;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DialogMessage {

        /* renamed from: a, reason: collision with root package name */
        public final int f12460a;

        public DialogMessage(int i) {
            this.f12460a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogMessage) && this.f12460a == ((DialogMessage) obj).f12460a;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.shop_lists_snap_error_cta) + androidx.camera.core.impl.b.a(this.f12460a, Integer.hashCode(R.string.shop_lists_snap_error_title) * 31, 31);
        }

        public final String toString() {
            return YU.a.e(this.f12460a, "DialogMessage(title=2132019280, message=", ", cta=2132019275)");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Listener;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void P2();

        void Q2();

        void f0();

        void g0();

        void p2();

        void s();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12461a;
        public final boolean b;
        public final DialogMessage c;

        public /* synthetic */ ViewState(int i) {
            this((i & 1) == 0, false, null);
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, DialogMessage dialogMessage, int i) {
            if ((i & 1) != 0) {
                z = viewState.f12461a;
            }
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            if ((i & 4) != 0) {
                dialogMessage = viewState.c;
            }
            viewState.getClass();
            return new ViewState(z, z2, dialogMessage);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12461a == viewState.f12461a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f12461a) * 31, 31, this.b);
            DialogMessage dialogMessage = this.c;
            return iE + (dialogMessage == null ? 0 : dialogMessage.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isTakingPhoto=", ", dialogMessage=", this.f12461a, this.b);
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }

        public ViewState(boolean z, boolean z2, DialogMessage dialogMessage) {
            this.f12461a = z;
            this.b = z2;
            this.c = dialogMessage;
        }
    }
}
