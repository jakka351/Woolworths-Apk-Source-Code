package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class Track {

    /* renamed from: a, reason: collision with root package name */
    public final int f3339a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final Format g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    public final TrackEncryptionBox[] l;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, long j4, Format format, int i3, TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2) {
        this.f3339a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = format;
        this.h = i3;
        this.l = trackEncryptionBoxArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final Track a(Format format) {
        return new Track(this.f3339a, this.b, this.c, this.d, this.e, this.f, format, this.h, this.l, this.k, this.i, this.j);
    }
}
