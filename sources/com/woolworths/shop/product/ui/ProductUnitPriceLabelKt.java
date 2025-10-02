package com.woolworths.shop.product.ui;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.modifier.VisibilityModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.bottomsheet.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProductUnitPriceLabelKt {
    public static final void a(final String str, Modifier modifier, long j, int i, int i2, boolean z, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        long j2;
        int i6;
        ComposerImpl composerImpl;
        final Modifier modifier3;
        final long j3;
        final int i7;
        final int i8;
        final boolean z2;
        ComposerImpl composerImplV = composer.v(-1724479295);
        int i9 = i3 | (composerImplV.n(str) ? 4 : 2);
        int i10 = i4 & 4;
        if (i10 != 0) {
            i5 = i9 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i5 = i9 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        int i11 = i4 & 8;
        if (i11 != 0) {
            i6 = i5 | 3072;
            j2 = j;
        } else {
            j2 = j;
            i6 = i5 | (composerImplV.s(j2) ? 2048 : 1024);
        }
        int i12 = i6 | 1794048;
        if ((599187 & i12) == 599186 && composerImplV.c()) {
            composerImplV.j();
            i7 = i;
            composerImpl = composerImplV;
            modifier3 = modifier2;
            j3 = j2;
            i8 = i2;
            z2 = z;
        } else {
            Modifier modifier4 = i10 != 0 ? Modifier.Companion.d : modifier2;
            long j4 = i11 != 0 ? Color.k : j2;
            boolean z3 = str != null;
            String str2 = str == null ? "" : str;
            composerImplV.o(5004770);
            boolean zP = composerImplV.p(z3);
            Object objG = composerImplV.G();
            if (zP || objG == Composer.Companion.f1624a) {
                objG = new c(z3, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            TextKt.b(str2, VisibilityModifierKt.a(modifier4, (Function0) objG), j4, 0L, null, 0L, null, new TextAlign(3), 0L, 2, false, 1, 1, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImpl, (i12 >> 3) & 896, 27696, 38392);
            modifier3 = modifier4;
            j3 = j4;
            i7 = 1;
            i8 = 1;
            z2 = true;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, modifier3, j3, i7, i8, z2, i3, i4) { // from class: com.woolworths.shop.product.ui.b
                public final /* synthetic */ String d;
                public final /* synthetic */ Modifier e;
                public final /* synthetic */ long f;
                public final /* synthetic */ int g;
                public final /* synthetic */ int h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int j;

                {
                    this.j = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    ProductUnitPriceLabelKt.a(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA, this.j);
                    return Unit.f24250a;
                }
            };
        }
    }
}
