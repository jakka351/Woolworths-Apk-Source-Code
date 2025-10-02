package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlatformRipple extends Ripple {
    public PlatformRipple(boolean z, float f, MutableState mutableState) {
        super(z, f, mutableState);
    }

    @Override // androidx.compose.material.ripple.Ripple
    public final RippleIndicationInstance c(InteractionSource interactionSource, boolean z, float f, MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        composer.o(331259447);
        ViewGroup viewGroupB = Ripple_androidKt.b((View) composer.x(AndroidCompositionLocals_androidKt.f));
        boolean zN = ((((i & 14) ^ 6) > 4 && composer.n(interactionSource)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && composer.n(this)) || (i & 196608) == 131072) | composer.n(viewGroupB);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            Object androidRippleIndicationInstance = new AndroidRippleIndicationInstance(z, f, mutableState, mutableState2, viewGroupB);
            composer.A(androidRippleIndicationInstance);
            objG = androidRippleIndicationInstance;
        }
        AndroidRippleIndicationInstance androidRippleIndicationInstance2 = (AndroidRippleIndicationInstance) objG;
        composer.l();
        return androidRippleIndicationInstance2;
    }
}
