package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/TransitionState;", "S", "", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;", "Landroidx/compose/animation/core/SeekableTransitionState;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class TransitionState<S> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f785a = SnapshotStateKt.f(Boolean.FALSE);

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public abstract void d(Transition transition);

    public abstract void e();
}
