package androidx.media;

import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class AudioAttributesCompat implements VersionedParcelable {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f2827a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AttributeUsage {
    }

    public static abstract class AudioManagerHidden {
    }

    public static class Builder {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2827a;
        return audioAttributesImpl == null ? audioAttributesCompat.f2827a == null : audioAttributesImpl.equals(audioAttributesCompat.f2827a);
    }

    public final int hashCode() {
        return this.f2827a.hashCode();
    }

    public final String toString() {
        return this.f2827a.toString();
    }
}
