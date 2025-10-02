package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchDefaults {
    public static SwitchColors a(long j, Composer composer, int i) {
        long j2 = (i & 1) != 0 ? ((Color) ((SnapshotMutableStateImpl) MaterialTheme.a(composer).d).getD()).f1766a : j;
        long jG = MaterialTheme.a(composer).g();
        long jD = MaterialTheme.a(composer).d();
        float f = (i & 32) != 0 ? 0.38f : 0.26f;
        return new DefaultSwitchColors(j2, Color.b(j2, 0.54f), jG, Color.b(jD, f), ColorKt.g(Color.b(j2, ContentAlpha.a(0.38f, 0.38f, composer)), MaterialTheme.a(composer).g()), Color.b(ColorKt.g(Color.b(j2, ContentAlpha.a(0.38f, 0.38f, composer)), MaterialTheme.a(composer).g()), 0.54f), ColorKt.g(Color.b(jG, ContentAlpha.a(0.38f, 0.38f, composer)), MaterialTheme.a(composer).g()), Color.b(ColorKt.g(Color.b(jD, ContentAlpha.a(0.38f, 0.38f, composer)), MaterialTheme.a(composer).g()), f));
    }
}
