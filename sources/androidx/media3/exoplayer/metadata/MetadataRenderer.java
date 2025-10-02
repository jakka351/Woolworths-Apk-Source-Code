package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.metadata.MetadataDecoderFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    public boolean A;
    public long B;
    public Metadata C;
    public long D;
    public final MetadataDecoderFactory u;
    public final MetadataOutput v;
    public final Handler w;
    public final MetadataInputBuffer x;
    public MetadataDecoder y;
    public boolean z;

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        super(5);
        this.v = metadataOutput;
        this.w = looper == null ? null : new Handler(looper, this);
        this.u = MetadataDecoderFactory.f3115a;
        this.x = new MetadataInputBuffer(1);
        this.D = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        this.C = null;
        this.y = null;
        this.D = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        this.C = null;
        this.z = false;
        this.A = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        this.y = ((MetadataDecoderFactory.AnonymousClass1) this.u).a(formatArr[0]);
        Metadata metadata = this.C;
        if (metadata != null) {
            long j3 = metadata.b;
            long j4 = (this.D + j3) - j2;
            if (j3 != j4) {
                metadata = new Metadata(j4, metadata.f2868a);
            }
            this.C = metadata;
        }
        this.D = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(androidx.media3.common.Metadata r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            androidx.media3.common.Metadata$Entry[] r1 = r7.f2868a
            int r2 = r1.length
            if (r0 >= r2) goto L4a
            r2 = r1[r0]
            androidx.media3.common.Format r2 = r2.b()
            if (r2 == 0) goto L42
            androidx.media3.exoplayer.metadata.MetadataDecoderFactory r3 = r6.u
            androidx.media3.exoplayer.metadata.MetadataDecoderFactory$1 r3 = (androidx.media3.exoplayer.metadata.MetadataDecoderFactory.AnonymousClass1) r3
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L42
            androidx.media3.extractor.metadata.SimpleMetadataDecoder r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.a()
            r1.getClass()
            androidx.media3.extractor.metadata.MetadataInputBuffer r3 = r6.x
            r3.l()
            int r4 = r1.length
            r3.n(r4)
            java.nio.ByteBuffer r4 = r3.g
            int r5 = androidx.media3.common.util.Util.f2928a
            r4.put(r1)
            r3.o()
            androidx.media3.common.Metadata r1 = r2.a(r3)
            if (r1 == 0) goto L47
            r6.N(r1, r8)
            goto L47
        L42:
            r1 = r1[r0]
            r8.add(r1)
        L47:
            int r0 = r0 + 1
            goto L1
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.metadata.MetadataRenderer.N(androidx.media3.common.Metadata, java.util.ArrayList):void");
    }

    public final long O(long j) {
        Assertions.f(j != -9223372036854775807L);
        Assertions.f(this.D != -9223372036854775807L);
        return j - this.D;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (((MetadataDecoderFactory.AnonymousClass1) this.u).b(format)) {
            return RendererCapabilities.g(format.M == 0 ? 4 : 2, 0, 0, 0);
        }
        return RendererCapabilities.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return this.A;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        this.v.u((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.z && this.C == null) {
                MetadataInputBuffer metadataInputBuffer = this.x;
                metadataInputBuffer.l();
                FormatHolder formatHolder = this.f;
                formatHolder.a();
                int iM = M(formatHolder, metadataInputBuffer, 0);
                if (iM == -4) {
                    if (metadataInputBuffer.f(4)) {
                        this.z = true;
                    } else if (metadataInputBuffer.i >= this.o) {
                        metadataInputBuffer.l = this.B;
                        metadataInputBuffer.o();
                        MetadataDecoder metadataDecoder = this.y;
                        int i = Util.f2928a;
                        Metadata metadataA = metadataDecoder.a(metadataInputBuffer);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.f2868a.length);
                            N(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.C = new Metadata(O(metadataInputBuffer.i), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iM == -5) {
                    Format format = formatHolder.b;
                    format.getClass();
                    this.B = format.s;
                }
            }
            Metadata metadata = this.C;
            if (metadata == null || metadata.b > O(j)) {
                z = false;
            } else {
                Metadata metadata2 = this.C;
                Handler handler = this.w;
                if (handler != null) {
                    handler.obtainMessage(1, metadata2).sendToTarget();
                } else {
                    this.v.u(metadata2);
                }
                this.C = null;
                z = true;
            }
            if (this.z && this.C == null) {
                this.A = true;
            }
        }
    }
}
