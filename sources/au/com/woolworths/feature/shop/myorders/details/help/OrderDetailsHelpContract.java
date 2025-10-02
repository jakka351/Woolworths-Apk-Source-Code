package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract;", "", "ViewState", "Actions", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderDetailsHelpContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions;", "", "OpenOliveActivity", "OpenExternalLink", "Back", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$Back;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$OpenOliveActivity;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$Back;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Back extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Back f7721a = new Back();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenExternalLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7722a;
            public final String b;

            public OpenExternalLink(String title, String externalLink) {
                Intrinsics.h(title, "title");
                Intrinsics.h(externalLink, "externalLink");
                this.f7722a = title;
                this.b = externalLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenExternalLink)) {
                    return false;
                }
                OpenExternalLink openExternalLink = (OpenExternalLink) obj;
                return Intrinsics.c(this.f7722a, openExternalLink.f7722a) && Intrinsics.c(this.b, openExternalLink.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7722a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenExternalLink(title=", this.f7722a, ", externalLink=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions$OpenOliveActivity;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7723a;
            public final String b;

            public OpenOliveActivity(String title, String oliveUrl) {
                Intrinsics.h(title, "title");
                Intrinsics.h(oliveUrl, "oliveUrl");
                this.f7723a = title;
                this.b = oliveUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenOliveActivity)) {
                    return false;
                }
                OpenOliveActivity openOliveActivity = (OpenOliveActivity) obj;
                return Intrinsics.c(this.f7723a, openOliveActivity.f7723a) && Intrinsics.c(this.b, openOliveActivity.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7723a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenOliveActivity(title=", this.f7723a, ", oliveUrl=", this.b, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState;", "", "Loading", "Loaded", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState$Loaded;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState$Loading;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState$Loaded;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loaded extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final OrderHelpDataList f7724a;

            public Loaded(OrderHelpDataList helpItem) {
                Intrinsics.h(helpItem, "helpItem");
                this.f7724a = helpItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && Intrinsics.c(this.f7724a, ((Loaded) obj).f7724a);
            }

            public final int hashCode() {
                return this.f7724a.hashCode();
            }

            public final String toString() {
                return "Loaded(helpItem=" + this.f7724a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Loading extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f7725a = new Loading();
        }
    }
}
