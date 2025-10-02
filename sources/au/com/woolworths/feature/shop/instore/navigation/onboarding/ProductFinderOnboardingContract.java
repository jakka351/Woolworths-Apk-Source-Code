package au.com.woolworths.feature.shop.instore.navigation.onboarding;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract;", "", "ViewState", "Actions", "EventSink", "OnboardingEvent", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductFinderOnboardingContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions;", "", "CloseAndMoveToProductFinder", "CloseOnboarding", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions$CloseAndMoveToProductFinder;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions$CloseOnboarding;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions$CloseAndMoveToProductFinder;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseAndMoveToProductFinder implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseAndMoveToProductFinder f7413a = new CloseAndMoveToProductFinder();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseAndMoveToProductFinder);
            }

            public final int hashCode() {
                return -2134764561;
            }

            public final String toString() {
                return "CloseAndMoveToProductFinder";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions$CloseOnboarding;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseOnboarding implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseOnboarding f7414a = new CloseOnboarding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseOnboarding);
            }

            public final int hashCode() {
                return -1841917512;
            }

            public final String toString() {
                return "CloseOnboarding";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$EventSink;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface EventSink {
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "", "OnBackButtonClick", "OnNextButtonClick", "OnActionButtonClick", "UpdateCurrentPageIndex", "TrackScreenImpression", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnActionButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnBackButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnNextButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$TrackScreenImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$UpdateCurrentPageIndex;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnboardingEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnActionButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnActionButtonClick implements OnboardingEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final OnActionButtonClick f7415a = new OnActionButtonClick();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnActionButtonClick);
            }

            public final int hashCode() {
                return -1482763384;
            }

            public final String toString() {
                return "OnActionButtonClick";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnBackButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnBackButtonClick implements OnboardingEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final OnBackButtonClick f7416a = new OnBackButtonClick();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnBackButtonClick);
            }

            public final int hashCode() {
                return 299388471;
            }

            public final String toString() {
                return "OnBackButtonClick";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$OnNextButtonClick;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnNextButtonClick implements OnboardingEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f7417a;

            public OnNextButtonClick(String buttonLabel) {
                Intrinsics.h(buttonLabel, "buttonLabel");
                this.f7417a = buttonLabel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnNextButtonClick) && Intrinsics.c(this.f7417a, ((OnNextButtonClick) obj).f7417a);
            }

            public final int hashCode() {
                return this.f7417a.hashCode();
            }

            public final String toString() {
                return a.h("OnNextButtonClick(buttonLabel=", this.f7417a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$TrackScreenImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TrackScreenImpression implements OnboardingEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final TrackScreenImpression f7418a = new TrackScreenImpression();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof TrackScreenImpression);
            }

            public final int hashCode() {
                return -739065977;
            }

            public final String toString() {
                return "TrackScreenImpression";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent$UpdateCurrentPageIndex;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$OnboardingEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateCurrentPageIndex implements OnboardingEvent {

            /* renamed from: a, reason: collision with root package name */
            public final int f7419a;
            public final String b;

            public UpdateCurrentPageIndex(int i, String str) {
                this.f7419a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateCurrentPageIndex)) {
                    return false;
                }
                UpdateCurrentPageIndex updateCurrentPageIndex = (UpdateCurrentPageIndex) obj;
                return this.f7419a == updateCurrentPageIndex.f7419a && Intrinsics.c(this.b, updateCurrentPageIndex.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.f7419a) * 31);
            }

            public final String toString() {
                return "UpdateCurrentPageIndex(currentPageIndex=" + this.f7419a + ", pageDescription=" + this.b + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$ViewState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f7420a;
        public final int b;
        public final String c;
        public final boolean d;

        public ViewState(List pages, int i, String str, boolean z) {
            Intrinsics.h(pages, "pages");
            this.f7420a = pages;
            this.b = i;
            this.c = str;
            this.d = z;
        }

        public static ViewState a(ViewState viewState, List pages, int i, String str, boolean z, int i2) {
            if ((i2 & 1) != 0) {
                pages = viewState.f7420a;
            }
            if ((i2 & 2) != 0) {
                i = viewState.b;
            }
            if ((i2 & 4) != 0) {
                str = viewState.c;
            }
            if ((i2 & 8) != 0) {
                z = viewState.d;
            }
            viewState.getClass();
            Intrinsics.h(pages, "pages");
            return new ViewState(pages, i, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f7420a, viewState.f7420a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + b.c(b.a(this.b, this.f7420a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(pages=");
            sb.append(this.f7420a);
            sb.append(", currentPageIndex=");
            sb.append(this.b);
            sb.append(", currentPageTitle=");
            return d.r(this.c, ", isLastPageShowing=", ")", sb, this.d);
        }
    }
}
