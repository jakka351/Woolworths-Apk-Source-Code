package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment;", "Landroidx/compose/ui/Alignment;", "Horizontal", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class BiasAbsoluteAlignment implements Alignment {

    /* renamed from: a, reason: collision with root package name */
    public final float f1720a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Horizontal implements Alignment.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final float f1721a;

        public Horizontal(float f) {
            this.f1721a = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int a(int i, int i2, LayoutDirection layoutDirection) {
            return Math.round((1 + this.f1721a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f1721a, ((Horizontal) obj).f1721a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f1721a);
        }

        public final String toString() {
            return android.support.v4.media.session.a.r(new StringBuilder("Horizontal(bias="), this.f1721a, ')');
        }
    }

    public BiasAbsoluteAlignment(float f) {
        this.f1720a = f;
    }

    @Override // androidx.compose.ui.Alignment
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1;
        float f2 = (this.f1720a + f) * (((int) (j3 >> 32)) / 2.0f);
        float f3 = (f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f3) & 4294967295L) | (Math.round(f2) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BiasAbsoluteAlignment) && Float.compare(this.f1720a, ((BiasAbsoluteAlignment) obj).f1720a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f1720a) * 31);
    }

    public final String toString() {
        return android.support.v4.media.session.a.j(this.f1720a, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
