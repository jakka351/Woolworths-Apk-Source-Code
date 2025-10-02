package androidx.compose.ui.layout;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModifierInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Modifier f1888a;
    public final LayoutCoordinates b;
    public final Object c;

    public ModifierInfo(Modifier modifier, NodeCoordinator nodeCoordinator, OwnedLayer ownedLayer) {
        this.f1888a = modifier;
        this.b = nodeCoordinator;
        this.c = ownedLayer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.f1888a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        return a.s(sb, this.c, ')');
    }
}
