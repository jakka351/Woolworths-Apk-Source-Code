package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptyMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyMap f1898a = new EmptyMap();

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ModifierLocal modifierLocal) {
        throw new IllegalStateException("");
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final void c(ModifierLocal modifierLocal, Object obj) {
        throw new IllegalStateException("");
    }
}
