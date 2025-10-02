package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardKt {
    public static final void a(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            shape = MaterialTheme.b(composer).b;
        }
        Shape shape2 = shape;
        long jG = (i2 & 4) != 0 ? MaterialTheme.a(composer).g() : j;
        SurfaceKt.a(modifier, shape2, jG, (i2 & 8) != 0 ? ColorsKt.b(jG, composer) : j2, (i2 & 16) != 0 ? null : borderStroke, f, composableLambdaImpl, composer, i & 4194302, 0);
    }
}
