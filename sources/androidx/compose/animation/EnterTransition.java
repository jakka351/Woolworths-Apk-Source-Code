package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "Companion", "Landroidx/compose/animation/EnterTransitionImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EnterTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final EnterTransition f722a = new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 63));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    /* renamed from: a */
    public abstract TransitionData getB();

    public final EnterTransition b(EnterTransition enterTransition) {
        Fade fade = enterTransition.getB().f738a;
        if (fade == null) {
            fade = getB().f738a;
        }
        Slide slide = enterTransition.getB().b;
        if (slide == null) {
            slide = getB().b;
        }
        ChangeSize changeSize = enterTransition.getB().c;
        if (changeSize == null) {
            changeSize = getB().c;
        }
        Scale scale = enterTransition.getB().d;
        if (scale == null) {
            scale = getB().d;
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, MapsKt.m(getB().f, enterTransition.getB().f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && Intrinsics.c(((EnterTransition) obj).getB(), getB());
    }

    public final int hashCode() {
        return getB().hashCode();
    }

    public final String toString() {
        if (equals(f722a)) {
            return "EnterTransition.None";
        }
        TransitionData b = getB();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        Fade fade = b.f738a;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = b.b;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = b.c;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = b.d;
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }
}
