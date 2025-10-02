package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TapGestureDetectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function3 f26941a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.ResultKt.b(r9)
        L34:
            r0.p = r8
            r0.r = r3
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r9 = r8.x1(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.lang.Object r2 = r9.f1851a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.lang.Object r9 = r9.f1851a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object b(PointerInputScope pointerInputScope, Continuation continuation, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function2, Function2 function22, Function3 function3) {
        Object objC = CoroutineScopeKt.c(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, null, function12, function15, function14, function1, function13, function2, function22, function3), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
