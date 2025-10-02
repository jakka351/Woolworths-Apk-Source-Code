package au.com.woolworths.analytics.supers.dynamicpage;

import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ContentPageAnalytics;", "", "ContentPage", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentPageAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ContentPageAnalytics$ContentPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ContentPage implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ContentPageAnalytics$ContentPage$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final ContentPage f4035a;

            public Action(ContentPage contentPage) {
                this.f4035a = contentPage;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$watchlistSnackbarImpression$1] */
            public final ContentPageAnalytics$ContentPage$Action$watchlistSnackbarImpression$1 a(final String label, final String description) {
                Intrinsics.h(label, "label");
                Intrinsics.h(description, "description");
                return new Event(this, label, description) { // from class: au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$watchlistSnackbarImpression$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(this.f4035a.g);
                        androidx.constraintlayout.core.state.a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                        androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(label), spreadBuilder, description), spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "watchlist_snackbarimpression";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "watchlist_snackbarimpression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                };
            }
        }

        public ContentPage(String str, String str2, String str3) {
            this.d = str;
            String lowerCase = b.D("\\s", str, "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.e = StringsKt.N(lowerCase, "screen").concat("_screen");
            Map mapJ = MapsKt.j(new Pair("screen.Name", str), new Pair("screen.Type", str2 == null ? "" : str2), new Pair("app.Section", str3 == null ? "" : str3));
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
            return this.d.equals(screen.getD()) && Intrinsics.c(this.e, screen.getE()) && Intrinsics.c(this.f, screen.getData());
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
