package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    public final MutableState d = SnapshotStateKt.f(new FixedIntInsets());

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void F1(ModifierLocalReadScope modifierLocalReadScope) {
        ((SnapshotMutableStateImpl) this.d).setValue(a((WindowInsets) modifierLocalReadScope.u(WindowInsetsPaddingKt.f986a)));
    }

    public abstract WindowInsets a(WindowInsets windowInsets);

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.f986a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets) ((SnapshotMutableStateImpl) this.d).getD();
    }
}
