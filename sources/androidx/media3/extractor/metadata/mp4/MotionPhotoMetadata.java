package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Longs;

@UnstableApi
/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f3293a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f3293a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f3293a == motionPhotoMetadata.f3293a && this.b == motionPhotoMetadata.b && this.c == motionPhotoMetadata.c && this.d == motionPhotoMetadata.d && this.e == motionPhotoMetadata.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.a(this.e) + ((Longs.a(this.d) + ((Longs.a(this.c) + ((Longs.a(this.b) + ((Longs.a(this.f3293a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f3293a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
