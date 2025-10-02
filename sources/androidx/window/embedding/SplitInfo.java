package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplitInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SplitInfo) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && BitmapDescriptorFactory.HUE_RED == BitmapDescriptorFactory.HUE_RED;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + ((Object) null) + ',');
        sb.append("secondaryActivityStack=" + ((Object) null) + ',');
        sb.append("splitRatio=" + BitmapDescriptorFactory.HUE_RED + '}');
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
