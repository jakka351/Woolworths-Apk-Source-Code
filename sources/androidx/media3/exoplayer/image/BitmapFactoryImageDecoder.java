package androidx.media3.exoplayer.image;

import androidx.annotation.VisibleForTesting;
import androidx.camera.core.internal.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    public final a o;

    @VisibleForTesting
    public interface BitmapDecoder {
    }

    public static final class Factory implements ImageDecoder.Factory {
        public final a b = new a(28);

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        
            if (r0 >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
        
            if (r0 >= 34) goto L45;
         */
        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(androidx.media3.common.Format r7) {
            /*
                r6 = this;
                java.lang.String r0 = r7.n
                r1 = 0
                if (r0 == 0) goto L82
                boolean r0 = androidx.media3.common.MimeTypes.j(r0)
                if (r0 != 0) goto Ld
                goto L82
            Ld:
                java.lang.String r7 = r7.n
                int r0 = androidx.media3.common.util.Util.f2928a
                r7.getClass()
                int r2 = r7.hashCode()
                r3 = 4
                r4 = 1
                r5 = -1
                switch(r2) {
                    case -1487656890: goto L61;
                    case -1487464693: goto L56;
                    case -1487464690: goto L4b;
                    case -1487394660: goto L40;
                    case -1487018032: goto L35;
                    case -879272239: goto L2a;
                    case -879258763: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L6b
            L1f:
                java.lang.String r2 = "image/png"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L28
                goto L6b
            L28:
                r5 = 6
                goto L6b
            L2a:
                java.lang.String r2 = "image/bmp"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L33
                goto L6b
            L33:
                r5 = 5
                goto L6b
            L35:
                java.lang.String r2 = "image/webp"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L3e
                goto L6b
            L3e:
                r5 = r3
                goto L6b
            L40:
                java.lang.String r2 = "image/jpeg"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L49
                goto L6b
            L49:
                r5 = 3
                goto L6b
            L4b:
                java.lang.String r2 = "image/heif"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L54
                goto L6b
            L54:
                r5 = 2
                goto L6b
            L56:
                java.lang.String r2 = "image/heic"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L5f
                goto L6b
            L5f:
                r5 = r4
                goto L6b
            L61:
                java.lang.String r2 = "image/avif"
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L6a
                goto L6b
            L6a:
                r5 = r1
            L6b:
                switch(r5) {
                    case 0: goto L74;
                    case 1: goto L6f;
                    case 2: goto L6f;
                    case 3: goto L78;
                    case 4: goto L78;
                    case 5: goto L78;
                    case 6: goto L78;
                    default: goto L6e;
                }
            L6e:
                goto L7d
            L6f:
                r7 = 26
                if (r0 < r7) goto L7d
                goto L78
            L74:
                r7 = 34
                if (r0 < r7) goto L7d
            L78:
                int r7 = androidx.media3.exoplayer.RendererCapabilities.g(r3, r1, r1, r1)
                return r7
            L7d:
                int r7 = androidx.media3.exoplayer.RendererCapabilities.g(r4, r1, r1, r1)
                return r7
            L82:
                int r7 = androidx.media3.exoplayer.RendererCapabilities.g(r1, r1, r1, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.Factory.a(androidx.media3.common.Format):int");
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public final ImageDecoder b() {
            return new BitmapFactoryImageDecoder(this.b);
        }
    }

    public BitmapFactoryImageDecoder(a aVar) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.o = aVar;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderInputBuffer g() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderOutputBuffer h() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.decoder.DecoderOutputBuffer
            public final void m() {
                BitmapFactoryImageDecoder.this.m(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z) {
        ImageOutputBuffer imageOutputBuffer = (ImageOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = decoderInputBuffer.g;
            byteBuffer.getClass();
            Assertions.f(byteBuffer.hasArray());
            Assertions.b(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.h = this.o.h(byteBuffer.remaining(), byteBuffer.array());
            imageOutputBuffer.e = decoderInputBuffer.i;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }
}
