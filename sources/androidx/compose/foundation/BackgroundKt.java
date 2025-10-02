package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BackgroundKt {
    public static Modifier a(Modifier modifier, Brush brush) {
        return modifier.x0(new BackgroundElement(0L, brush, RectangleShapeKt.f1779a, InspectableValueKt.a(), 1));
    }

    public static final Modifier b(Modifier modifier, long j, Shape shape) {
        return modifier.x0(new BackgroundElement(j, null, shape, InspectableValueKt.a(), 2));
    }
}
