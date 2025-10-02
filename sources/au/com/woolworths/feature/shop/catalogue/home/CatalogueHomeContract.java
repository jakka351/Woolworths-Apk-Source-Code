package au.com.woolworths.feature.shop.catalogue.home;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueHome;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract;", "", "Action", "ViewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueHomeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "", "LaunchInitialStoreSelection", "LaunchSubsequentStoreSelection", "LaunchTermsAndConditions", "LaunchCatalogueDetails", "LaunchCatalogueBrowse", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchCatalogueBrowse;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchCatalogueDetails;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchInitialStoreSelection;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchSubsequentStoreSelection;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchTermsAndConditions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchCatalogueBrowse;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueBrowse extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6838a;

            public LaunchCatalogueBrowse(String str) {
                this.f6838a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCatalogueBrowse) && Intrinsics.c(this.f6838a, ((LaunchCatalogueBrowse) obj).f6838a);
            }

            public final int hashCode() {
                String str = this.f6838a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchCatalogueBrowse(catalogueId=", this.f6838a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchCatalogueDetails;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6839a;
            public final CatalogueTracking b;

            public LaunchCatalogueDetails(CatalogueTracking catalogueTracking, String str) {
                this.f6839a = str;
                this.b = catalogueTracking;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchCatalogueDetails)) {
                    return false;
                }
                LaunchCatalogueDetails launchCatalogueDetails = (LaunchCatalogueDetails) obj;
                return Intrinsics.c(this.f6839a, launchCatalogueDetails.f6839a) && Intrinsics.c(this.b, launchCatalogueDetails.b);
            }

            public final int hashCode() {
                int iHashCode = this.f6839a.hashCode() * 31;
                CatalogueTracking catalogueTracking = this.b;
                return iHashCode + (catalogueTracking == null ? 0 : catalogueTracking.hashCode());
            }

            public final String toString() {
                return "LaunchCatalogueDetails(id=" + this.f6839a + ", tracking=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchInitialStoreSelection;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchInitialStoreSelection extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchInitialStoreSelection f6840a = new LaunchInitialStoreSelection();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchSubsequentStoreSelection;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSubsequentStoreSelection extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSubsequentStoreSelection f6841a = new LaunchSubsequentStoreSelection();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action$LaunchTermsAndConditions;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchTermsAndConditions extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f6842a;

            public LaunchTermsAndConditions(ArrayList arrayList) {
                this.f6842a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchTermsAndConditions) && this.f6842a.equals(((LaunchTermsAndConditions) obj).f6842a);
            }

            public final int hashCode() {
                return this.f6842a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.k("LaunchTermsAndConditions(terms=", ")", this.f6842a);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6843a;
        public final CatalogueHome b;
        public final CatalogueHomePageErrorState c;

        public ViewState(CatalogueHome catalogueHome, CatalogueHomePageErrorState catalogueHomePageErrorState, int i) {
            boolean z = (i & 1) == 0;
            catalogueHome = (i & 2) != 0 ? null : catalogueHome;
            catalogueHomePageErrorState = (i & 4) != 0 ? null : catalogueHomePageErrorState;
            this.f6843a = z;
            this.b = catalogueHome;
            this.c = catalogueHomePageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6843a == viewState.f6843a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6843a) * 31;
            CatalogueHome catalogueHome = this.b;
            int iHashCode2 = (iHashCode + (catalogueHome == null ? 0 : catalogueHome.f6856a.hashCode())) * 31;
            CatalogueHomePageErrorState catalogueHomePageErrorState = this.c;
            return iHashCode2 + (catalogueHomePageErrorState != null ? catalogueHomePageErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f6843a + ", data=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
