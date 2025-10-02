package androidx.compose.foundation.gestures;

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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Lambda A;
    public final /* synthetic */ Ref.LongRef B;
    public final /* synthetic */ Orientation C;
    public final /* synthetic */ Lambda D;
    public final /* synthetic */ Lambda E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Lambda G;
    public Object q;
    public Object r;
    public Object s;
    public Ref.LongRef t;
    public TouchSlopDetector u;
    public PointerInputChange v;
    public boolean w;
    public float x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$9(Function0 function0, Ref.LongRef longRef, Orientation orientation, Function3 function3, Function2 function2, Function0 function02, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.A = (Lambda) function0;
        this.B = longRef;
        this.C = orientation;
        this.D = (Lambda) function3;
        this.E = (Lambda) function2;
        this.F = function02;
        this.G = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation);
        dragGestureDetectorKt$detectDragGestures$9.z = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x042d, code lost:
    
        if (r4.x1(r7, r24) == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04a2, code lost:
    
        if (r4 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0527, code lost:
    
        if (r9 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x017b, code lost:
    
        if (r5 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0183, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c8, code lost:
    
        if (r5 == r1) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0372 A[PHI: r2 r3 r4 r5 r6 r7 r8 r9 r11 r16 r18
  0x0372: PHI (r2v38 float) = (r2v25 float), (r2v39 float) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r3v33 androidx.compose.ui.input.pointer.PointerInputChange) = 
  (r3v23 androidx.compose.ui.input.pointer.PointerInputChange)
  (r3v35 androidx.compose.ui.input.pointer.PointerInputChange)
 binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r4v27 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r4v21 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r4v30 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r5v36 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r5v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r5v38 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r6v33 kotlin.jvm.internal.Ref$LongRef) = (r6v14 kotlin.jvm.internal.Ref$LongRef), (r6v34 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r7v6 androidx.compose.foundation.gestures.Orientation) = (r7v0 androidx.compose.foundation.gestures.Orientation), (r7v20 androidx.compose.foundation.gestures.Orientation) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r8v38 androidx.compose.foundation.gestures.TouchSlopDetector) = 
  (r8v20 androidx.compose.foundation.gestures.TouchSlopDetector)
  (r8v39 androidx.compose.foundation.gestures.TouchSlopDetector)
 binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r9v23 java.lang.Object) = (r9v10 java.lang.Object), (r9v31 java.lang.Object) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r11v17 kotlin.jvm.internal.Ref$LongRef) = (r11v12 kotlin.jvm.internal.Ref$LongRef), (r11v18 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r16v21 long) = (r16v15 long), (r16v22 long) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]
  0x0372: PHI (r18v21 long) = (r18v15 long), (r18v22 long) binds: [B:8:0x0064, B:113:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca A[PHI: r2 r3 r4 r5 r6 r13 r14 r15 r16 r18
  0x01ca: PHI (r2v15 androidx.compose.foundation.gestures.TouchSlopDetector) = 
  (r2v13 androidx.compose.foundation.gestures.TouchSlopDetector)
  (r2v16 androidx.compose.foundation.gestures.TouchSlopDetector)
 binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r3v11 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r3v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r3v13 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r4v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r4v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r4v10 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r5v9 androidx.compose.ui.input.pointer.PointerInputChange) = 
  (r5v7 androidx.compose.ui.input.pointer.PointerInputChange)
  (r5v10 androidx.compose.ui.input.pointer.PointerInputChange)
 binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r6v4 float) = (r6v2 float), (r6v5 float) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r13v4 kotlin.jvm.internal.Ref$LongRef) = (r13v2 kotlin.jvm.internal.Ref$LongRef), (r13v5 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r14v4 kotlin.jvm.internal.Ref$LongRef) = (r14v2 kotlin.jvm.internal.Ref$LongRef), (r14v5 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r15v2 java.lang.Object) = (r15v1 java.lang.Object), (r15v11 java.lang.Object) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r16v7 long) = (r16v5 long), (r16v8 long) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r18v7 long) = (r18v5 long), (r18v8 long) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0294  */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v33, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r6v27, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0336 -> B:155:0x043a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x033e -> B:112:0x0354). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x03e3 -> B:148:0x040e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x040a -> B:148:0x040e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x042d -> B:152:0x0431). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0446 -> B:80:0x0292). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x04a2 -> B:169:0x04a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0191 -> B:28:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0201 -> B:28:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x024b -> B:73:0x027f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0251 -> B:30:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0274 -> B:70:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02f8 -> B:86:0x02b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
