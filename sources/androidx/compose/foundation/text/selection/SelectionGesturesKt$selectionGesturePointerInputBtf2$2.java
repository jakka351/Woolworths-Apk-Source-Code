package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", l = {209, 217, 220, 221}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SelectionGesturesKt$selectionGesturePointerInputBtf2$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ClicksCounter s;
    public final /* synthetic */ MouseSelectionObserver t;
    public final /* synthetic */ TextDragObserver u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGesturePointerInputBtf2$2(TextDragObserver textDragObserver, ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
        super(2, continuation);
        this.s = clicksCounter;
        this.t = mouseSelectionObserver;
        this.u = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$selectionGesturePointerInputBtf2$2 selectionGesturesKt$selectionGesturePointerInputBtf2$2 = new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(this.u, this.s, this.t, continuation);
        selectionGesturesKt$selectionGesturePointerInputBtf2$2.r = obj;
        return selectionGesturesKt$selectionGesturePointerInputBtf2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$selectionGesturePointerInputBtf2$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.c(r1, r13.t, r6, r14, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.e(r1, r6, r14, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.f(r1, r6, r14, r13) == r0) goto L37;
     */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.ResultKt.b(r14)
            goto L96
        L20:
            java.lang.Object r1 = r13.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r14)
            goto L3b
        L28:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.r
            r1 = r14
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r13.r = r1
            r13.q = r5
            java.lang.Object r14 = androidx.compose.foundation.text.selection.SelectionGesturesKt.a(r1, r13)
            if (r14 != r0) goto L3b
            goto L95
        L3b:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            androidx.compose.foundation.text.selection.ClicksCounter r6 = r13.s
            r6.a(r14)
            boolean r7 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r14)
            r8 = 0
            if (r7 == 0) goto L78
            int r9 = r14.c
            r9 = r9 & 33
            if (r9 == 0) goto L78
            java.lang.Object r9 = r14.f1851a
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
        L59:
            if (r11 >= r10) goto L6b
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.b()
            if (r12 == 0) goto L68
            goto L78
        L68:
            int r11 = r11 + 1
            goto L59
        L6b:
            r13.r = r8
            r13.q = r4
            androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r13.t
            java.lang.Object r14 = androidx.compose.foundation.text.selection.SelectionGesturesKt.c(r1, r2, r6, r14, r13)
            if (r14 != r0) goto L96
            goto L95
        L78:
            if (r7 != 0) goto L96
            int r4 = r6.b
            androidx.compose.foundation.text.TextDragObserver r6 = r13.u
            if (r4 != r5) goto L8b
            r13.r = r8
            r13.q = r3
            java.lang.Object r14 = androidx.compose.foundation.text.selection.SelectionGesturesKt.e(r1, r6, r14, r13)
            if (r14 != r0) goto L96
            goto L95
        L8b:
            r13.r = r8
            r13.q = r2
            java.lang.Object r14 = androidx.compose.foundation.text.selection.SelectionGesturesKt.f(r1, r6, r14, r13)
            if (r14 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
