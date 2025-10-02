package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/RippleConfiguration;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RippleConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final long f1314a;

    public RippleConfiguration(long j, int i) {
        this.f1314a = (i & 1) != 0 ? Color.k : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RippleConfiguration) {
            return Color.c(this.f1314a, ((RippleConfiguration) obj).f1314a);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.f1314a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.i(this.f1314a)) + ", rippleAlpha=null)";
    }
}
