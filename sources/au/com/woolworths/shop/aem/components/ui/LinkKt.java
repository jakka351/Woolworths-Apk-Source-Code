package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LinkKt {
    public static final void a(LinkData linkData, Function0 onLinkClick, Modifier modifier, PaddingValues paddingValues, Composer composer, int i) {
        PaddingValues paddingValues2;
        Intrinsics.h(linkData, "linkData");
        Intrinsics.h(onLinkClick, "onLinkClick");
        ComposerImpl composerImplV = composer.v(-287519326);
        int i2 = (composerImplV.I(linkData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onLinkClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            paddingValues2 = paddingValues;
        } else {
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(24, BitmapDescriptorFactory.HUE_RED, 2);
            TextWithAltData textWithAltData = linkData.c;
            TertiaryButtonKt.a(textWithAltData.f10170a, onLinkClick, modifier, false, false, paddingValuesImplA, textWithAltData.b, composerImplV, (i3 & 1008) | 196608, 24);
            paddingValues2 = paddingValuesImplA;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(linkData, onLinkClick, modifier, paddingValues2, i, 9);
        }
    }
}
