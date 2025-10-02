package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlurEffect extends RenderEffect {
    public final float b;
    public final float c;
    public final int d;

    public BlurEffect(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect b() {
        float f = this.b;
        float f2 = this.c;
        return (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) ? android.graphics.RenderEffect.createOffsetEffect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : android.graphics.RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.a(this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.b == blurEffect.b && this.c == blurEffect.c && this.d == blurEffect.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + android.support.v4.media.session.a.b(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) TileMode.a(this.d)) + ')';
    }
}
