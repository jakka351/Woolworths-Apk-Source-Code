package au.com.woolworths.analytics.supers.payments;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddGiftCardAnalytics;", "", "Payment", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddGiftCardAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddGiftCardAnalytics$Payment;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Payment implements Screen {
        public final String d;
        public final Object e;
        public final Pair[] f;
        public final Action g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/payments/AddGiftCardAnalytics$Payment$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final Payment f4042a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;
            public final Lazy f;

            public Action(Payment payment) {
                this.f4042a = payment;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.b
                    public final /* synthetic */ AddGiftCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenValidationFailure$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Gift Card Validation Failure", spreadBuilder, "event.Description", "Failure to validate the gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_validation_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_validation_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.b
                    public final /* synthetic */ AddGiftCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenValidationFailure$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Gift Card Validation Failure", spreadBuilder, "event.Description", "Failure to validate the gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_validation_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_validation_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.b
                    public final /* synthetic */ AddGiftCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenValidationFailure$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Gift Card Validation Failure", spreadBuilder, "event.Description", "Failure to validate the gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_validation_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_validation_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.b
                    public final /* synthetic */ AddGiftCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenValidationFailure$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Gift Card Validation Failure", spreadBuilder, "event.Description", "Failure to validate the gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_validation_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_validation_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.payments.b
                    public final /* synthetic */ AddGiftCardAnalytics.Payment.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "network_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Network Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_network_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_network_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "server_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Server Error", spreadBuilder, "event.Description", "Unable to add gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_server_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_server_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenValidationFailure$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "Gift Card Validation Failure", spreadBuilder, "event.Description", "Failure to validate the gift card");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_screen_validation_failure";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_screen_validation_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOn$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - on");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardButtonClickToggleOff$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4042a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                        spreadBuilder.a(new Pair("event.Label", "Add gift card"));
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Description", "Toggle state - off");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "add_gift_card_button";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "add_gift_card_button".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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

        public Payment(String str) {
            String lowerCase = androidx.camera.core.impl.b.D("\\s", "Checkout Payment WPay screen", "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.d = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Checkout Payment WPay screen"), new Pair("app.Section", str));
            this.e = mapJ;
            this.f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.g = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Checkout Payment WPay screen".equals(screen.getD()) && Intrinsics.c(this.d, screen.getD()) && Intrinsics.c(this.e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Checkout Payment WPay screen";
        }

        public final int hashCode() {
            return this.e.hashCode() + androidx.camera.core.impl.b.c(2066944825, 31, this.d);
        }
    }
}
