package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ScrollState implements ScrollableState {
    public static final SaverKt$Saver$1 i;

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntState f848a;
    public float e;
    public final MutableIntState b = SnapshotIntStateKt.a(0);
    public final MutableInteractionSource c = InteractionSourceKt.a();
    public final MutableIntState d = SnapshotIntStateKt.a(Integer.MAX_VALUE);
    public final ScrollableState f = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float fFloatValue = ((Number) obj).floatValue();
            ScrollState scrollState = this.h;
            MutableIntState mutableIntState = scrollState.f848a;
            float fD = ((SnapshotMutableIntStateImpl) mutableIntState).d() + fFloatValue + scrollState.e;
            float fB = RangesKt.b(fD, BitmapDescriptorFactory.HUE_RED, ((SnapshotMutableIntStateImpl) scrollState.d).d());
            boolean z = fD == fB;
            float fD2 = fB - r4.d();
            int iRound = Math.round(fD2);
            ((SnapshotMutableIntStateImpl) mutableIntState).i(((SnapshotMutableIntStateImpl) mutableIntState).d() + iRound);
            scrollState.e = fD2 - iRound;
            if (!z) {
                fFloatValue = fD2;
            }
            return Float.valueOf(fFloatValue);
        }
    });
    public final State g = SnapshotStateKt.d(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ScrollState scrollState = this.h;
            return Boolean.valueOf(((SnapshotMutableIntStateImpl) scrollState.f848a).d() < ((SnapshotMutableIntStateImpl) scrollState.d).d());
        }
    });
    public final State h = SnapshotStateKt.d(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(((SnapshotMutableIntStateImpl) this.h.f848a).d() > 0);
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        i = new SaverKt$Saver$1(ScrollState$Companion$Saver$2.h, ScrollState$Companion$Saver$1.h);
    }

    public ScrollState(int i2) {
        this.f848a = SnapshotIntStateKt.a(i2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return ((Boolean) this.g.getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.f.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.h.getD()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objE = this.f.e(mutatePriority, function2, continuation);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    public final Object f(int i2, AnimationSpec animationSpec, SuspendLambda suspendLambda) {
        Object objA = ScrollExtensionsKt.a(this, i2 - ((SnapshotMutableIntStateImpl) this.f848a).d(), animationSpec, suspendLambda);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
