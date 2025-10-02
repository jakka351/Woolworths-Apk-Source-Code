package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScaffoldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1481a = 16;

    public static final void a(final Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, Function2 function24, int i, final long j, final long j2, final WindowInsets windowInsets, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2) {
        int i3;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        long j3;
        ComposableLambdaImpl composableLambdaImpl2;
        final Function2 function28;
        final int i4;
        ComposerImpl composerImpl;
        final int i5;
        final Function2 function29;
        ComposerImpl composerImplV = composer.v(-1219521777);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function25 = function2;
            i3 |= composerImplV.I(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            function26 = function22;
            i3 |= composerImplV.I(function26) ? 256 : 128;
        } else {
            function26 = function22;
        }
        if ((i2 & 3072) == 0) {
            function27 = function23;
            i3 |= composerImplV.I(function27) ? 2048 : 1024;
        } else {
            function27 = function23;
        }
        int i6 = i3 | 221184;
        if ((1572864 & i2) == 0) {
            j3 = j;
            i6 |= composerImplV.s(j3) ? 1048576 : 524288;
        } else {
            j3 = j;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= composerImplV.s(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= composerImplV.n(windowInsets) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i6 |= composerImplV.I(composableLambdaImpl2) ? 536870912 : 268435456;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if ((i6 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            function29 = function24;
            i5 = i;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                function28 = ComposableSingletons$ScaffoldKt.f1421a;
                i4 = 2;
            } else {
                composerImplV.j();
                function28 = function24;
                i4 = i;
            }
            composerImplV.W();
            int i7 = (234881024 & i6) ^ 100663296;
            boolean z = (i7 > 67108864 && composerImplV.n(windowInsets)) || (i6 & 100663296) == 67108864;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new MutableWindowInsets(windowInsets);
                composerImplV.A(objG);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objG;
            int i8 = i6;
            boolean zN = ((i7 > 67108864 && composerImplV.n(windowInsets)) || (i8 & 100663296) == 67108864) | composerImplV.n(mutableWindowInsets);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((SnapshotMutableStateImpl) mutableWindowInsets.f1561a).setValue(WindowInsetsKt.f(windowInsets, (WindowInsets) obj));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            final Function2 function210 = function25;
            final Function2 function211 = function26;
            final Function2 function212 = function27;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            int i9 = i8 >> 12;
            composerImpl = composerImplV;
            SurfaceKt.a(WindowInsetsPaddingKt.c(modifier, (Function1) objG2), null, j3, j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-1979205334, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ScaffoldKt.b(i4, function210, composableLambdaImpl3, function212, function28, mutableWindowInsets, function211, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i9 & 896) | 12582912 | (i9 & 7168), 114);
            i5 = i4;
            function29 = function28;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ScaffoldKt.a(modifier, function2, function22, function23, function29, i5, j, j2, windowInsets, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final int i, final Function2 function2, final ComposableLambdaImpl composableLambdaImpl, final Function2 function22, final Function2 function23, final WindowInsets windowInsets, final Function2 function24, Composer composer, final int i2) {
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        WindowInsets windowInsets2;
        final Function2 function25;
        ComposerImpl composerImplV = composer.v(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.I(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.I(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            windowInsets2 = windowInsets;
            i3 |= composerImplV.n(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((1572864 & i2) == 0) {
            function25 = function24;
            i3 |= composerImplV.I(function25) ? 1048576 : 524288;
        } else {
            function25 = function24;
        }
        if ((i3 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                final WindowInsets windowInsets3 = windowInsets2;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function26 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        WindowInsets windowInsets4;
                        Object obj4;
                        Object obj5;
                        FabPlacement fabPlacement;
                        Object obj6;
                        ArrayList arrayList;
                        Integer numValueOf;
                        int i4;
                        final int i5;
                        int iR1;
                        int iC;
                        Object obj7;
                        Object obj8;
                        int i6;
                        int iR12;
                        int iR13;
                        final SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                        long j = ((Constraints) obj2).f2197a;
                        int iH = Constraints.h(j);
                        final int iG = Constraints.g(j);
                        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
                        List listX0 = subcomposeMeasureScope.X0(ScaffoldLayoutContent.d, function2);
                        ArrayList arrayList2 = new ArrayList(listX0.size());
                        int size = listX0.size();
                        for (int iF = 0; iF < size; iF = androidx.camera.core.impl.b.f((Measurable) listX0.get(iF), jA, arrayList2, iF, 1)) {
                        }
                        int i7 = 1;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int i8 = ((Placeable) obj3).e;
                            int I = CollectionsKt.I(arrayList2);
                            if (1 <= I) {
                                int i9 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i9);
                                    int i10 = ((Placeable) obj9).e;
                                    if (i8 < i10) {
                                        obj3 = obj9;
                                        i8 = i10;
                                    }
                                    if (i9 == I) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj3;
                        int i11 = placeable != null ? placeable.e : 0;
                        List listX02 = subcomposeMeasureScope.X0(ScaffoldLayoutContent.f, function22);
                        ArrayList arrayList3 = new ArrayList(listX02.size());
                        int size2 = listX02.size();
                        int iF2 = 0;
                        while (true) {
                            windowInsets4 = windowInsets3;
                            if (iF2 >= size2) {
                                break;
                            }
                            iF2 = androidx.camera.core.impl.b.f((Measurable) listX02.get(iF2), ConstraintsKt.i((-windowInsets4.d(subcomposeMeasureScope, subcomposeMeasureScope.getD())) - windowInsets4.b(subcomposeMeasureScope, subcomposeMeasureScope.getD()), -windowInsets4.c(subcomposeMeasureScope), jA), arrayList3, iF2, 1);
                            i7 = 1;
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int i12 = ((Placeable) obj4).e;
                            int I2 = CollectionsKt.I(arrayList4);
                            if (i7 <= I2) {
                                int i13 = i7;
                                while (true) {
                                    Object obj10 = arrayList4.get(i13);
                                    int i14 = ((Placeable) obj10).e;
                                    if (i12 < i14) {
                                        i12 = i14;
                                        obj4 = obj10;
                                    }
                                    if (i13 == I2) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj4;
                        int i15 = placeable2 != null ? placeable2.e : 0;
                        if (arrayList4.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList4.get(0);
                            int i16 = ((Placeable) obj5).d;
                            int I3 = CollectionsKt.I(arrayList4);
                            if (1 <= I3) {
                                int i17 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i17);
                                    int i18 = ((Placeable) obj11).d;
                                    if (i16 < i18) {
                                        i16 = i18;
                                        obj5 = obj11;
                                    }
                                    if (i17 == I3) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj5;
                        int i19 = placeable3 != null ? placeable3.d : 0;
                        List listX03 = subcomposeMeasureScope.X0(ScaffoldLayoutContent.g, function23);
                        final ArrayList arrayList5 = new ArrayList(listX03.size());
                        int size3 = listX03.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            int i21 = i11;
                            ArrayList arrayList6 = arrayList4;
                            ArrayList arrayList7 = arrayList2;
                            int i22 = i15;
                            Placeable placeableC0 = ((Measurable) listX03.get(i20)).c0(ConstraintsKt.i((-windowInsets4.d(subcomposeMeasureScope, subcomposeMeasureScope.getD())) - windowInsets4.b(subcomposeMeasureScope, subcomposeMeasureScope.getD()), -windowInsets4.c(subcomposeMeasureScope), jA));
                            if (placeableC0.e == 0 || placeableC0.d == 0) {
                                placeableC0 = null;
                            }
                            if (placeableC0 != null) {
                                arrayList5.add(placeableC0);
                            }
                            i20++;
                            i11 = i21;
                            arrayList4 = arrayList6;
                            arrayList2 = arrayList7;
                            i15 = i22;
                        }
                        final int i23 = i11;
                        final ArrayList arrayList8 = arrayList4;
                        final ArrayList arrayList9 = arrayList2;
                        int i24 = i15;
                        boolean zIsEmpty = arrayList5.isEmpty();
                        int i25 = i;
                        if (zIsEmpty) {
                            fabPlacement = null;
                        } else {
                            if (arrayList5.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList5.get(0);
                                int i26 = ((Placeable) obj7).d;
                                int I4 = CollectionsKt.I(arrayList5);
                                if (1 <= I4) {
                                    int i27 = 1;
                                    while (true) {
                                        Object obj12 = arrayList5.get(i27);
                                        int i28 = ((Placeable) obj12).d;
                                        if (i26 < i28) {
                                            i26 = i28;
                                            obj7 = obj12;
                                        }
                                        if (i27 == I4) {
                                            break;
                                        }
                                        i27++;
                                    }
                                }
                            }
                            Intrinsics.e(obj7);
                            int i29 = ((Placeable) obj7).d;
                            if (arrayList5.isEmpty()) {
                                i6 = i29;
                                obj8 = null;
                            } else {
                                obj8 = arrayList5.get(0);
                                int i30 = ((Placeable) obj8).e;
                                int I5 = CollectionsKt.I(arrayList5);
                                if (1 <= I5) {
                                    int i31 = 1;
                                    while (true) {
                                        Object obj13 = arrayList5.get(i31);
                                        i6 = i29;
                                        int i32 = ((Placeable) obj13).e;
                                        if (i30 < i32) {
                                            i30 = i32;
                                            obj8 = obj13;
                                        }
                                        if (i31 == I5) {
                                            break;
                                        }
                                        i31++;
                                        i29 = i6;
                                    }
                                } else {
                                    i6 = i29;
                                }
                            }
                            Intrinsics.e(obj8);
                            int i33 = ((Placeable) obj8).e;
                            if (i25 != 0) {
                                if (i25 != 2 && i25 != 3) {
                                    iR12 = (iH - i6) / 2;
                                } else if (subcomposeMeasureScope.getD() == LayoutDirection.d) {
                                    iR13 = subcomposeMeasureScope.r1(ScaffoldKt.f1481a);
                                    iR12 = (iH - iR13) - i6;
                                } else {
                                    iR12 = subcomposeMeasureScope.r1(ScaffoldKt.f1481a);
                                }
                                fabPlacement = new FabPlacement(iR12, i33);
                            } else if (subcomposeMeasureScope.getD() == LayoutDirection.d) {
                                iR12 = subcomposeMeasureScope.r1(ScaffoldKt.f1481a);
                                fabPlacement = new FabPlacement(iR12, i33);
                            } else {
                                iR13 = subcomposeMeasureScope.r1(ScaffoldKt.f1481a);
                                iR12 = (iH - iR13) - i6;
                                fabPlacement = new FabPlacement(iR12, i33);
                            }
                        }
                        final Function2 function27 = function25;
                        List listX04 = subcomposeMeasureScope.X0(ScaffoldLayoutContent.h, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj14, Object obj15) {
                                Composer composer2 = (Composer) obj14;
                                if ((((Number) obj15).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    function27.invoke(composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -2146438447));
                        ArrayList arrayList10 = new ArrayList(listX04.size());
                        int size4 = listX04.size();
                        int iF3 = 0;
                        while (iF3 < size4) {
                            ArrayList arrayList11 = arrayList10;
                            iF3 = androidx.camera.core.impl.b.f((Measurable) listX04.get(iF3), jA, arrayList11, iF3, 1);
                            windowInsets4 = windowInsets4;
                            arrayList10 = arrayList11;
                        }
                        ArrayList arrayList12 = arrayList10;
                        WindowInsets windowInsets5 = windowInsets4;
                        int i34 = 1;
                        if (arrayList12.isEmpty()) {
                            arrayList = arrayList12;
                            obj6 = null;
                        } else {
                            obj6 = arrayList12.get(0);
                            int i35 = ((Placeable) obj6).e;
                            int I6 = CollectionsKt.I(arrayList12);
                            if (1 <= I6) {
                                while (true) {
                                    Object obj14 = arrayList12.get(i34);
                                    arrayList = arrayList12;
                                    int i36 = ((Placeable) obj14).e;
                                    if (i35 < i36) {
                                        i35 = i36;
                                        obj6 = obj14;
                                    }
                                    if (i34 == I6) {
                                        break;
                                    }
                                    i34++;
                                    arrayList12 = arrayList;
                                }
                            } else {
                                arrayList = arrayList12;
                            }
                        }
                        Placeable placeable4 = (Placeable) obj6;
                        Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.e) : null;
                        if (fabPlacement != null) {
                            int i37 = fabPlacement.b;
                            if (numValueOf2 == null || i25 == 3) {
                                iR1 = subcomposeMeasureScope.r1(ScaffoldKt.f1481a) + i37;
                                iC = windowInsets5.c(subcomposeMeasureScope);
                            } else {
                                iR1 = numValueOf2.intValue() + i37;
                                iC = subcomposeMeasureScope.r1(ScaffoldKt.f1481a);
                            }
                            numValueOf = Integer.valueOf(iC + iR1);
                        } else {
                            numValueOf = null;
                        }
                        if (i24 != 0) {
                            int iIntValue = i24 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets5.c(subcomposeMeasureScope));
                            i4 = iH;
                            i5 = iIntValue;
                        } else {
                            i4 = iH;
                            i5 = 0;
                        }
                        final FabPlacement fabPlacement2 = fabPlacement;
                        final WindowInsets windowInsets6 = windowInsets3;
                        final ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                        final Integer num = numValueOf2;
                        final ArrayList arrayList13 = arrayList;
                        List listX05 = subcomposeMeasureScope.X0(ScaffoldLayoutContent.e, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj15, Object obj16) {
                                Integer num2;
                                Composer composer2 = (Composer) obj15;
                                if ((((Number) obj16).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    WindowInsets windowInsets7 = windowInsets6;
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                    PaddingValues paddingValuesE = WindowInsetsKt.e(windowInsets7, subcomposeMeasureScope2);
                                    composableLambdaImpl4.invoke(new PaddingValuesImpl(PaddingKt.d(paddingValuesE, subcomposeMeasureScope2.getD()), arrayList9.isEmpty() ? paddingValuesE.getB() : subcomposeMeasureScope2.B(i23), PaddingKt.c(paddingValuesE, subcomposeMeasureScope2.getD()), (arrayList13.isEmpty() || (num2 = num) == null) ? paddingValuesE.getD() : subcomposeMeasureScope2.B(num2.intValue())), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1213360416));
                        final ArrayList arrayList14 = new ArrayList(listX05.size());
                        int size5 = listX05.size();
                        for (int iF4 = 0; iF4 < size5; iF4 = androidx.camera.core.impl.b.f((Measurable) listX05.get(iF4), jA, arrayList14, iF4, 1)) {
                        }
                        final int i38 = i19;
                        final WindowInsets windowInsets7 = windowInsets3;
                        final int i39 = i4;
                        final Integer num2 = numValueOf;
                        return subcomposeMeasureScope.L0(i39, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                int i40;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj15;
                                ArrayList arrayList15 = arrayList14;
                                int size6 = arrayList15.size();
                                for (int i41 = 0; i41 < size6; i41++) {
                                    placementScope.e((Placeable) arrayList15.get(i41), 0, 0, BitmapDescriptorFactory.HUE_RED);
                                }
                                ArrayList arrayList16 = arrayList9;
                                int size7 = arrayList16.size();
                                for (int i42 = 0; i42 < size7; i42++) {
                                    placementScope.e((Placeable) arrayList16.get(i42), 0, 0, BitmapDescriptorFactory.HUE_RED);
                                }
                                ArrayList arrayList17 = arrayList8;
                                int size8 = arrayList17.size();
                                int i43 = 0;
                                while (true) {
                                    i40 = iG;
                                    if (i43 >= size8) {
                                        break;
                                    }
                                    Placeable placeable5 = (Placeable) arrayList17.get(i43);
                                    int i44 = (i39 - i38) / 2;
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                    placementScope.e(placeable5, windowInsets7.d(subcomposeMeasureScope2, subcomposeMeasureScope2.getD()) + i44, i40 - i5, BitmapDescriptorFactory.HUE_RED);
                                    i43++;
                                }
                                ArrayList arrayList18 = arrayList13;
                                int size9 = arrayList18.size();
                                for (int i45 = 0; i45 < size9; i45++) {
                                    Placeable placeable6 = (Placeable) arrayList18.get(i45);
                                    Integer num3 = num;
                                    placementScope.e(placeable6, 0, i40 - (num3 != null ? num3.intValue() : 0), BitmapDescriptorFactory.HUE_RED);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    ArrayList arrayList19 = arrayList5;
                                    int size10 = arrayList19.size();
                                    for (int i46 = 0; i46 < size10; i46++) {
                                        Placeable placeable7 = (Placeable) arrayList19.get(i46);
                                        int i47 = fabPlacement3.f1447a;
                                        Integer num4 = num2;
                                        Intrinsics.e(num4);
                                        placementScope.e(placeable7, i47, i40 - num4.intValue(), BitmapDescriptorFactory.HUE_RED);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(function26);
                objG = function26;
            }
            SubcomposeLayoutKt.a(null, (Function2) objG, composerImplV, 0, 1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ScaffoldKt.b(i, function2, composableLambdaImpl, function22, function23, windowInsets, function24, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
