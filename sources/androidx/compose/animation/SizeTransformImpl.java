package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SizeTransformImpl implements SizeTransform {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f734a;

    public SizeTransformImpl(Function2 function2) {
        this.f734a = function2;
    }

    @Override // androidx.compose.animation.SizeTransform
    public final boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.SizeTransform
    public final FiniteAnimationSpec b(long j, long j2) {
        return (FiniteAnimationSpec) this.f734a.invoke(new IntSize(j), new IntSize(j2));
    }
}
