package au.com.woolworths.analytics.supers.login;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.login.LoginAnalytics;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics;", "", "LoginWebviewOld", "LoginOld", "LoginWebview", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginOld;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LoginOld implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginOld$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/login/LoginAnalytics.LoginOld.Action.LOGIN_SUCCESS", "Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginOld$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOGIN_SUCCESS extends Action {
                public final Object f;

                public LOGIN_SUCCESS() {
                    super("LOGIN_SUCCESS", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LoginOld.e);
                    spreadBuilder.a(new Pair("event.Action", "success-response"));
                    spreadBuilder.a(new Pair("event.Category", "login"));
                    a.y("event.Label", "login successful", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "login_successful";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            static {
                Action[] actionArr = {new LOGIN_SUCCESS()};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Login screen"), new Pair("app.Section", "Login"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "login_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Login screen".equals(screen.getD()) && "login_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Login screen";
        }

        public final int hashCode() {
            return d.hashCode() - 826490207;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebview;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class LoginWebview implements Screen {
        public static final LoginWebview d = new LoginWebview();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebview$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebview$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                /* JADX WARN: Type inference failed for: r0v1, types: [au.com.woolworths.analytics.supers.login.LoginAnalytics$LoginWebview$Action$Companion$loginError$1] */
                public static LoginAnalytics$LoginWebview$Action$Companion$loginError$1 a(final String str, final String errorDescription) {
                    Intrinsics.h(errorDescription, "errorDescription");
                    return new Event(str, errorDescription) { // from class: au.com.woolworths.analytics.supers.login.LoginAnalytics$LoginWebview$Action$Companion$loginError$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(LoginAnalytics.LoginWebview.f);
                            spreadBuilder.a(new Pair("event.Category", "group login"));
                            spreadBuilder.a(new Pair("event.Action", "failure-response"));
                            a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", str, spreadBuilder, errorDescription), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "grouplogin_failed";
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return "grouplogin_failed".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    };
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/login/LoginAnalytics.LoginWebview.Action.LOGIN_SUCCESS", "Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebview$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOGIN_SUCCESS extends Action {
                public final Object h;

                public LOGIN_SUCCESS() {
                    super("LOGIN_SUCCESS", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LoginWebview.f);
                    spreadBuilder.a(new Pair("event.Category", "group login"));
                    spreadBuilder.a(new Pair("event.Action", "success-response"));
                    a.y("event.Label", "login successful", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "grouplogin_successful";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                LOGIN_SUCCESS login_success = new LOGIN_SUCCESS();
                e = login_success;
                Action[] actionArr = {login_success};
                f = actionArr;
                g = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) f.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Login Webview screen"), new Pair("screen.Type", "account"), new Pair("app.Section", "Login"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "loginwebview_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Login Webview screen".equals(screen.getD()) && "loginwebview_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Login Webview screen";
        }

        public final int hashCode() {
            return e.hashCode() - 28042737;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebviewOld;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LoginWebviewOld implements Screen {
        public static final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebviewOld$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/login/LoginAnalytics$LoginWebviewOld$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Login Webview screen"), new Pair("app.Section", "Login"));
            d = mapJ;
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "loginwebview_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Login Webview screen".equals(screen.getD()) && "loginwebview_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Login Webview screen";
        }

        public final int hashCode() {
            return d.hashCode() - 28042737;
        }
    }
}
