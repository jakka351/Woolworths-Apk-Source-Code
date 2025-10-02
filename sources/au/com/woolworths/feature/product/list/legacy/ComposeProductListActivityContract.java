package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract;", "", "Action", "ViewState", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ComposeProductListActivityContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action;", "", "LaunchSearch", "NavigateUp", "Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action$LaunchSearch;", "Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action$NavigateUp;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action$LaunchSearch;", "Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSearch extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSearch f5279a = new LaunchSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSearch);
            }

            public final int hashCode() {
                return -1784585094;
            }

            public final String toString() {
                return "LaunchSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action$NavigateUp;", "Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$Action;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateUp extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateUp f5280a = new NavigateUp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateUp);
            }

            public final int hashCode() {
                return -817431317;
            }

            public final String toString() {
                return "NavigateUp";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivityContract$ViewState;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f5281a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public ViewState(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f5281a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        public static ViewState a(ViewState viewState, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                str = viewState.f5281a;
            }
            String str3 = str;
            if ((i & 2) != 0) {
                str2 = viewState.b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                z = viewState.c;
            }
            boolean z5 = z;
            if ((i & 8) != 0) {
                z2 = viewState.d;
            }
            boolean z6 = z2;
            if ((i & 16) != 0) {
                z3 = viewState.e;
            }
            boolean z7 = z3;
            if ((i & 32) != 0) {
                z4 = viewState.f;
            }
            viewState.getClass();
            return new ViewState(str3, str4, z5, z6, z7, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f5281a, viewState.f5281a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f;
        }

        public final int hashCode() {
            int iHashCode = this.f5281a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.f) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ViewState(storeName=", this.f5281a, ", searchTerm=", this.b, ", showProductFinderTopBar=");
            au.com.woolworths.android.onesite.a.D(sbV, this.c, ", showProductFinderTopBarOliveButton=", this.d, ", showOliveVoiceFlow=");
            return au.com.woolworths.android.onesite.a.q(sbV, this.e, ", oliveSearchRunning=", this.f, ")");
        }
    }
}
