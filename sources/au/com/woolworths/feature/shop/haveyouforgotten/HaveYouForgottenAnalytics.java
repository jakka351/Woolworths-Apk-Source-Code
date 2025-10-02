package au.com.woolworths.feature.shop.haveyouforgotten;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenAnalytics;", "", "HaveYouForgotten", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HaveYouForgottenAnalytics {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenAnalytics$HaveYouForgotten;", "Lau/com/woolworths/analytics/Screen;", "Action", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HaveYouForgotten implements Screen {
        public static final Object d = MapsKt.j(new Pair("screen.Name", "Have You Forgotten Screen"), new Pair("app.Section", "Checkout"));

        @StabilityInferred
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenAnalytics$HaveYouForgotten$Action;", "Lau/com/woolworths/analytics/Event;", "Companion", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Action implements Event {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenAnalytics$HaveYouForgotten$Action$Companion;", "", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "have_you_forgotten_screen";
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Have You Forgotten Screen";
        }
    }
}
