package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {304}, m = "awaitPrimaryFirstDown")
/* loaded from: classes2.dex */
final class TapGestureDetectorKt$awaitPrimaryFirstDown$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public PointerEventPass q;
    public /* synthetic */ Object r;
    public int s;

    public TapGestureDetectorKt$awaitPrimaryFirstDown$1(BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.d(null, null, this);
    }
}
