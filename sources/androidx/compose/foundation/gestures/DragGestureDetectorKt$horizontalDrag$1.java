package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1055}, m = "horizontalDrag-jO51t88")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$horizontalDrag$1 extends ContinuationImpl {
    public Function1 p;
    public AwaitPointerEventScope q;
    public Orientation r;
    public AwaitPointerEventScope s;
    public Ref.LongRef t;
    public /* synthetic */ Object u;
    public int v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.h(null, 0L, null, this);
    }
}
