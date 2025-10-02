package au.com.woolworths.foundation.shop.olive.voice.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchResultData;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VoiceSearchResultData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8830a;
    public final Object b;

    public VoiceSearchResultData(String str, List list) {
        this.f8830a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSearchResultData)) {
            return false;
        }
        VoiceSearchResultData voiceSearchResultData = (VoiceSearchResultData) obj;
        return this.f8830a.equals(voiceSearchResultData.f8830a) && this.b.equals(voiceSearchResultData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8830a.hashCode() * 31);
    }

    public final String toString() {
        return "VoiceSearchResultData(result=" + this.f8830a + ", selectedChips=" + this.b + ")";
    }
}
