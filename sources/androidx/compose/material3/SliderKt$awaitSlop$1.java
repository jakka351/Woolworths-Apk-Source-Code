package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {1426}, m = "awaitSlop-8vUncbI")
/* loaded from: classes2.dex */
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    public Ref.FloatRef p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return SliderKt.d(null, 0L, 0, this);
    }
}
