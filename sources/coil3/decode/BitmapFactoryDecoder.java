package coil3.decode;

import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Semaphore;
import okio.Buffer;
import okio.ForwardingSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder;", "Lcoil3/decode/Decoder;", "Factory", "ExceptionCatchingSource", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BitmapFactoryDecoder implements Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageSource f13072a;
    public final Options b;
    public final Semaphore c;
    public final ExifOrientationStrategy d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$Companion;", "", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$ExceptionCatchingSource;", "Lokio/ForwardingSource;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final Semaphore f13073a;
        public final ExifOrientationStrategy b;

        public Factory(Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy) {
            this.f13073a = semaphore;
            this.b = exifOrientationStrategy;
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder a(SourceFetchResult sourceFetchResult, Options options) {
            return new BitmapFactoryDecoder(sourceFetchResult.f13100a, options, this.f13073a, this.b);
        }
    }

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy) {
        this.f13072a = imageSource;
        this.b = options;
        this.c = semaphore;
        this.d = exifOrientationStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.sync.Semaphore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlinx.coroutines.sync.Semaphore] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlinx.coroutines.sync.Semaphore] */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.p
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L73
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            java.lang.Object r2 = r0.q
            kotlinx.coroutines.sync.Semaphore r2 = (kotlinx.coroutines.sync.Semaphore) r2
            java.lang.Object r4 = r0.p
            coil3.decode.BitmapFactoryDecoder r4 = (coil3.decode.BitmapFactoryDecoder) r4
            kotlin.ResultKt.b(r7)
            r7 = r2
            goto L5d
        L47:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            kotlinx.coroutines.sync.Semaphore r7 = r6.c
            r0.q = r7
            r0.t = r4
            r2 = r7
            kotlinx.coroutines.sync.SemaphoreAndMutexImpl r2 = (kotlinx.coroutines.sync.SemaphoreAndMutexImpl) r2
            java.lang.Object r2 = r2.b(r0)
            if (r2 != r1) goto L5c
            goto L6f
        L5c:
            r4 = r6
        L5d:
            coil3.decode.a r2 = new coil3.decode.a     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            r0.p = r7     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r0.q = r4     // Catch: java.lang.Throwable -> L79
            r0.t = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.a(r2, r0)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L70
        L6f:
            return r1
        L70:
            r5 = r0
            r0 = r7
            r7 = r5
        L73:
            coil3.decode.DecodeResult r7 = (coil3.decode.DecodeResult) r7     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r7
        L79:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L7d:
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
