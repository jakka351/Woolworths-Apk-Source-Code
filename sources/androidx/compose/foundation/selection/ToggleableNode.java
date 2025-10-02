package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.compose.ToggleableComposeCallback_1_7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableNode;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToggleableNode extends ClickableNode {
    public boolean K;
    public ToggleableComposeCallback_1_7 L;
    public final Function0 M;

    public ToggleableNode(final boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, final ToggleableComposeCallback_1_7 toggleableComposeCallback_1_7) {
        super(mutableInteractionSource, indicationNodeFactory, z2, null, role, new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                toggleableComposeCallback_1_7.invoke(Boolean.valueOf(!z));
                return Unit.f24250a;
            }
        });
        this.K = z;
        this.L = toggleableComposeCallback_1_7;
        this.M = new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.L.invoke(Boolean.valueOf(!r0.K));
                return Unit.f24250a;
            }
        };
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void v2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToggleableState toggleableStateA = ToggleableStateKt.a(this.K);
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.H;
        KProperty kProperty = SemanticsPropertiesKt.f2022a[23];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, toggleableStateA);
    }
}
