package au.com.woolworths.analytics.rewards.everydaypay;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics;", "", "Gifting", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EdpGiftCardsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Gifting implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.ADD_GIFT_CARD_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_GIFT_CARD_CLICKED extends Action {
                public final Object f;

                public ADD_GIFT_CARD_CLICKED() {
                    super("ADD_GIFT_CARD_CLICKED", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Add Gift Card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.ADD_GIFT_CARD_VIA_EMAIL_SUCCESS", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_GIFT_CARD_VIA_EMAIL_SUCCESS extends Action {
                public final Object f;

                public ADD_GIFT_CARD_VIA_EMAIL_SUCCESS() {
                    super("ADD_GIFT_CARD_VIA_EMAIL_SUCCESS", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Add gift card success via email", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.ADD_GIFT_CARD_VIA_EMAIL_SUCCESS_NO_BANK_CARDS", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_GIFT_CARD_VIA_EMAIL_SUCCESS_NO_BANK_CARDS extends Action {
                public final Object f;

                public ADD_GIFT_CARD_VIA_EMAIL_SUCCESS_NO_BANK_CARDS() {
                    super("ADD_GIFT_CARD_VIA_EMAIL_SUCCESS_NO_BANK_CARDS", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "Add gift card success via email", spreadBuilder, "event.Description", "no bank card in wallet");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.AUTOPROVISION_FAILURE_WALLET_LIMIT_EXCEEDED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOPROVISION_FAILURE_WALLET_LIMIT_EXCEEDED extends Action {
                public final Object f;

                public AUTOPROVISION_FAILURE_WALLET_LIMIT_EXCEEDED() {
                    super("AUTOPROVISION_FAILURE_WALLET_LIMIT_EXCEEDED", 10);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "gift card auto-provision failed", spreadBuilder, "error.Reason", "gift card value exceeds allowable limit");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.AUTOPROVISION_PENDING", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOPROVISION_PENDING extends Action {
                public final Object f;

                public AUTOPROVISION_PENDING() {
                    super("AUTOPROVISION_PENDING", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "gift card auto-provision in progress", spreadBuilder, "event.Description", "your gift card will be ready for use shortly");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.AUTOPROVISION_SUCCESSFUL", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOPROVISION_SUCCESSFUL extends Action {
                public final Object f;

                public AUTOPROVISION_SUCCESSFUL() {
                    super("AUTOPROVISION_SUCCESSFUL", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "gift card auto-provision successful", spreadBuilder, "event.Description", "your gift card is ready for use.");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.AUTOPROVISION_SYSTEM_FAILURE", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOPROVISION_SYSTEM_FAILURE extends Action {
                public final Object f;

                public AUTOPROVISION_SYSTEM_FAILURE() {
                    super("AUTOPROVISION_SYSTEM_FAILURE", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "gift card auto-provision failed", spreadBuilder, "error.Reason", "unexpected system failure");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.AVAILABLE_TAB_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AVAILABLE_TAB_CLICKED extends Action {
                public final Object f;

                public AVAILABLE_TAB_CLICKED() {
                    super("AVAILABLE_TAB_CLICKED", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "available", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.BANK_CARD_SUCCESSFULLY_ADDED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class BANK_CARD_SUCCESSFULLY_ADDED extends Action {
                public final Object f;

                public BANK_CARD_SUCCESSFULLY_ADDED() {
                    super("BANK_CARD_SUCCESSFULLY_ADDED", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "bank card successfully added", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.EMPTY_STATE_ADD_GIFT_CARD_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_STATE_ADD_GIFT_CARD_CLICKED extends Action {
                public final Object f;

                public EMPTY_STATE_ADD_GIFT_CARD_CLICKED() {
                    super("EMPTY_STATE_ADD_GIFT_CARD_CLICKED", 11);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "add gift card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.EMPTY_STATE_BUY_GIFT_CARD_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_STATE_BUY_GIFT_CARD_CLICKED extends Action {
                public final Object f;

                public EMPTY_STATE_BUY_GIFT_CARD_CLICKED() {
                    super("EMPTY_STATE_BUY_GIFT_CARD_CLICKED", 12);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "My Gift Cards"));
                    a.y("event.Label", "Buy Gift Card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "buygiftcardbutton_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.GIFTING_STORE_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GIFTING_STORE_CLICKED extends Action {
                public final Object f;

                public GIFTING_STORE_CLICKED() {
                    super("GIFTING_STORE_CLICKED", 13);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "My Gift Cards"));
                    a.y("event.Label", "Giftcard Icon", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "giftcardicon_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.GIFT_CARD_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GIFT_CARD_CLICKED extends Action {
                public final Object f;

                public GIFT_CARD_CLICKED() {
                    super("GIFT_CARD_CLICKED", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Tap a Gift Card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.REMOVE_ALL_DIALOG_CANCEL_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_ALL_DIALOG_CANCEL_BUTTON_CLICK extends Action {
                public final Object f;

                public REMOVE_ALL_DIALOG_CANCEL_BUTTON_CLICK() {
                    super("REMOVE_ALL_DIALOG_CANCEL_BUTTON_CLICK", 17);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "remove_giftcards_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "cancel", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "remove_giftcards_dialog_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.REMOVE_ALL_DIALOG_REMOVE_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_ALL_DIALOG_REMOVE_BUTTON_CLICK extends Action {
                public final Object f;

                public REMOVE_ALL_DIALOG_REMOVE_BUTTON_CLICK() {
                    super("REMOVE_ALL_DIALOG_REMOVE_BUTTON_CLICK", 16);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "remove_giftcards_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "remove", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "remove_giftcards_dialog_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.REMOVE_ALL_FROM_WALLET_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_ALL_FROM_WALLET_BUTTON_CLICK extends Action {
                public final Object f;

                public REMOVE_ALL_FROM_WALLET_BUTTON_CLICK() {
                    super("REMOVE_ALL_FROM_WALLET_BUTTON_CLICK", 14);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "remove all from wallet", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.REMOVE_ALL_GIFT_CARDS_DIALOG_SHOWN", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_ALL_GIFT_CARDS_DIALOG_SHOWN extends Action {
                public final Object f;

                public REMOVE_ALL_GIFT_CARDS_DIALOG_SHOWN() {
                    super("REMOVE_ALL_GIFT_CARDS_DIALOG_SHOWN", 15);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "remove_giftcards_dialog"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "remove all used & expired gift cards from wallet?", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "remove_giftcards_dialog_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.REMOVE_GIFT_CARDS_SUCCESSFUL", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_GIFT_CARDS_SUCCESSFUL extends Action {
                public final Object f;

                public REMOVE_GIFT_CARDS_SUCCESSFUL() {
                    super("REMOVE_GIFT_CARDS_SUCCESSFUL", 18);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "your used and expired gift cards have been successfully removed", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics.Gifting.Action.USED_AND_EXPIRED_TAB_CLICKED", "Lau/com/woolworths/analytics/rewards/everydaypay/EdpGiftCardsAnalytics$Gifting$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class USED_AND_EXPIRED_TAB_CLICKED extends Action {
                public final Object f;

                public USED_AND_EXPIRED_TAB_CLICKED() {
                    super("USED_AND_EXPIRED_TAB_CLICKED", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Gifting.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "used & expired", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            static {
                Action[] actionArr = {new ADD_GIFT_CARD_CLICKED(), new GIFT_CARD_CLICKED(), new ADD_GIFT_CARD_VIA_EMAIL_SUCCESS(), new ADD_GIFT_CARD_VIA_EMAIL_SUCCESS_NO_BANK_CARDS(), new BANK_CARD_SUCCESSFULLY_ADDED(), new AVAILABLE_TAB_CLICKED(), new USED_AND_EXPIRED_TAB_CLICKED(), new AUTOPROVISION_PENDING(), new AUTOPROVISION_SUCCESSFUL(), new AUTOPROVISION_SYSTEM_FAILURE(), new AUTOPROVISION_FAILURE_WALLET_LIMIT_EXCEEDED(), new EMPTY_STATE_ADD_GIFT_CARD_CLICKED(), new EMPTY_STATE_BUY_GIFT_CARD_CLICKED(), new GIFTING_STORE_CLICKED(), new REMOVE_ALL_FROM_WALLET_BUTTON_CLICK(), new REMOVE_ALL_GIFT_CARDS_DIALOG_SHOWN(), new REMOVE_ALL_DIALOG_REMOVE_BUTTON_CLICK(), new REMOVE_ALL_DIALOG_CANCEL_BUTTON_CLICK(), new REMOVE_GIFT_CARDS_SUCCESSFUL()};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Gift Cards"), new Pair("screen.Type", "My Gift Cards"), new Pair("app.Section", "Everyday Pay"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "giftcards_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Gift Cards".equals(screen.getD()) && "giftcards_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Gift Cards";
        }

        public final int hashCode() {
            return d.hashCode() - 747296581;
        }
    }
}
