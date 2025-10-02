package au.com.woolworths.feature.product.list.legacy.compose.productsearch;

import androidx.camera.core.impl.b;
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
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.compose.productsearch.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0006¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "heroTile1Height", "heroTile2Height", "heroTile3Height", "heroTile4Height", "index", "product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
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
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.a(java.util.List, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(883016462);
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
                b.B(i2, composerImplV, i2, function2);
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
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 7, modifier);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1199937336);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_barcode_scanner, 0, composerImplV), "", modifier2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 8, modifier2);
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1825244332);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_buy_again, 0, composerImplV), "", modifier2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 6, modifier2);
        }
    }

    public static final void e(final Function0 function0, final String str, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(971824604);
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
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1512335560, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt$HeroTile$1
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
                            b.z(p, composer2, p, function23);
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
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(19);
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
            recomposeScopeImplX.d = new d(function0, str, composableLambdaImpl, composableLambdaImpl2, modifier, i, 1);
        }
    }

    public static final void f(final Function0 onVoiceSearchClicked, Function0 onScanBarcodeClicked, Function0 onBuyAgainClicked, Function0 onOliveClicked, Function1 shouldDisplaySearchTile, final boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        int i3;
        BiasAlignment.Vertical vertical;
        RowScopeInstance rowScopeInstance;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        boolean z2;
        Modifier modifier2;
        Intrinsics.h(onVoiceSearchClicked, "onVoiceSearchClicked");
        Intrinsics.h(onScanBarcodeClicked, "onScanBarcodeClicked");
        Intrinsics.h(onBuyAgainClicked, "onBuyAgainClicked");
        Intrinsics.h(onOliveClicked, "onOliveClicked");
        Intrinsics.h(shouldDisplaySearchTile, "shouldDisplaySearchTile");
        ComposerImpl composerImplV = composer.v(1284005374);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onVoiceSearchClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onScanBarcodeClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onBuyAgainClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onOliveClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(shouldDisplaySearchTile) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if ((599187 & i4) == 599186 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            String strI = androidx.constraintlayout.core.state.a.i(StringResources_androidKt.c(composerImplV, R.string.olive_voice_search_tile_title), " ", StringResources_androidKt.c(composerImplV, z ? R.string.olive_voice_sample_description_vps : R.string.olive_voice_sample_description_vps_old), StringResources_androidKt.c(composerImplV, R.string.olive_voice_sample_description_alt_vps));
            String strO = b.o(StringResources_androidKt.c(composerImplV, R.string.olive_voice_scan_barcode_tile_title), " ", StringResources_androidKt.c(composerImplV, R.string.olive_voice_scan_barcode_tile_description));
            String strO2 = b.o(StringResources_androidKt.c(composerImplV, R.string.buy_again_entry_point_title), " ", StringResources_androidKt.c(composerImplV, R.string.buy_again_entry_point_subtitle));
            String strJ = androidx.constraintlayout.core.state.a.j(StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_title), " ", StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_subtitle_gluten_free_snack), StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_subtitle_cleaning_product_under_10), StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_subtitle_half_price_this_week));
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            MutableIntState mutableIntState = (MutableIntState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$12) {
                objD = SnapshotIntStateKt.a(0);
                composerImplV.A(objD);
            }
            MutableIntState mutableIntState2 = (MutableIntState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$12) {
                objD2 = SnapshotIntStateKt.a(0);
                composerImplV.A(objD2);
            }
            MutableIntState mutableIntState3 = (MutableIntState) objD2;
            Object objD3 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD3 == composer$Companion$Empty$12) {
                objD3 = SnapshotIntStateKt.a(0);
                composerImplV.A(objD3);
            }
            MutableIntState mutableIntState4 = (MutableIntState) objD3;
            composerImplV.V(false);
            int iC = ComparisonsKt.c(mutableIntState.d(), mutableIntState2.d(), mutableIntState3.d(), mutableIntState4.d());
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 16;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.n, composerImplV, 54);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function27);
            }
            Updater.b(composerImplV, modifierD2, function28);
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, vertical2, composerImplV, 6);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function27);
            }
            Updater.b(composerImplV, modifierD3, function28);
            composerImplV.o(-1059429513);
            boolean zBooleanValue = ((Boolean) shouldDisplaySearchTile.invoke(SearchTile.d)).booleanValue();
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            if (zBooleanValue) {
                Modifier modifierA = rowScopeInstance2.a(companion, 1.0f, true);
                composerImplV.o(5004770);
                Object objG2 = composerImplV.G();
                if (objG2 == composer$Companion$Empty$12) {
                    objG2 = new au.com.woolworths.feature.product.list.compose.productsearch.b(4, mutableIntState);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                Modifier modifierA2 = OnGloballyPositionedModifierKt.a(modifierA, (Function1) objG2);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
                Modifier modifierI = SizeKt.i(modifierA2, ((Density) composerImplV.x(staticProvidableCompositionLocal)).B(iC), BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(strI);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == composer$Companion$Empty$12) {
                    objG3 = new androidx.navigation.fragment.d(strI, 19);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                function22 = function28;
                i3 = iC;
                function24 = function25;
                function2 = function26;
                rowScopeInstance = rowScopeInstance2;
                function23 = function27;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                vertical = vertical2;
                e(onVoiceSearchClicked, StringResources_androidKt.c(composerImplV, R.string.olive_voice_search_tile_title), ComposableLambdaKt.c(1772040336, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt$SearchTilesSection$1$1$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 40);
                            composer2.o(1849434622);
                            Object objG4 = composer2.G();
                            if (objG4 == Composer.Companion.f1624a) {
                                objG4 = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(20);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            VoiceProductSearchEntryIconKt.a(0, 0, composer2, SemanticsModifierKt.b(modifierQ, false, (Function1) objG4), onVoiceSearchClicked);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(-940574895, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt$SearchTilesSection$1$1$1$5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            SearchTilesSectionKt.a(CollectionsKt.R(StringResources_androidKt.c(composer2, z ? R.string.olive_voice_sample_description_vps : R.string.olive_voice_sample_description_vps_old), StringResources_androidKt.c(composer2, R.string.olive_voice_sample_description_alt_vps)), null, true, composer2, KyberEngine.KyberPolyBytes, 2);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), SemanticsModifierKt.b(modifierI, true, (Function1) objG3), composerImplV, (i4 & 14) | 3456);
                Modifier modifierA3 = rowScopeInstance.a(companion, 1.0f, true);
                composerImplV.o(5004770);
                Object objG4 = composerImplV.G();
                if (objG4 == composer$Companion$Empty$1) {
                    objG4 = new au.com.woolworths.feature.product.list.compose.productsearch.b(5, mutableIntState2);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                Modifier modifierI2 = SizeKt.i(OnGloballyPositionedModifierKt.a(modifierA3, (Function1) objG4), ((Density) composerImplV.x(staticProvidableCompositionLocal)).B(i3), BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(5004770);
                boolean zN2 = composerImplV.n(strO);
                Object objG5 = composerImplV.G();
                if (zN2 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new androidx.navigation.fragment.d(strO, 20);
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                e(onScanBarcodeClicked, StringResources_androidKt.c(composerImplV, R.string.olive_voice_scan_barcode_tile_title), ComposableSingletons$SearchTilesSectionKt.f5350a, ComposableSingletons$SearchTilesSectionKt.b, SemanticsModifierKt.b(modifierI2, true, (Function1) objG5), composerImplV, ((i4 >> 3) & 14) | 3456);
            } else {
                function2 = function26;
                function22 = function28;
                function23 = function27;
                function24 = function25;
                i3 = iC;
                vertical = vertical2;
                rowScopeInstance = rowScopeInstance2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
            }
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.o(-160515112);
            if (((Boolean) shouldDisplaySearchTile.invoke(SearchTile.e)).booleanValue()) {
                Modifier modifierH2 = PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2);
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.g(f), vertical, composerImplV, 6);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierH2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function24);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function2);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    b.B(i8, composerImplV, i8, function23);
                }
                Updater.b(composerImplV, modifierD4, function22);
                Modifier modifierA4 = rowScopeInstance.a(companion, 1.0f, true);
                composerImplV.o(5004770);
                Object objG6 = composerImplV.G();
                if (objG6 == composer$Companion$Empty$1) {
                    objG6 = new au.com.woolworths.feature.product.list.compose.productsearch.b(6, mutableIntState3);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                Modifier modifierA5 = OnGloballyPositionedModifierKt.a(modifierA4, (Function1) objG6);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.h;
                Modifier modifierI3 = SizeKt.i(modifierA5, ((Density) composerImplV.x(staticProvidableCompositionLocal2)).B(i3), BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(5004770);
                boolean zN3 = composerImplV.n(strO2);
                Object objG7 = composerImplV.G();
                if (zN3 || objG7 == composer$Companion$Empty$1) {
                    objG7 = new androidx.navigation.fragment.d(strO2, 21);
                    composerImplV.A(objG7);
                }
                composerImplV.V(false);
                e(onBuyAgainClicked, StringResources_androidKt.c(composerImplV, R.string.buy_again_entry_point_title), ComposableSingletons$SearchTilesSectionKt.c, ComposableSingletons$SearchTilesSectionKt.d, SemanticsModifierKt.b(modifierI3, true, (Function1) objG7), composerImplV, ((i4 >> 6) & 14) | 3456);
                Modifier modifierA6 = rowScopeInstance.a(companion, 1.0f, true);
                composerImplV.o(5004770);
                Object objG8 = composerImplV.G();
                if (objG8 == composer$Companion$Empty$1) {
                    objG8 = new au.com.woolworths.feature.product.list.compose.productsearch.b(7, mutableIntState4);
                    composerImplV.A(objG8);
                }
                composerImplV.V(false);
                Modifier modifierI4 = SizeKt.i(OnGloballyPositionedModifierKt.a(modifierA6, (Function1) objG8), ((Density) composerImplV.x(staticProvidableCompositionLocal2)).B(i3), BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(5004770);
                boolean zN4 = composerImplV.n(strJ);
                Object objG9 = composerImplV.G();
                if (zN4 || objG9 == composer$Companion$Empty$1) {
                    objG9 = new androidx.navigation.fragment.d(strJ, 22);
                    composerImplV.A(objG9);
                }
                composerImplV.V(false);
                z2 = true;
                e(onOliveClicked, StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_point_title), ComposableSingletons$SearchTilesSectionKt.e, ComposableSingletons$SearchTilesSectionKt.f, SemanticsModifierKt.b(modifierI4, true, (Function1) objG9), composerImplV, ((i4 >> 9) & 14) | 3456);
                composerImplV.V(true);
            } else {
                z2 = true;
            }
            android.support.v4.media.session.a.C(composerImplV, false, z2, z2);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onVoiceSearchClicked, onScanBarcodeClicked, onBuyAgainClicked, onOliveClicked, shouldDisplaySearchTile, z, modifier2, i);
        }
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
            r0 = 1862756120(0x6f076718, float:4.190511E28)
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
            au.com.woolworths.feature.product.list.legacy.compose.filter.a r2 = new au.com.woolworths.feature.product.list.legacy.compose.filter.a
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
            r6 = 1
            r4 = r16
            r5 = r17
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r0.d = r1
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.g(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.lang.String):void");
    }
}
