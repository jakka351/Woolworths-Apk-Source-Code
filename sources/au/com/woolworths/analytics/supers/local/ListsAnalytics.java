package au.com.woolworths.analytics.supers.local;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.local.ListsAnalytics;
import java.util.ArrayList;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/local/ListsAnalytics;", "", "Details", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/local/ListsAnalytics$Details;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Details implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/local/ListsAnalytics$Details$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final Details f4039a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;

            public Action(Details details) {
                this.f4039a = details;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.local.a
                    public final /* synthetic */ ListsAnalytics.Details.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$addToCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "add", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_add";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_add".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$updateCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "update cart", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_update";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$productOptionsMenu$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "menu"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "product list menu", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "menu_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "menu_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$findValueSwaps$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Compare lower unit price", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "lowerunitprice_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "lowerunitprice_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.local.a
                    public final /* synthetic */ ListsAnalytics.Details.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$addToCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "add", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_add";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_add".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$updateCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "update cart", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_update";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$productOptionsMenu$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "menu"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "product list menu", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "menu_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "menu_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$findValueSwaps$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Compare lower unit price", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "lowerunitprice_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "lowerunitprice_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.local.a
                    public final /* synthetic */ ListsAnalytics.Details.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$addToCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "add", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_add";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_add".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$updateCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "update cart", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_update";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$productOptionsMenu$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "menu"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "product list menu", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "menu_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "menu_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$findValueSwaps$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Compare lower unit price", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "lowerunitprice_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "lowerunitprice_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.local.a
                    public final /* synthetic */ ListsAnalytics.Details.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$addToCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "add", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_add";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_add".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$updateCart$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        spreadBuilder.a(new Pair("event.Category", "cart"));
                                        androidx.constraintlayout.core.state.a.z("event.Label", "update cart", spreadBuilder, "event.Description", "lists");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "cart_update";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "cart_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$productOptionsMenu$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "menu"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "product list menu", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "menu_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "menu_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.local.ListsAnalytics$Details$Action$findValueSwaps$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4039a.g);
                                        spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Compare lower unit price", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "lowerunitprice_buttonclick";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "lowerunitprice_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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

        public Details(String str, String str2, String str3) {
            this.d = str;
            this.e = str2;
            Map mapJ = MapsKt.j(new Pair("screen.Name", str), new Pair("app.Section", str3));
            this.f = mapJ;
            this.g = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.h = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.d.equals(screen.getD()) && this.e.equals(screen.getE()) && Intrinsics.c(this.f, screen.getData());
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
