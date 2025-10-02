package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {851}, m = "awaitAllPointersUpWithSlopDetection")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public PointerEventPass q;
    public Ref.LongRef r;
    public TouchSlopDetector s;
    public int t;
    public float u;
    public /* synthetic */ Object v;
    public int w;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.a(null, null, null, this);
    }
}
