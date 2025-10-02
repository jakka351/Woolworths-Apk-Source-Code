package au.com.woolworths.analytics.supers.payments;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics;", "", "Payment", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Payment implements Screen {
        public static final Payment d = new Payment();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final Action k;
            public static final Action l;
            public static final Action m;
            public static final Action n;
            public static final Action o;
            public static final Action p;
            public static final Action q;
            public static final Action r;
            public static final Action s;
            public static final /* synthetic */ Action[] t;
            public static final /* synthetic */ EnumEntries u;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE extends Action {
                public final Object v;

                public GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE() {
                    super("GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE", 12);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "network_error", spreadBuilder, "event.Description", "Gift card amount adjustment failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE extends Action {
                public final Object v;

                public GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE() {
                    super("GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE", 13);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "server_error", spreadBuilder, "event.Description", "Gift card amount adjustment failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.LINK_PAYPAL_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LINK_PAYPAL_NETWORK_ERROR extends Action {
                public final Object v;

                public LINK_PAYPAL_NETWORK_ERROR() {
                    super("LINK_PAYPAL_NETWORK_ERROR", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Link PayPal"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "network_error", spreadBuilder, "event.Description", "Link PayPal failure unable to open paypal");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.LINK_PAYPAL_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LINK_PAYPAL_SERVER_ERROR extends Action {
                public final Object v;

                public LINK_PAYPAL_SERVER_ERROR() {
                    super("LINK_PAYPAL_SERVER_ERROR", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Link PayPal"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "server_error", spreadBuilder, "event.Description", "Link PayPal failure unable to open paypal");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.PAYMENT_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAYMENT_NETWORK_ERROR extends Action {
                public final Object v;

                public PAYMENT_NETWORK_ERROR() {
                    super("PAYMENT_NETWORK_ERROR", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "network_error"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to load payment screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.PAYMENT_PLACE_ORDER_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAYMENT_PLACE_ORDER_NETWORK_ERROR extends Action {
                public final Object v;

                public PAYMENT_PLACE_ORDER_NETWORK_ERROR() {
                    super("PAYMENT_PLACE_ORDER_NETWORK_ERROR", 14);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "network_error"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Payment failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.PAYMENT_PLACE_ORDER_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAYMENT_PLACE_ORDER_SERVER_ERROR extends Action {
                public final Object v;

                public PAYMENT_PLACE_ORDER_SERVER_ERROR() {
                    super("PAYMENT_PLACE_ORDER_SERVER_ERROR", 15);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "server_error"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Payment failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.PAYMENT_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAYMENT_SERVER_ERROR extends Action {
                public final Object v;

                public PAYMENT_SERVER_ERROR() {
                    super("PAYMENT_SERVER_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "server_error"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to load payment screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_GIFT_CARD_BUTTON", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_GIFT_CARD_BUTTON extends Action {
                public final Object v;

                public REMOVE_GIFT_CARD_BUTTON() {
                    super("REMOVE_GIFT_CARD_BUTTON", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Remove gift card button", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "remove_gift_card_button";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_GIFT_CARD_CONFIRM", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_GIFT_CARD_CONFIRM extends Action {
                public final Object v;

                public REMOVE_GIFT_CARD_CONFIRM() {
                    super("REMOVE_GIFT_CARD_CONFIRM", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Remove gift dialog confirm", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "remove_gift_card_confirm";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_GIFT_CARD_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_GIFT_CARD_NETWORK_ERROR extends Action {
                public final Object v;

                public REMOVE_GIFT_CARD_NETWORK_ERROR() {
                    super("REMOVE_GIFT_CARD_NETWORK_ERROR", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "network_error", spreadBuilder, "event.Description", "Gift card removal error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_GIFT_CARD_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_GIFT_CARD_SERVER_ERROR extends Action {
                public final Object v;

                public REMOVE_GIFT_CARD_SERVER_ERROR() {
                    super("REMOVE_GIFT_CARD_SERVER_ERROR", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "server_error", spreadBuilder, "event.Description", "Gift card removal error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_PAYPAL_BUTTON", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_PAYPAL_BUTTON extends Action {
                public final Object v;

                public REMOVE_PAYPAL_BUTTON() {
                    super("REMOVE_PAYPAL_BUTTON", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Remove PayPal button", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "remove_paypal_button";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_PAYPAL_CONFIRM", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_PAYPAL_CONFIRM extends Action {
                public final Object v;

                public REMOVE_PAYPAL_CONFIRM() {
                    super("REMOVE_PAYPAL_CONFIRM", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Unlink PayPal confirmation button", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "unlink_paypal_button";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_PAYPAL_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_PAYPAL_NETWORK_ERROR extends Action {
                public final Object v;

                public REMOVE_PAYPAL_NETWORK_ERROR() {
                    super("REMOVE_PAYPAL_NETWORK_ERROR", 10);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "network_error", spreadBuilder, "event.Description", "PayPal removal error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_network_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/payments/PaymentAnalytics.Payment.Action.REMOVE_PAYPAL_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/payments/PaymentAnalytics$Payment$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_PAYPAL_SERVER_ERROR extends Action {
                public final Object v;

                public REMOVE_PAYPAL_SERVER_ERROR() {
                    super("REMOVE_PAYPAL_SERVER_ERROR", 11);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Payment.f);
                    spreadBuilder.a(new Pair("event.Category", "Payments"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    androidx.constraintlayout.core.state.a.z("event.Action", "server_error", spreadBuilder, "event.Description", "PayPal removal error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.v = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "payment_screen_server_failure";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.v;
                }
            }

            static {
                PAYMENT_NETWORK_ERROR payment_network_error = new PAYMENT_NETWORK_ERROR();
                d = payment_network_error;
                PAYMENT_SERVER_ERROR payment_server_error = new PAYMENT_SERVER_ERROR();
                e = payment_server_error;
                REMOVE_GIFT_CARD_BUTTON remove_gift_card_button = new REMOVE_GIFT_CARD_BUTTON();
                f = remove_gift_card_button;
                REMOVE_GIFT_CARD_CONFIRM remove_gift_card_confirm = new REMOVE_GIFT_CARD_CONFIRM();
                g = remove_gift_card_confirm;
                REMOVE_GIFT_CARD_NETWORK_ERROR remove_gift_card_network_error = new REMOVE_GIFT_CARD_NETWORK_ERROR();
                h = remove_gift_card_network_error;
                REMOVE_GIFT_CARD_SERVER_ERROR remove_gift_card_server_error = new REMOVE_GIFT_CARD_SERVER_ERROR();
                i = remove_gift_card_server_error;
                LINK_PAYPAL_NETWORK_ERROR link_paypal_network_error = new LINK_PAYPAL_NETWORK_ERROR();
                j = link_paypal_network_error;
                LINK_PAYPAL_SERVER_ERROR link_paypal_server_error = new LINK_PAYPAL_SERVER_ERROR();
                k = link_paypal_server_error;
                REMOVE_PAYPAL_BUTTON remove_paypal_button = new REMOVE_PAYPAL_BUTTON();
                l = remove_paypal_button;
                REMOVE_PAYPAL_CONFIRM remove_paypal_confirm = new REMOVE_PAYPAL_CONFIRM();
                m = remove_paypal_confirm;
                REMOVE_PAYPAL_NETWORK_ERROR remove_paypal_network_error = new REMOVE_PAYPAL_NETWORK_ERROR();
                n = remove_paypal_network_error;
                REMOVE_PAYPAL_SERVER_ERROR remove_paypal_server_error = new REMOVE_PAYPAL_SERVER_ERROR();
                o = remove_paypal_server_error;
                GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE gift_card_amount_adjustment_network_failure = new GIFT_CARD_AMOUNT_ADJUSTMENT_NETWORK_FAILURE();
                p = gift_card_amount_adjustment_network_failure;
                GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE gift_card_amount_adjustment_server_failure = new GIFT_CARD_AMOUNT_ADJUSTMENT_SERVER_FAILURE();
                q = gift_card_amount_adjustment_server_failure;
                PAYMENT_PLACE_ORDER_NETWORK_ERROR payment_place_order_network_error = new PAYMENT_PLACE_ORDER_NETWORK_ERROR();
                r = payment_place_order_network_error;
                PAYMENT_PLACE_ORDER_SERVER_ERROR payment_place_order_server_error = new PAYMENT_PLACE_ORDER_SERVER_ERROR();
                s = payment_place_order_server_error;
                Action[] actionArr = {payment_network_error, payment_server_error, remove_gift_card_button, remove_gift_card_confirm, remove_gift_card_network_error, remove_gift_card_server_error, link_paypal_network_error, link_paypal_server_error, remove_paypal_button, remove_paypal_confirm, remove_paypal_network_error, remove_paypal_server_error, gift_card_amount_adjustment_network_failure, gift_card_amount_adjustment_server_failure, payment_place_order_network_error, payment_place_order_server_error};
                t = actionArr;
                u = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) t.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Checkout Payment WPay screen"), new Pair("app.Section", "Checkout"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "checkoutpaymentwpay_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Checkout Payment WPay screen".equals(screen.getD()) && "checkoutpaymentwpay_screen".equals(screen.getD()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Checkout Payment WPay screen";
        }

        public final int hashCode() {
            return e.hashCode() + 269695373;
        }
    }
}
