package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ExitTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final ExitTransition f723a;
    public static final ExitTransition b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LinkedHashMap linkedHashMap = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        f723a = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, linkedHashMap, 63));
        b = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, linkedHashMap, 47));
    }

    /* renamed from: a */
    public abstract TransitionData getC();

    public final ExitTransition b(ExitTransition exitTransition) {
        Fade fade = exitTransition.getC().f738a;
        if (fade == null) {
            fade = getC().f738a;
        }
        Slide slide = exitTransition.getC().b;
        if (slide == null) {
            slide = getC().b;
        }
        ChangeSize changeSize = exitTransition.getC().c;
        if (changeSize == null) {
            changeSize = getC().c;
        }
        Scale scale = exitTransition.getC().d;
        if (scale == null) {
            scale = getC().d;
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exitTransition.getC().e || getC().e, MapsKt.m(getC().f, exitTransition.getC().f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && Intrinsics.c(((ExitTransition) obj).getC(), getC());
    }

    public final int hashCode() {
        return getC().hashCode();
    }

    public final String toString() {
        if (equals(f723a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData c = getC();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        Fade fade = c.f738a;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = c.b;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = c.c;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = c.d;
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c.e);
        return sb.toString();
    }
}
