package au.com.woolworths.feature.shop.countryselector;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract;", "", "Actions", "ViewState", "Destination", "ViewStateBySource", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CountrySelectorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions;", "", "Navigate", "PerformIdpLogout", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions$Navigate;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions$PerformIdpLogout;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions$Navigate;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Navigate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Destination f7031a;

            public Navigate(Destination destination) {
                this.f7031a = destination;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Navigate) && Intrinsics.c(this.f7031a, ((Navigate) obj).f7031a);
            }

            public final int hashCode() {
                return this.f7031a.hashCode();
            }

            public final String toString() {
                return "Navigate(destination=" + this.f7031a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions$PerformIdpLogout;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Actions;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformIdpLogout extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformIdpLogout f7032a = new PerformIdpLogout();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformIdpLogout);
            }

            public final int hashCode() {
                return -845635326;
            }

            public final String toString() {
                return "PerformIdpLogout";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination;", "", "HomePage", "Onboarding", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination$HomePage;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination$Onboarding;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Destination {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination$HomePage;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HomePage extends Destination {

            /* renamed from: a, reason: collision with root package name */
            public final Region f7033a;

            public HomePage(Region region) {
                Intrinsics.h(region, "region");
                this.f7033a = region;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HomePage) && this.f7033a == ((HomePage) obj).f7033a;
            }

            public final int hashCode() {
                return this.f7033a.hashCode();
            }

            public final String toString() {
                return "HomePage(region=" + this.f7033a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination$Onboarding;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$Destination;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Onboarding extends Destination {

            /* renamed from: a, reason: collision with root package name */
            public static final Onboarding f7034a = new Onboarding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Onboarding);
            }

            public final int hashCode() {
                return 190260910;
            }

            public final String toString() {
                return "Onboarding";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewState;", "", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Region f7035a;
        public final Activities.CountrySelector.Source b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final Region f;
        public final ViewStateBySource g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Activities.CountrySelector.Source.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Activities.CountrySelector.Source source = Activities.CountrySelector.Source.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public ViewState(Region region, Activities.CountrySelector.Source source, boolean z, boolean z2, boolean z3, Region region2) {
            ViewStateBySource onboardingCountrySelectorViewState;
            Intrinsics.h(source, "source");
            this.f7035a = region;
            this.b = source;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = region2;
            int iOrdinal = source.ordinal();
            if (iOrdinal == 0) {
                onboardingCountrySelectorViewState = new ViewStateBySource.OnboardingCountrySelectorViewState(region);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (region == null) {
                    throw new IllegalStateException("selectedRegion cannot be null for More screen, make sure you are using CountrySelectorInteractor.regionOrDefault");
                }
                onboardingCountrySelectorViewState = new ViewStateBySource.MoreCountrySelectorViewState(region, z, z2, z3, region);
            }
            this.g = onboardingCountrySelectorViewState;
        }

        public static ViewState a(ViewState viewState, Region region, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                region = viewState.f7035a;
            }
            Region region2 = region;
            Activities.CountrySelector.Source source = viewState.b;
            if ((i & 4) != 0) {
                z = viewState.c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = viewState.d;
            }
            boolean z4 = z2;
            boolean z5 = (i & 16) != 0 ? viewState.e : true;
            Region region3 = viewState.f;
            viewState.getClass();
            Intrinsics.h(source, "source");
            return new ViewState(region2, source, z3, z4, z5, region3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7035a == viewState.f7035a && this.b == viewState.b && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f;
        }

        public final int hashCode() {
            Region region = this.f7035a;
            int iE = b.e(b.e(b.e((this.b.hashCode() + ((region == null ? 0 : region.hashCode()) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
            Region region2 = this.f;
            return iE + (region2 != null ? region2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(selectedRegion=");
            sb.append(this.f7035a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", isUserLoggedIn=");
            a.D(sb, this.c, ", showConfimDialog=", this.d, ", showLoadingScreen=");
            sb.append(this.e);
            sb.append(", lastSelectedRegion=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource;", "", "MoreCountrySelectorViewState", "OnboardingCountrySelectorViewState", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource$MoreCountrySelectorViewState;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource$OnboardingCountrySelectorViewState;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewStateBySource {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource$MoreCountrySelectorViewState;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MoreCountrySelectorViewState implements ViewStateBySource {

            /* renamed from: a, reason: collision with root package name */
            public final Region f7036a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final Region e;

            public MoreCountrySelectorViewState(Region selectedRegion, boolean z, boolean z2, boolean z3, Region lastSelectedRegion) {
                Intrinsics.h(selectedRegion, "selectedRegion");
                Intrinsics.h(lastSelectedRegion, "lastSelectedRegion");
                this.f7036a = selectedRegion;
                this.b = z;
                this.c = z2;
                this.d = z3;
                this.e = lastSelectedRegion;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoreCountrySelectorViewState)) {
                    return false;
                }
                MoreCountrySelectorViewState moreCountrySelectorViewState = (MoreCountrySelectorViewState) obj;
                return this.f7036a == moreCountrySelectorViewState.f7036a && this.b == moreCountrySelectorViewState.b && this.c == moreCountrySelectorViewState.c && this.d == moreCountrySelectorViewState.d && this.e == moreCountrySelectorViewState.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + b.e(b.e(b.e(this.f7036a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MoreCountrySelectorViewState(selectedRegion=");
                sb.append(this.f7036a);
                sb.append(", isUserLoggedIn=");
                sb.append(this.b);
                sb.append(", showRegionConfirmationDialog=");
                a.D(sb, this.c, ", showLoadingScreen=", this.d, ", lastSelectedRegion=");
                sb.append(this.e);
                sb.append(")");
                return sb.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource$OnboardingCountrySelectorViewState;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewStateBySource;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnboardingCountrySelectorViewState implements ViewStateBySource {

            /* renamed from: a, reason: collision with root package name */
            public final Region f7037a;

            public OnboardingCountrySelectorViewState(Region region) {
                this.f7037a = region;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnboardingCountrySelectorViewState) && this.f7037a == ((OnboardingCountrySelectorViewState) obj).f7037a;
            }

            public final int hashCode() {
                Region region = this.f7037a;
                if (region == null) {
                    return 0;
                }
                return region.hashCode();
            }

            public final String toString() {
                return "OnboardingCountrySelectorViewState(selectedRegion=" + this.f7037a + ")";
            }
        }
    }
}
