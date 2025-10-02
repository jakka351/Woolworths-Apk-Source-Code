package au.com.woolworths.feature.shop.catalogue.listing.promotion.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.model.ProductHeroCard;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.model.PromotionGroup;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionGroupKt {
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.List] */
    public static final void a(PromotionGroup group, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(group, "group");
        ComposerImpl composerImplV = composer.v(2121081924);
        int i2 = 2;
        if ((((composerImplV.I(group) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            int i3 = Color.l;
            long jA = ColorExtKt.a(Color.j, group.b);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            modifier2 = Modifier.Companion.d;
            float f = 6;
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(modifier2, jA, rectangleShapeKt$RectangleShape$1), f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifier2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ImageWithAltText imageWithAltText = group.f6906a;
            SingletonAsyncImageKt.a(imageWithAltText != null ? imageWithAltText.f10141a : null, null, PaddingKt.j(SizeKt.g(SizeKt.e(modifier2, 1.0f), 120), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, 20, 5), null, ContentScale.Companion.e, composerImplV, 1573296, 1976);
            b(group.c, composerImplV, 0);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(group, i, i2, modifier2);
        }
    }

    public static final void b(List list, Composer composer, int i) {
        RowScopeInstance rowScopeInstance;
        ComposerImpl composerImplV = composer.v(-153371453);
        int i2 = 4;
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = 0;
            while (i3 < list.size()) {
                Object obj = list.get(i3);
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
                Modifier.Companion companion = Modifier.Companion.d;
                Modifier modifierF = PaddingKt.f(companion, i2);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, Alignment.Companion.j, composerImplV, 6);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                boolean z = obj instanceof ProductCard;
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
                if (z) {
                    composerImplV.o(-1852031625);
                    SharedIntrinsicHeightState sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
                    ProductCard productCard = (ProductCard) obj;
                    composerImplV.o(1849434622);
                    Object objG = composerImplV.G();
                    if (objG == composer$Companion$Empty$1) {
                        objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(12);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    Modifier modifierA = rowScopeInstance2.a(companion, 1.0f, true);
                    int i5 = ProductCard.$stable | KyberEngine.KyberPolyBytes;
                    PromotionCardKt.a(productCard, sharedIntrinsicHeightState, (Function1) objG, modifierA, composerImplV, i5, 0);
                    int i6 = i3 + 1;
                    Object objJ = CollectionsKt.J(i6, list);
                    Integer numValueOf = null;
                    ProductCard productCard2 = objJ instanceof ProductCard ? (ProductCard) objJ : null;
                    composerImplV.o(-1852018035);
                    if (productCard2 == null) {
                        rowScopeInstance = rowScopeInstance2;
                    } else {
                        composerImplV.o(1849434622);
                        Object objG2 = composerImplV.G();
                        if (objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(13);
                            composerImplV.A(objG2);
                        }
                        composerImplV.V(false);
                        rowScopeInstance = rowScopeInstance2;
                        PromotionCardKt.a(productCard2, sharedIntrinsicHeightState, (Function1) objG2, rowScopeInstance.a(companion, 1.0f, true), composerImplV, i5, 0);
                        numValueOf = Integer.valueOf(i3);
                        i3 = i6;
                    }
                    composerImplV.V(false);
                    if (numValueOf == null) {
                        SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
                    }
                    composerImplV.V(false);
                } else if (obj instanceof ProductHeroCard) {
                    composerImplV.o(-1852002960);
                    ProductCard productCard3 = ((ProductHeroCard) obj).f6905a;
                    composerImplV.o(1849434622);
                    Object objG3 = composerImplV.G();
                    if (objG3 == composer$Companion$Empty$1) {
                        objG3 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(14);
                        composerImplV.A(objG3);
                    }
                    composerImplV.V(false);
                    ComposerImpl composerImpl = composerImplV;
                    PromotionHeroCardKt.a(productCard3, (Function1) objG3, rowScopeInstance2.a(companion, 1.0f, true), composerImpl, ProductCard.$stable | 48, 0);
                    composerImplV = composerImpl;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(-1577342535);
                    composerImplV.V(false);
                }
                i3++;
                composerImplV.V(true);
                i2 = 4;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 24, list);
        }
    }
}
