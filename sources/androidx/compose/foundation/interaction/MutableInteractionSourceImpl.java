package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    /* renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f923a = SharedFlowKt.b(0, 16, BufferOverflow.e, 1);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean a(Interaction interaction) {
        return this.f923a.f(interaction);
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final Object b(Interaction interaction, Continuation continuation) throws Throwable {
        Object objEmit = this.f923a.emit(interaction, continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final Flow c() {
        return this.f923a;
    }
}
