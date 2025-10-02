package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.GestureDetectorKt$detectTransformGestures$2", f = "GestureDetector.kt", l = {47, 56}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class GestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function4 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ ClosedFloatingPointRange H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Function1 J;
    public VelocityTracker q;
    public VelocityTracker1D r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public long x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureDetectorKt$detectTransformGestures$2(Function0 function0, Function4 function4, Function2 function2, Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, float f, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.D = function0;
        this.E = function4;
        this.F = function2;
        this.G = function1;
        this.H = closedFloatingPointRange;
        this.I = f;
        this.J = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GestureDetectorKt$detectTransformGestures$2 gestureDetectorKt$detectTransformGestures$2 = new GestureDetectorKt$detectTransformGestures$2(this.D, this.E, this.F, this.G, this.H, this.I, this.J, continuation);
        gestureDetectorKt$detectTransformGestures$2.C = obj;
        return gestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GestureDetectorKt$detectTransformGestures$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0277, code lost:
    
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r0.get(r3)).d != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0279, code lost:
    
        r2 = r0.size();
        r3 = 0;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0282, code lost:
    
        if (r3 >= r2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0284, code lost:
    
        r5 = androidx.compose.ui.geometry.Offset.h(r5, ((androidx.compose.ui.input.pointer.PointerInputChange) r0.get(r3)).c);
        r4 = r4 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0295, code lost:
    
        if (r4 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0297, code lost:
    
        r2 = 9205357640488583168L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029d, code lost:
    
        r2 = androidx.compose.ui.geometry.Offset.b(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        r4 = ((java.lang.Iterable) r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ad, code lost:
    
        if (r4.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02af, code lost:
    
        ((androidx.compose.ui.input.pointer.PointerInputChange) r4.next()).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b9, code lost:
    
        r5 = r37;
        r12 = r2;
        r4 = r17;
        r8 = r26;
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c3, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0267, code lost:
    
        r2 = r0.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026d, code lost:
    
        if (r3 >= r2) goto L175;
     */
    /* JADX WARN: Path cross not found for [B:114:0x02c9, B:93:0x0255], limit reached: 176 */
    /* JADX WARN: Path cross not found for [B:60:0x01bc, B:64:0x01d1], limit reached: 176 */
    /* JADX WARN: Path cross not found for [B:74:0x01f3, B:79:0x0206], limit reached: 176 */
    /* JADX WARN: Path cross not found for [B:93:0x0255, B:114:0x02c9], limit reached: 176 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0255  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00dc -> B:19:0x00e2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.GestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
