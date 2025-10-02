package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraComparisonSectionItem;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BenefitsComparisonTableKt {
    public static final void a(final EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeadings compareTableColumnHeadings, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1282375689);
        if ((((composerImplV.n(compareTableColumnHeadings) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierB = BackgroundKt.b(companion, ToneColors.k, RectangleShapeKt.f1779a);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(17);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            d(ComposableLambdaKt.c(1989934016, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableHeaderRow$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader compareTableColumnHeader = compareTableColumnHeadings.f6153a;
                        BenefitsComparisonTableKt.b(Alignment.Companion.n, compareTableColumnHeader.f6152a, compareTableColumnHeader.b, composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1595530177, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableHeaderRow$1$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader compareTableColumnHeader = compareTableColumnHeadings.b;
                        BenefitsComparisonTableKt.b(Alignment.Companion.n, compareTableColumnHeader.f6152a, compareTableColumnHeader.b, composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1201126338, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableHeaderRow$1$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader compareTableColumnHeader = compareTableColumnHeadings.c;
                        BenefitsComparisonTableKt.b(Alignment.Companion.n, compareTableColumnHeader.f6152a, compareTableColumnHeader.b, composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SemanticsModifierKt.a(modifierB, (Function1) objG), composerImplV, 438);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_compare_table_divider_horizontal), composerImplV, null);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 14, compareTableColumnHeadings);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.BiasAlignment.Horizontal r11, java.lang.String r12, final java.lang.String r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt.b(androidx.compose.ui.BiasAlignment$Horizontal, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(long j, List list, List list2, List list3, Composer composer, int i) {
        final List list4;
        final List list5;
        final List list6;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1301227084);
        if (((i | (composerImplV.s(j) ? 4 : 2) | (composerImplV.I(list) ? 32 : 16) | (composerImplV.I(list2) ? 256 : 128) | (composerImplV.I(list3) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            list4 = list;
            list5 = list2;
            list6 = list3;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierB = BackgroundKt.b(companion, j, RectangleShapeKt.f1779a);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(context) | composerImplV.I(list) | composerImplV.I(list2) | composerImplV.I(list3);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(context, list, list2, list3, 2);
                list4 = list;
                list5 = list2;
                list6 = list3;
                composerImplV.A(cVar);
                objG = cVar;
            } else {
                list4 = list;
                list5 = list2;
                list6 = list3;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            d(ComposableLambdaKt.c(-1152045443, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableItemRow$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        Updater.b(composer2, columnMeasurePolicyA2, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        composer2.o(1581877451);
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            BenefitsComparisonTableKt.b(horizontal, null, ((EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue) it.next()).b, composer2, 54);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1265655938, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableItemRow$1$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue compareTableRowValue : list5) {
                            BenefitsComparisonTableKt.b(Alignment.Companion.n, compareTableRowValue.f6155a, compareTableRowValue.b, composer2, 6);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1379266433, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$ComparisonTableItemRow$1$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope ComparisonTableRowTemplate = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ComparisonTableRowTemplate, "$this$ComparisonTableRowTemplate");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue compareTableRowValue : list6) {
                            BenefitsComparisonTableKt.b(Alignment.Companion.n, compareTableRowValue.f6155a, compareTableRowValue.b, composer2, 6);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SemanticsModifierKt.a(modifierB, (Function1) objG), composerImpl, 438);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(j, list4, list5, list6, i);
        }
    }

    public static final void d(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Modifier modifier, Composer composer, int i) {
        Function3 function3;
        ComposerImpl composerImplV = composer.v(-1825191145);
        if (((i | (composerImplV.n(modifier) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function3 = composableLambdaImpl3;
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
            IntrinsicSize intrinsicSize = IntrinsicSize.d;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(IntrinsicKt.a(companion, intrinsicSize), 8, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            composableLambdaImpl.invoke(boxScopeInstance, composerImplV, 54);
            composerImplV.V(true);
            DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 5, ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_compare_table_divider_vertical), composerImplV, null);
            Modifier modifierU = SizeKt.u(companion, 168);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierU);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            Modifier modifierA2 = rowScopeInstance.a(companion, 1.0f, true);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierA2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ5, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD5, function24);
            composableLambdaImpl2.invoke(boxScopeInstance, composerImplV, 54);
            composerImplV.V(true);
            DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 5, ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_compare_table_divider_vertical), composerImplV, null);
            Modifier modifierA3 = rowScopeInstance.a(companion, 1.0f, true);
            MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment, false);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImplV.Q();
            Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierA3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD3, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ6, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD6, function24);
            function3 = composableLambdaImpl3;
            function3.invoke(boxScopeInstance, composerImplV, 54);
            composerImplV.V(true);
            composerImplV.V(true);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) composableLambdaImpl, (Object) composableLambdaImpl2, (Object) function3, modifier, i, 6);
        }
    }

    public static final String e(Context context, List list) {
        if (!list.isEmpty()) {
            return CollectionsKt.M(list, "\n", null, null, new b(context, 0), 30);
        }
        String string = context.getString(R.string.everyday_extras_landing_table_item_not_included);
        Intrinsics.e(string);
        return string;
    }
}
