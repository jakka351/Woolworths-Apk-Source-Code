package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultScrollableState implements ScrollableState {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f881a;
    public final DefaultScrollableState$scrollScope$1 b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public final float f(float f) {
            if (Float.isNaN(f)) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            DefaultScrollableState defaultScrollableState = this.f882a;
            float fFloatValue = ((Number) defaultScrollableState.f881a.invoke(Float.valueOf(f))).floatValue();
            ((SnapshotMutableStateImpl) defaultScrollableState.e).setValue(Boolean.valueOf(fFloatValue > BitmapDescriptorFactory.HUE_RED));
            ((SnapshotMutableStateImpl) defaultScrollableState.f).setValue(Boolean.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED));
            return fFloatValue;
        }
    };
    public final MutatorMutex c = new MutatorMutex();
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1] */
    public DefaultScrollableState(Function1 function1) {
        this.f881a = (Lambda) function1;
        Boolean bool = Boolean.FALSE;
        this.d = SnapshotStateKt.f(bool);
        this.e = SnapshotStateKt.f(bool);
        this.f = SnapshotStateKt.f(bool);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.d).getD()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return ((Number) this.f881a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
