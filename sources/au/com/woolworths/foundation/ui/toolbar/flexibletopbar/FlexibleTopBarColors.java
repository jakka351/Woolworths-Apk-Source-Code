package au.com.woolworths.foundation.ui.toolbar.flexibletopbar;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/toolbar/flexibletopbar/FlexibleTopBarColors;", "", "toolbar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlexibleTopBarColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8933a;
    public final long b;

    public FlexibleTopBarColors(long j, long j2) {
        this.f8933a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FlexibleTopBarColors)) {
            return false;
        }
        FlexibleTopBarColors flexibleTopBarColors = (FlexibleTopBarColors) obj;
        return Color.c(this.f8933a, flexibleTopBarColors.f8933a) && Color.c(this.b, flexibleTopBarColors.b);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.f8933a) * 31);
    }
}
