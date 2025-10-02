package au.com.woolworths.analytics.supers.signup;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.supers.signup.SignupAnalytics;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/signup/SignupAnalytics;", "", "SignupWebview", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SignupAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/signup/SignupAnalytics$SignupWebview;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SignupWebview implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/signup/SignupAnalytics$SignupWebview$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/signup/SignupAnalytics$SignupWebview$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.analytics.supers.signup.SignupAnalytics$SignupWebview$Action$Companion$signupError$1] */
                public static SignupAnalytics$SignupWebview$Action$Companion$signupError$1 a(final String str) {
                    return new Event(str) { // from class: au.com.woolworths.analytics.supers.signup.SignupAnalytics$SignupWebview$Action$Companion$signupError$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                            spreadBuilder.b(SignupAnalytics.SignupWebview.e);
                            spreadBuilder.a(new Pair("event.Category", "signup"));
                            spreadBuilder.a(new Pair("event.Action", "error_impression"));
                            a.y("event.Label", str, spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "signup_user_error_impression";
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return "signup_user_error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    };
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/signup/SignupAnalytics.SignupWebview.Action.SIGNUP_ERROR_TRY_AGAIN", "Lau/com/woolworths/analytics/supers/signup/SignupAnalytics$SignupWebview$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SIGNUP_ERROR_TRY_AGAIN extends Action {
                public final Object h;

                public SIGNUP_ERROR_TRY_AGAIN() {
                    super("SIGNUP_ERROR_TRY_AGAIN", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(SignupWebview.e);
                    spreadBuilder.a(new Pair("event.Category", "signup"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "try again", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "signup_user_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                SIGNUP_ERROR_TRY_AGAIN signup_error_try_again = new SIGNUP_ERROR_TRY_AGAIN();
                e = signup_error_try_again;
                Action[] actionArr = {signup_error_try_again};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Signup Webview screen"), new Pair("screen.Type", "account"), new Pair("app.Section", "Sign Up"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "signupwebview_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Signup Webview screen".equals(screen.getD()) && "signupwebview_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Signup Webview screen";
        }

        public final int hashCode() {
            return d.hashCode() - 689339791;
        }
    }
}
