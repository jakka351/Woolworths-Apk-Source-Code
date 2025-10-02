package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {209}, m = "consumeUntilUp")
/* loaded from: classes2.dex */
final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public /* synthetic */ Object q;
    public int r;

    public TapGestureDetectorKt$consumeUntilUp$1(BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.a(null, this);
    }
}
