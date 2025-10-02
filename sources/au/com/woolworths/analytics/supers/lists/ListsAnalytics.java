package au.com.woolworths.analytics.supers.lists;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import com.salesforce.marketingcloud.storage.db.k;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics;", "", "Lists", "AddList", "ViewSimilarItems", "LowerUnitPriceOptions", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$AddList;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AddList implements Screen {
        public static final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$AddList$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$AddList$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                Action[] actionArr = new Action[0];
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Add list screen"), new Pair("app.Section", "Lists"));
            d = mapJ;
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "addlist_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Add list screen".equals(screen.getD()) && "addlist_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Add list screen";
        }

        public final int hashCode() {
            return d.hashCode() + 1724697315;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Lists implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final /* synthetic */ Action[] j;
            public static final /* synthetic */ EnumEntries k;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.Lists.Action.CHECK_AVAILABILITY_CTA_CLICK", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CHECK_AVAILABILITY_CTA_CLICK extends Action {
                public final Object l;

                public CHECK_AVAILABILITY_CTA_CLICK() {
                    super("CHECK_AVAILABILITY_CTA_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Lists.e);
                    spreadBuilder.a(new Pair(k.a.b, "android"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "check stock");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.Lists.Action.MAX_LISTS_ERROR_DIALOG_IMPRESSION", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MAX_LISTS_ERROR_DIALOG_IMPRESSION extends Action {
                public final Object l;

                public MAX_LISTS_ERROR_DIALOG_IMPRESSION() {
                    super("MAX_LISTS_ERROR_DIALOG_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Lists.e);
                    spreadBuilder.a(new Pair("event.Category", "dialog"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "maximum list amount reached", spreadBuilder, "event.Description", "you can only have 50 lists");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "dialog_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.Lists.Action.SUBSTITUTION_SAVED_SNACKBAR", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SUBSTITUTION_SAVED_SNACKBAR extends Action {
                public final Object l;

                public SUBSTITUTION_SAVED_SNACKBAR() {
                    super("SUBSTITUTION_SAVED_SNACKBAR", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Lists.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "item saved to list", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.Lists.Action.VIEW_SIMILAR", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class VIEW_SIMILAR extends Action {
                public final Object l;

                public VIEW_SIMILAR() {
                    super("VIEW_SIMILAR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Lists.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "View Similar Items", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.Lists.Action.WATCHLIST_CLICK", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$Lists$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WATCHLIST_CLICK extends Action {
                public final Object l;

                public WATCHLIST_CLICK() {
                    super("WATCHLIST_CLICK", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Lists.e);
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "view watchlist", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_buttonclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            static {
                MAX_LISTS_ERROR_DIALOG_IMPRESSION max_lists_error_dialog_impression = new MAX_LISTS_ERROR_DIALOG_IMPRESSION();
                e = max_lists_error_dialog_impression;
                VIEW_SIMILAR view_similar = new VIEW_SIMILAR();
                f = view_similar;
                SUBSTITUTION_SAVED_SNACKBAR substitution_saved_snackbar = new SUBSTITUTION_SAVED_SNACKBAR();
                g = substitution_saved_snackbar;
                CHECK_AVAILABILITY_CTA_CLICK check_availability_cta_click = new CHECK_AVAILABILITY_CTA_CLICK();
                h = check_availability_cta_click;
                WATCHLIST_CLICK watchlist_click = new WATCHLIST_CLICK();
                i = watchlist_click;
                Action[] actionArr = {max_lists_error_dialog_impression, view_similar, substitution_saved_snackbar, check_availability_cta_click, watchlist_click};
                j = actionArr;
                k = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) j.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Lists screen"), new Pair("screen.Type", "lists"), new Pair("app.Section", "Lists"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "lists_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Lists screen".equals(screen.getD()) && "lists_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Lists screen";
        }

        public final int hashCode() {
            return d.hashCode() - 263337951;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LowerUnitPriceOptions implements Screen {
        public static final LowerUnitPriceOptions d = new LowerUnitPriceOptions();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final /* synthetic */ Action[] h;
            public static final /* synthetic */ EnumEntries i;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.LowerUnitPriceOptions.Action.ADD_ITEM_TO_CART", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_ITEM_TO_CART extends Action {
                public final Object j;

                public ADD_ITEM_TO_CART() {
                    super("ADD_ITEM_TO_CART", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LowerUnitPriceOptions.f);
                    spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                    spreadBuilder.a(new Pair("event.Action", "bottomsheet_click"));
                    a.y("event.Label", "add item to cart", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "lowerunitprice_bottomsheetclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.LowerUnitPriceOptions.Action.ADD_OR_REPLACE_BOTTOM_SHEET", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_OR_REPLACE_BOTTOM_SHEET extends Action {
                public final Object j;

                public ADD_OR_REPLACE_BOTTOM_SHEET() {
                    super("ADD_OR_REPLACE_BOTTOM_SHEET", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LowerUnitPriceOptions.f);
                    spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                    spreadBuilder.a(new Pair("event.Action", "bottomsheet_impression"));
                    a.y("event.Label", "lower unit price options", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "lowerunitprice_bottomsheetimpression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.LowerUnitPriceOptions.Action.CANCEL", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CANCEL extends Action {
                public final Object j;

                public CANCEL() {
                    super("CANCEL", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LowerUnitPriceOptions.f);
                    spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                    spreadBuilder.a(new Pair("event.Action", "bottomsheet_click"));
                    a.y("event.Label", "cancel", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "lowerunitprice_bottomsheetclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.LowerUnitPriceOptions.Action.SAVE_AND_KEEP_ORIGINAL", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SAVE_AND_KEEP_ORIGINAL extends Action {
                public final Object j;

                public SAVE_AND_KEEP_ORIGINAL() {
                    super("SAVE_AND_KEEP_ORIGINAL", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LowerUnitPriceOptions.f);
                    spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                    spreadBuilder.a(new Pair("event.Action", "bottomsheet_click"));
                    a.y("event.Label", "save and keep original", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "lowerunitprice_bottomsheetclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.LowerUnitPriceOptions.Action.SAVE_AND_REPLACE_ORIGINAL", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$LowerUnitPriceOptions$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SAVE_AND_REPLACE_ORIGINAL extends Action {
                public final Object j;

                public SAVE_AND_REPLACE_ORIGINAL() {
                    super("SAVE_AND_REPLACE_ORIGINAL", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LowerUnitPriceOptions.f);
                    spreadBuilder.a(new Pair("event.Category", "lower unit price"));
                    spreadBuilder.a(new Pair("event.Action", "bottomsheet_click"));
                    a.y("event.Label", "save and replace original", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "lowerunitprice_bottomsheetclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            static {
                ADD_OR_REPLACE_BOTTOM_SHEET add_or_replace_bottom_sheet = new ADD_OR_REPLACE_BOTTOM_SHEET();
                d = add_or_replace_bottom_sheet;
                SAVE_AND_REPLACE_ORIGINAL save_and_replace_original = new SAVE_AND_REPLACE_ORIGINAL();
                e = save_and_replace_original;
                SAVE_AND_KEEP_ORIGINAL save_and_keep_original = new SAVE_AND_KEEP_ORIGINAL();
                f = save_and_keep_original;
                ADD_ITEM_TO_CART add_item_to_cart = new ADD_ITEM_TO_CART();
                g = add_item_to_cart;
                Action[] actionArr = {add_or_replace_bottom_sheet, save_and_replace_original, save_and_keep_original, add_item_to_cart, new CANCEL()};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "lower unit price options screen"), new Pair("app.Section", "Lists"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "lowerunitpriceoptions_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "lower unit price options screen".equals(screen.getD()) && "lowerunitpriceoptions_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "lower unit price options screen";
        }

        public final int hashCode() {
            return e.hashCode() - 1660348495;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$ViewSimilarItems;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ViewSimilarItems implements Screen {
        public static final ViewSimilarItems d = new ViewSimilarItems();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$ViewSimilarItems$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final /* synthetic */ Action[] g;
            public static final /* synthetic */ EnumEntries h;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$ViewSimilarItems$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.ViewSimilarItems.Action.DISCLAIMER_BOTTOM_SHEET", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$ViewSimilarItems$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DISCLAIMER_BOTTOM_SHEET extends Action {
                public final Object i;

                public DISCLAIMER_BOTTOM_SHEET() {
                    super("DISCLAIMER_BOTTOM_SHEET", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ViewSimilarItems.f);
                    spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "similar items disclaimer", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "bottomsheet_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/ListsAnalytics.ViewSimilarItems.Action.NO_ALTERNATIVES", "Lau/com/woolworths/analytics/supers/lists/ListsAnalytics$ViewSimilarItems$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NO_ALTERNATIVES extends Action {
                public final Object i;

                public NO_ALTERNATIVES() {
                    super("NO_ALTERNATIVES", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ViewSimilarItems.f);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "no similar items found", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            static {
                NO_ALTERNATIVES no_alternatives = new NO_ALTERNATIVES();
                e = no_alternatives;
                DISCLAIMER_BOTTOM_SHEET disclaimer_bottom_sheet = new DISCLAIMER_BOTTOM_SHEET();
                f = disclaimer_bottom_sheet;
                Action[] actionArr = {no_alternatives, disclaimer_bottom_sheet};
                g = actionArr;
                h = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) g.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "View Similar Items screen"), new Pair("app.Section", "Lists"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "viewsimilaritems_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "View Similar Items screen".equals(screen.getD()) && "viewsimilaritems_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "View Similar Items screen";
        }

        public final int hashCode() {
            return e.hashCode() - 952788405;
        }
    }
}
