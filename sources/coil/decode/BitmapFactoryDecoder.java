package coil.decode;

import coil.decode.Decoder;
import coil.fetch.SourceResult;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Buffer;
import okio.ForwardingSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder;", "Lcoil/decode/Decoder;", "Companion", "ExceptionCatchingSource", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BitmapFactoryDecoder implements Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageSource f12973a;
    public final Options b;
    public final Semaphore c;
    public final ExifOrientationPolicy d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$Companion;", "", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$ExceptionCatchingSource;", "Lokio/ForwardingSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExceptionCatchingSource extends ForwardingSource {
        public Exception e;

        @Override // okio.ForwardingSource, okio.Source
        public final long q2(Buffer buffer, long j) throws Exception {
            try {
                return super.q2(buffer, j);
            } catch (Exception e) {
                this.e = e;
                throw e;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/BitmapFactoryDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final ExifOrientationPolicy f12974a;
        public final Semaphore b;

        public Factory(int i, ExifOrientationPolicy exifOrientationPolicy) {
            this.f12974a = exifOrientationPolicy;
            this.b = SemaphoreKt.a(i);
        }

        @Override // coil.decode.Decoder.Factory
        public final BitmapFactoryDecoder a(SourceResult sourceResult, Options options) {
            return new BitmapFactoryDecoder(sourceResult.f12995a, options, this.b, this.f12974a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public final int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationPolicy exifOrientationPolicy) {
        this.f12973a = imageSource;
        this.b = options;
        this.c = semaphore;
        this.d = exifOrientationPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = (coil.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = new coil.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.p
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r7 = move-exception
            goto L76
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlinx.coroutines.sync.Semaphore r2 = r0.q
            java.lang.Object r4 = r0.p
            coil.decode.BitmapFactoryDecoder r4 = (coil.decode.BitmapFactoryDecoder) r4
            kotlin.ResultKt.b(r7)
            r7 = r2
            goto L56
        L43:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            kotlinx.coroutines.sync.Semaphore r7 = r6.c
            r0.q = r7
            r0.t = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L55
            goto L68
        L55:
            r4 = r6
        L56:
            coil.decode.BitmapFactoryDecoder$decode$2$1 r2 = new coil.decode.BitmapFactoryDecoder$decode$2$1     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            r0.p = r7     // Catch: java.lang.Throwable -> L72
            r4 = 0
            r0.q = r4     // Catch: java.lang.Throwable -> L72
            r0.t = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.a(r2, r0)     // Catch: java.lang.Throwable -> L72
            if (r0 != r1) goto L69
        L68:
            return r1
        L69:
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            coil.decode.DecodeResult r7 = (coil.decode.DecodeResult) r7     // Catch: java.lang.Throwable -> L2e
            r0.release()
            return r7
        L72:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L76:
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
