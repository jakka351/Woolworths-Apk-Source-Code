package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IntervalList<T> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Interval<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f1033a;
        public final int b;
        public final LazyLayoutIntervalContent.Interval c;

        public Interval(int i, int i2, LazyLayoutIntervalContent.Interval interval) {
            this.f1033a = i;
            this.b = i2;
            this.c = interval;
            if (i < 0) {
                InlineClassHelperKt.a("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            InlineClassHelperKt.a("size should be > 0");
        }
    }
}
