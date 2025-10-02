package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/CommonRipple;", "Landroidx/compose/material/ripple/Ripple;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CommonRipple extends Ripple {
    @Override // androidx.compose.material.ripple.Ripple
    public final RippleIndicationInstance c(InteractionSource interactionSource, boolean z, float f, MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        composer.o(-1768051227);
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.n(interactionSource)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && composer.n(this)) || (i & 196608) == 131072);
        Object objG = composer.G();
        if (z2 || objG == Composer.Companion.f1624a) {
            objG = new CommonRippleIndicationInstance(z, f, mutableState, mutableState2);
            composer.A(objG);
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objG;
        composer.l();
        return commonRippleIndicationInstance;
    }
}
