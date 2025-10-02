package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {179}, m = "consumeUntilUp")
/* loaded from: classes8.dex */
final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.a(null, this);
    }
}
