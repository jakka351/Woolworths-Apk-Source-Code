package au.com.woolworths.analytics.supers.dynamicpage;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/DynamicPageAnalytics;", "", "DynamicPage", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DynamicPageAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/DynamicPageAnalytics$DynamicPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class DynamicPage implements Screen {
        public final String d;
        public final Object e;
        public final Pair[] f;
        public final Action g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/DynamicPageAnalytics$DynamicPage$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final DynamicPage f4036a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;

            public Action(DynamicPage dynamicPage) {
                this.f4036a = dynamicPage;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.dynamicpage.a
                    public final /* synthetic */ DynamicPageAnalytics.DynamicPage.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$cartClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "cart-controls"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Cart Open", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$shareClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Share", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$contentTileClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4036a.f);
                                        androidx.constraintlayout.core.state.a.z("event.Category", "marketing landing page", spreadBuilder, "event.Action", "button_click");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$bottomsheetImpression$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "bottomsheet", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.dynamicpage.a
                    public final /* synthetic */ DynamicPageAnalytics.DynamicPage.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$cartClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "cart-controls"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Cart Open", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$shareClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Share", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$contentTileClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4036a.f);
                                        androidx.constraintlayout.core.state.a.z("event.Category", "marketing landing page", spreadBuilder, "event.Action", "button_click");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$bottomsheetImpression$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "bottomsheet", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.dynamicpage.a
                    public final /* synthetic */ DynamicPageAnalytics.DynamicPage.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$cartClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "cart-controls"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Cart Open", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$shareClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Share", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$contentTileClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4036a.f);
                                        androidx.constraintlayout.core.state.a.z("event.Category", "marketing landing page", spreadBuilder, "event.Action", "button_click");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$bottomsheetImpression$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "bottomsheet", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.dynamicpage.a
                    public final /* synthetic */ DynamicPageAnalytics.DynamicPage.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$cartClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "cart-controls"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Cart Open", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$shareClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Share", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$contentTileClick$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4036a.f);
                                        androidx.constraintlayout.core.state.a.z("event.Category", "marketing landing page", spreadBuilder, "event.Action", "button_click");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics$DynamicPage$Action$bottomsheetImpression$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4036a.f);
                                        spreadBuilder.a(new Pair("event.Category", "marketing landing page"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "bottomsheet", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "mlp_campaign";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "mlp_campaign".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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

        public DynamicPage(String str) {
            this.d = str;
            Map mapJ = MapsKt.j(new Pair("screen.Name", str), new Pair("screen.Type", NotificationResult.Notification.CAMPAIGN), new Pair("app.Section", "Other"));
            this.e = mapJ;
            this.f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.g = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "mlp_campaign";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.d.equals(screen.getD()) && "mlp_campaign".equals(screen.getE()) && Intrinsics.c(this.e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.e.hashCode() + (((this.d.hashCode() * 31) - 196181282) * 31);
        }
    }
}
