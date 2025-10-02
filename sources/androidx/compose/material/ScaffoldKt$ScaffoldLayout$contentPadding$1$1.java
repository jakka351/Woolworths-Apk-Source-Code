package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/ScaffoldKt$ScaffoldLayout$contentPadding$1$1", "Landroidx/compose/foundation/layout/PaddingValues;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f1318a;

    public ScaffoldKt$ScaffoldLayout$contentPadding$1$1() {
        float f = 0;
        this.f1318a = SnapshotStateKt.f(new PaddingValuesImpl(f, f, f, f));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: a */
    public final float getD() {
        return ((PaddingValues) ((SnapshotMutableStateImpl) this.f1318a).getD()).getD();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        return ((PaddingValues) ((SnapshotMutableStateImpl) this.f1318a).getD()).b(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        return ((PaddingValues) ((SnapshotMutableStateImpl) this.f1318a).getD()).c(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: d */
    public final float getB() {
        return ((PaddingValues) ((SnapshotMutableStateImpl) this.f1318a).getD()).getB();
    }
}
