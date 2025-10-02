package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MouseWheelScrollingLogic r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.r = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.r, continuation);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.q = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.b(r5, r6, r7, r8, r9, r12) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0032, B:19:0x003c, B:23:0x004c, B:14:0x0027), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.p
            r2 = 0
            r3 = 2
            r4 = 1
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = r12.r
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r1 = r12.q
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L18
        L16:
            r13 = r1
            goto L32
        L18:
            r0 = move-exception
            r13 = r0
            goto L72
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.q
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L18
            goto L4c
        L2b:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.q
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
        L32:
            kotlin.coroutines.CoroutineContext r1 = r13.getE()     // Catch: java.lang.Throwable -> L18
            boolean r1 = kotlinx.coroutines.JobKt.h(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L6d
            kotlinx.coroutines.channels.BufferedChannel r1 = r5.e     // Catch: java.lang.Throwable -> L18
            r12.q = r13     // Catch: java.lang.Throwable -> L18
            r12.p = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.c(r12)     // Catch: java.lang.Throwable -> L18
            if (r1 != r0) goto L49
            goto L6c
        L49:
            r11 = r1
            r1 = r13
            r13 = r11
        L4c:
            r7 = r13
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L18
            androidx.compose.ui.unit.Density r13 = r5.d     // Catch: java.lang.Throwable -> L18
            float r6 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.f894a     // Catch: java.lang.Throwable -> L18
            float r8 = r13.T1(r6)     // Catch: java.lang.Throwable -> L18
            androidx.compose.ui.unit.Density r13 = r5.d     // Catch: java.lang.Throwable -> L18
            float r6 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.b     // Catch: java.lang.Throwable -> L18
            float r9 = r13.T1(r6)     // Catch: java.lang.Throwable -> L18
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r5.f895a     // Catch: java.lang.Throwable -> L18
            r12.q = r1     // Catch: java.lang.Throwable -> L18
            r12.p = r3     // Catch: java.lang.Throwable -> L18
            r10 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.b(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18
            if (r13 != r0) goto L16
        L6c:
            return r0
        L6d:
            r5.g = r2
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        L72:
            r5.g = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
