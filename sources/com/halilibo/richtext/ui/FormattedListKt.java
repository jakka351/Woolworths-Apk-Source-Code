package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FormattedListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f16281a = TextUnitKt.c(8);
    public static final long b = TextUnitKt.c(4);
    public static final long c = TextUnitKt.c(4);
    public static final b d = new b(0);
    public static final b e = new b(1);
    public static final DynamicProvidableCompositionLocal f = new DynamicProvidableCompositionLocal(new c(0));

    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.halilibo.richtext.ui.RichTextScope r15, final com.halilibo.richtext.ui.ListType r16, final java.util.List r17, int r18, final androidx.compose.runtime.internal.ComposableLambdaImpl r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.FormattedListKt.a(com.halilibo.richtext.ui.RichTextScope, com.halilibo.richtext.ui.ListType, java.util.List, int, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final int i, final float f2, final PaddingValuesImpl paddingValuesImpl, final ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(-1888378294);
        int i3 = (composerImplV.r(i) ? 4 : 2) | i2 | (composerImplV.q(f2) ? 32 : 16) | (composerImplV.n(paddingValuesImpl) ? 256 : 128);
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(874495906);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: com.halilibo.richtext.ui.FormattedListKt$PrefixListLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope Layout, List measurables, long j) {
                        Object next;
                        Intrinsics.h(Layout, "$this$Layout");
                        Intrinsics.h(measurables, "measurables");
                        int size = measurables.size();
                        int i4 = i;
                        if (size != i4 * 2) {
                            throw new IllegalStateException("Check failed.");
                        }
                        List list = measurables;
                        Sequence sequenceW = SequencesKt.w(CollectionsKt.n(list), i4);
                        Sequence sequenceE = SequencesKt.e(CollectionsKt.n(list), i4);
                        final List listX = SequencesKt.x(SequencesKt.r(sequenceW, new b(6)));
                        List list2 = listX;
                        Iterator it = list2.iterator();
                        Object next2 = null;
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                int i5 = ((Placeable) next).d;
                                do {
                                    Object next3 = it.next();
                                    int i6 = ((Placeable) next3).d;
                                    if (i5 < i6) {
                                        next = next3;
                                        i5 = i6;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Intrinsics.e(next);
                        final Placeable placeable = (Placeable) next;
                        int iH = Constraints.h(j) - placeable.d;
                        int i7 = 0;
                        final List listX2 = SequencesKt.x(SequencesKt.r(sequenceE, new au.com.woolworths.feature.product.list.compose.filter.e(Constraints.a(j, 0, iH < 0 ? 0 : iH, 0, 0, 13), 8)));
                        List list3 = listX2;
                        Iterator it2 = list3.iterator();
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (it2.hasNext()) {
                                int i8 = ((Placeable) next2).d;
                                do {
                                    Object next4 = it2.next();
                                    int i9 = ((Placeable) next4).d;
                                    if (i8 < i9) {
                                        next2 = next4;
                                        i8 = i9;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        Intrinsics.e(next2);
                        int i10 = placeable.d + ((Placeable) next2).d;
                        Iterator it3 = list3.iterator();
                        int i11 = 0;
                        while (it3.hasNext()) {
                            i11 += ((Placeable) it3.next()).e;
                        }
                        int size2 = listX2.size() - 1;
                        float f3 = f2;
                        int iR1 = (Layout.r1(f3) * size2) + i11;
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            i7 += ((Placeable) it4.next()).e;
                        }
                        int iMax = Math.max(iR1, (Layout.r1(f3) * (listX.size() - 1)) + i7);
                        final int i12 = i;
                        final float f4 = f2;
                        return Layout.L0(i10, iMax, EmptyMap.d, new Function1() { // from class: com.halilibo.richtext.ui.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                                Intrinsics.h(layout, "$this$layout");
                                int i13 = 0;
                                for (int i14 = 0; i14 < i12; i14++) {
                                    Placeable placeable2 = (Placeable) listX.get(i14);
                                    Placeable placeable3 = (Placeable) listX2.get(i14);
                                    int iMax2 = Math.max(placeable2.e, placeable3.e);
                                    MeasureScope measureScope = Layout;
                                    int iR12 = measureScope.r1(f4) + iMax2;
                                    Placeable placeable4 = placeable;
                                    long j2 = ((placeable4.d - placeable2.d) << 32) | ((iR12 - placeable2.e) & 4294967295L);
                                    long jA = Alignment.Companion.c.a(j2, j2, measureScope.getD());
                                    Placeable.PlacementScope.h(layout, placeable2, (int) (jA >> 32), ((int) (jA & 4294967295L)) + i13);
                                    Placeable.PlacementScope.h(layout, placeable3, placeable4.d, i13);
                                    i13 += iR12;
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            composerImplV.V(false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SelectionContainerKt.a(6, composerImplV, ComposableLambdaKt.c(-1117232110, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.FormattedListKt$PrefixListLayout$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (int i5 = 0; i5 < i; i5++) {
                            Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValuesImpl);
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE);
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
                            Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function22 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function22);
                            }
                            Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                            composableLambdaImpl.invoke(Integer.valueOf(i5), composer2, 0);
                            composer2.f();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            composerImplV.o(1936501445);
            for (int i5 = 0; i5 < i; i5++) {
                composableLambdaImpl2.invoke(Integer.valueOf(i5), composerImplV, 48);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.instore.cart.ui.c(i, f2, paddingValuesImpl, composableLambdaImpl, composableLambdaImpl2, i2);
        }
    }

    public static final void c(int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(824663458);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(f.b(0), ComposableLambdaKt.c(20615394, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.FormattedListKt$RestartListLevel$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(composableLambdaImpl, i, 0);
        }
    }
}
