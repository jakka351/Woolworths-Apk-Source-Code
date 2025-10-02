package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class InsetsPaddingValues implements PaddingValues {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f966a;
    public final Density b;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.f966a = windowInsets;
        this.b = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: a */
    public final float getD() {
        WindowInsets windowInsets = this.f966a;
        Density density = this.b;
        return density.B(windowInsets.c(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f966a;
        Density density = this.b;
        return density.B(windowInsets.d(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f966a;
        Density density = this.b;
        return density.B(windowInsets.b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: d */
    public final float getB() {
        WindowInsets windowInsets = this.f966a;
        Density density = this.b;
        return density.B(windowInsets.a(density));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return Intrinsics.c(this.f966a, insetsPaddingValues.f966a) && Intrinsics.c(this.b, insetsPaddingValues.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f966a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f966a + ", density=" + this.b + ')';
    }
}
