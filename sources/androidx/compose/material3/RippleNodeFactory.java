package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class RippleNodeFactory implements IndicationNodeFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1480a;
    public final float b;
    public final long c;

    public RippleNodeFactory(boolean z, float f, long j) {
        this.f1480a = z;
        this.b = f;
        this.c = j;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode a(InteractionSource interactionSource) {
        return new DelegatingThemeAwareRippleNode(interactionSource, this.f1480a, this.b, new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            public final long a() {
                return this.d.c;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.f1480a == rippleNodeFactory.f1480a && Dp.a(this.b, rippleNodeFactory.b)) {
            return Color.c(this.c, rippleNodeFactory.c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int iB = android.support.v4.media.session.a.b(this.b, Boolean.hashCode(this.f1480a) * 31, 961);
        int i = Color.l;
        return Long.hashCode(this.c) + iB;
    }
}
