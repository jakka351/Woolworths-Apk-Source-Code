package au.com.woolworths.foundation.shop.olive.voice;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceSpeechRecogniserImpl;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceSpeechRecogniser;", "Companion", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OliveVoiceSpeechRecogniserImpl implements OliveVoiceSpeechRecogniser {
    public static final Intent d;

    /* renamed from: a, reason: collision with root package name */
    public SpeechRecognizer f8805a;
    public OliveVoiceViewModel b;
    public boolean c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceSpeechRecogniserImpl$Companion;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        d = intent;
    }
}
