package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OliveVoiceScreenKt$OliveVoiceScreen$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VoiceAnalytics voiceAnalytics = (VoiceAnalytics) this.receiver;
        voiceAnalytics.b.f(new VoiceProductAssistantAnalytics.Onboarding(voiceAnalytics.c));
        return Unit.f24250a;
    }
}
