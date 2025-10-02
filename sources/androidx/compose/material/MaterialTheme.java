package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static Colors a(Composer composer) {
        return (Colors) composer.x(ColorsKt.f1254a);
    }

    public static Shapes b(Composer composer) {
        return (Shapes) composer.x(ShapesKt.f1322a);
    }

    public static Typography c(Composer composer) {
        return (Typography) composer.x(TypographyKt.b);
    }
}
