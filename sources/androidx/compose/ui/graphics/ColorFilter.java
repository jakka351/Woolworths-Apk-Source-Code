package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class ColorFilter {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.ColorFilter f1767a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static BlendModeColorFilter a(long j) {
            return new BlendModeColorFilter(j, 5);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f1767a = colorFilter;
    }
}
