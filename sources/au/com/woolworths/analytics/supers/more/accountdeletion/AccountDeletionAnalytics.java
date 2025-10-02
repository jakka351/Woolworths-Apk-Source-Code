package au.com.woolworths.analytics.supers.more.accountdeletion;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics;", "", "CloseAccount", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountDeletionAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class CloseAccount implements Screen {
        public static final CloseAccount d = new CloseAccount();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final /* synthetic */ Action[] k;
            public static final /* synthetic */ EnumEntries l;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.CLOSE_ACCOUNT_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLOSE_ACCOUNT_NETWORK_ERROR extends Action {
                public final Object m;

                public CLOSE_ACCOUNT_NETWORK_ERROR() {
                    super("CLOSE_ACCOUNT_NETWORK_ERROR", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    a.y("event.Label", "Close account network error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.CLOSE_ACCOUNT_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLOSE_ACCOUNT_SERVER_ERROR extends Action {
                public final Object m;

                public CLOSE_ACCOUNT_SERVER_ERROR() {
                    super("CLOSE_ACCOUNT_SERVER_ERROR", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    a.y("event.Label", "Close account server error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.CONFIRMATION_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRMATION_BUTTON_CLICK extends Action {
                public final Object m;

                public CONFIRMATION_BUTTON_CLICK() {
                    super("CONFIRMATION_BUTTON_CLICK", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.y("event.Label", "Confirm and close account", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.TERMS_AND_CONDITIONS_CHECKED", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TERMS_AND_CONDITIONS_CHECKED extends Action {
                public final Object m;

                public TERMS_AND_CONDITIONS_CHECKED() {
                    super("TERMS_AND_CONDITIONS_CHECKED", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "check"));
                    spreadBuilder.a(new Pair("event.Category", "checkbox"));
                    a.y("event.Label", "Checked terms and conditions agreed", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "checkbox_check";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.TERMS_AND_CONDITIONS_UNCHECKED", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TERMS_AND_CONDITIONS_UNCHECKED extends Action {
                public final Object m;

                public TERMS_AND_CONDITIONS_UNCHECKED() {
                    super("TERMS_AND_CONDITIONS_UNCHECKED", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "uncheck"));
                    spreadBuilder.a(new Pair("event.Category", "checkbox"));
                    a.y("event.Label", "Unchecked terms and conditions agreed", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "checkbox_uncheck";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.TERMS_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TERMS_NETWORK_ERROR extends Action {
                public final Object m;

                public TERMS_NETWORK_ERROR() {
                    super("TERMS_NETWORK_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics.CloseAccount.Action.TERMS_SERVER_ERROR", "Lau/com/woolworths/analytics/supers/more/accountdeletion/AccountDeletionAnalytics$CloseAccount$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TERMS_SERVER_ERROR extends Action {
                public final Object m;

                public TERMS_SERVER_ERROR() {
                    super("TERMS_SERVER_ERROR", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CloseAccount.f);
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            static {
                TERMS_SERVER_ERROR terms_server_error = new TERMS_SERVER_ERROR();
                d = terms_server_error;
                TERMS_NETWORK_ERROR terms_network_error = new TERMS_NETWORK_ERROR();
                e = terms_network_error;
                TERMS_AND_CONDITIONS_CHECKED terms_and_conditions_checked = new TERMS_AND_CONDITIONS_CHECKED();
                f = terms_and_conditions_checked;
                TERMS_AND_CONDITIONS_UNCHECKED terms_and_conditions_unchecked = new TERMS_AND_CONDITIONS_UNCHECKED();
                g = terms_and_conditions_unchecked;
                CONFIRMATION_BUTTON_CLICK confirmation_button_click = new CONFIRMATION_BUTTON_CLICK();
                h = confirmation_button_click;
                CLOSE_ACCOUNT_SERVER_ERROR close_account_server_error = new CLOSE_ACCOUNT_SERVER_ERROR();
                i = close_account_server_error;
                CLOSE_ACCOUNT_NETWORK_ERROR close_account_network_error = new CLOSE_ACCOUNT_NETWORK_ERROR();
                j = close_account_network_error;
                Action[] actionArr = {terms_server_error, terms_network_error, terms_and_conditions_checked, terms_and_conditions_unchecked, confirmation_button_click, close_account_server_error, close_account_network_error};
                k = actionArr;
                l = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) k.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Close Account"), new Pair("app.Section", "More"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "closeaccount_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Close Account".equals(screen.getD()) && "closeaccount_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Close Account";
        }

        public final int hashCode() {
            return e.hashCode() - 147461489;
        }
    }
}
