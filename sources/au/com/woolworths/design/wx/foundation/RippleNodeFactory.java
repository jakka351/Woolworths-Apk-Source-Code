package au.com.woolworths.design.wx.foundation;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/wx/foundation/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "design-wx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RippleNodeFactory implements IndicationNodeFactory {

    /* renamed from: a, reason: collision with root package name */
    public final long f5158a;

    public RippleNodeFactory(long j) {
        this.f5158a = j;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode a(InteractionSource interactionSource) {
        Intrinsics.h(interactionSource, "interactionSource");
        return new DelegatingThemeAwareRippleNode(interactionSource, new ColorProducer() { // from class: au.com.woolworths.design.wx.foundation.RippleNodeFactory$create$colorProducer$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            public final long a() {
                return this.d.f5158a;
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
        if (Dp.a(Float.NaN, Float.NaN)) {
            return Color.c(this.f5158a, rippleNodeFactory.f5158a);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int iB = android.support.v4.media.session.a.b(Float.NaN, Boolean.hashCode(true) * 31, 961);
        int i = Color.l;
        return Long.hashCode(this.f5158a) + iB;
    }
}
