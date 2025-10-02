package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SimpleTableLayoutKt {
    public static final void a(final int i, final List rows, final Function1 drawDecorations, final float f, Modifier modifier, Composer composer, int i2) {
        int i3;
        Intrinsics.h(rows, "rows");
        Intrinsics.h(drawDecorations, "drawDecorations");
        Intrinsics.h(modifier, "modifier");
        ComposerImpl composerImplV = composer.v(-1130591255);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(rows) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(drawDecorations) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.q(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(802039891);
            boolean zI = ((i3 & 14) == 4) | composerImplV.I(rows) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function2() { // from class: com.halilibo.richtext.ui.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        final SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
                        Constraints constraints = (Constraints) obj2;
                        Intrinsics.h(SubcomposeLayout, "$this$SubcomposeLayout");
                        Boolean bool = Boolean.FALSE;
                        final List list = rows;
                        final int i4 = i;
                        ArrayList arrayListO0 = CollectionsKt.O0(SubcomposeLayout.X0(bool, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.SimpleTableLayoutKt$SimpleTableLayout$1$1$measurables$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer2 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    for (List list2 : list) {
                                        if (list2.size() != i4) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        composer2.o(571476473);
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            ((Function2) it.next()).invoke(composer2, 0);
                                        }
                                        composer2.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -223867091)), i4, i4);
                        if (arrayListO0.size() != list.size()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        long j = constraints.f2197a;
                        if (!Constraints.d(j)) {
                            throw new IllegalStateException("Table must have bounded width");
                        }
                        final float f2 = f;
                        final float fH = (Constraints.h(j) - ((i4 + 1) * f2)) / i4;
                        float size = (arrayListO0.size() + 1) * f2;
                        int iIntValue = 0;
                        long jE = ConstraintsKt.e(ConstraintsKt.b(MathKt.b(fH), 0, 13), j);
                        final ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListO0, 10));
                        Iterator it = arrayListO0.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((Measurable) it2.next()).c0(jE));
                            }
                            arrayList.add(arrayList2);
                        }
                        final ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((List) it3.next()).iterator();
                            if (it4.hasNext()) {
                                Object next = it4.next();
                                if (it4.hasNext()) {
                                    int i5 = ((Placeable) next).e;
                                    do {
                                        Object next2 = it4.next();
                                        int i6 = ((Placeable) next2).e;
                                        if (i5 < i6) {
                                            next = next2;
                                            i5 = i6;
                                        }
                                    } while (it4.hasNext());
                                }
                                obj3 = next;
                            } else {
                                obj3 = null;
                            }
                            Intrinsics.e(obj3);
                            arrayList3.add(Integer.valueOf(((Placeable) obj3).e));
                        }
                        final int iH = Constraints.h(j);
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            iIntValue += ((Number) it5.next()).intValue();
                        }
                        final int iB = MathKt.b(iIntValue + size);
                        final Function1 function1 = drawDecorations;
                        return SubcomposeLayout.L0(iH, iB, EmptyMap.d, new Function1() { // from class: com.halilibo.richtext.ui.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj4;
                                Intrinsics.h(layout, "$this$layout");
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                float f3 = f2;
                                float fFloatValue = f3;
                                int i7 = 0;
                                for (Object obj5 : arrayList) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    float f4 = f3 / 2.0f;
                                    arrayList4.add(Float.valueOf(fFloatValue - f4));
                                    float f5 = f3;
                                    for (Placeable placeable : (List) obj5) {
                                        if (i7 == 0) {
                                            arrayList5.add(Float.valueOf(f5 - f4));
                                        }
                                        layout.e(placeable, MathKt.b(f5), MathKt.b(fFloatValue), BitmapDescriptorFactory.HUE_RED);
                                        f5 += fH + f3;
                                    }
                                    if (i7 == 0) {
                                        arrayList5.add(Float.valueOf(f5 - f4));
                                    }
                                    fFloatValue += ((Number) arrayList3.get(i7)).floatValue() + f3;
                                    i7 = i8;
                                }
                                arrayList4.add(Float.valueOf(fFloatValue - (f3 / 2.0f)));
                                final TableLayoutResult tableLayoutResult = new TableLayoutResult(arrayList4, arrayList5);
                                Boolean bool2 = Boolean.TRUE;
                                final Function1 function12 = function1;
                                Placeable.PlacementScope.h(layout, ((Measurable) CollectionsKt.n0(SubcomposeLayout.X0(bool2, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.SimpleTableLayoutKt$SimpleTableLayout$1$1$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Composer composer2 = (Composer) obj6;
                                        if ((((Number) obj7).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            BoxKt.a((Modifier) function12.invoke(tableLayoutResult), composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -1387549559)))).c0(Constraints.Companion.c(iH, iB)), 0, 0);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SubcomposeLayoutKt.a(modifier, (Function2) objG, composerImplV, (i3 >> 12) & 14, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shared.ui.compose.e(i, rows, drawDecorations, f, modifier, i2);
        }
    }
}
