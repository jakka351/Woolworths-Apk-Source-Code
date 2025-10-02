package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {31, 37}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public PointerInputChange q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ TapOnPosition t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(TapOnPosition tapOnPosition, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.t = tapOnPosition;
        this.u = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.t, this.u, continuation);
        pressDownGestureKt$detectPressDownGesture$2.s = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.r
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L64
            if (r1 == r4) goto L5c
            if (r1 != r3) goto L54
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.q
            java.lang.Object r4 = r12.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            kotlin.ResultKt.b(r13)
        L16:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            java.lang.Object r13 = r13.f1851a
            r5 = r13
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = r2
        L22:
            if (r6 >= r5) goto L4a
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r8 = r7.f1855a
            long r10 = r1.f1855a
            boolean r8 = androidx.compose.ui.input.pointer.PointerId.a(r8, r10)
            if (r8 == 0) goto L47
            boolean r7 = r7.d
            if (r7 == 0) goto L47
            r12.s = r4
            r12.q = r1
            r12.r = r3
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r13 = r4.x1(r13, r12)
            if (r13 != r0) goto L16
            goto L75
        L47:
            int r6 = r6 + 1
            goto L22
        L4a:
            kotlin.jvm.functions.Function0 r13 = r12.u
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$2 r13 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2.C00302) r13
            r13.invoke()
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        L54:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L5c:
            java.lang.Object r0 = r12.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.ResultKt.b(r13)
            goto L76
        L64:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r12.s = r13
            r12.r = r4
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r13, r2, r12, r3)
            if (r13 != r0) goto L76
        L75:
            return r0
        L76:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            long r0 = r13.c
            androidx.compose.foundation.text.input.internal.selection.TapOnPosition r13 = r12.t
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$1 r13 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2.AnonymousClass2.AnonymousClass1) r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r13 = r13.f1184a
            r13.getClass()
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
