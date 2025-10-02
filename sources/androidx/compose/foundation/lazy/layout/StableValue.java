package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00028\u0000¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
final class StableValue<T> {
    public final boolean equals(Object obj) {
        return (obj instanceof StableValue) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "StableValue(value=null)";
    }
}
