package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes2.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2829a = versionedParcel.l(audioAttributesImplBase.f2829a, 1);
        audioAttributesImplBase.b = versionedParcel.l(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.l(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.l(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        versionedParcel.v(audioAttributesImplBase.f2829a, 1);
        versionedParcel.v(audioAttributesImplBase.b, 2);
        versionedParcel.v(audioAttributesImplBase.c, 3);
        versionedParcel.v(audioAttributesImplBase.d, 4);
    }
}
