package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class Ripple implements Indication {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1385a;
    public final float b;
    public final MutableState c;

    public Ripple(boolean z, float f, MutableState mutableState) {
        this.f1385a = z;
        this.b = f;
        this.c = mutableState;
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance b(InteractionSource interactionSource, Composer composer) {
        long jA;
        composer.o(988743187);
        RippleTheme rippleTheme = (RippleTheme) composer.x(RippleThemeKt.f1391a);
        MutableState mutableState = this.c;
        if (((Color) mutableState.getD()).f1766a != 16) {
            composer.o(-303557454);
            composer.l();
            jA = ((Color) mutableState.getD()).f1766a;
        } else {
            composer.o(-303499670);
            jA = rippleTheme.a(composer);
            composer.l();
        }
        MutableState mutableStateL = SnapshotStateKt.l(new Color(jA), composer);
        MutableState mutableStateL2 = SnapshotStateKt.l(rippleTheme.b(composer), composer);
        RippleIndicationInstance rippleIndicationInstanceC = c(interactionSource, this.f1385a, this.b, mutableStateL, mutableStateL2, composer, 0);
        boolean zN = composer.n(interactionSource) | composer.I(rippleIndicationInstanceC);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Ripple$rememberUpdatedInstance$1$1(interactionSource, rippleIndicationInstanceC, null);
            composer.A(objG);
        }
        EffectsKt.f(rippleIndicationInstanceC, interactionSource, (Function2) objG, composer);
        composer.l();
        return rippleIndicationInstanceC;
    }

    public abstract RippleIndicationInstance c(InteractionSource interactionSource, boolean z, float f, MutableState mutableState, MutableState mutableState2, Composer composer, int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.f1385a == ripple.f1385a && Dp.a(this.b, ripple.b) && this.c.equals(ripple.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + android.support.v4.media.session.a.b(this.b, Boolean.hashCode(this.f1385a) * 31, 31);
    }
}
