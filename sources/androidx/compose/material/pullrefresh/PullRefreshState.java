package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullRefreshState {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f1383a;
    public final MutableState b;
    public final MutableFloatState g;
    public final MutableFloatState h;
    public final State c = SnapshotStateKt.d(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Float.valueOf(((SnapshotMutableFloatStateImpl) this.h.f).a() * 0.5f);
        }
    });
    public final MutableState d = SnapshotStateKt.f(Boolean.FALSE);
    public final MutableFloatState e = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableFloatState f = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutatorMutex i = new MutatorMutex();

    public PullRefreshState(CoroutineScope coroutineScope, MutableState mutableState, float f, float f2) {
        this.f1383a = coroutineScope;
        this.b = mutableState;
        this.g = PrimitiveSnapshotStateKt.a(f2);
        this.h = PrimitiveSnapshotStateKt.a(f);
    }

    public final float a() {
        return ((SnapshotMutableFloatStateImpl) this.g).a();
    }

    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.d).getD()).booleanValue();
    }
}
