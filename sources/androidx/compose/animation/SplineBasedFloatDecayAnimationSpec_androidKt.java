package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f737a = ViewConfiguration.getScrollFriction();

    public static final DecayAnimationSpec a(Composer composer) {
        Density density = (Density) composer.x(CompositionLocalsKt.h);
        boolean zQ = composer.q(density.getD());
        Object objG = composer.G();
        if (zQ || objG == Composer.Companion.f1624a) {
            objG = DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(density));
            composer.A(objG);
        }
        return (DecayAnimationSpec) objG;
    }
}
