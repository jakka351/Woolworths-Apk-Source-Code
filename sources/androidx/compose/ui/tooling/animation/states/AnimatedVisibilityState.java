package androidx.compose.ui.tooling.animation.states;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "Companion", "value", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class AnimatedVisibilityState implements ComposeAnimationState {

    /* renamed from: a, reason: collision with root package name */
    public final String f2187a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnimatedVisibilityState) {
            return Intrinsics.c(this.f2187a, ((AnimatedVisibilityState) obj).f2187a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2187a.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final String getF2187a() {
        return this.f2187a;
    }
}
