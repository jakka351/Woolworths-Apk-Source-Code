package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UnsupportedComposeAnimation implements ComposeAnimation {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2181a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation$Companion;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Intrinsics.c(composeAnimationTypeArrValues[i].name(), "UNSUPPORTED")) {
                z = true;
                break;
            }
            i++;
        }
        f2181a = z;
    }

    public UnsupportedComposeAnimation() {
        ComposeAnimationType composeAnimationType = ComposeAnimationType.UNSUPPORTED;
    }
}
