package androidx.compose.foundation.contextmenu;

import android.support.v4.media.session.a;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes2.dex */
public final class ContextMenuColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f854a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ContextMenuColors(long j, long j2, long j3, long j4, long j5) {
        this.f854a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.c(this.f854a, contextMenuColors.f854a) && Color.c(this.b, contextMenuColors.b) && Color.c(this.c, contextMenuColors.c) && Color.c(this.d, contextMenuColors.d) && Color.c(this.e, contextMenuColors.e);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.e) + b.b(b.b(b.b(Long.hashCode(this.f854a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        a.A(this.f854a, ", textColor=", sb);
        a.A(this.b, ", iconColor=", sb);
        a.A(this.c, ", disabledTextColor=", sb);
        a.A(this.d, ", disabledIconColor=", sb);
        sb.append((Object) Color.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
