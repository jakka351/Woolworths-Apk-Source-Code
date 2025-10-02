package au.com.woolworths.product.details.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
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
import au.com.woolworths.feature.rewards.account.preferences.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewsSummaryTileKt {
    public static final void a(final String ratingText, final String ratingAltText, final double d, final String str, final String str2, final String str3, final Function0 onWriteReviewClicked, final Function0 onRatingsAndReviewsClicked, Composer composer, final int i) {
        int i2;
        String str4;
        String str5;
        Intrinsics.h(ratingText, "ratingText");
        Intrinsics.h(ratingAltText, "ratingAltText");
        Intrinsics.h(onWriteReviewClicked, "onWriteReviewClicked");
        Intrinsics.h(onRatingsAndReviewsClicked, "onRatingsAndReviewsClicked");
        ComposerImpl composerImplV = composer.v(1064823382);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(ratingText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(ratingAltText) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.t(d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str4 = str2;
            i2 |= composerImplV.n(str4) ? 16384 : 8192;
        } else {
            str4 = str2;
        }
        if ((196608 & i) == 0) {
            str5 = str3;
            i2 |= composerImplV.n(str5) ? 131072 : 65536;
        } else {
            str5 = str3;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onWriteReviewClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onRatingsAndReviewsClicked) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final String str6 = str4;
            final String str7 = str5;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1107332486, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.details.ui.ProductReviewsSummaryTileKt$ProductReviewsSummaryTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1746271574);
                        String str8 = str7;
                        boolean zN = composer2.n(str8);
                        Function0 function0 = onRatingsAndReviewsClicked;
                        boolean zN2 = zN | composer2.n(function0);
                        Function0 function02 = onWriteReviewClicked;
                        boolean zN3 = zN2 | composer2.n(function02);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zN3 || objG == obj3) {
                            objG = new b(str8, function0, function02, 0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierJ = PaddingKt.j(SizeKt.e(ClickableKt.d(companion, false, null, null, (Function0) objG, 7), 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == obj3) {
                            objG2 = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(22);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierJ, true, (Function1) objG2);
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, vertical, composer2, 54);
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
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
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
                        StarRatingBarKt.b(d, ratingAltText, PaddingKt.j(companion, f, f2, BitmapDescriptorFactory.HUE_RED, f2, 4), 0L, composer2, 3120);
                        TextKt.b(ratingText, PaddingKt.j(companion, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composer2).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 48, 0, 65528);
                        composer2.f();
                        String str9 = str;
                        if (str9 == null) {
                            str9 = "Write review";
                        }
                        composer2.o(-1633490746);
                        String str10 = str6;
                        boolean zN4 = composer2.n(str10) | composer2.n(str9);
                        Object objG3 = composer2.G();
                        if (zN4 || objG3 == obj3) {
                            objG3 = new f(str10, str9, 3);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        TextKt.b(str9, SemanticsModifierKt.b(companion, false, (Function1) objG3), CoreTheme.b(composer2).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 0, 0, 65528);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.product.details.ui.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductReviewsSummaryTileKt.a(ratingText, ratingAltText, d, str, str2, str3, onWriteReviewClicked, onRatingsAndReviewsClicked, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
