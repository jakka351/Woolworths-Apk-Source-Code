package au.com.woolworths.analytics.supers.deliveryunlimited;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics;", "", "Payment", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionConfirmationAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Payment implements Screen {
        public static final Payment d = new Payment();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final /* synthetic */ Action[] h;
            public static final /* synthetic */ EnumEntries i;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics.Payment.Action.CONFIRM_SUBSCRIPTION_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRM_SUBSCRIPTION_NETWORK_ERROR extends Action {
                public final Object j;

                public CONFIRM_SUBSCRIPTION_NETWORK_ERROR() {
                    super("CONFIRM_SUBSCRIPTION_NETWORK_ERROR", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Subscription Payments"));
                    spreadBuilder.a(new Pair("event.Action", "network_error"));
                    a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to load confirm subscription screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "confirm_subscription_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics.Payment.Action.CONFIRM_SUBSCRIPTION_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRM_SUBSCRIPTION_SERVER_ERROR extends Action {
                public final Object j;

                public CONFIRM_SUBSCRIPTION_SERVER_ERROR() {
                    super("CONFIRM_SUBSCRIPTION_SERVER_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Subscription Payments"));
                    spreadBuilder.a(new Pair("event.Action", "server_error"));
                    a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to load confirm subscription screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "confirm_subscription_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics.Payment.Action.CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR extends Action {
                public final Object j;

                public CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR() {
                    super("CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Subscription Payments"));
                    spreadBuilder.a(new Pair("event.Action", "network_error"));
                    a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Subscription Payment network failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "subscription_payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics.Payment.Action.CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/deliveryunlimited/SubscriptionConfirmationAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR extends Action {
                public final Object j;

                public CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR() {
                    super("CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Subscription Payments"));
                    spreadBuilder.a(new Pair("event.Action", "server_error"));
                    a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Subscription Payment server failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "confirm_subscription_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            static {
                CONFIRM_SUBSCRIPTION_NETWORK_ERROR confirm_subscription_network_error = new CONFIRM_SUBSCRIPTION_NETWORK_ERROR();
                d = confirm_subscription_network_error;
                CONFIRM_SUBSCRIPTION_SERVER_ERROR confirm_subscription_server_error = new CONFIRM_SUBSCRIPTION_SERVER_ERROR();
                e = confirm_subscription_server_error;
                CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR confirm_subscription_subscribe_network_error = new CONFIRM_SUBSCRIPTION_SUBSCRIBE_NETWORK_ERROR();
                f = confirm_subscription_subscribe_network_error;
                CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR confirm_subscription_subscribe_server_error = new CONFIRM_SUBSCRIPTION_SUBSCRIBE_SERVER_ERROR();
                g = confirm_subscription_subscribe_server_error;
                Action[] actionArr = {confirm_subscription_network_error, confirm_subscription_server_error, confirm_subscription_subscribe_network_error, confirm_subscription_subscribe_server_error};
                h = actionArr;
                i = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) h.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Confirm Subscription WPay screen"), new Pair("app.Section", "Delivery Unlimited"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "confirmsubscriptionwpay_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Confirm Subscription WPay screen".equals(screen.getD()) && "confirmsubscriptionwpay_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Confirm Subscription WPay screen";
        }

        public final int hashCode() {
            return e.hashCode() - 1355363397;
        }
    }
}
