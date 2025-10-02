package au.com.woolworths.analytics.supers.checkout;

import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/RewardsAmountSelectorAnalytics;", "", "RewardsAmountSelector", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardsAmountSelectorAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/RewardsAmountSelectorAnalytics$RewardsAmountSelector;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RewardsAmountSelector implements Screen {
        public final String d;
        public final Object e;
        public final Pair[] f;
        public final Action g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsAmountSelector f4033a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;
            public final Lazy f;
            public final Lazy g;

            public Action(RewardsAmountSelector rewardsAmountSelector) {
                this.f4033a = rewardsAmountSelector;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
                this.g = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.supers.checkout.a
                    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsBottomsheetServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Use Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "rewards_dollars_bottomsheet_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "rewards_dollars_bottomsheet_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 3:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Remove Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "remove_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "remove_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 4:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsNetworkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Network error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateRewardsDollarsServerError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(action.f4033a.f);
                                        spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                                        spreadBuilder.a(new Pair("event.Action", "error_impression"));
                                        androidx.constraintlayout.core.state.a.y("event.Label", "Update Rewards Dollars - Server error", spreadBuilder);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getD() {
                                        return "update_rewards_dollars_error";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "update_rewards_dollars_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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

        public RewardsAmountSelector() {
            String lowerCase = b.D("\\s", "Checkout Summary screen", "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.d = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Checkout Summary screen"), new Pair("app.Section", "Checkout"));
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
            return "Checkout Summary screen".equals(screen.getD()) && Intrinsics.c(this.d, screen.getD()) && Intrinsics.c(this.e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Checkout Summary screen";
        }

        public final int hashCode() {
            return this.e.hashCode() + b.c(-2055724096, 31, this.d);
        }
    }
}
