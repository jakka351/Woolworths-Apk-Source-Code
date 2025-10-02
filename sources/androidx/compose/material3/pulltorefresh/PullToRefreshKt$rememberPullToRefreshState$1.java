package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PullToRefreshKt$rememberPullToRefreshState$1 extends Lambda implements Function0<PullToRefreshStateImpl> {
    public static final PullToRefreshKt$rememberPullToRefreshState$1 h = new PullToRefreshKt$rememberPullToRefreshState$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(BitmapDescriptorFactory.HUE_RED), VectorConvertersKt.f788a, (Object) null, 12));
    }
}
