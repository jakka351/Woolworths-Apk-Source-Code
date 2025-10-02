package au.com.woolworths.shop.product.details.ui.linkdedicatedviews;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.account.preferences.f;
import au.com.woolworths.feature.shop.instore.cart.ui.d;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.c;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NutritionalInfoScreenKt {
    public static final void a(final NutritionInfo nutritionalInfo, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(nutritionalInfo, "nutritionalInfo");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-266144363);
        int i2 = (composerImplV.I(nutritionalInfo) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(643772601, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt$NutritionalInfoScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1930209675, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt$NutritionalInfoScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final Function0 function02 = function0;
                                    TopNavBarKt.a("Nutritional Information", null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-966746045, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt.NutritionalInfoScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG = composer4.G();
                                                if (zN || objG == Composer.Companion.f1624a) {
                                                    objG = new c(10, function03);
                                                    composer4.A(objG);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC, (Function0) objG, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663302, 766);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final NutritionInfo nutritionInfo = nutritionalInfo;
                        ScaffoldKt.a(null, composableLambdaImplC, null, null, 0L, null, ComposableLambdaKt.c(103756108, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt$NutritionalInfoScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j;
                                TextStyle textStyle;
                                PaddingValues paddingVals = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingVals, "paddingVals");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(paddingVals) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierB = ScrollKt.b(PaddingKt.e(companion, paddingVals), ScrollKt.a(composer3), true);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierB);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, columnMeasurePolicyA, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function24);
                                    NutritionInfo nutritionInfo2 = nutritionInfo;
                                    List list = nutritionInfo2.d;
                                    List list2 = nutritionInfo2.h;
                                    List<String> list3 = nutritionInfo2.g;
                                    NutritionalInfoScreenKt.b(list, nutritionInfo2.e, composer3, 0);
                                    float size = 1.0f / list3.size();
                                    composer3.o(1849434622);
                                    Object objG = composer3.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (objG == composer$Companion$Empty$1) {
                                        objG = new au.com.woolworths.shop.product.details.ui.a(9);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    Modifier modifierA = SemanticsModifierKt.a(companion, (Function1) objG);
                                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                    BiasAlignment.Vertical vertical = Alignment.Companion.j;
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer3, 0);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierA);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, function2);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        b.z(p2, composer3, p2, function23);
                                    }
                                    Updater.b(composer3, modifierD2, function24);
                                    composer3.o(-1732860208);
                                    for (String str : list3) {
                                        composer3.o(1849434622);
                                        Object objG2 = composer3.G();
                                        if (objG2 == composer$Companion$Empty$1) {
                                            objG2 = new au.com.woolworths.shop.product.details.ui.a(10);
                                            composer3.A(objG2);
                                        }
                                        composer3.l();
                                        float f = size;
                                        NutritionalInfoScreenKt.c(f, CoreTheme.f(composer3).f5120a.b.c, str, SemanticsModifierKt.a(companion, (Function1) objG2), null, composer3, 6, 16);
                                        vertical = vertical;
                                        size = f;
                                    }
                                    BiasAlignment.Vertical vertical2 = vertical;
                                    float f2 = size;
                                    composer3.l();
                                    composer3.f();
                                    composer3.o(479452393);
                                    int i3 = 0;
                                    for (Object obj6 : list2) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        List list4 = (List) list2.get(i3);
                                        composer3.o(1849434622);
                                        Object objG3 = composer3.G();
                                        if (objG3 == composer$Companion$Empty$1) {
                                            objG3 = new au.com.woolworths.shop.product.details.ui.a(11);
                                            composer3.A(objG3);
                                        }
                                        composer3.l();
                                        Modifier modifierB2 = SemanticsModifierKt.b(companion, true, (Function1) objG3);
                                        int i5 = i3 % 2;
                                        if (i5 + ((((i5 ^ 2) & ((-i5) | i5)) >> 31) & 2) == 0) {
                                            composer3.o(-1785664593);
                                            j = CoreTheme.b(composer3).e.f4848a.d;
                                            composer3.l();
                                        } else {
                                            composer3.o(-1785539663);
                                            j = CoreTheme.b(composer3).e.f4848a.c;
                                            composer3.l();
                                        }
                                        Modifier modifierB3 = BackgroundKt.b(modifierB2, j, RectangleShapeKt.f1779a);
                                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical2, composer3, 0);
                                        int p3 = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                                        Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierB3);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function03 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function03);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, rowMeasurePolicyA2, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                                        Function2 function25 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                                            b.z(p3, composer3, p3, function25);
                                        }
                                        Updater.b(composer3, modifierD3, ComposeUiNode.Companion.d);
                                        composer3.o(-1933705216);
                                        int i6 = 0;
                                        for (Object obj7 : list4) {
                                            int i7 = i6 + 1;
                                            if (i6 < 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            String strQ = StringsKt.Q(Intrinsics.c(list4.get(i6), "-") ? DevicePublicKeyStringDef.NONE : (String) list4.get(i6), "Approx.", "Approx. ", false);
                                            String str2 = (String) list4.get(i6);
                                            String str3 = list3.get(i6) + ", " + strQ + ",";
                                            if (i6 == 0) {
                                                composer3.o(1206979538);
                                                textStyle = CoreTheme.f(composer3).f5120a.b.c;
                                                composer3.l();
                                            } else {
                                                composer3.o(1207091665);
                                                textStyle = CoreTheme.f(composer3).f5120a.b.f5123a;
                                                composer3.l();
                                            }
                                            NutritionalInfoScreenKt.c(f2, textStyle, str2, null, str3, composer3, 6, 8);
                                            i6 = i7;
                                            list4 = list4;
                                        }
                                        composer3.l();
                                        composer3.f();
                                        i3 = i4;
                                    }
                                    composer3.l();
                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composer3, null);
                                    TextKt.a(nutritionInfo2.f, CoreTheme.f(composer3).b.f5125a.b, PaddingKt.g(companion, 16, 12), 0L, null, 0, 0, false, 0, null, composer3, KyberEngine.KyberPolyBytes, 1016);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 125);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(nutritionalInfo, i, 13, onNavigateUp);
        }
    }

    public static final void b(List list, List list2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1079219668);
        if ((((composerImplV.I(list) ? 4 : 2) | i | (composerImplV.I(list2) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.product.details.ui.a(7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, function24, 1849434622);
            if (objF == composer$Companion$Empty$1) {
                objF = new au.com.woolworths.shop.product.details.ui.a(8);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(companion, false, (Function1) objF);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-303511571);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c(0.5f, CoreTheme.f(composerImplV).f5120a.c.c, (String) it.next(), null, null, composerImplV, 54, 24);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            Modifier modifierB3 = BackgroundKt.b(companion, CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB3);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, ComposeUiNode.Companion.f);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function25);
            }
            Updater.b(composerImplV, modifierD3, ComposeUiNode.Companion.d);
            composerImplV.o(1454493585);
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                c(0.5f, CoreTheme.f(composerImplV).f5120a.b.f5123a, (String) list2.get(i5), null, list.get(i5) + ", " + list2.get(i5), composerImplV, 54, 8);
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(list, i, 29, list2);
        }
    }

    public static final void c(float f, TextStyle style, String text, Modifier modifier, String str, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        String str3;
        Modifier modifier3;
        Intrinsics.h(style, "style");
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(1701884445);
        if ((i & 48) == 0) {
            i3 = i | (composerImplV.q(f) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i6 = i3 | (composerImplV.n(style) ? 256 : 128) | (composerImplV.n(text) ? 2048 : 1024);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i6 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 196608;
            str2 = str;
        } else {
            str2 = str;
            i5 = i4 | (composerImplV.n(str2) ? 131072 : 65536);
        }
        if ((74899 & i5) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
            str3 = str2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i7 != 0 ? companion : modifier2;
            String str4 = i8 != 0 ? null : str2;
            Modifier modifierA = RowScopeInstance.f974a.a(companion, f, true);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i9 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                b.B(i9, composerImplV, i9, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierG = PaddingKt.g(modifier4, 16, 12);
            composerImplV.o(-1633490746);
            boolean z = ((i5 & 7168) == 2048) | ((458752 & i5) == 131072);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(str4, text, 5);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifier5 = modifier4;
            TextKt.a(text, style, SemanticsModifierKt.a(modifierG, (Function1) objG), 0L, null, 0, 0, false, 0, null, composerImplV, ((i5 >> 9) & 14) | ((i5 >> 3) & 112), 1016);
            composerImplV.V(true);
            str3 = str4;
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(f, style, text, modifier3, str3, i, i2);
        }
    }
}
