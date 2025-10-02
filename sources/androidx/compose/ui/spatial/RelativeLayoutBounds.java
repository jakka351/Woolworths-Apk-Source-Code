package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {

    /* renamed from: a, reason: collision with root package name */
    public final long f2027a;
    public final long b;
    public final DelegatableNode c;

    public RelativeLayoutBounds(long j, long j2, DelegatableNode delegatableNode) {
        this.f2027a = j;
        this.b = j2;
        this.c = delegatableNode;
    }
}
