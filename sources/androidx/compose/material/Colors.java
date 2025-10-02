package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Colors;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Colors {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f1253a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;

    public Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.f1253a = SnapshotStateKt.e(new Color(j), SnapshotStateKt.n());
        this.b = SnapshotStateKt.e(new Color(j2), SnapshotStateKt.n());
        this.c = SnapshotStateKt.e(new Color(j3), SnapshotStateKt.n());
        this.d = SnapshotStateKt.e(new Color(j4), SnapshotStateKt.n());
        this.e = SnapshotStateKt.e(new Color(j5), SnapshotStateKt.n());
        this.f = SnapshotStateKt.e(new Color(j6), SnapshotStateKt.n());
        this.g = SnapshotStateKt.e(new Color(j7), SnapshotStateKt.n());
        this.h = SnapshotStateKt.e(new Color(j8), SnapshotStateKt.n());
        this.i = SnapshotStateKt.e(new Color(j9), SnapshotStateKt.n());
        this.j = SnapshotStateKt.e(new Color(j10), SnapshotStateKt.n());
        this.k = SnapshotStateKt.e(new Color(j11), SnapshotStateKt.n());
        this.l = SnapshotStateKt.e(new Color(j12), SnapshotStateKt.n());
        this.m = SnapshotStateKt.e(Boolean.valueOf(z), SnapshotStateKt.n());
    }

    public static Colors a(Colors colors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i) {
        long jE = (i & 1) != 0 ? colors.e() : j;
        long j12 = (i & 2) != 0 ? ((Color) ((SnapshotMutableStateImpl) colors.b).getD()).f1766a : j2;
        long jF = (i & 4) != 0 ? colors.f() : j3;
        long j13 = (i & 8) != 0 ? ((Color) ((SnapshotMutableStateImpl) colors.d).getD()).f1766a : j4;
        long jB = (i & 16) != 0 ? colors.b() : j5;
        long jG = (i & 32) != 0 ? colors.g() : j6;
        long jC = (i & 64) != 0 ? colors.c() : j7;
        long j14 = (i & 128) != 0 ? ((Color) ((SnapshotMutableStateImpl) colors.h).getD()).f1766a : j8;
        long j15 = (i & 256) != 0 ? ((Color) ((SnapshotMutableStateImpl) colors.i).getD()).f1766a : j9;
        long j16 = ((Color) ((SnapshotMutableStateImpl) colors.j).getD()).f1766a;
        long jD = (i & 1024) != 0 ? colors.d() : j10;
        long j17 = (i & 2048) != 0 ? ((Color) ((SnapshotMutableStateImpl) colors.l).getD()).f1766a : j11;
        boolean zH = colors.h();
        colors.getClass();
        return new Colors(jE, j12, jF, j13, jB, jG, jC, j14, j15, j16, jD, j17, zH);
    }

    public final long b() {
        return ((Color) ((SnapshotMutableStateImpl) this.e).getD()).f1766a;
    }

    public final long c() {
        return ((Color) ((SnapshotMutableStateImpl) this.g).getD()).f1766a;
    }

    public final long d() {
        return ((Color) ((SnapshotMutableStateImpl) this.k).getD()).f1766a;
    }

    public final long e() {
        return ((Color) ((SnapshotMutableStateImpl) this.f1253a).getD()).f1766a;
    }

    public final long f() {
        return ((Color) ((SnapshotMutableStateImpl) this.c).getD()).f1766a;
    }

    public final long g() {
        return ((Color) ((SnapshotMutableStateImpl) this.f).getD()).f1766a;
    }

    public final boolean h() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.m).getD()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) Color.i(e()));
        sb.append(", primaryVariant=");
        sb.append((Object) Color.i(((Color) ((SnapshotMutableStateImpl) this.b).getD()).f1766a));
        sb.append(", secondary=");
        sb.append((Object) Color.i(f()));
        sb.append(", secondaryVariant=");
        sb.append((Object) Color.i(((Color) ((SnapshotMutableStateImpl) this.d).getD()).f1766a));
        sb.append(", background=");
        sb.append((Object) Color.i(b()));
        sb.append(", surface=");
        sb.append((Object) Color.i(g()));
        sb.append(", error=");
        sb.append((Object) Color.i(c()));
        sb.append(", onPrimary=");
        a.A(((Color) ((SnapshotMutableStateImpl) this.h).getD()).f1766a, ", onSecondary=", sb);
        a.A(((Color) ((SnapshotMutableStateImpl) this.i).getD()).f1766a, ", onBackground=", sb);
        sb.append((Object) Color.i(((Color) ((SnapshotMutableStateImpl) this.j).getD()).f1766a));
        sb.append(", onSurface=");
        sb.append((Object) Color.i(d()));
        sb.append(", onError=");
        sb.append((Object) Color.i(((Color) ((SnapshotMutableStateImpl) this.l).getD()).f1766a));
        sb.append(", isLight=");
        sb.append(h());
        sb.append(')');
        return sb.toString();
    }
}
