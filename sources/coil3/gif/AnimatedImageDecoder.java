package coil3.gif;

import android.os.Build;
import androidx.annotation.RequiresApi;
import coil3.decode.Decoder;
import coil3.decode.ImageSource;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/gif/AnimatedImageDecoder;", "Lcoil3/decode/Decoder;", "Factory", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnimatedImageDecoder implements Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageSource f13101a;
    public final Options b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/gif/AnimatedImageDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Decoder.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13103a;

        public Factory() {
            this.f13103a = Build.VERSION.SDK_INT < 34;
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder a(SourceFetchResult sourceFetchResult, Options options) {
            BufferedSource bufferedSourceU0 = sourceFetchResult.f13100a.U0();
            if (!DecodeUtilsKt.a(bufferedSourceU0) && (!bufferedSourceU0.a0(0L, DecodeUtilsKt.c) || !bufferedSourceU0.a0(8L, DecodeUtilsKt.d) || !bufferedSourceU0.a0(12L, DecodeUtilsKt.e) || !bufferedSourceU0.request(21L) || ((byte) (bufferedSourceU0.getE().e(20L) & 2)) <= 0)) {
                if (Build.VERSION.SDK_INT < 30 || !bufferedSourceU0.a0(4L, DecodeUtilsKt.f)) {
                    return null;
                }
                if (!bufferedSourceU0.a0(8L, DecodeUtilsKt.g) && !bufferedSourceU0.a0(8L, DecodeUtilsKt.h) && !bufferedSourceU0.a0(8L, DecodeUtilsKt.i)) {
                    return null;
                }
            }
            return new AnimatedImageDecoder(sourceFetchResult.f13100a, options, this.f13103a);
        }
    }

    public AnimatedImageDecoder(ImageSource imageSource, Options options, boolean z) {
        this.f13101a = imageSource;
        this.b = options;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.gif.AnimatedImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.gif.AnimatedImageDecoder$decode$1 r0 = (coil3.gif.AnimatedImageDecoder$decode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            coil3.gif.AnimatedImageDecoder$decode$1 r0 = new coil3.gif.AnimatedImageDecoder$decode$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.p
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            kotlin.ResultKt.b(r7)
            goto L72
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.q
            java.lang.Object r4 = r0.p
            coil3.gif.AnimatedImageDecoder r4 = (coil3.gif.AnimatedImageDecoder) r4
            kotlin.ResultKt.b(r7)
            goto L61
        L42:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            coil3.gif.a r2 = new coil3.gif.a
            r5 = 0
            r2.<init>(r5, r6, r7)
            r0.p = r6
            r0.q = r7
            r0.t = r4
            java.lang.Object r2 = kotlinx.coroutines.InterruptibleKt.a(r2, r0)
            if (r2 != r1) goto L5d
            goto L70
        L5d:
            r4 = r2
            r2 = r7
            r7 = r4
            r4 = r6
        L61:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r0.p = r2
            r5 = 0
            r0.q = r5
            r0.t = r3
            java.lang.Object r7 = r4.b(r7, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            r0 = r2
        L72:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            coil3.Image r7 = coil3.Image_androidKt.b(r7)
            boolean r0 = r0.d
            coil3.decode.DecodeResult r1 = new coil3.decode.DecodeResult
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.gif.AnimatedImageDecoder.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.graphics.drawable.Drawable r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof coil3.gif.AnimatedImageDecoder$wrapDrawable$1
            if (r0 == 0) goto L13
            r0 = r10
            coil3.gif.AnimatedImageDecoder$wrapDrawable$1 r0 = (coil3.gif.AnimatedImageDecoder$wrapDrawable$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            coil3.gif.AnimatedImageDecoder$wrapDrawable$1 r0 = new coil3.gif.AnimatedImageDecoder$wrapDrawable$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            android.graphics.drawable.AnimatedImageDrawable r9 = r0.q
            coil3.gif.AnimatedImageDecoder r0 = r0.p
            kotlin.ResultKt.b(r10)
            goto L81
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.b(r10)
            boolean r10 = r9 instanceof android.graphics.drawable.AnimatedImageDrawable
            if (r10 != 0) goto L3b
            return r9
        L3b:
            r10 = r9
            android.graphics.drawable.AnimatedImageDrawable r10 = (android.graphics.drawable.AnimatedImageDrawable) r10
            coil3.Extras$Key r2 = coil3.gif.ImageRequestsKt.f13105a
            coil3.request.Options r4 = r8.b
            java.lang.Object r2 = coil3.ExtrasKt.b(r4, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r10.setRepeatCount(r2)
            coil3.Extras$Key r2 = coil3.gif.ImageRequestsKt.c
            java.lang.Object r2 = coil3.ExtrasKt.b(r4, r2)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            coil3.Extras$Key r5 = coil3.gif.ImageRequestsKt.d
            java.lang.Object r4 = coil3.ExtrasKt.b(r4, r5)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            if (r2 != 0) goto L66
            if (r4 == 0) goto L64
            goto L66
        L64:
            r0 = r8
            goto L81
        L66:
            kotlinx.coroutines.scheduling.DefaultScheduler r5 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            kotlinx.coroutines.MainCoroutineDispatcher r5 = r5.T()
            coil3.gif.AnimatedImageDecoder$wrapDrawable$2 r6 = new coil3.gif.AnimatedImageDecoder$wrapDrawable$2
            r7 = 0
            r6.<init>(r9, r2, r4, r7)
            r0.p = r8
            r0.q = r10
            r0.t = r3
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.f(r5, r6, r0)
            if (r10 != r1) goto L64
            return r1
        L81:
            coil3.size.ScaleDrawable r10 = new coil3.size.ScaleDrawable
            coil3.request.Options r0 = r0.b
            coil3.size.Scale r0 = r0.c
            r10.<init>(r9, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.gif.AnimatedImageDecoder.b(android.graphics.drawable.Drawable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
