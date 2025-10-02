package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", l = {272, 284}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CoroutineContext s;
    public final /* synthetic */ ScrollConfig t;
    public final /* synthetic */ Channel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoomByCtrlMouseScroll$2(CoroutineContext coroutineContext, ScrollConfig scrollConfig, Channel channel, Continuation continuation) {
        super(2, continuation);
        this.s = coroutineContext;
        this.t = scrollConfig;
        this.u = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new TransformableKt$detectZoomByCtrlMouseScroll$2(this.s, this.t, this.u, continuation);
        transformableKt$detectZoomByCtrlMouseScroll$2.r = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformableKt$detectZoomByCtrlMouseScroll$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:26:0x007e, B:28:0x0082, B:23:0x0050, B:19:0x003c, B:22:0x0047, B:14:0x0028), top: B:35:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007b -> B:26:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.q
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r2 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.f908a
            androidx.compose.foundation.gestures.ScrollConfig r3 = r11.t
            r4 = 2
            r5 = 1
            kotlinx.coroutines.channels.Channel r6 = r11.u
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            java.lang.Object r1 = r11.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L7e
        L1a:
            r12 = move-exception
            goto L89
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.Object r1 = r11.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L47
        L2c:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            r1 = r12
        L34:
            kotlin.coroutines.CoroutineContext r12 = r11.s
            boolean r12 = kotlinx.coroutines.JobKt.h(r12)
            if (r12 == 0) goto L8d
            r11.r = r1     // Catch: java.lang.Throwable -> L1a
            r11.q = r5     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = androidx.compose.foundation.gestures.TransformableKt.a(r1, r3, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto L47
            goto L7d
        L47:
            androidx.compose.ui.geometry.Offset r12 = (androidx.compose.ui.geometry.Offset) r12     // Catch: java.lang.Throwable -> L1a
            long r7 = r12.f1751a     // Catch: java.lang.Throwable -> L1a
            androidx.compose.foundation.gestures.TransformEvent$TransformStarted r12 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.f907a     // Catch: java.lang.Throwable -> L1a
            r6.k(r12)     // Catch: java.lang.Throwable -> L1a
        L50:
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r12 = (int) r7     // Catch: java.lang.Throwable -> L1a
            float r12 = java.lang.Float.intBitsToFloat(r12)     // Catch: java.lang.Throwable -> L1a
            r7 = 1141391360(0x44084000, float:545.0)
            float r12 = r12 / r7
            r7 = 1073741824(0x40000000, float:2.0)
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L1a
            double r9 = (double) r12     // Catch: java.lang.Throwable -> L1a
            double r7 = java.lang.Math.pow(r7, r9)     // Catch: java.lang.Throwable -> L1a
            float r12 = (float) r7     // Catch: java.lang.Throwable -> L1a
            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta     // Catch: java.lang.Throwable -> L1a
            r8 = 0
            r10 = 0
            r7.<init>(r8, r12, r10)     // Catch: java.lang.Throwable -> L1a
            r6.k(r7)     // Catch: java.lang.Throwable -> L1a
            r11.r = r1     // Catch: java.lang.Throwable -> L1a
            r11.q = r4     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = androidx.compose.foundation.gestures.TransformableKt.c(r1, r3, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto L7e
        L7d:
            return r0
        L7e:
            androidx.compose.ui.geometry.Offset r12 = (androidx.compose.ui.geometry.Offset) r12     // Catch: java.lang.Throwable -> L1a
            if (r12 == 0) goto L85
            long r7 = r12.f1751a     // Catch: java.lang.Throwable -> L1a
            goto L50
        L85:
            r6.k(r2)
            goto L34
        L89:
            r6.k(r2)
            throw r12
        L8d:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
