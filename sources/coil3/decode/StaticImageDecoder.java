package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.RequiresApi;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Semaphore;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/decode/StaticImageDecoder;", "Lcoil3/decode/Decoder;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class StaticImageDecoder implements Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageDecoder.Source f13081a;
    public final AutoCloseable b;
    public final Options c;
    public final Semaphore d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/StaticImageDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final Semaphore f13083a;

        public Factory(Semaphore semaphore) {
            this.f13083a = semaphore;
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder a(SourceFetchResult sourceFetchResult, Options options) {
            ImageDecoder.Source sourceA;
            Bitmap.Config configB = ImageRequests_androidKt.b(options);
            if ((configB == Bitmap.Config.ARGB_8888 || configB == Bitmap.Config.HARDWARE) && (sourceA = StaticImageDecoderKt.a(sourceFetchResult.f13100a, options, false)) != null) {
                return new StaticImageDecoder(sourceA, sourceFetchResult.f13100a, options, this.f13083a);
            }
            return null;
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, Options options, Semaphore semaphore) {
        this.f13081a = source;
        this.b = autoCloseable;
        this.c = options;
        this.d = semaphore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.q
            kotlinx.coroutines.sync.Semaphore r1 = (kotlinx.coroutines.sync.Semaphore) r1
            coil3.decode.StaticImageDecoder r0 = r0.p
            kotlin.ResultKt.b(r6)
            goto L4e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.ResultKt.b(r6)
            r0.p = r5
            kotlinx.coroutines.sync.Semaphore r6 = r5.d
            r0.q = r6
            r0.t = r3
            r2 = r6
            kotlinx.coroutines.sync.SemaphoreAndMutexImpl r2 = (kotlinx.coroutines.sync.SemaphoreAndMutexImpl) r2
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            java.lang.AutoCloseable r6 = r0.b     // Catch: java.lang.Throwable -> L74
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            android.graphics.ImageDecoder$Source r3 = r0.f13081a     // Catch: java.lang.Throwable -> L76
            coil3.decode.StaticImageDecoder$decode$lambda$2$lambda$1$$inlined$decodeBitmap$1 r4 = new coil3.decode.StaticImageDecoder$decode$lambda$2$lambda$1$$inlined$decodeBitmap$1     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            android.graphics.Bitmap r0 = android.graphics.ImageDecoder.decodeBitmap(r3, r4)     // Catch: java.lang.Throwable -> L76
            coil3.decode.DecodeResult r3 = new coil3.decode.DecodeResult     // Catch: java.lang.Throwable -> L76
            coil3.BitmapImage r4 = new coil3.BitmapImage     // Catch: java.lang.Throwable -> L76
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L76
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L76
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L76
            r0 = 0
            kotlin.jdk7.AutoCloseableKt.a(r6, r0)     // Catch: java.lang.Throwable -> L74
            r1.release()
            return r3
        L74:
            r6 = move-exception
            goto L7d
        L76:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r2 = move-exception
            kotlin.jdk7.AutoCloseableKt.a(r6, r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L7d:
            r1.release()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
