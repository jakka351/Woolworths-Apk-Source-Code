package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocationItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract;", "", "Actions", "ViewState", "PageState", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PickUpLocationResultContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$Actions;", "", "OpenStoreDetails", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$Actions$OpenStoreDetails;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$Actions$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenStoreDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PickUpLocationItem f8205a;

            public OpenStoreDetails(PickUpLocationItem pickUpLocationItem) {
                Intrinsics.h(pickUpLocationItem, "pickUpLocationItem");
                this.f8205a = pickUpLocationItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenStoreDetails) && Intrinsics.c(this.f8205a, ((OpenStoreDetails) obj).f8205a);
            }

            public final int hashCode() {
                return this.f8205a.hashCode();
            }

            public final String toString() {
                return "OpenStoreDetails(pickUpLocationItem=" + this.f8205a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$PageState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("LOCATION_LIST", 1);
            e = pageState2;
            PageState pageState3 = new PageState("ERROR", 2);
            f = pageState3;
            PageState[] pageStateArr = {pageState, pageState2, pageState3};
            g = pageStateArr;
            h = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultContract$ViewState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f8206a;
        public final PickUpLocationResultErrorState b;
        public final List c;

        public ViewState(PageState pageState, PickUpLocationResultErrorState pickUpLocationResultErrorState, List list) {
            this.f8206a = pageState;
            this.b = pickUpLocationResultErrorState;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8206a == viewState.f8206a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8206a.hashCode() * 31;
            PickUpLocationResultErrorState pickUpLocationResultErrorState = this.b;
            return this.c.hashCode() + ((iHashCode + (pickUpLocationResultErrorState == null ? 0 : pickUpLocationResultErrorState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(pageState=");
            sb.append(this.f8206a);
            sb.append(", errorState=");
            sb.append(this.b);
            sb.append(", storeList=");
            return android.support.v4.media.session.a.t(sb, this.c, ")");
        }
    }
}
