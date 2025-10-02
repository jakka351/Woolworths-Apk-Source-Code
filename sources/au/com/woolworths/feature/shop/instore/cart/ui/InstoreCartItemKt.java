package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.product.models.ProductQuantityHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreCartItemKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.product.models.ProductCard r25, final boolean r26, final androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, com.woolworths.shop.product.ui.boost.BoostingState r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartItemKt.a(au.com.woolworths.product.models.ProductCard, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.woolworths.shop.product.ui.boost.BoostingState, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final double d, final String str, final Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1775882030);
        if (((i | (composerImplV.t(d) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 6;
            TextKt.a(ProductQuantityHelper.getQuantityLabel((float) d, str), CoreTheme.f(composerImplV).e.b.f5135a, PaddingKt.g(BorderKt.a(BackgroundKt.b(TestTagKt.a(modifier, "quantityLabel"), CoreTheme.d(composerImplV).f4872a.c, RoundedCornerShapeKt.b(f)), 1, CoreTheme.b(composerImplV).e.b.f4852a, RoundedCornerShapeKt.b(f)), 18, f), CoreTheme.b(composerImplV).e.d.c.f4857a, null, 3, 0, false, 0, null, composerImplV, 0, 976);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(d, str, modifier, i) { // from class: au.com.woolworths.feature.shop.instore.cart.ui.b
                public final /* synthetic */ double d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Modifier f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(385);
                    InstoreCartItemKt.b(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
