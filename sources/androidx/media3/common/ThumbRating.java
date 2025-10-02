package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ThumbRating extends Rating {
    static {
        Util.E(1);
        Util.E(2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ThumbRating;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool);
    }
}
