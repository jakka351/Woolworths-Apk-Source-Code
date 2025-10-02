package au.com.woolworths.foundation.shop.olive.voice;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OliveVoiceFeature implements Feature {
    public static final /* synthetic */ OliveVoiceFeature[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OliveVoiceFeature[] oliveVoiceFeatureArr = {new OliveVoiceFeature() { // from class: au.com.woolworths.foundation.shop.olive.voice.OliveVoiceFeature.OLIVE_VOICE_TTS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_voice_search_tts";
            }
        }};
        d = oliveVoiceFeatureArr;
        e = EnumEntriesKt.a(oliveVoiceFeatureArr);
    }

    public static OliveVoiceFeature valueOf(String str) {
        return (OliveVoiceFeature) Enum.valueOf(OliveVoiceFeature.class, str);
    }

    public static OliveVoiceFeature[] values() {
        return (OliveVoiceFeature[]) d.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final boolean getDefaultValue() {
        return false;
    }
}
