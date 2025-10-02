package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl$Companion$Saver$2 extends Lambda implements Function1<Float, PullToRefreshStateImpl> {
    public static final PullToRefreshStateImpl$Companion$Saver$2 h = new PullToRefreshStateImpl$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(((Number) obj).floatValue()), VectorConvertersKt.f788a, (Object) null, 12));
    }
}
