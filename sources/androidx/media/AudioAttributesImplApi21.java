package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi
/* loaded from: classes2.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f2828a;
    public int b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2828a.equals(((AudioAttributesImplApi21) obj).f2828a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2828a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2828a;
    }
}
