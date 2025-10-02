package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class BiasAlignment implements Alignment {

    /* renamed from: a, reason: collision with root package name */
    public final float f1722a;
    public final float b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Horizontal implements Alignment.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final float f1723a;

        public Horizontal(float f) {
            this.f1723a = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int a(int i, int i2, LayoutDirection layoutDirection) {
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.d;
            float f2 = this.f1723a;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1;
            }
            return Math.round((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f1723a, ((Horizontal) obj).f1723a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f1723a);
        }

        public final String toString() {
            return android.support.v4.media.session.a.r(new StringBuilder("Horizontal(bias="), this.f1723a, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Vertical implements Alignment.Vertical {

        /* renamed from: a, reason: collision with root package name */
        public final float f1724a;

        public Vertical(float f) {
            this.f1724a = f;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public final int a(int i, int i2) {
            return Math.round((1 + this.f1724a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.f1724a, ((Vertical) obj).f1724a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f1724a);
        }

        public final String toString() {
            return android.support.v4.media.session.a.r(new StringBuilder("Vertical(bias="), this.f1724a, ')');
        }
    }

    public BiasAlignment(float f, float f2) {
        this.f1722a = f;
        this.b = f2;
    }

    @Override // androidx.compose.ui.Alignment
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.d;
        float f3 = this.f1722a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.b) * f2;
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.f1722a, biasAlignment.f1722a) == 0 && Float.compare(this.b, biasAlignment.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f1722a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f1722a);
        sb.append(", verticalBias=");
        return android.support.v4.media.session.a.r(sb, this.b, ')');
    }
}
