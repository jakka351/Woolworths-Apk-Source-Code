package au.com.woolworths.foundation.shop.instore.presence.presentation;

import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics;
import au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.foundation.shop.instore.presence.analytics.InstorePresencePromptExtKt;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePromptClickHandler;", "", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InstorePresencePromptClickHandler {
    /* renamed from: L5 */
    InstorePresenceInteractor getI();

    default void Q(InstorePresencePrompt instorePresencePrompt) {
        getI().h(instorePresencePrompt);
        AnalyticsManager analyticsManagerC = getE();
        InstorePromptAnalytics.Bottomsheet bottomsheet = new InstorePromptAnalytics.Bottomsheet(f().getD(), f().getE());
        String strA = InstorePresencePromptExtKt.a(instorePresencePrompt);
        InstorePromptAnalytics.Bottomsheet.Action action = bottomsheet.h;
        action.getClass();
        analyticsManagerC.g(new InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1(action, "maybe later", strA));
    }

    default void X2(InstorePresencePrompt instorePresencePrompt) {
        getI().g(instorePresencePrompt);
        AnalyticsManager analyticsManagerC = getE();
        InstorePromptAnalytics.Bottomsheet bottomsheet = new InstorePromptAnalytics.Bottomsheet(f().getD(), f().getE());
        String strA = InstorePresencePromptExtKt.a(instorePresencePrompt);
        InstorePromptAnalytics.Bottomsheet.Action action = bottomsheet.h;
        action.getClass();
        analyticsManagerC.g(new InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1(action, "Don’t show me this again", strA));
    }

    /* renamed from: c */
    AnalyticsManager getE();

    LegacyStoreLocatorInteractor e3();

    Screen f();

    default void h6(InstorePresencePrompt instorePresencePrompt) {
        final String str;
        AnalyticsManager analyticsManagerC = getE();
        InstorePromptAnalytics.Bottomsheet bottomsheet = new InstorePromptAnalytics.Bottomsheet(f().getD(), f().getE());
        if (instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchStore) {
            str = "looks like you're shopping";
        } else {
            if (!(instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchToInstoreMode)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "enjoy in-store features";
        }
        final String strA = InstorePresencePromptExtKt.a(instorePresencePrompt);
        final InstorePromptAnalytics.Bottomsheet.Action action = bottomsheet.h;
        action.getClass();
        analyticsManagerC.g(new Event(action, str, strA) { // from class: au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics$Bottomsheet$Action$bottomsheetImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4037a.g);
                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                a.z("event.Label", str, spreadBuilder, "event.Description", strA);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "bottomsheet_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "bottomsheet_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    default void p0(InstorePresencePrompt instorePresencePrompt) {
        BuildersKt.c(s0(), null, null, new InstorePresencePromptClickHandler$onPerformUpdateClick$1(this, instorePresencePrompt, null), 3);
        AnalyticsManager analyticsManagerC = getE();
        InstorePromptAnalytics.Bottomsheet bottomsheet = new InstorePromptAnalytics.Bottomsheet(f().getD(), f().getE());
        String strA = InstorePresencePromptExtKt.a(instorePresencePrompt);
        InstorePromptAnalytics.Bottomsheet.Action action = bottomsheet.h;
        action.getClass();
        analyticsManagerC.g(new InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1(action, "yes please", strA));
    }

    CloseableCoroutineScope s0();

    default void t5(InstorePresencePrompt instorePresencePrompt) {
        getI().h(instorePresencePrompt);
    }
}
