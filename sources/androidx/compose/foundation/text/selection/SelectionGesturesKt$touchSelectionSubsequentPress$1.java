package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {281, 322}, m = "touchSelectionSubsequentPress")
/* loaded from: classes2.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public TextDragObserver q;
    public PointerInputChange r;
    public Ref.LongRef s;
    public long t;
    public /* synthetic */ Object u;
    public int v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return SelectionGesturesKt.f(null, null, null, this);
    }
}
