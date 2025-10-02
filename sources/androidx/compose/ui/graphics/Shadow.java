package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Shadow {
    public static final Shadow d = new Shadow();

    /* renamed from: a, reason: collision with root package name */
    public final long f1782a;
    public final long b;
    public final float c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public Shadow(long j, float f, long j2) {
        this.f1782a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.c(this.f1782a, shadow.f1782a) && Offset.c(this.b, shadow.b) && this.c == shadow.c;
    }

    public final int hashCode() {
        int i = Color.l;
        return Float.hashCode(this.c) + androidx.camera.core.impl.b.b(Long.hashCode(this.f1782a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        android.support.v4.media.session.a.A(this.f1782a, ", offset=", sb);
        sb.append((Object) Offset.j(this.b));
        sb.append(", blurRadius=");
        return android.support.v4.media.session.a.r(sb, this.c, ')');
    }

    public /* synthetic */ Shadow() {
        this(ColorKt.d(4278190080L), BitmapDescriptorFactory.HUE_RED, 0L);
    }
}
