package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@LayoutScopeMarker
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "CustomProperties", "MotionProperties", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MotionLayoutScope {

    /* renamed from: a, reason: collision with root package name */
    public final MutableFloatState f2251a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public final class CustomProperties {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public final class MotionProperties {
    }

    public MotionLayoutScope(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.f2251a = mutableFloatState;
    }
}
