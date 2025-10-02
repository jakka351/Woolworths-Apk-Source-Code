package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public ModifierLocalProvider f1897a;

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f1897a.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ModifierLocal modifierLocal) {
        if (modifierLocal != this.f1897a.getKey()) {
            InlineClassHelperKt.b("Check failed.");
        }
        return this.f1897a.getValue();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final void c(ModifierLocal modifierLocal, Object obj) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }
}
