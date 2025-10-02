package au.com.woolworths.analytics.rewards.checkout;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics;", "", "DeliveryPage", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckoutDeliveryAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class DeliveryPage implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.ADD_SHIPPING_DETAILS_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_SHIPPING_DETAILS_BUTTON_CLICK extends Action {
                public final Object f;

                public ADD_SHIPPING_DETAILS_BUTTON_CLICK() {
                    super("ADD_SHIPPING_DETAILS_BUTTON_CLICK", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "selectShippingDetails"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Add Shipping Details", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "addshippingdetails_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_BACK_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_BACK_BUTTON_CLICK extends Action {
                public final Object f;

                public DELIVERY_BACK_BUTTON_CLICK() {
                    super("DELIVERY_BACK_BUTTON_CLICK", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "Delivery"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Back button", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "backbutton_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_CANCEL_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_CANCEL_BUTTON_CLICK extends Action {
                public final Object f;

                public DELIVERY_CANCEL_BUTTON_CLICK() {
                    super("DELIVERY_CANCEL_BUTTON_CLICK", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "Delivery"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "close", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cancel_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_CONTINUE_TO_PAYMENT_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_CONTINUE_TO_PAYMENT_CLICK extends Action {
                public final Object f;

                public DELIVERY_CONTINUE_TO_PAYMENT_CLICK() {
                    super("DELIVERY_CONTINUE_TO_PAYMENT_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "Delivery"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "continue to payment", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "continuetopayment_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_DIALOG_ADD_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_DIALOG_ADD_CLICK extends Action {
                public final Object f;

                public DELIVERY_DIALOG_ADD_CLICK() {
                    super("DELIVERY_DIALOG_ADD_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Add shipping details", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "addshippingdetails_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_DIALOG_CANCEL_CLICK", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_DIALOG_CANCEL_CLICK extends Action {
                public final Object f;

                public DELIVERY_DIALOG_CANCEL_CLICK() {
                    super("DELIVERY_DIALOG_CANCEL_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Cancel", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cancel_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics.DeliveryPage.Action.DELIVERY_DIALOG_IMPRESSION", "Lau/com/woolworths/analytics/rewards/checkout/CheckoutDeliveryAnalytics$DeliveryPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_DIALOG_IMPRESSION extends Action {
                public final Object f;

                public DELIVERY_DIALOG_IMPRESSION() {
                    super("DELIVERY_DIALOG_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(DeliveryPage.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "No shipping address added", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "delivery_dialog_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            static {
                Action[] actionArr = {new DELIVERY_DIALOG_IMPRESSION(), new DELIVERY_DIALOG_ADD_CLICK(), new DELIVERY_DIALOG_CANCEL_CLICK(), new DELIVERY_CONTINUE_TO_PAYMENT_CLICK(), new DELIVERY_BACK_BUTTON_CLICK(), new DELIVERY_CANCEL_BUTTON_CLICK(), new ADD_SHIPPING_DETAILS_BUTTON_CLICK()};
                d = actionArr;
                e = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) d.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Delivery"), new Pair("screen.Type", "checkout"), new Pair("app.Section", "checkout"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "delivery_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Delivery".equals(screen.getD()) && "delivery_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Delivery";
        }

        public final int hashCode() {
            return d.hashCode() - 1955223843;
        }
    }
}
