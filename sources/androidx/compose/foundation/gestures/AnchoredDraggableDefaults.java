package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnchoredDraggableDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final TweenSpec f864a = AnimationSpecKt.e(0, 0, null, 7);
    public static final Function1 b = AnchoredDraggableDefaults$PositionalThreshold$1.h;
    public static final DecayAnimationSpec c = DecayAnimationSpecKt.b(3);
}
