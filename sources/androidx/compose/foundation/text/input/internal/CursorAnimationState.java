package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CursorAnimationState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1157a;
    public final AtomicReference b = new AtomicReference(null);
    public final MutableFloatState c = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);

    public CursorAnimationState(boolean z) {
        this.f1157a = z;
    }

    public final Object a(SuspendLambda suspendLambda) {
        Object objC = CoroutineScopeKt.c(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), suspendLambda);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
