package androidx.compose.ui.text;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/BulletSpanWithLevel;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BulletSpanWithLevel {

    /* renamed from: a, reason: collision with root package name */
    public final Bullet f2038a;
    public final int b;
    public final int c;

    public BulletSpanWithLevel(Bullet bullet, int i, int i2) {
        this.f2038a = bullet;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return Intrinsics.c(this.f2038a, bulletSpanWithLevel.f2038a) && this.b == bulletSpanWithLevel.b && this.c == bulletSpanWithLevel.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.a(this.b, this.f2038a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.f2038a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return a.l(sb, this.c, ')');
    }
}
