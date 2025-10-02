package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.PathIterator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PathEasing implements Easing {
    @Override // androidx.compose.animation.core.Easing
    public final float a(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        new IntervalTree();
        PathIterator.ConicEvaluation[] conicEvaluationArr = PathIterator.ConicEvaluation.d;
        throw null;
    }
}
