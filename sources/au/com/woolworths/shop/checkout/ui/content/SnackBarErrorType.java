package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType;", "", "Network", "Server", "Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType$Network;", "Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType$Server;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SnackBarErrorType {

    /* renamed from: a, reason: collision with root package name */
    public final String f10763a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType$Network;", "Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Network extends SnackBarErrorType {
        public final Event b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Network(int i, Event event) {
            super("No network connection. Please retry.");
            event = (i & 2) != 0 ? null : event;
            this.b = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Network) && Intrinsics.c(this.b, ((Network) obj).b);
        }

        public final int hashCode() {
            Event event = this.b;
            if (event == null) {
                return 0;
            }
            return event.hashCode();
        }

        public final String toString() {
            return "Network(trackingAction=null, trackingEvent=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType$Server;", "Lau/com/woolworths/shop/checkout/ui/content/SnackBarErrorType;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Server extends SnackBarErrorType {
        public final String b;
        public final Action c;
        public final Event d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Server(String str, Action action, Event event, int i) {
            super("Unable to reserve selected window. Select another window or retry.");
            str = (i & 1) != 0 ? null : str;
            action = (i & 2) != 0 ? null : action;
            event = (i & 4) != 0 ? null : event;
            this.b = str;
            this.c = action;
            this.d = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Server)) {
                return false;
            }
            Server server = (Server) obj;
            return Intrinsics.c(this.b, server.b) && Intrinsics.c(this.c, server.c) && Intrinsics.c(this.d, server.d);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Action action = this.c;
            int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
            Event event = this.d;
            return iHashCode2 + (event != null ? event.hashCode() : 0);
        }

        public final String toString() {
            return "Server(message=" + this.b + ", trackingAction=" + this.c + ", trackingEvent=" + this.d + ")";
        }
    }

    public SnackBarErrorType(String str) {
        this.f10763a = str;
    }
}
