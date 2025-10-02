package au.com.woolworths.foundation.shop.olive.voice;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchResult;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VoiceSearchResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f8818a;
    public final List b;

    public VoiceSearchResult(String str, List list) {
        this.f8818a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSearchResult)) {
            return false;
        }
        VoiceSearchResult voiceSearchResult = (VoiceSearchResult) obj;
        return Intrinsics.c(this.f8818a, voiceSearchResult.f8818a) && Intrinsics.c(this.b, voiceSearchResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8818a.hashCode() * 31);
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.i("VoiceSearchResult(searchTerm=", this.f8818a, ", selectedChips=", ")", this.b);
    }
}
