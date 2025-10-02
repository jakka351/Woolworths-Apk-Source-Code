package au.com.woolworths.analytics.supers.payments;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddCreditCardAnalytics;", "", "Payment", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddCreditCardAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddCreditCardAnalytics$Payment;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Payment implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddCreditCardAnalytics$Payment$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final Payment f4041a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;
            public final Lazy f;
            public final Lazy g;

            public Action(Payment payment) {
                this.f4041a = payment;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i2 = 1;
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i3 = 2;
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i4 = 3;
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i5 = 4;
                this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i6 = 5;
                this.g = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.a
                    public final /* synthetic */ AddCreditCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardNetworkErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardServerErrorLoadWebview$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server error", spreadBuilder, "event.Description", "Unable to load add credit card webview");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add credit card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardButtonClickServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4041a.g);
                                        spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add credit card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_credit_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_credit_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
            }
        }

        public Payment(String screenName, String str) {
            Intrinsics.h(screenName, "screenName");
            this.d = screenName;
            String lowerCase = androidx.camera.core.impl.b.D("\\s", screenName, "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.e = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", screenName), new Pair("app.Section", str));
            this.f = mapJ;
            this.g = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.h = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(this.d, screen.getD()) && Intrinsics.c(this.e, screen.getD()) && Intrinsics.c(this.f, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.f;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + androidx.camera.core.impl.b.c(this.d.hashCode() * 31, 31, this.e);
        }
    }
}
