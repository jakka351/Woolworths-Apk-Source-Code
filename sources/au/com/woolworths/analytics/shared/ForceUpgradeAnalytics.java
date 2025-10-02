package au.com.woolworths.analytics.shared;

import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics;", "", "ForceUpgradeAppScreen", "ForceUpgradeOsScreen", "SoftUpgradeAppDialog", "SoftUpgradeOsDialog", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ForceUpgradeAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$ForceUpgradeAppScreen;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ForceUpgradeAppScreen implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$ForceUpgradeAppScreen$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final ForceUpgradeAppScreen f4025a;

            public Action(ForceUpgradeAppScreen forceUpgradeAppScreen) {
                this.f4025a = forceUpgradeAppScreen;
            }
        }

        public ForceUpgradeAppScreen(String screenType) {
            Intrinsics.h(screenType, "screenType");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "App force upgrade"), new Pair("screen.Type", screenType), new Pair("app.Section", "Force Upgrade"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "forced_upgrade_screen_view";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "App force upgrade".equals(screen.getD()) && "forced_upgrade_screen_view".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "App force upgrade";
        }

        public final int hashCode() {
            return this.d.hashCode() + 1590982489;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$ForceUpgradeOsScreen;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ForceUpgradeOsScreen implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$ForceUpgradeOsScreen$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final ForceUpgradeOsScreen f4026a;

            public Action(ForceUpgradeOsScreen forceUpgradeOsScreen) {
                this.f4026a = forceUpgradeOsScreen;
            }
        }

        public ForceUpgradeOsScreen(String screenType) {
            Intrinsics.h(screenType, "screenType");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Os force upgrade"), new Pair("screen.Type", screenType), new Pair("app.Section", "Force Upgrade"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "forced_upgrade_screen_view";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Os force upgrade".equals(screen.getD()) && "forced_upgrade_screen_view".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Os force upgrade";
        }

        public final int hashCode() {
            return this.d.hashCode() - 1044309668;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$SoftUpgradeAppDialog;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SoftUpgradeAppDialog implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final SoftUpgradeAppDialog f4027a;

            public Action(SoftUpgradeAppDialog softUpgradeAppDialog) {
                this.f4027a = softUpgradeAppDialog;
            }
        }

        public SoftUpgradeAppDialog(String screenType) {
            Intrinsics.h(screenType, "screenType");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "App soft upgrade"), new Pair("screen.Type", screenType), new Pair("event.Description", "soft - app update"), new Pair("event.Category", "App Upgrade"), new Pair("app.Section", "Force Upgrade"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "appsoftupgrade_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "App soft upgrade".equals(screen.getD()) && "appsoftupgrade_screen".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "App soft upgrade";
        }

        public final int hashCode() {
            return this.d.hashCode() - 1091543189;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$SoftUpgradeOsDialog;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SoftUpgradeOsDialog implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/ForceUpgradeAnalytics$SoftUpgradeOsDialog$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final SoftUpgradeOsDialog f4028a;

            public Action(SoftUpgradeOsDialog softUpgradeOsDialog) {
                this.f4028a = softUpgradeOsDialog;
            }
        }

        public SoftUpgradeOsDialog(String screenType) {
            Intrinsics.h(screenType, "screenType");
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Os soft upgrade"), new Pair("screen.Type", screenType), new Pair("event.Description", "soft - os update"), new Pair("event.Category", "App Upgrade"), new Pair("app.Section", "Force Upgrade"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "ossoftupgrade_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Os soft upgrade".equals(screen.getD()) && "ossoftupgrade_screen".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Os soft upgrade";
        }

        public final int hashCode() {
            return this.d.hashCode() - 967391131;
        }
    }
}
