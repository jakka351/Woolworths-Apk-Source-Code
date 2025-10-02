package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$17$1 extends FunctionReferenceImpl implements Function1<VoiceSearchError, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VoiceSearchError p0 = (VoiceSearchError) obj;
        Intrinsics.h(p0, "p0");
        VoiceAnalytics voiceAnalytics = (VoiceAnalytics) this.receiver;
        voiceAnalytics.getClass();
        String str = voiceAnalytics.c;
        VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
        voiceAnalytics.a(assistant.h.a(str, p0.a(voiceAnalytics.f8821a), "response error after try 3"));
        return Unit.f24250a;
    }
}
