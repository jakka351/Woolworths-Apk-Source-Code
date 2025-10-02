package androidx.compose.material;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DrawerDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1276a;

    static {
        new TweenSpec(256, (Easing) null, 6);
        f1276a = 16;
    }

    public static long a(Composer composer) {
        return Color.b(MaterialTheme.a(composer).d(), 0.32f);
    }
}
