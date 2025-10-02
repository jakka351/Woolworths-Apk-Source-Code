package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/constraintlayout/compose/Transition;", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransitionImpl implements Transition {
    public static final TransitionImpl b = new TransitionImpl(new CLObject(new char[0]));

    /* renamed from: a, reason: collision with root package name */
    public final CLObject f2255a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl$Companion;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public TransitionImpl(CLObject cLObject) {
        this.f2255a = cLObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TransitionImpl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return Intrinsics.c(this.f2255a, ((TransitionImpl) obj).f2255a);
    }

    public final int hashCode() {
        return this.f2255a.hashCode();
    }
}
