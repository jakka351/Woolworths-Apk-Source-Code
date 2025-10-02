package au.com.woolworths.foundation.shop.olive.voice;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceInteractorImpl;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceInteractor;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OliveVoiceInteractorImpl implements OliveVoiceInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final OliveVoiceRepositoryImpl f8803a;

    public OliveVoiceInteractorImpl(OliveVoiceRepositoryImpl oliveVoiceRepositoryImpl) {
        this.f8803a = oliveVoiceRepositoryImpl;
    }

    public final boolean a() {
        return this.f8803a.f8804a.getBoolean("oliveVoicePermissionOnboardingShown", false);
    }
}
