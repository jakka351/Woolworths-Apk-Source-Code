package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public PointerInputChange q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ TextDragObserver t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.t = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.t, continuation);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.s = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r14 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r14 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:17:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.r
            r2 = 0
            androidx.compose.foundation.text.TextDragObserver r3 = r13.t
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r13.q
            java.lang.Object r5 = r13.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.b(r14)
            goto L54
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r14)
            goto L3c
        L29:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.s
            r1 = r14
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r13.s = r1
            r13.r = r5
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r2, r13, r4)
            if (r14 != r0) goto L3c
            goto L53
        L3c:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            long r5 = r14.c
            r3.a()
            r5 = r1
            r1 = r14
        L45:
            r13.s = r5
            r13.q = r1
            r13.r = r4
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r14 = r5.x1(r14, r13)
            if (r14 != r0) goto L54
        L53:
            return r0
        L54:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.lang.Object r14 = r14.f1851a
            r6 = r14
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = r2
        L60:
            if (r7 >= r6) goto L7a
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            long r9 = r8.f1855a
            long r11 = r1.f1855a
            boolean r9 = androidx.compose.ui.input.pointer.PointerId.a(r9, r11)
            if (r9 == 0) goto L77
            boolean r8 = r8.d
            if (r8 == 0) goto L77
            goto L45
        L77:
            int r7 = r7 + 1
            goto L60
        L7a:
            r3.d()
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
