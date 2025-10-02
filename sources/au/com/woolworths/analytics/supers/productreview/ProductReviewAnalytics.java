package au.com.woolworths.analytics.supers.productreview;

import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/productreview/ProductReviewAnalytics;", "", "ProductReview", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductReviewAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/productreview/ProductReviewAnalytics$ProductReview;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ProductReview implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/productreview/ProductReviewAnalytics$ProductReview$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductReview f4044a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;
            public final Lazy f;

            public Action(ProductReview productReview) {
                this.f4044a = productReview;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.productreview.a
                    public final /* synthetic */ ProductReviewAnalytics.ProductReview.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewOpened$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - opened", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_opened";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_opened".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewClosed$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - closed", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_closed";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_closed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewSuccess$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - success", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_success";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_success".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$deliveryTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Delivery time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$pickupTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Pick up time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.productreview.a
                    public final /* synthetic */ ProductReviewAnalytics.ProductReview.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewOpened$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - opened", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_opened";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_opened".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewClosed$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - closed", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_closed";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_closed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewSuccess$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - success", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_success";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_success".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$deliveryTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Delivery time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$pickupTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Pick up time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.productreview.a
                    public final /* synthetic */ ProductReviewAnalytics.ProductReview.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewOpened$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - opened", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_opened";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_opened".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewClosed$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - closed", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_closed";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_closed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewSuccess$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - success", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_success";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_success".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$deliveryTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Delivery time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$pickupTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Pick up time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.productreview.a
                    public final /* synthetic */ ProductReviewAnalytics.ProductReview.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewOpened$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - opened", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_opened";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_opened".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewClosed$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - closed", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_closed";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_closed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewSuccess$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - success", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_success";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_success".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$deliveryTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Delivery time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$pickupTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Pick up time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.productreview.a
                    public final /* synthetic */ ProductReviewAnalytics.ProductReview.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewOpened$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - opened", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_opened";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_opened".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewClosed$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - closed", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_closed";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_closed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewSuccess$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "notification"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - success", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "product_review_modal_success";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "product_review_modal_success".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$deliveryTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Delivery time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$pickupTimeUpdatedSnackbar$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4044a.g);
                                        spreadBuilder.a(new Pair("event.Category", "snackbar"));
                                        spreadBuilder.a(new Pair("event.Action", "impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Product review modal - Pick up time reserved", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "snackbar_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "snackbar_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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

        public ProductReview(String screenName) {
            Intrinsics.h(screenName, "screenName");
            this.d = screenName;
            String lowerCase = b.D("\\s", screenName, "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.e = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", screenName), new Pair("app.Section", "Checkout"));
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
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }
    }
}
