package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final SaverKt$Saver$1 b;

    /* renamed from: a, reason: collision with root package name */
    public final Animatable f1568a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        b = new SaverKt$Saver$1(PullToRefreshStateImpl$Companion$Saver$2.h, PullToRefreshStateImpl$Companion$Saver$1.h);
    }

    public PullToRefreshStateImpl(Animatable animatable) {
        this.f1568a = animatable;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float a() {
        return ((Number) this.f1568a.f()).floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object b(Continuation continuation) {
        Object objD = Animatable.d(this.f1568a, new Float(BitmapDescriptorFactory.HUE_RED), null, null, null, continuation, 14);
        return objD == CoroutineSingletons.d ? objD : Unit.f24250a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object c(float f, SuspendLambda suspendLambda) {
        Object objH = this.f1568a.h(new Float(f), suspendLambda);
        return objH == CoroutineSingletons.d ? objH : Unit.f24250a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final boolean d() {
        return this.f1568a.g();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final Object e(Continuation continuation) {
        Object objD = Animatable.d(this.f1568a, new Float(1.0f), null, null, null, continuation, 14);
        return objD == CoroutineSingletons.d ? objD : Unit.f24250a;
    }
}
