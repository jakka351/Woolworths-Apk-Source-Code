package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeNutritionTileData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeNutritionTileFeatureItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsNutritionTileKt {
    public static final void a(RecipeNutritionTileFeatureItem recipeNutritionTileFeatureItem, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1826040320);
        if ((((composerImplV.n(recipeNutritionTileFeatureItem) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(21);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = SizeKt.b(SemanticsModifierKt.b(companion, true, (Function1) objG), 76, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String upperCase = recipeNutritionTileFeatureItem.f8020a.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 1, 0, null, WxTheme.b(composerImplV).r, composerImplV, 0, 3072, 56830);
            TextKt.b(recipeNutritionTileFeatureItem.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, WxTheme.b(composerImplV).z, composerImplV, 0, 3072, 57342);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(recipeNutritionTileFeatureItem, i, 25, modifier2);
        }
    }

    public static final void b(RecipeNutritionTileData recipeNutritionTileData, Modifier modifier, Composer composer, int i) {
        Function0 function0;
        Function2 function2;
        RecipeNutritionTileData nutritionTile = recipeNutritionTileData;
        Intrinsics.h(nutritionTile, "nutritionTile");
        ArrayList arrayList = nutritionTile.g;
        ComposerImpl composerImplV = composer.v(-2009337165);
        if (((i | (composerImplV.I(nutritionTile) ? 4 : 2)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            long jB = WxTheme.a(composerImplV).b();
            float f = 12;
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, jB, roundedCornerShapeB);
            float f2 = 16;
            Modifier modifierF = PaddingKt.f(modifierB, f2);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierF);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            TextKt.b(nutritionTile.f8019a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).y, composerImplV, 0, 0, 65534);
            Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                function0 = function02;
                composerImplV.K(function0);
            } else {
                function0 = function02;
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                function2 = function24;
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            } else {
                function2 = function24;
            }
            Updater.b(composerImplV, modifierD3, function25);
            NutritionCircleIndicatorKt.b(nutritionTile.d, 0, composerImplV, null);
            Modifier modifierJ = PaddingKt.j(companion, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA3, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD4, function25);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.e(nutritionTile.b);
            int iL = builder.l(new SpanStyle(ToneColors.g, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534));
            try {
                builder.e(" / ");
                builder.i(iL);
                builder.e(nutritionTile.c);
                Function2 function26 = function2;
                Function0 function03 = function0;
                TextKt.c(builder.m(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, WxTheme.b(composerImplV).y, composerImplV, 0, 0, 131070);
                float f3 = 8;
                TextKt.b(nutritionTile.e, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 48, 0, 65528);
                composerImplV.V(true);
                composerImplV.V(true);
                Modifier modifierA = IntrinsicKt.a(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), IntrinsicSize.e);
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
                Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierA);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function03);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function22);
                Updater.b(composerImplV, persistentCompositionLocalMapQ5, function23);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function26);
                }
                Updater.b(composerImplV, modifierD5, function25);
                composerImplV.o(2049369052);
                int i7 = 0;
                for (Object obj : arrayList) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    a((RecipeNutritionTileFeatureItem) obj, null, composerImplV, 0);
                    composerImplV.o(2049372320);
                    if (i7 != CollectionsKt.I(arrayList)) {
                        DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.g, composerImplV, null);
                    }
                    composerImplV.V(false);
                    i7 = i8;
                }
                android.support.v4.media.session.a.C(composerImplV, false, true, true);
                nutritionTile = recipeNutritionTileData;
                TextKt.b(nutritionTile.f, PaddingKt.g(companion, f3, f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 0, 0, 65532);
                composerImplV = composerImplV;
                composerImplV.V(true);
            } catch (Throwable th) {
                builder.i(iL);
                throw th;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(nutritionTile, i, 24, modifier);
        }
    }
}
