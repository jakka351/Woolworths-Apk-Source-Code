package au.com.woolworths.design.wx.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/wx/foundation/ColorScheme;", "", "design-wx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorScheme {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f5154a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;

    public ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f5154a = SnapshotStateKt.e(new Color(j), SnapshotStateKt.n());
        this.b = SnapshotStateKt.e(new Color(j2), SnapshotStateKt.n());
        this.c = SnapshotStateKt.e(new Color(j3), SnapshotStateKt.n());
        this.d = SnapshotStateKt.e(new Color(j4), SnapshotStateKt.n());
        this.e = SnapshotStateKt.e(new Color(j5), SnapshotStateKt.n());
        this.f = SnapshotStateKt.e(new Color(j6), SnapshotStateKt.n());
        this.g = SnapshotStateKt.e(new Color(j7), SnapshotStateKt.n());
        this.h = SnapshotStateKt.e(new Color(j8), SnapshotStateKt.n());
        this.i = SnapshotStateKt.e(new Color(j9), SnapshotStateKt.n());
        this.j = SnapshotStateKt.e(new Color(j10), SnapshotStateKt.n());
    }

    public final long a() {
        return ((Color) ((SnapshotMutableStateImpl) this.c).getD()).f1766a;
    }

    public final long b() {
        return ((Color) ((SnapshotMutableStateImpl) this.d).getD()).f1766a;
    }

    public final long c() {
        return ((Color) ((SnapshotMutableStateImpl) this.f).getD()).f1766a;
    }

    public final long d() {
        return ((Color) ((SnapshotMutableStateImpl) this.h).getD()).f1766a;
    }

    public final long e() {
        return ((Color) ((SnapshotMutableStateImpl) this.i).getD()).f1766a;
    }

    public final long f() {
        return ((Color) ((SnapshotMutableStateImpl) this.g).getD()).f1766a;
    }

    public final long g() {
        return ((Color) ((SnapshotMutableStateImpl) this.j).getD()).f1766a;
    }

    public final long h() {
        return ((Color) ((SnapshotMutableStateImpl) this.f5154a).getD()).f1766a;
    }

    public final long i() {
        return ((Color) ((SnapshotMutableStateImpl) this.b).getD()).f1766a;
    }

    public final String toString() {
        String strI = Color.i(h());
        String strI2 = Color.i(i());
        String strI3 = Color.i(a());
        String strI4 = Color.i(b());
        String strI5 = Color.i(((Color) ((SnapshotMutableStateImpl) this.e).getD()).f1766a);
        String strI6 = Color.i(c());
        String strI7 = Color.i(f());
        String strI8 = Color.i(d());
        String strI9 = Color.i(e());
        String strI10 = Color.i(g());
        StringBuilder sbV = YU.a.v("ColorScheme(primary=", strI, "primaryDark=", strI2, "background=");
        androidx.constraintlayout.core.state.a.B(sbV, strI3, "backgroundSecondary=", strI4, "linkText=");
        androidx.constraintlayout.core.state.a.B(sbV, strI5, "content=", strI6, "contentSecondary=");
        androidx.constraintlayout.core.state.a.B(sbV, strI7, "contentDisabled=", strI8, "contentInverse=");
        return androidx.constraintlayout.core.state.a.l(sbV, strI9, "error=", strI10, ")");
    }
}
