package au.com.woolworths.feature.shop.trafficdrivers.ui;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.text.InlineBadgeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.models.TagStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TagLabelUiKt {
    public static final void a(TagLabel tagLabel, Composer composer, int i) {
        int i2;
        Intrinsics.h(tagLabel, "tagLabel");
        ComposerImpl composerImplV = composer.v(-868464995);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(tagLabel) : composerImplV.I(tagLabel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (tagLabel.getStyle() == TagStyle.FEATURED) {
            float f = 4;
            InlineBadgeKt.a(tagLabel.getText(), ToneColors.j, null, ToneColors.d, false, TextUnitKt.c(11), RoundedCornerShapeKt.b(f), new PaddingValuesImpl(f, f, f, f), WxTheme.b(composerImplV).t, composerImplV, 12779520, 20);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.a(i, 4, tagLabel);
        }
    }
}
