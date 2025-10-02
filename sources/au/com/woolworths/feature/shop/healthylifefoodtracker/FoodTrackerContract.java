package au.com.woolworths.feature.shop.healthylifefoodtracker;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract;", "", "Action", "ViewState", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FoodTrackerContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action;", "", "OpenUrl", "AddEdrRequest", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action$AddEdrRequest;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action$OpenUrl;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action$AddEdrRequest;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddEdrRequest extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final AddEdrRequest f7155a = new AddEdrRequest();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AddEdrRequest);
            }

            public final int hashCode() {
                return -1606791839;
            }

            public final String toString() {
                return "AddEdrRequest";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action$OpenUrl;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7156a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f7156a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f7156a, ((OpenUrl) obj).f7156a);
            }

            public final int hashCode() {
                return this.f7156a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f7156a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$ViewState;", "", "Companion", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState h = new ViewState(false, null, "", StatefulButtonState.d, null, null, false);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7157a;
        public final FoodTrackerPage b;
        public final String c;
        public final StatefulButtonState d;
        public final FullPageMessage.Error e;
        public final Text f;
        public final boolean g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$ViewState$Companion;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, FoodTrackerPage foodTrackerPage, String navigationalTitle, StatefulButtonState primaryActonState, FullPageMessage.Error error, Text text, boolean z2) {
            Intrinsics.h(navigationalTitle, "navigationalTitle");
            Intrinsics.h(primaryActonState, "primaryActonState");
            this.f7157a = z;
            this.b = foodTrackerPage;
            this.c = navigationalTitle;
            this.d = primaryActonState;
            this.e = error;
            this.f = text;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7157a == viewState.f7157a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7157a) * 31;
            FoodTrackerPage foodTrackerPage = this.b;
            int iHashCode2 = (this.d.hashCode() + androidx.camera.core.impl.b.c((iHashCode + (foodTrackerPage == null ? 0 : foodTrackerPage.hashCode())) * 31, 31, this.c)) * 31;
            FullPageMessage.Error error = this.e;
            int iHashCode3 = (iHashCode2 + (error == null ? 0 : error.hashCode())) * 31;
            Text text = this.f;
            return Boolean.hashCode(this.g) + ((iHashCode3 + (text != null ? text.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f7157a);
            sb.append(", page=");
            sb.append(this.b);
            sb.append(", navigationalTitle=");
            sb.append(this.c);
            sb.append(", primaryActonState=");
            sb.append(this.d);
            sb.append(", error=");
            sb.append(this.e);
            sb.append(", snackbarMessage=");
            sb.append(this.f);
            sb.append(", showConsentForm=");
            return YU.a.k(")", sb, this.g);
        }
    }
}
