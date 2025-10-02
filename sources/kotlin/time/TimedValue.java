package kotlin.time;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental
/* loaded from: classes7.dex */
public final /* data */ class TimedValue<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        int i = Duration.g;
        return true;
    }

    public final int hashCode() {
        int i = Duration.g;
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "TimedValue(value=null, duration=" + ((Object) Duration.n(0L)) + ')';
    }
}
