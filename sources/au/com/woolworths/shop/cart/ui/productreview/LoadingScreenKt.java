package au.com.woolworths.shop.cart.ui.productreview;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LoadingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function3 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = -282695166(0xffffffffef266a02, float:-5.1502667E28)
            androidx.compose.runtime.ComposerImpl r9 = r13.v(r0)
            r13 = r15 & 1
            r0 = 2
            if (r13 == 0) goto L10
            r1 = r14 | 6
        Le:
            r11 = r1
            goto L20
        L10:
            r1 = r14 & 6
            if (r1 != 0) goto L1f
            boolean r1 = r9.I(r12)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = r0
        L1d:
            r1 = r1 | r14
            goto Le
        L1f:
            r11 = r14
        L20:
            r1 = r11 & 3
            if (r1 != r0) goto L30
            boolean r0 = r9.c()
            if (r0 != 0) goto L2b
            goto L30
        L2b:
            r9.j()
            goto Lc2
        L30:
            if (r13 == 0) goto L34
            androidx.compose.runtime.internal.ComposableLambdaImpl r12 = au.com.woolworths.shop.cart.ui.productreview.ComposableSingletons$LoadingScreenKt.f10509a
        L34:
            long r0 = au.com.woolworths.design.wx.foundation.ToneColors.j
            r13 = 1056964608(0x3f000000, float:0.5)
            long r0 = androidx.compose.ui.graphics.Color.b(r0, r13)
            androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1 r13 = androidx.compose.ui.graphics.RectangleShapeKt.f1779a
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion.d
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.BackgroundKt.b(r2, r0, r13)
            androidx.compose.foundation.layout.FillElement r0 = androidx.compose.foundation.layout.SizeKt.c
            androidx.compose.ui.Modifier r13 = r13.x0(r0)
            androidx.compose.foundation.layout.Arrangement$Center$1 r0 = androidx.compose.foundation.layout.Arrangement.e
            r1 = 54
            androidx.compose.ui.BiasAlignment$Horizontal r3 = androidx.compose.ui.Alignment.Companion.n
            androidx.compose.foundation.layout.ColumnMeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.a(r0, r3, r9, r1)
            int r1 = r9.P
            androidx.compose.runtime.PersistentCompositionLocalMap r4 = r9.Q()
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.d(r9, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.e3
            r5.getClass()
            kotlin.jvm.functions.Function0 r5 = androidx.compose.ui.node.ComposeUiNode.Companion.b
            r9.i()
            boolean r6 = r9.O
            if (r6 == 0) goto L70
            r9.K(r5)
            goto L73
        L70:
            r9.e()
        L73:
            kotlin.jvm.functions.Function2 r5 = androidx.compose.ui.node.ComposeUiNode.Companion.g
            androidx.compose.runtime.Updater.b(r9, r0, r5)
            kotlin.jvm.functions.Function2 r0 = androidx.compose.ui.node.ComposeUiNode.Companion.f
            androidx.compose.runtime.Updater.b(r9, r4, r0)
            kotlin.jvm.functions.Function2 r0 = androidx.compose.ui.node.ComposeUiNode.Companion.j
            boolean r4 = r9.O
            if (r4 != 0) goto L91
            java.lang.Object r4 = r9.G()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
            if (r4 != 0) goto L94
        L91:
            androidx.camera.core.impl.b.B(r1, r9, r1, r0)
        L94:
            kotlin.jvm.functions.Function2 r0 = androidx.compose.ui.node.ComposeUiNode.Companion.d
            androidx.compose.runtime.Updater.b(r9, r13, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r13 = androidx.compose.foundation.layout.ColumnScopeInstance.f948a
            androidx.compose.ui.Modifier r10 = r13.b(r2, r3)
            au.com.woolworths.design.wx.foundation.ColorScheme r0 = au.com.woolworths.design.wx.foundation.WxTheme.a(r9)
            long r5 = r0.h()
            r3 = 0
            r4 = 28
            r1 = 0
            r2 = 0
            r7 = 0
            androidx.compose.material.ProgressIndicatorKt.b(r1, r2, r3, r4, r5, r7, r9, r10)
            int r0 = r11 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.invoke(r13, r9, r0)
            r13 = 1
            r9.V(r13)
        Lc2:
            androidx.compose.runtime.RecomposeScopeImpl r13 = r9.X()
            if (r13 == 0) goto Lcf
            au.com.woolworths.feature.shop.marketplace.ui.facet.f r0 = new au.com.woolworths.feature.shop.marketplace.ui.facet.f
            r0.<init>(r12, r14, r15)
            r13.d = r0
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.productreview.LoadingScreenKt.a(kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
