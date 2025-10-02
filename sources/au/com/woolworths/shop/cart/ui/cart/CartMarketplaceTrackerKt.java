package au.com.woolworths.shop.cart.ui.cart;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "internalProgress", "progressAnimation", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartMarketplaceTrackerKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r19, final float r20, final java.lang.String r21, boolean r22, kotlin.jvm.functions.Function0 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r25
            java.lang.String r0 = "onLoaded"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            r0 = -1510321397(0xffffffffa5fa530b, float:-4.342436E-16)
            r4 = r24
            androidx.compose.runtime.ComposerImpl r0 = r4.v(r0)
            r4 = r6 & 6
            if (r4 != 0) goto L27
            boolean r4 = r0.n(r1)
            if (r4 == 0) goto L24
            r4 = 4
            goto L25
        L24:
            r4 = 2
        L25:
            r4 = r4 | r6
            goto L28
        L27:
            r4 = r6
        L28:
            r7 = r6 & 48
            if (r7 != 0) goto L38
            boolean r7 = r0.q(r2)
            if (r7 == 0) goto L35
            r7 = 32
            goto L37
        L35:
            r7 = 16
        L37:
            r4 = r4 | r7
        L38:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L48
            boolean r7 = r0.n(r3)
            if (r7 == 0) goto L45
            r7 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r7 = 128(0x80, float:1.794E-43)
        L47:
            r4 = r4 | r7
        L48:
            r7 = r26 & 8
            if (r7 == 0) goto L51
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L4e:
            r8 = r22
            goto L63
        L51:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L4e
            r8 = r22
            boolean r9 = r0.p(r8)
            if (r9 == 0) goto L60
            r9 = 2048(0x800, float:2.87E-42)
            goto L62
        L60:
            r9 = 1024(0x400, float:1.435E-42)
        L62:
            r4 = r4 | r9
        L63:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L73
            boolean r9 = r0.I(r5)
            if (r9 == 0) goto L70
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L72
        L70:
            r9 = 8192(0x2000, float:1.14794E-41)
        L72:
            r4 = r4 | r9
        L73:
            r4 = r4 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r9) goto L87
            boolean r4 = r0.c()
            if (r4 != 0) goto L80
            goto L87
        L80:
            r0.j()
            r16 = r0
            r4 = r8
            goto Lac
        L87:
            if (r7 == 0) goto L8b
            r4 = 0
            goto L8c
        L8b:
            r4 = r8
        L8c:
            r5.invoke()
            au.com.woolworths.shop.cart.ui.cart.CartMarketplaceTrackerKt$CartMarketplaceTracker$1 r7 = new au.com.woolworths.shop.cart.ui.cart.CartMarketplaceTrackerKt$CartMarketplaceTracker$1
            r7.<init>()
            r8 = 88879439(0x54c314f, float:9.6010905E-36)
            androidx.compose.runtime.internal.ComposableLambdaImpl r15 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r8, r7, r0)
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = r0
            au.com.woolworths.design.wx.component.SurfaceKt.a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
        Lac:
            androidx.compose.runtime.RecomposeScopeImpl r8 = r16.X()
            if (r8 == 0) goto Lbb
            au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.c r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.c
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.cart.CartMarketplaceTrackerKt.a(java.lang.String, float, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
