package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$16$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) this.receiver;
        VoiceAnalytics voiceAnalyticsP6 = oliveVoiceViewModel.p6();
        final String str = voiceAnalyticsP6.c;
        VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
        final String string = voiceAnalyticsP6.f8821a.getString(R.string.olive_voice_failure_fallback_action);
        Intrinsics.g(string, "getString(...)");
        final VoiceProductAssistantAnalytics.Assistant.Action action = assistant.h;
        action.getClass();
        voiceAnalyticsP6.a(new Event(str, action, string) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$errorResponseButtonClicked$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str, "_buttonclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", string));
                androidx.constraintlayout.core.state.a.y("event.Description", "response error after try 3", spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.e = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d, reason: from getter */
            public final String getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return Intrinsics.c(this.d, event.getD()) && Intrinsics.c(this.e, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.e;
            }
        });
        oliveVoiceViewModel.j.f(OliveVoiceContract.Action.ShowProductFinder.f8798a);
        return Unit.f24250a;
    }
}
