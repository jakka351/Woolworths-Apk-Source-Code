package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LinkStateInteractionSourceObserver {

    /* renamed from: a, reason: collision with root package name */
    public final InteractionSource f1122a;
    public final MutableIntState b = SnapshotIntStateKt.a(0);

    public LinkStateInteractionSourceObserver(MutableInteractionSource mutableInteractionSource) {
        this.f1122a = mutableInteractionSource;
    }
}
