package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/ConsumedInsetsModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ConsumedInsetsModifier implements ModifierLocalConsumer {
    public final Function1 d;
    public WindowInsets e;

    public ConsumedInsetsModifier(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void F1(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.u(WindowInsetsPaddingKt.f986a);
        if (Intrinsics.c(windowInsets, this.e)) {
            return;
        }
        this.e = windowInsets;
        this.d.invoke(windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifier) && ((ConsumedInsetsModifier) obj).d == this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
