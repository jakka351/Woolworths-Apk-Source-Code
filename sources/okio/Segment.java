package okio;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Segment;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Segment {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26782a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public Segment f;
    public Segment g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokio/Segment$Companion;", "", "", "SIZE", "I", "SHARE_MINIMUM", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public Segment() {
        this.f26782a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final Segment a() {
        Segment segment = this.f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.g;
        Intrinsics.e(segment2);
        segment2.f = this.f;
        Segment segment3 = this.f;
        Intrinsics.e(segment3);
        segment3.g = this.g;
        this.f = null;
        this.g = null;
        return segment;
    }

    public final void b(Segment segment) {
        Intrinsics.h(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        Segment segment2 = this.f;
        Intrinsics.e(segment2);
        segment2.g = segment;
        this.f = segment;
    }

    public final Segment c() {
        this.d = true;
        return new Segment(this.f26782a, this.b, this.c, true, false);
    }

    public final void d(Segment sink, int i) {
        Intrinsics.h(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f26782a;
            ArraysKt.v(bArr, bArr, 0, i4, i2, 2);
            sink.c -= sink.b;
            sink.b = 0;
        }
        byte[] bArr2 = sink.f26782a;
        int i5 = sink.c;
        int i6 = this.b;
        ArraysKt.p(i5, i6, i6 + i, this.f26782a, bArr2);
        sink.c += i;
        this.b += i;
    }

    public Segment(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.h(data, "data");
        this.f26782a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
