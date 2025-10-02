package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.reflect.InvocationTargetException;

@RestrictTo
/* loaded from: classes2.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        VersionedParcelable versionedParcelableO = audioAttributesCompat.f2827a;
        if (versionedParcel.j(1)) {
            versionedParcelableO = versionedParcel.o();
        }
        audioAttributesCompat.f2827a = (AudioAttributesImpl) versionedParcelableO;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.q(false, false);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2827a;
        versionedParcel.p(1);
        versionedParcel.y(audioAttributesImpl);
    }
}
