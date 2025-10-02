package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PorductMemberPriceLabelKt {
    public static final void a(final String header, final String title, Modifier modifier, final String str, ProductMemberPriceLabelStyle productMemberPriceLabelStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Intrinsics.h(header, "header");
        Intrinsics.h(title, "title");
        ComposerImpl composerImplV = composer.v(1086564801);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(header) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(title) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            FlowLayoutKt.b(modifier4, productMemberPriceLabelStyle.l(), null, null, productMemberPriceLabelStyle.getK(), 0, ComposableLambdaKt.c(192600486, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.PorductMemberPriceLabelKt$ProductMemberPriceLabel$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FlowRowScope FlowRow = (FlowRowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FlowRow, "$this$FlowRow");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(FlowRow) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_rewards_card_small, 0, composer2);
                        Modifier.Companion companion = Modifier.Companion.d;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        float f = 16;
                        ImageKt.a(painterA, null, SizeKt.u(SizeKt.g(FlowRow.b(companion, vertical), f), f), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 120);
                        SpacerKt.a(composer2, SizeKt.u(companion, 4));
                        TextKt.a(header, CoreTheme.f(composer2).f5120a.c.b, FlowRow.b(companion, vertical), CoreTheme.b(composer2).e.d.f4856a, null, 0, 0, false, 0, null, composer2, 0, 1008);
                        float f2 = 8;
                        SpacerKt.a(composer2, SizeKt.u(companion, f2));
                        TextKt.a(title, CoreTheme.f(composer2).f5120a.c.b, FlowRow.b(companion, vertical), CoreTheme.b(composer2).e.d.f4856a, null, 0, 0, false, 0, null, composer2, 0, 1008);
                        SpacerKt.a(composer2, SizeKt.u(companion, f2));
                        String str2 = str;
                        if (str2 != null && str2.length() != 0) {
                            TextKt.a(str, CoreTheme.f(composer2).f5120a.c.f5124a, FlowRow.b(companion, vertical), CoreTheme.b(composer2).e.d.f4856a, null, 0, 0, false, 0, null, composer2, 0, 1008);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 6) & 14) | 1572864, 44);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.product.composeui.l(header, title, modifier3, str, productMemberPriceLabelStyle, i, i2, 1);
        }
    }
}
