package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends AnimationVector> implements ComposeAnimation {
    public static final boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final ToolingState f2171a;
    public final AnimationSpec b;
    public final Animatable c;
    public final Set d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation$Companion;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            if (Intrinsics.c(composeAnimationTypeArrValues[i].name(), "ANIMATE_X_AS_STATE")) {
                z = true;
                break;
            }
            i++;
        }
        e = z;
    }

    public AnimateXAsStateComposeAnimation(Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState) {
        this.f2171a = toolingState;
        this.b = animationSpec;
        this.c = animatable;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATE_X_AS_STATE;
        Object objF = animatable.f();
        Intrinsics.f(objF, "null cannot be cast to non-null type kotlin.Any");
        Object[] enumConstants = objF.getClass().getEnumConstants();
        this.d = enumConstants != null ? ArraysKt.r0(enumConstants) : SetsKt.i(objF);
    }
}
