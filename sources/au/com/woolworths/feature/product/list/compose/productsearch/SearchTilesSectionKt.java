package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0006¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "heroTile1Height", "heroTile2Height", "heroTile3Height", "heroTile4Height", "index", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SearchTilesSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.util.List r15, androidx.compose.ui.Modifier r16, boolean r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt.a(java.util.List, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(113984891);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), 40);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_ask_olive, 0, composerImplV);
            BiasAlignment biasAlignment = Alignment.Companion.d;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            ImageKt.a(painterA, "", boxScopeInstance.g(modifier, biasAlignment), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_chat_entry_bbs_beta, 0, composerImplV), "", boxScopeInstance.g(companion, Alignment.Companion.c), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 4, modifier);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1424212735);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_barcode_scanner, 0, composerImplV), "", modifier2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 3, modifier2);
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1478982045);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_buy_again, 0, composerImplV), "", modifier2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 2, modifier2);
        }
    }

    public static final void e(final Function0 function0, final String str, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-964520339);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(671181969, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt$HeroTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(BackgroundKt.b(ClickableKt.d(modifier, false, null, null, function0, 7), CoreTheme.b(composer2).e.f4848a.d, RoundedCornerShapeKt.b(f)), f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, horizontal, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        composableLambdaImpl.invoke(composer2, 0);
                        Modifier.Companion companion = Modifier.Companion.d;
                        SpacerKt.a(composer2, SizeKt.g(companion, 8));
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.i(6, Alignment.Companion.j), horizontal, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.product.list.compose.filter.a(18);
                            composer2.A(objG);
                        }
                        composer2.l();
                        TextKt.a(str, CoreTheme.f(composer2).f5120a.f5121a.b, SemanticsModifierKt.a(companion, (Function1) objG), 0L, null, 0, 2, false, 2, null, composer2, 102236160, 696);
                        composableLambdaImpl2.invoke(composer2, 0);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(function0, str, composableLambdaImpl, composableLambdaImpl2, modifier, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final kotlin.jvm.functions.Function0 r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function1 r40, androidx.compose.ui.Modifier r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt.f(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(int r16, int r17, androidx.compose.runtime.Composer r18, androidx.compose.ui.Modifier r19, java.lang.String r20) {
        /*
            r0 = 919451825(0x36cdb8b1, float:6.130977E-6)
            r1 = r18
            androidx.compose.runtime.ComposerImpl r12 = r1.v(r0)
            r0 = r16 & 6
            r1 = r20
            if (r0 != 0) goto L1b
            boolean r0 = r12.n(r1)
            if (r0 == 0) goto L17
            r0 = 4
            goto L18
        L17:
            r0 = 2
        L18:
            r0 = r16 | r0
            goto L1d
        L1b:
            r0 = r16
        L1d:
            r2 = r17 & 2
            if (r2 == 0) goto L26
            r0 = r0 | 48
        L23:
            r3 = r19
            goto L38
        L26:
            r3 = r16 & 48
            if (r3 != 0) goto L23
            r3 = r19
            boolean r4 = r12.n(r3)
            if (r4 == 0) goto L35
            r4 = 32
            goto L37
        L35:
            r4 = 16
        L37:
            r0 = r0 | r4
        L38:
            r4 = r0 & 19
            r5 = 18
            if (r4 != r5) goto L49
            boolean r4 = r12.c()
            if (r4 != 0) goto L45
            goto L49
        L45:
            r12.j()
            goto L90
        L49:
            if (r2 == 0) goto L4f
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion.d
            r15 = r2
            goto L50
        L4f:
            r15 = r3
        L50:
            r2 = 1849434622(0x6e3c21fe, float:1.4556069E28)
            r12.o(r2)
            java.lang.Object r2 = r12.G()
            androidx.compose.runtime.Composer$Companion$Empty$1 r3 = androidx.compose.runtime.Composer.Companion.f1624a
            if (r2 != r3) goto L68
            au.com.woolworths.feature.product.list.compose.filter.a r2 = new au.com.woolworths.feature.product.list.compose.filter.a
            r3 = 17
            r2.<init>(r3)
            r12.A(r2)
        L68:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 0
            r12.V(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.a(r15, r2)
            au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens r2 = au.com.woolworths.design.core.ui.foundation.CoreTheme.f(r12)
            au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens$Body r2 = r2.f5120a
            au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens$Body$Sm r2 = r2.c
            androidx.compose.ui.text.TextStyle r2 = r2.f5124a
            r0 = r0 & 14
            r4 = 102236160(0x6180000, float:2.8588023E-35)
            r13 = r0 | r4
            r14 = 696(0x2b8, float:9.75E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 2
            r9 = 0
            r10 = 2
            r11 = 0
            au.com.woolworths.design.core.ui.component.stable.TextKt.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r15
        L90:
            androidx.compose.runtime.RecomposeScopeImpl r0 = r12.X()
            if (r0 == 0) goto La4
            au.com.woolworths.feature.product.list.compose.productsearch.f r1 = new au.com.woolworths.feature.product.list.compose.productsearch.f
            r6 = 0
            r4 = r16
            r5 = r17
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r0.d = r1
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt.g(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.lang.String):void");
    }
}
