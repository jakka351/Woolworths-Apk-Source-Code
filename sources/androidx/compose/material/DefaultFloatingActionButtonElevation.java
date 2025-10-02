package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f1267a;
    public final float b;
    public final float c;
    public final float d;

    public DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.f1267a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    public final AnimationState a(MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        composer.o(-478475335);
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && composer.n(mutableInteractionSource)) || (i & 6) == 4;
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (z || objG == obj) {
            objG = new FloatingActionButtonElevationAnimatable(this.f1267a, this.b, this.c, this.d);
            composer.A(objG);
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) objG;
        boolean zI = composer.I(floatingActionButtonElevationAnimatable) | ((((i & 112) ^ 48) > 32 && composer.n(this)) || (i & 48) == 32);
        Object objG2 = composer.G();
        if (zI || objG2 == obj) {
            objG2 = new DefaultFloatingActionButtonElevation$elevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.A(objG2);
        }
        EffectsKt.e(composer, this, (Function2) objG2);
        boolean zI2 = composer.I(floatingActionButtonElevationAnimatable) | ((i2 > 4 && composer.n(mutableInteractionSource)) || (i & 6) == 4);
        Object objG3 = composer.G();
        if (zI2 || objG3 == obj) {
            objG3 = new DefaultFloatingActionButtonElevation$elevation$2$1(mutableInteractionSource, floatingActionButtonElevationAnimatable, null);
            composer.A(objG3);
        }
        EffectsKt.e(composer, mutableInteractionSource, (Function2) objG3);
        AnimationState animationState = floatingActionButtonElevationAnimatable.e.c;
        composer.l();
        return animationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
        if (Dp.a(this.f1267a, defaultFloatingActionButtonElevation.f1267a) && Dp.a(this.b, defaultFloatingActionButtonElevation.b) && Dp.a(this.c, defaultFloatingActionButtonElevation.c)) {
            return Dp.a(this.d, defaultFloatingActionButtonElevation.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.f1267a) * 31, 31), 31);
    }
}
