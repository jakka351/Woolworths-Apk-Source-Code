package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
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
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$12$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VoiceAnalytics voiceAnalytics = (VoiceAnalytics) this.receiver;
        final String str = voiceAnalytics.c;
        final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str).h;
        action.getClass();
        voiceAnalytics.a(new Event(str, action) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$microphoneAccessImpression$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str, "_microphoneaccess_impression");
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("event.Label", "microphone access"));
                androidx.constraintlayout.core.state.a.y("event.Description", "microphone access", spreadBuilder);
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
        return Unit.f24250a;
    }
}
