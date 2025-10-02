package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@UnstableApi
/* loaded from: classes2.dex */
public final class ExternallyLoadedImageDecoder implements ImageDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final DecoderInputBuffer f3090a = new DecoderInputBuffer(1);
    public final ImageOutputBuffer b = new AnonymousClass1();
    public ListenableFuture c;
    public boolean d;

    /* renamed from: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder$1, reason: invalid class name */
    class AnonymousClass1 extends ImageOutputBuffer {
    }

    public interface BitmapResolver {
    }

    public static final class ExternalImageRequest {
    }

    public static final class Factory implements ImageDecoder.Factory {
        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public final int a(Format format) {
            return RendererCapabilities.g(Objects.equals(format.n, "application/x-image-uri") ? 4 : MimeTypes.j(format.n) ? 1 : 0, 0, 0, 0);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public final ImageDecoder b() {
            return new ExternallyLoadedImageDecoder();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void c(long j) {
    }

    @Override // androidx.media3.decoder.Decoder
    public final Object d() {
        if (this.c == null) {
            return this.f3090a;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    /* renamed from: e */
    public final void b(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.f(4)) {
            this.d = true;
            decoderInputBuffer.l();
        } else {
            ByteBuffer byteBuffer = decoderInputBuffer.g;
            byteBuffer.getClass();
            Assertions.f(byteBuffer.hasArray());
            Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8));
            throw null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.c = null;
        }
        this.d = false;
        ((AnonymousClass1) this.b).l();
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // androidx.media3.decoder.Decoder
    public final void release() {
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.c = null;
        }
        this.d = false;
        ((AnonymousClass1) this.b).l();
    }

    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    public final ImageOutputBuffer a() {
        boolean z = this.d;
        ImageOutputBuffer imageOutputBuffer = this.b;
        if (z) {
            imageOutputBuffer.e(4);
            this.d = false;
            return imageOutputBuffer;
        }
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            try {
                if (listenableFuture.isDone()) {
                    try {
                        imageOutputBuffer.h = (Bitmap) Futures.b(this.c);
                        imageOutputBuffer.e = 0L;
                        return imageOutputBuffer;
                    } catch (CancellationException e) {
                        throw new ImageDecoderException(e);
                    } catch (ExecutionException e2) {
                        throw new ImageDecoderException(e2.getCause());
                    }
                }
            } finally {
                this.c = null;
            }
        }
        return null;
    }
}
