package ovh.plrapps.mapcompose.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lovh/plrapps/mapcompose/core/BitmapForLayer;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$worker$1$bitmapForLayers$1$1", f = "TileCollector.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCollector$worker$1$bitmapForLayers$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BitmapForLayer>, Object> {
    public int p;
    public final /* synthetic */ Layer q;
    public final /* synthetic */ TileSpec r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Map t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Map v;
    public final /* synthetic */ CoroutineScope w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$worker$1$bitmapForLayers$1$1(Layer layer, TileSpec tileSpec, int i, Map map, boolean z, Map map2, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.q = layer;
        this.r = tileSpec;
        this.s = i;
        this.t = map;
        this.u = z;
        this.v = map2;
        this.w = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCollector$worker$1$bitmapForLayers$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCollector$worker$1$bitmapForLayers$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.io.IOException {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r5.p
            r1 = 0
            ovh.plrapps.mapcompose.core.Layer r2 = r5.q
            r3 = 1
            if (r0 == 0) goto L6f
            if (r0 != r3) goto L67
            kotlin.ResultKt.b(r6)
            java.io.InputStream r6 = (java.io.InputStream) r6
            if (r6 == 0) goto L61
            r2.getClass()
            java.util.Map r0 = r5.t
            java.lang.Object r0 = r0.get(r1)
            android.graphics.BitmapFactory$Options r0 = (android.graphics.BitmapFactory.Options) r0
            if (r0 != 0) goto L26
            ovh.plrapps.mapcompose.core.BitmapForLayer r6 = new ovh.plrapps.mapcompose.core.BitmapForLayer
            r6.<init>(r1, r2)
            return r6
        L26:
            int r4 = r5.s
            r0.inSampleSize = r4
            boolean r4 = r5.u
            if (r4 == 0) goto L3b
            r0.inMutable = r3
            java.util.Map r3 = r5.v
            java.lang.Object r3 = r3.get(r1)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.inBitmap = r3
            goto L3f
        L3b:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.HARDWARE
            r0.inPreferredConfig = r3
        L3f:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r1, r0)     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r0 = move-exception
            kotlin.Result$Failure r0 = kotlin.ResultKt.a(r0)     // Catch: java.lang.Throwable -> L5a
        L49:
            boolean r3 = r0 instanceof kotlin.Result.Failure     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r0
        L4f:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L5a
            ovh.plrapps.mapcompose.core.BitmapForLayer r0 = new ovh.plrapps.mapcompose.core.BitmapForLayer     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5a
            r6.close()
            return r0
        L5a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            kotlin.io.CloseableKt.a(r6, r0)
            throw r1
        L61:
            ovh.plrapps.mapcompose.core.BitmapForLayer r6 = new ovh.plrapps.mapcompose.core.BitmapForLayer
            r6.<init>(r1, r2)
            return r6
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L6f:
            kotlin.ResultKt.b(r6)
            r2.getClass()
            r5.p = r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.core.TileCollector$worker$1$bitmapForLayers$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
