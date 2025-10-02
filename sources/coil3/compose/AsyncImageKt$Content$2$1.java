package coil3.compose;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AsyncImageKt$Content$2$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AsyncImageKt$Content$2$1 f13056a = new AsyncImageKt$Content$2$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        return measureScope.L0(Constraints.j(j), Constraints.i(j), EmptyMap.d, new au.com.woolworths.android.onesite.analytics.a11y.a(15));
    }
}
