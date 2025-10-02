package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {720}, m = "restartable")
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    public AnchoredDraggableKt$restartable$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.b(null, null, this);
    }
}
