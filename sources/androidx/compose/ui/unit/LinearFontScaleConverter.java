package androidx.compose.ui.unit;

import android.support.v4.media.session.a;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/LinearFontScaleConverter;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LinearFontScaleConverter implements FontScaleConverter {

    /* renamed from: a, reason: collision with root package name */
    public final float f2203a;

    public LinearFontScaleConverter(float f) {
        this.f2203a = f;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float a(float f) {
        return f / this.f2203a;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float b(float f) {
        return f * this.f2203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.f2203a, ((LinearFontScaleConverter) obj).f2203a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2203a);
    }

    public final String toString() {
        return a.r(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f2203a, ')');
    }
}
