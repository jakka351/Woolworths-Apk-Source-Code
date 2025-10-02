package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ratingbar.RatingBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureDifficultyData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsFeaturesKt {
    public static final void a(RecipeFeatureData recipeFeatureData, Modifier modifier, Composer composer, int i) {
        String strName;
        RecipeFeatureData recipeFeatureData2;
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1296273704);
        int i2 = i | (composerImplV.n(recipeFeatureData) ? 4 : 2) | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            recipeFeatureData2 = recipeFeatureData;
            modifier2 = modifier;
        } else {
            RecipeFeatureType recipeFeatureType = recipeFeatureData.h;
            if (recipeFeatureType == null || (strName = recipeFeatureType.name()) == null) {
                strName = "UNKNOWN";
            }
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(recipeFeatureData, 9);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f = 16;
            Modifier modifierA = TestTagKt.a(PaddingKt.f(SizeKt.b(SemanticsModifierKt.b(companion2, true, (Function1) objG), 80, BitmapDescriptorFactory.HUE_RED, 2), f), strName);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierA2 = TestTagKt.a(companion2, strName.concat("_title"));
            String upperCase = recipeFeatureData.d.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            String str = strName;
            TextKt.b(upperCase, modifierA2, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 1, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 3072, 56824);
            Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            recipeFeatureData2 = recipeFeatureData;
            TextKt.b(recipeFeatureData2.e, TestTagKt.a(rowScopeInstance.c(companion2, horizontalAlignmentLine), str.concat("_amount")), 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, WxTheme.b(composerImplV).v, composerImplV, 0, 3072, 57340);
            composerImpl = composerImplV;
            String str2 = recipeFeatureData2.f;
            composerImpl.o(1783075536);
            if (str2 == null) {
                companion = companion2;
            } else {
                companion = companion2;
                TextKt.b(str2, rowScopeInstance.c(companion2, horizontalAlignmentLine), 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, WxTheme.b(composerImpl).o, composerImpl, 0, 3072, 57340);
                composerImpl = composerImpl;
            }
            android.support.v4.media.session.a.C(composerImpl, false, true, true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(recipeFeatureData2, i, 22, modifier2);
        }
    }

    public static final void b(List list, Modifier modifier, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(-1679538463);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, ToneColors.i, composerImplV, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2));
            boolean z2 = true;
            Modifier modifierH = PaddingKt.h(IntrinsicKt.a(SizeKt.e(companion, 1.0f), IntrinsicSize.e), BitmapDescriptorFactory.HUE_RED, 16, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-1655944112);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                if (obj instanceof RecipeFeatureData) {
                    composerImplV.o(2117562064);
                    a((RecipeFeatureData) obj, null, composerImplV, 0);
                    composerImplV.V(false);
                } else if (obj instanceof RecipeFeatureDifficultyData) {
                    composerImplV.o(2117564982);
                    c((RecipeFeatureDifficultyData) obj, null, composerImplV, 0);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1220063222);
                    composerImplV.V(false);
                }
                composerImplV.o(-1655935601);
                if (i4 != CollectionsKt.I(list)) {
                    z = z2;
                    DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composerImplV, null);
                } else {
                    z = z2;
                }
                composerImplV.V(false);
                i4 = i5;
                z2 = z;
            }
            boolean z3 = z2;
            composerImplV.V(false);
            composerImplV.V(z3);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, ToneColors.i, composerImplV, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2));
            composerImplV.V(z3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(list, modifier, i, 0);
        }
    }

    public static final void c(RecipeFeatureDifficultyData recipeFeatureDifficultyData, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1815447176);
        int i2 = i | (composerImplV.n(recipeFeatureDifficultyData) ? 4 : 2) | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(recipeFeatureDifficultyData, 10);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            Modifier modifierC = SizeKt.c(PaddingKt.f(SemanticsModifierKt.b(modifier2, true, (Function1) objG), 16), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierC);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String upperCase = recipeFeatureDifficultyData.d.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 1, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 3072, 56826);
            composerImplV = composerImplV;
            RatingBarKt.a(recipeFeatureDifficultyData.f, recipeFeatureDifficultyData.e, PaddingKt.f(modifier2, 8), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, VectorResources_androidKt.b(R.drawable.ic_circle, 6, composerImplV), 0L, 0L, composerImplV, KyberEngine.KyberPolyBytes, 472);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(recipeFeatureDifficultyData, i, 23, modifier2);
        }
    }
}
