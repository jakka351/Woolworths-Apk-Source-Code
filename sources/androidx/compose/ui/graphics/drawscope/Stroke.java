package androidx.compose.ui.graphics.drawscope;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {

    /* renamed from: a, reason: collision with root package name */
    public final float f1803a;
    public final float b;
    public final int c;
    public final int d;
    public final PathEffect e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public Stroke(float f, float f2, int i, int i2, AndroidPathEffect androidPathEffect, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        androidPathEffect = (i3 & 16) != 0 ? null : androidPathEffect;
        this.f1803a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = androidPathEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.f1803a == stroke.f1803a && this.b == stroke.b && this.c == stroke.c && this.d == stroke.d && Intrinsics.c(this.e, stroke.e);
    }

    public final int hashCode() {
        int iA = b.a(this.d, b.a(this.c, a.b(this.b, Float.hashCode(this.f1803a) * 31, 31), 31), 31);
        PathEffect pathEffect = this.e;
        return iA + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f1803a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
