package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public final boolean d;
    public final StateLayer e;

    public RippleIndicationInstance(boolean z, final MutableState mutableState) {
        this.d = z;
        this.e = new StateLayer(z, new Function0<RippleAlpha>() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$stateLayer$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (RippleAlpha) mutableState.getD();
            }
        });
    }

    public abstract void b(PressInteraction.Press press, CoroutineScope coroutineScope);

    public abstract void d(PressInteraction.Press press);
}
