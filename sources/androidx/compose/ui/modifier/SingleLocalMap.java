package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SingleLocalMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public final ModifierLocal f1901a;
    public final MutableState b = SnapshotStateKt.f(null);

    public SingleLocalMap(ModifierLocal modifierLocal) {
        this.f1901a = modifierLocal;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f1901a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ModifierLocal modifierLocal) {
        if (!(modifierLocal == this.f1901a)) {
            InlineClassHelperKt.b("Check failed.");
        }
        Object d = ((SnapshotMutableStateImpl) this.b).getD();
        if (d == null) {
            return null;
        }
        return d;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final void c(ModifierLocal modifierLocal, Object obj) {
        if (!(modifierLocal == this.f1901a)) {
            InlineClassHelperKt.b("Check failed.");
        }
        ((SnapshotMutableStateImpl) this.b).setValue(obj);
    }
}
