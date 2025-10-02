package au.com.woolworths.compose.utils.graphics;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/graphics/ForwardingDrawInfo;", "", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ForwardingDrawInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f4708a;
    public final float b;
    public final ColorFilter c;

    public ForwardingDrawInfo(Painter painter, float f, ColorFilter colorFilter) {
        Intrinsics.h(painter, "painter");
        this.f4708a = painter;
        this.b = f;
        this.c = colorFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingDrawInfo)) {
            return false;
        }
        ForwardingDrawInfo forwardingDrawInfo = (ForwardingDrawInfo) obj;
        return Intrinsics.c(this.f4708a, forwardingDrawInfo.f4708a) && Float.compare(this.b, forwardingDrawInfo.b) == 0 && Intrinsics.c(this.c, forwardingDrawInfo.c);
    }

    public final int hashCode() {
        int iB = a.b(this.b, this.f4708a.hashCode() * 31, 31);
        ColorFilter colorFilter = this.c;
        return iB + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "ForwardingDrawInfo(painter=" + this.f4708a + ", alpha=" + this.b + ", colorFilter=" + this.c + ")";
    }
}
