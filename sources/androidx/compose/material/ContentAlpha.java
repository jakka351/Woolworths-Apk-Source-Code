package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static float a(float f, float f2, Composer composer) {
        long j = ((Color) composer.x(ContentColorKt.f1261a)).f1766a;
        return (!MaterialTheme.a(composer).h() ? ((double) ColorKt.i(j)) < 0.5d : ((double) ColorKt.i(j)) > 0.5d) ? f2 : f;
    }

    public static float b(Composer composer) {
        return a(1.0f, 0.87f, composer);
    }

    public static float c(Composer composer, int i) {
        return a(0.74f, 0.6f, composer);
    }
}
