package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimationModifierKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f716a;

    static {
        long j = Integer.MIN_VALUE;
        f716a = (j & 4294967295L) | (j << 32);
    }

    public static final Modifier a(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function2 function2) {
        return ClipKt.b(modifier).x0(new SizeAnimationModifierElement(finiteAnimationSpec, function2));
    }

    public static final boolean c(long j) {
        return !IntSize.b(j, f716a);
    }
}
