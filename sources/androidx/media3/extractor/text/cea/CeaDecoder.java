package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
abstract class CeaDecoder implements SubtitleDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3364a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public CeaInputBuffer d;
    public long e;
    public long f;
    public long g;

    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        public long m;

        @Override // java.lang.Comparable
        public final int compareTo(CeaInputBuffer ceaInputBuffer) {
            CeaInputBuffer ceaInputBuffer2 = ceaInputBuffer;
            if (f(4) != ceaInputBuffer2.f(4)) {
                return f(4) ? 1 : -1;
            }
            long j = this.i - ceaInputBuffer2.i;
            if (j == 0) {
                j = this.m - ceaInputBuffer2.m;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        public b j;

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void m() {
            CeaDecoder ceaDecoder = this.j.f3365a;
            l();
            ceaDecoder.b.add(this);
        }
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.f3364a.add(new CeaInputBuffer(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            b bVar = new b(this);
            CeaOutputBuffer ceaOutputBuffer = new CeaOutputBuffer();
            ceaOutputBuffer.j = bVar;
            arrayDeque.add(ceaOutputBuffer);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // androidx.media3.decoder.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r7) {
        /*
            r6 = this;
            androidx.media3.extractor.text.SubtitleInputBuffer r7 = (androidx.media3.extractor.text.SubtitleInputBuffer) r7
            androidx.media3.extractor.text.cea.CeaDecoder$CeaInputBuffer r0 = r6.d
            if (r7 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.media3.common.util.Assertions.b(r0)
            androidx.media3.extractor.text.cea.CeaDecoder$CeaInputBuffer r7 = (androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer) r7
            r0 = 4
            boolean r0 = r7.f(r0)
            if (r0 != 0) goto L35
            long r0 = r7.i
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L35
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L35
            r7.l()
            java.util.ArrayDeque r0 = r6.f3364a
            r0.add(r7)
            goto L43
        L35:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.m = r0
            java.util.ArrayDeque r0 = r6.c
            r0.add(r7)
        L43:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.CeaDecoder.b(java.lang.Object):void");
    }

    @Override // androidx.media3.decoder.Decoder
    public final void c(long j) {
        this.g = j;
    }

    @Override // androidx.media3.decoder.Decoder
    public final Object d() {
        Assertions.f(this.d == null);
        ArrayDeque arrayDeque = this.f3364a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque.pollFirst();
        this.d = ceaInputBuffer;
        return ceaInputBuffer;
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public void f(long j) {
        this.e = j;
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f3364a;
            if (zIsEmpty) {
                break;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.poll();
            int i = Util.f2928a;
            ceaInputBuffer.l();
            arrayDeque.add(ceaInputBuffer);
        }
        CeaInputBuffer ceaInputBuffer2 = this.d;
        if (ceaInputBuffer2 != null) {
            ceaInputBuffer2.l();
            arrayDeque.add(ceaInputBuffer2);
            this.d = null;
        }
    }

    public abstract Subtitle g();

    public abstract void h(SubtitleInputBuffer subtitleInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SubtitleOutputBuffer a() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.peek();
            int i = Util.f2928a;
            if (ceaInputBuffer.i > this.e) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer2 = (CeaInputBuffer) arrayDeque2.poll();
            boolean zF = ceaInputBuffer2.f(4);
            ArrayDeque arrayDeque3 = this.f3364a;
            if (zF) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                subtitleOutputBuffer.e(4);
                ceaInputBuffer2.l();
                arrayDeque3.add(ceaInputBuffer2);
                return subtitleOutputBuffer;
            }
            h(ceaInputBuffer2);
            if (j()) {
                Subtitle subtitleG = g();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                long j = ceaInputBuffer2.i;
                subtitleOutputBuffer2.e = j;
                subtitleOutputBuffer2.h = subtitleG;
                subtitleOutputBuffer2.i = j;
                ceaInputBuffer2.l();
                arrayDeque3.add(ceaInputBuffer2);
                return subtitleOutputBuffer2;
            }
            ceaInputBuffer2.l();
            arrayDeque3.add(ceaInputBuffer2);
        }
    }

    public abstract boolean j();

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }
}
