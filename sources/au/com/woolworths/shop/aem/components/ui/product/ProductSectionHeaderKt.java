package au.com.woolworths.shop.aem.components.ui.product;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.ui.content.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductSectionHeaderKt {
    public static final void a(float f, int i, int i2, Composer composer, Modifier modifier, final String headerText) {
        int i3;
        int i4;
        float f2;
        Intrinsics.h(headerText, "headerText");
        ComposerImpl composerImplV = composer.v(-1206363755);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(headerText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.n(modifier) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i5 | KyberEngine.KyberPolyBytes;
        } else {
            i4 = i5 | (composerImplV.q(f) ? 256 : 128);
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
        } else {
            if (i6 != 0) {
                f = 0;
            }
            float f3 = f;
            SurfaceKt.a(modifier, null, 0L, 0L, null, f3, ComposableLambdaKt.c(683310297, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.product.ProductSectionHeaderKt$ProductSectionHeader$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(headerText, PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 8), WxTheme.a(composer2).c(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composer2).o, composer2, 48, 3120, 55288);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 3) & 14) | 1572864 | ((i4 << 9) & 458752), 30);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new p(headerText, modifier, f2, i, i2, 3);
        }
    }
}
