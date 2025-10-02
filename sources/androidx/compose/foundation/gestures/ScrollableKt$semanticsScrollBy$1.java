package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1023}, m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes2.dex */
final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    public ScrollingLogic p;
    public Ref.FloatRef q;
    public /* synthetic */ Object r;
    public int s;

    public ScrollableKt$semanticsScrollBy$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return ScrollableKt.a(null, 0L, this);
    }
}
