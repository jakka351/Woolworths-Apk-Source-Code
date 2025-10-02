package androidx.compose.foundation.gestures;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/AnimationData;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class AnimationData {

    /* renamed from: a, reason: collision with root package name */
    public final float f871a;
    public final long b;
    public final float c;

    public AnimationData(long j, float f, float f2) {
        this.f871a = f;
        this.b = j;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.f871a, animationData.f871a) == 0 && Offset.c(this.b, animationData.b) && Float.compare(this.c, animationData.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + b.b(Float.hashCode(this.f871a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.f871a);
        sb.append(", offset=");
        sb.append((Object) Offset.j(this.b));
        sb.append(", degrees=");
        return a.r(sb, this.c, ')');
    }
}
