package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1061, 1101}, m = "awaitTouchSlopOrCancellation-jO51t88")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {
    public Function2 p;
    public AwaitPointerEventScope q;
    public Ref.LongRef r;
    public TouchSlopDetector s;
    public PointerInputChange t;
    public float u;
    public /* synthetic */ Object v;
    public int w;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.d(null, 0L, null, this);
    }
}
