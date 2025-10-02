package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.ratingbar.StarRatingBarKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewsSummaryTileKt {
    public static final void a(final String str, final String str2, final double d, final String str3, final String str4, final String str5, final Function0 onWriteReviewClick, Modifier modifier, final Function0 onRatingsAndReviewsClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        Intrinsics.h(onWriteReviewClick, "onWriteReviewClick");
        Intrinsics.h(onRatingsAndReviewsClick, "onRatingsAndReviewsClick");
        ComposerImpl composerImplV = composer.v(1493372947);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.t(d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.n(str5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(onWriteReviewClick) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i4 = i3 | 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (composerImplV.n(modifier2) ? 8388608 : 4194304);
        }
        if ((100663296 & i) == 0) {
            i4 |= composerImplV.I(onRatingsAndReviewsClick) ? 67108864 : 33554432;
        }
        if ((i4 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            final Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1835562697, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductReviewsSummaryTileKt$ProductReviewsSummaryTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1746271574);
                        String str6 = str5;
                        boolean zN = composer2.n(str6);
                        Function0 function0 = onRatingsAndReviewsClick;
                        boolean zN2 = zN | composer2.n(function0);
                        Function0 function02 = onWriteReviewClick;
                        boolean zN3 = zN2 | composer2.n(function02);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zN3 || objG == obj3) {
                            objG = new au.com.woolworths.product.details.ui.b(str6, function0, function02, 1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        float f = 16;
                        Modifier modifierJ = PaddingKt.j(SizeKt.e(ClickableKt.d(modifier4, false, null, null, (Function0) objG, 7), 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == obj3) {
                            objG2 = new a(5);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierJ, true, (Function1) objG2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        float f2 = 4;
                        StarRatingBarKt.b(d, str2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f2, 5), 0L, composer2, 3120);
                        Modifier modifierJ2 = PaddingKt.j(companion, 2, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 10);
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        if (objG3 == obj3) {
                            objG3 = new a(6);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        TextKt.b(str, SemanticsModifierKt.b(modifierJ2, false, (Function1) objG3), CoreTheme.b(composer2).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.c.b, composer2, 0, 0, 65528);
                        composer2.f();
                        String str7 = str3;
                        if (str7 == null) {
                            str7 = "Write review";
                        }
                        composer2.o(-1633490746);
                        String str8 = str4;
                        boolean zN4 = composer2.n(str8) | composer2.n(str7);
                        Object objG4 = composer2.G();
                        if (zN4 || objG4 == obj3) {
                            objG4 = new au.com.woolworths.feature.rewards.account.preferences.f(str8, str7, 4);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        TextKt.b(str7, SemanticsModifierKt.b(companion, false, (Function1) objG4), CoreTheme.b(composer2).f4782a.d.b.f4798a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.c.b, composer2, 0, 0, 65528);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.product.details.ui.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductReviewsSummaryTileKt.a(str, str2, d, str3, str4, str5, onWriteReviewClick, modifier3, onRatingsAndReviewsClick, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
