package au.com.woolworths.analytics.shared;

import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/shared/BottomsheetAnalytics;", "", "Bottomsheet", "Popup", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomsheetAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/BottomsheetAnalytics$Bottomsheet;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Bottomsheet implements Screen {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/BottomsheetAnalytics$Bottomsheet$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getE()) && Intrinsics.c(null, screen.getData());
        }

        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return null;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/shared/BottomsheetAnalytics$Popup;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Popup implements Screen {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/shared/BottomsheetAnalytics$Popup$Action;", "", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getE()) && Intrinsics.c(null, screen.getData());
        }

        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return null;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }
}
