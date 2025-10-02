package androidx.compose.material3.carousel;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselState implements ScrollableState {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f1537a;
    public final PagerState b;

    @ExperimentalMaterial3Api
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ListSaverKt.a(CarouselState$Companion$Saver$2.h, CarouselState$Companion$Saver$1.h);
    }

    public CarouselState(int i, float f, Function0 function0) {
        MutableState mutableStateF = SnapshotStateKt.f(function0);
        this.f1537a = mutableStateF;
        this.b = PagerStateKt.a(i, f, (Function0) ((SnapshotMutableStateImpl) mutableStateF).getD());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.b.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.b.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        PagerState pagerState = this.b;
        pagerState.getClass();
        Object objS = PagerState.s(pagerState, mutatePriority, function2, continuation);
        return objS == CoroutineSingletons.d ? objS : Unit.f24250a;
    }
}
