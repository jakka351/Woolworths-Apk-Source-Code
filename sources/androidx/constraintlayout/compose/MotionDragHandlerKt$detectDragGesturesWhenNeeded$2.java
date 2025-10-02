package androidx.constraintlayout.compose;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", l = {166, 174, 183}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public PointerInputChange q;
    public Ref.LongRef r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ Function0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(Function1 function1, Function1 function12, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.u = function1;
        this.v = function12;
        this.w = function2;
        this.x = function0;
        this.y = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(this.u, this.v, this.w, this.x, this.y, continuation);
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.t = obj;
        return motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[PHI: r1 r5 r6 r10
  0x0083: PHI (r1v6 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v11 kotlin.jvm.internal.Ref$LongRef) binds: [B:20:0x0080, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r5v10 androidx.compose.ui.input.pointer.PointerInputChange) = 
  (r5v9 androidx.compose.ui.input.pointer.PointerInputChange)
  (r5v13 androidx.compose.ui.input.pointer.PointerInputChange)
 binds: [B:20:0x0080, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r6v3 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r6v2 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r6v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:20:0x0080, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r10v7 java.lang.Object) = (r10v6 java.lang.Object), (r10v0 java.lang.Object) binds: [B:20:0x0080, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:22:0x0083). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
