package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

@UnstableApi
/* loaded from: classes2.dex */
public final class DecoderCounters {

    /* renamed from: a, reason: collision with root package name */
    public int f2993a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.f2993a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        int i12 = Util.f2928a;
        Locale locale = Locale.US;
        StringBuilder sbQ = YU.a.q(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        YU.a.w(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbQ);
        YU.a.w(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbQ);
        YU.a.w(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbQ);
        YU.a.w(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbQ);
        sbQ.append(j);
        sbQ.append("\n videoFrameProcessingOffsetCount=");
        sbQ.append(i11);
        sbQ.append("\n}");
        return sbQ.toString();
    }
}
