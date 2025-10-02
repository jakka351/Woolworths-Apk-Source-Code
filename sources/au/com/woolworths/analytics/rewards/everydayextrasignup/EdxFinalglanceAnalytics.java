package au.com.woolworths.analytics.rewards.everydayextrasignup;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics;", "", "Finalglance", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EdxFinalglanceAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics$Finalglance;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Finalglance implements Screen {
        public static final Finalglance d = new Finalglance();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics$Finalglance$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final /* synthetic */ Action[] g;
            public static final /* synthetic */ EnumEntries h;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics$Finalglance$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics.Finalglance.Action.RESPONSE_ERROR", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics$Finalglance$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESPONSE_ERROR extends Action {
                public final Object i;

                public RESPONSE_ERROR() {
                    super("RESPONSE_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(Finalglance.f);
                    spreadBuilder.a(new Pair("event.Action", "error"));
                    spreadBuilder.a(new Pair("event.Category", "response"));
                    spreadBuilder.a(new Pair("event.Label", "EDX Subscribe Error"));
                    spreadBuilder.a(new Pair("event.Description", "EDX Subscribe Error"));
                    a.y("event.Value", "SWOP", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "response_error";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics.Finalglance.Action.RESPONSE_SUCCESS", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxFinalglanceAnalytics$Finalglance$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESPONSE_SUCCESS extends Action {
                public final Object i;

                public RESPONSE_SUCCESS() {
                    super("RESPONSE_SUCCESS", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(Finalglance.f);
                    spreadBuilder.a(new Pair("event.Action", "success"));
                    spreadBuilder.a(new Pair("event.Category", "response"));
                    spreadBuilder.a(new Pair("event.Label", "EDX Subscribe Success"));
                    spreadBuilder.a(new Pair("event.Description", "EDX Subscribe Success"));
                    a.y("event.Value", "SWOP", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "response_success";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            static {
                RESPONSE_SUCCESS response_success = new RESPONSE_SUCCESS();
                e = response_success;
                RESPONSE_ERROR response_error = new RESPONSE_ERROR();
                f = response_error;
                Action[] actionArr = {response_success, response_error};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Everyday Extra Final Glance"), new Pair("app.Section", "Everyday Extra"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "everydayextrafinalglance_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Everyday Extra Final Glance".equals(screen.getD()) && "everydayextrafinalglance_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Everyday Extra Final Glance";
        }

        public final int hashCode() {
            return e.hashCode() - 362783587;
        }
    }
}
