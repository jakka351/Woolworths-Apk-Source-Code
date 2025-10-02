package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Landroidx/compose/foundation/layout/BoxScope;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {

    /* renamed from: a, reason: collision with root package name */
    public static final BoxScopeInstance f944a = new BoxScopeInstance();

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier g(Modifier modifier, Alignment alignment) {
        return modifier.x0(new BoxChildDataElement(alignment, false, InspectableValueKt.a()));
    }

    public final Modifier i() {
        return new BoxChildDataElement(Alignment.Companion.e, true, InspectableValueKt.a());
    }
}
