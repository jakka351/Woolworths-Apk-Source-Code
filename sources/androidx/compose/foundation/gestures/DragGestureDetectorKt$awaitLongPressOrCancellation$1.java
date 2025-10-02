package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {968}, m = "awaitLongPressOrCancellation-rnUCldI")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    public PointerInputChange p;
    public Ref.ObjectRef q;
    public Ref.BooleanRef r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.c(null, 0L, this);
    }
}
