package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public class Interval<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return android.support.v4.media.session.a.b(Float.MIN_VALUE, Float.hashCode(Float.MAX_VALUE) * 31, 31);
    }

    public final String toString() {
        return "Interval(start=3.4028235E38, end=1.4E-45, data=null)";
    }
}
