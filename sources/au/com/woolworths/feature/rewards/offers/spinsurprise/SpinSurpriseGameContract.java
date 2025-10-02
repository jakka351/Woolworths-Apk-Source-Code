package au.com.woolworths.feature.rewards.offers.spinsurprise;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract;", "", "Action", "ViewState", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinSurpriseGameContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action;", "", "LoadUrlInWebView", "CloseScreenAndShowError", "CloseScreen", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$CloseScreenAndShowError;", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$LoadUrlInWebView;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6397a = new CloseScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$CloseScreenAndShowError;", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreenAndShowError extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6398a;

            public CloseScreenAndShowError(Text text) {
                this.f6398a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseScreenAndShowError) && Intrinsics.c(this.f6398a, ((CloseScreenAndShowError) obj).f6398a);
            }

            public final int hashCode() {
                return this.f6398a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("CloseScreenAndShowError(message=", this.f6398a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action$LoadUrlInWebView;", "Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LoadUrlInWebView extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6399a;
            public final Set b;

            public LoadUrlInWebView(String initialUrl, Set set) {
                Intrinsics.h(initialUrl, "initialUrl");
                this.f6399a = initialUrl;
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadUrlInWebView)) {
                    return false;
                }
                LoadUrlInWebView loadUrlInWebView = (LoadUrlInWebView) obj;
                return Intrinsics.c(this.f6399a, loadUrlInWebView.f6399a) && Intrinsics.c(this.b, loadUrlInWebView.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6399a.hashCode() * 31);
            }

            public final String toString() {
                return "LoadUrlInWebView(initialUrl=" + this.f6399a + ", internalUrls=" + this.b + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$ViewState;", "", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState b = new ViewState(true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6400a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameContract$ViewState$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z) {
            this.f6400a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f6400a == ((ViewState) obj).f6400a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6400a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("ViewState(isLoading=", ")", this.f6400a);
        }
    }
}
