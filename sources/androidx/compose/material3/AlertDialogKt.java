package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AlertDialogKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1394a = 280;
    public static final float b = 560;
    public static final float c = 8;
    public static final float d = 12;
    public static final PaddingValuesImpl e;
    public static final PaddingValuesImpl f;
    public static final PaddingValuesImpl g;
    public static final PaddingValuesImpl h;

    static {
        float f2 = 24;
        e = new PaddingValuesImpl(f2, f2, f2, f2);
        float f3 = 16;
        f = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7);
        g = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7);
        h = PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7);
    }

    public static final void a(final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, final Function2 function2, final Function2 function22, final Shape shape, final long j, final float f2, final long j2, final long j3, final long j4, final long j5, Composer composer, final int i) {
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1522575799);
        int i2 = i | 48 | (composerImplV.I(null) ? 256 : 128) | (composerImplV.I(function2) ? 2048 : 1024) | (composerImplV.I(function22) ? 16384 : 8192) | (composerImplV.n(shape) ? 131072 : 65536) | (composerImplV.s(j) ? 1048576 : 524288) | (composerImplV.q(f2) ? 8388608 : 4194304) | (composerImplV.s(j2) ? 67108864 : 33554432) | (composerImplV.s(j3) ? 536870912 : 268435456);
        int i3 = (composerImplV.s(j4) ? (char) 4 : (char) 2) | (composerImplV.s(j5) ? ' ' : (char) 16);
        if ((i2 & 306783379) == 306783378 && (i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            int i4 = i2 >> 12;
            Modifier.Companion companion = Modifier.Companion.d;
            SurfaceKt.a(companion, shape, j, 0L, f2, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-2126308228, new Function2<Composer, Integer, Unit>(function22, j3, j4, j5, j2, composableLambdaImpl) { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                public final /* synthetic */ Function2 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ ComposableLambdaImpl m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.j = j4;
                    this.k = j5;
                    this.l = j2;
                    this.m = composableLambdaImpl;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        PaddingValuesImpl paddingValuesImpl = AlertDialogKt.e;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierE = PaddingKt.e(companion2, paddingValuesImpl);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function23 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function23);
                        Function2 function24 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function24);
                        Function2 function25 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function25);
                        }
                        Function2 function26 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function26);
                        composer2.o(-1924971291);
                        composer2.l();
                        composer2.o(-1924961479);
                        final Function2 function27 = this.h;
                        if (function27 != null) {
                            ProvideContentColorTextStyleKt.a(this.j, TypographyKt.a(DialogTokens.c, composer2), ComposableLambdaKt.c(434448772, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        Modifier modifierB = ColumnScopeInstance.f948a.b(PaddingKt.e(Modifier.Companion.d, AlertDialogKt.g), Alignment.Companion.m);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p2 = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
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
                                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                        Function2 function28 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer3, p2, function28);
                                        }
                                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                        androidx.camera.core.impl.b.A(0, composer3, function27);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, KyberEngine.KyberPolyBytes);
                        }
                        composer2.l();
                        composer2.o(-1924936431);
                        final Function2 function28 = this.i;
                        if (function28 != null) {
                            ProvideContentColorTextStyleKt.a(this.k, TypographyKt.a(DialogTokens.e, composer2), ComposableLambdaKt.c(-796843771, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        Modifier.Companion companion3 = Modifier.Companion.d;
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                                        Modifier modifierB = columnScopeInstance.b(PaddingKt.e(columnScopeInstance.a(companion3, 1.0f, false), AlertDialogKt.h), Alignment.Companion.m);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p2 = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
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
                                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                        Function2 function29 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer3, p2, function29);
                                        }
                                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                        androidx.camera.core.impl.b.A(0, composer3, function28);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, KyberEngine.KyberPolyBytes);
                        }
                        composer2.l();
                        Modifier modifierB = ColumnScopeInstance.f948a.b(companion2, Alignment.Companion.o);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, function23);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function24);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function25);
                        }
                        Updater.b(composer2, modifierD2, function26);
                        ShapeKeyTokens shapeKeyTokens = DialogTokens.f1575a;
                        ProvideContentColorTextStyleKt.a(this.l, TypographyKt.a(TypographyKeyTokens.h, composer2), this.m, composer2, 0);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i4 & 896) | (i4 & 112) | 12582918 | ((i2 >> 9) & 57344), 104);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier2, function2, function22, shape, j, f2, j2, j3, j4, j5, i) { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ Function2 k;
                public final /* synthetic */ Shape l;
                public final /* synthetic */ long m;
                public final /* synthetic */ float n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;
                public final /* synthetic */ long q;
                public final /* synthetic */ long r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(7);
                    AlertDialogKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final float f2, final float f3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(586821353);
        if ((i & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    public static final void a(ArrayList arrayList, Ref.IntRef intRef, MeasureScope measureScope, float f4, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef2, ArrayList arrayList4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!arrayList.isEmpty()) {
                            intRef.d = measureScope.r1(f4) + intRef.d;
                        }
                        arrayList.add(0, CollectionsKt.G0(arrayList2));
                        arrayList3.add(Integer.valueOf(intRef2.d));
                        arrayList4.add(Integer.valueOf(intRef.d));
                        intRef.d += intRef2.d;
                        intRef3.d = Math.max(intRef3.d, intRef4.d);
                        arrayList2.clear();
                        intRef4.d = 0;
                        intRef2.d = 0;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        int i2;
                        Placeable placeable;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Placeable placeableC0 = ((Measurable) list.get(i3)).c0(j);
                            boolean zIsEmpty = arrayList4.isEmpty();
                            int i4 = size;
                            float f4 = f2;
                            if (zIsEmpty) {
                                i2 = i3;
                                placeable = placeableC0;
                            } else {
                                ArrayList arrayList5 = arrayList;
                                Ref.IntRef intRef5 = intRef2;
                                if (measureScope.r1(f4) + intRef3.d + placeableC0.d <= Constraints.h(j)) {
                                    arrayList = arrayList5;
                                    intRef2 = intRef5;
                                    i2 = i3;
                                    placeable = placeableC0;
                                } else {
                                    i2 = i3;
                                    intRef2 = intRef5;
                                    placeable = placeableC0;
                                    arrayList = arrayList5;
                                    a(arrayList, intRef2, measureScope, f3, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.d = measureScope.r1(f4) + intRef3.d;
                            }
                            arrayList4.add(placeable);
                            intRef3.d += placeable.d;
                            intRef4.d = Math.max(intRef4.d, placeable.e);
                            i3 = i2 + 1;
                            size = i4;
                        }
                        if (!arrayList4.isEmpty()) {
                            a(arrayList, intRef2, measureScope, f3, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int iMax = Math.max(intRef.d, Constraints.j(j));
                        int iMax2 = Math.max(intRef2.d, Constraints.i(j));
                        final ArrayList arrayList6 = arrayList;
                        final float f5 = f2;
                        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                MeasureScope measureScope2;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                ArrayList arrayList7 = arrayList6;
                                int size2 = arrayList7.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    List list2 = (List) arrayList7.get(i5);
                                    int size3 = list2.size();
                                    int[] iArr = new int[size3];
                                    int i6 = 0;
                                    while (true) {
                                        measureScope2 = measureScope;
                                        if (i6 >= size3) {
                                            break;
                                        }
                                        iArr[i6] = ((Placeable) list2.get(i6)).d + (i6 < CollectionsKt.I(list2) ? measureScope2.r1(f5) : 0);
                                        i6++;
                                    }
                                    Arrangement$End$1 arrangement$End$1 = Arrangement.b;
                                    int[] iArr2 = new int[size3];
                                    for (int i7 = 0; i7 < size3; i7++) {
                                        iArr2[i7] = 0;
                                    }
                                    arrangement$End$1.b(measureScope2, iMax, iArr, measureScope2.getD(), iArr2);
                                    int size4 = list2.size();
                                    for (int i8 = 0; i8 < size4; i8++) {
                                        placementScope.e((Placeable) list2.get(i8), iArr2[i8], ((Number) arrayList3.get(i5)).intValue(), BitmapDescriptorFactory.HUE_RED);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y(6, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(f2, f3, composableLambdaImpl, i) { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(439);
                    AlertDialogKt.b(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, final Shape shape, final long j, final long j2, final long j3, final long j4, final float f2, final DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        Function2 function24;
        int i4;
        ComposerImpl composerImplV = composer.v(-919826268);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 |= composerImplV.I(composableLambdaImpl2) ? 32 : 16;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function24 = function2;
            i3 |= composerImplV.I(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function22) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.I(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.n(shape) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.s(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.s(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.s(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.s(j4) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.q(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.n(dialogProperties) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            final Function2 function25 = function24;
            d(function0, modifier, dialogProperties, ComposableLambdaKt.c(-1852840226, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
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
                        final Function2 function26 = function25;
                        final ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1163543932, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    float f3 = AlertDialogKt.c;
                                    float f4 = AlertDialogKt.d;
                                    final Function2 function27 = function26;
                                    final ComposableLambdaImpl composableLambdaImpl5 = composableLambdaImpl4;
                                    AlertDialogKt.b(f3, f4, ComposableLambdaKt.c(1887135077, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                composer4.o(1497073862);
                                                Function2 function28 = function27;
                                                if (function28 != null) {
                                                    function28.invoke(composer4, 0);
                                                }
                                                composer4.l();
                                                composableLambdaImpl5.invoke(composer4, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 438);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        ShapeKeyTokens shapeKeyTokens = DialogTokens.f1575a;
                        AlertDialogKt.a(composableLambdaImplC, null, function22, function23, shape, j, f2, ColorSchemeKt.d(ColorSchemeKeyTokens.p, composer2), j2, j3, j4, composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    AlertDialogKt.c(function0, composableLambdaImpl, modifier, function2, function22, function23, shape, j, j2, j3, j4, f2, dialogProperties, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final Function0 function0, final Modifier modifier, final DialogProperties dialogProperties, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1922902937);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(dialogProperties) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AndroidDialog_androidKt.a(function0, dialogProperties, ComposableLambdaKt.c(905289008, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                        final String strA = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_dialog);
                        Modifier modifierT = SizeKt.t(modifier, AlertDialogKt.f1394a, BitmapDescriptorFactory.HUE_RED, AlertDialogKt.b, BitmapDescriptorFactory.HUE_RED, 10);
                        boolean zN = composer2.n(strA);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    SemanticsPropertiesKt.o((SemanticsPropertyReceiver) obj3, strA);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        Modifier modifierX0 = modifierT.x0(SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG));
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
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
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 112) | (i2 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AlertDialogKt.d(function0, modifier, dialogProperties, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
