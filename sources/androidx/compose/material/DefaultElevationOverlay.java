package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultElevationOverlay f1266a = new DefaultElevationOverlay();

    @Override // androidx.compose.material.ElevationOverlay
    public final long a(long j, float f, Composer composer, int i) {
        composer.o(-1687113661);
        Colors colorsA = MaterialTheme.a(composer);
        if (Float.compare(f, 0) <= 0 || colorsA.h()) {
            composer.o(1169156439);
            composer.l();
        } else {
            composer.o(1169017931);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ElevationOverlayKt.f1281a;
            j = ColorKt.g(Color.b(ColorsKt.b(j, composer), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j);
            composer.l();
        }
        composer.l();
        return j;
    }
}
