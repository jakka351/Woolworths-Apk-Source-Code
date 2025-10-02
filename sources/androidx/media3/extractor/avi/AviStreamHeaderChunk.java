package androidx.media3.extractor.avi;

import androidx.media3.common.util.Log;

/* loaded from: classes2.dex */
final class AviStreamHeaderChunk implements AviChunk {

    /* renamed from: a, reason: collision with root package name */
    public final int f3264a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public AviStreamHeaderChunk(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f3264a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        int i = this.f3264a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        Log.g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1752331379;
    }
}
