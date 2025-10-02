package au.com.woolworths.analytics.supers.instoreprompt;

import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.Screen;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instoreprompt/InstorePromptAnalytics;", "", "Bottomsheet", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstorePromptAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instoreprompt/InstorePromptAnalytics$Bottomsheet;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Bottomsheet implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/instoreprompt/InstorePromptAnalytics$Bottomsheet$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final Bottomsheet f4037a;

            public Action(Bottomsheet bottomsheet) {
                this.f4037a = bottomsheet;
            }
        }

        public Bottomsheet(String screenName, String appSection) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(appSection, "appSection");
            this.d = screenName;
            String lowerCase = b.D("\\s", screenName, "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.e = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", screenName), new Pair("app.Section", appSection));
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
            return Intrinsics.c(this.d, screen.getD()) && Intrinsics.c(this.e, screen.getE()) && Intrinsics.c(this.f, screen.getData());
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
