package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ ComposableLambdaImpl j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ ComposableLambdaImpl l;
    public final /* synthetic */ float m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ BottomSheetState p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(Function2 function2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function22, ComposableLambdaImpl composableLambdaImpl3, float f, Function0 function0, int i, BottomSheetState bottomSheetState, int i2) {
        super(2);
        this.h = function2;
        this.i = composableLambdaImpl;
        this.j = composableLambdaImpl2;
        this.k = function22;
        this.l = composableLambdaImpl3;
        this.m = f;
        this.n = function0;
        this.o = i;
        this.p = bottomSheetState;
        this.q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Function2 function2;
        ComposableLambdaImpl composableLambdaImpl;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.q | 1);
        float f = BottomSheetScaffoldKt.f1245a;
        ComposerImpl composerImplV = ((Composer) obj).v(1411837005);
        int i2 = iA & 6;
        Function2 function22 = this.h;
        if (i2 == 0) {
            i = (composerImplV.I(function22) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        ComposableLambdaImpl composableLambdaImpl2 = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        ComposableLambdaImpl composableLambdaImpl3 = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(composableLambdaImpl3) ? 256 : 128;
        }
        int i5 = iA & 3072;
        Function2 function23 = this.k;
        if (i5 == 0) {
            i |= composerImplV.I(function23) ? 2048 : 1024;
        }
        int i6 = iA & 24576;
        ComposableLambdaImpl composableLambdaImpl4 = this.l;
        if (i6 == 0) {
            i |= composerImplV.I(composableLambdaImpl4) ? 16384 : 8192;
        }
        int i7 = 196608 & iA;
        final float f2 = this.m;
        if (i7 == 0) {
            i |= composerImplV.q(f2) ? 131072 : 65536;
        }
        int i8 = 1572864 & iA;
        final Function0 function0 = this.n;
        if (i8 == 0) {
            i |= composerImplV.I(function0) ? 1048576 : 524288;
        }
        int i9 = 12582912 & iA;
        final int i10 = this.o;
        if (i9 == 0) {
            i |= composerImplV.r(i10) ? 8388608 : 4194304;
        }
        int i11 = 100663296 & iA;
        final BottomSheetState bottomSheetState = this.p;
        if (i11 == 0) {
            i |= composerImplV.n(bottomSheetState) ? 67108864 : 33554432;
        }
        if (composerImplV.z(i & 1, (38347923 & i) != 38347922)) {
            List listR = CollectionsKt.R(function22 == null ? ComposableSingletons$BottomSheetScaffoldKt.f1256a : function22, composableLambdaImpl2, composableLambdaImpl3, function23 == null ? ComposableSingletons$BottomSheetScaffoldKt.b : function23, composableLambdaImpl4);
            boolean z = ((29360128 & i) == 8388608) | ((3670016 & i) == 1048576) | ((458752 & i) == 131072) | ((i & 234881024) == 67108864);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new MultiContentMeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v16 */
                    /* JADX WARN: Type inference failed for: r1v18 */
                    /* JADX WARN: Type inference failed for: r1v19 */
                    /* JADX WARN: Type inference failed for: r1v24 */
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        Object obj6;
                        ArrayList arrayList = (ArrayList) list;
                        List list2 = (List) arrayList.get(0);
                        int i12 = 1;
                        List list3 = (List) arrayList.get(1);
                        List list4 = (List) arrayList.get(2);
                        List list5 = (List) arrayList.get(3);
                        List list6 = (List) arrayList.get(4);
                        final int iH = Constraints.h(j);
                        final int iG = Constraints.g(j);
                        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
                        final ArrayList arrayList2 = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int iF = 0; iF < size; iF = b.f((Measurable) list4.get(iF), jA, arrayList2, iF, 1)) {
                        }
                        final ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int iF2 = 0; iF2 < size2; iF2 = b.f((Measurable) list2.get(iF2), jA, arrayList3, iF2, 1)) {
                        }
                        Placeable placeable = null;
                        if (arrayList3.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList3.get(0);
                            int i13 = ((Placeable) obj3).e;
                            int I = CollectionsKt.I(arrayList3);
                            if (1 <= I) {
                                int i14 = 1;
                                while (true) {
                                    Object obj7 = arrayList3.get(i14);
                                    int i15 = ((Placeable) obj7).e;
                                    if (i13 < i15) {
                                        obj3 = obj7;
                                        i13 = i15;
                                    }
                                    if (i14 == I) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj3;
                        final int i16 = placeable2 != null ? placeable2.e : 0;
                        long jA2 = Constraints.a(jA, 0, 0, 0, iG - i16, 7);
                        final ArrayList arrayList4 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int iF3 = 0; iF3 < size3; iF3 = b.f((Measurable) list3.get(iF3), jA2, arrayList4, iF3, 1)) {
                        }
                        final ArrayList arrayList5 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int iF4 = 0; iF4 < size4; iF4 = b.f((Measurable) list5.get(iF4), jA, arrayList5, iF4, 1)) {
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int i17 = ((Placeable) obj4).d;
                            int I2 = CollectionsKt.I(arrayList5);
                            if (1 <= I2) {
                                int i18 = 1;
                                while (true) {
                                    Object obj8 = arrayList5.get(i18);
                                    int i19 = ((Placeable) obj8).d;
                                    if (i17 < i19) {
                                        obj4 = obj8;
                                        i17 = i19;
                                    }
                                    if (i18 == I2) {
                                        break;
                                    }
                                    i18++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj4;
                        final int i20 = placeable3 != null ? placeable3.d : 0;
                        if (arrayList5.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList5.get(0);
                            int i21 = ((Placeable) obj5).e;
                            int I3 = CollectionsKt.I(arrayList5);
                            if (1 <= I3) {
                                int i22 = 1;
                                while (true) {
                                    Object obj9 = arrayList5.get(i22);
                                    int i23 = ((Placeable) obj9).e;
                                    if (i21 < i23) {
                                        obj5 = obj9;
                                        i21 = i23;
                                    }
                                    if (i22 == I3) {
                                        break;
                                    }
                                    i22++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj5;
                        final int i24 = placeable4 != null ? placeable4.e : 0;
                        final ArrayList arrayList6 = new ArrayList(list6.size());
                        int size5 = list6.size();
                        for (int iF5 = 0; iF5 < size5; iF5 = b.f((Measurable) list6.get(iF5), jA, arrayList6, iF5, 1)) {
                        }
                        if (arrayList6.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList6.get(0);
                            int i25 = ((Placeable) obj6).d;
                            int I4 = CollectionsKt.I(arrayList6);
                            if (1 <= I4) {
                                int i26 = 1;
                                while (true) {
                                    Object obj10 = arrayList6.get(i26);
                                    int i27 = ((Placeable) obj10).d;
                                    if (i25 < i27) {
                                        obj6 = obj10;
                                        i25 = i27;
                                    }
                                    if (i26 == I4) {
                                        break;
                                    }
                                    i26++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) obj6;
                        final int i28 = placeable5 != null ? placeable5.d : 0;
                        if (!arrayList6.isEmpty()) {
                            ?? r1 = arrayList6.get(0);
                            int i29 = ((Placeable) r1).e;
                            int I5 = CollectionsKt.I(arrayList6);
                            boolean z2 = r1;
                            if (1 <= I5) {
                                while (true) {
                                    Object obj11 = arrayList6.get(i12);
                                    int i30 = ((Placeable) obj11).e;
                                    r1 = z2;
                                    if (i29 < i30) {
                                        r1 = obj11;
                                        i29 = i30;
                                    }
                                    if (i12 == I5) {
                                        break;
                                    }
                                    i12++;
                                    z2 = r1;
                                }
                            }
                            placeable = r1;
                        }
                        Placeable placeable6 = placeable;
                        final int i31 = placeable6 != null ? placeable6.e : 0;
                        final float f3 = f2;
                        final BottomSheetState bottomSheetState2 = bottomSheetState;
                        final Function0 function02 = function0;
                        final int i32 = i10;
                        return measureScope.L0(iH, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1

                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[0] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        BottomSheetValue bottomSheetValue = BottomSheetValue.d;
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj12) {
                                int iR1;
                                int i33;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj12;
                                int iB = MathKt.b(((Number) function02.invoke()).floatValue());
                                int i34 = iH;
                                MeasureScope measureScope2 = measureScope;
                                int i35 = i32;
                                if (i35 == 0) {
                                    iR1 = measureScope2.r1(BottomSheetScaffoldKt.f1245a);
                                } else {
                                    int i36 = i20;
                                    iR1 = i35 == 1 ? (i34 - i36) / 2 : (i34 - i36) - measureScope2.r1(BottomSheetScaffoldKt.f1245a);
                                }
                                float fT1 = measureScope2.T1(f3);
                                int i37 = i24;
                                int i38 = i37 / 2;
                                int iR12 = fT1 < ((float) i38) ? (iB - i37) - measureScope2.r1(BottomSheetScaffoldKt.f1245a) : iB - i38;
                                int i39 = (i34 - i28) / 2;
                                int iOrdinal = ((BottomSheetValue) ((SnapshotMutableStateImpl) bottomSheetState2.f1247a.g).getD()).ordinal();
                                int i40 = i31;
                                if (iOrdinal == 0) {
                                    i33 = iR12 - i40;
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i33 = iG - i40;
                                }
                                ArrayList arrayList7 = arrayList4;
                                int size6 = arrayList7.size();
                                for (int i41 = 0; i41 < size6; i41++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList7.get(i41), 0, i16);
                                }
                                ArrayList arrayList8 = arrayList3;
                                int size7 = arrayList8.size();
                                for (int i42 = 0; i42 < size7; i42++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList8.get(i42), 0, 0);
                                }
                                ArrayList arrayList9 = arrayList2;
                                int size8 = arrayList9.size();
                                for (int i43 = 0; i43 < size8; i43++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList9.get(i43), 0, 0);
                                }
                                ArrayList arrayList10 = arrayList5;
                                int size9 = arrayList10.size();
                                for (int i44 = 0; i44 < size9; i44++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList10.get(i44), iR1, iR12);
                                }
                                ArrayList arrayList11 = arrayList6;
                                int size10 = arrayList11.size();
                                for (int i45 = 0; i45 < size10; i45++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList11.get(i45), i39, i33);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objG;
            ComposableLambdaImpl composableLambdaImplB = LayoutKt.b(listR);
            boolean zN = composerImplV.n(multiContentMeasurePolicy);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                composerImplV.A(objG2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG2;
            int i12 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            function2 = function22;
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            composableLambdaImpl = composableLambdaImpl2;
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                b.B(i12, composerImplV, i12, function24);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y(0, composableLambdaImplB, composerImplV, true);
        } else {
            function2 = function22;
            composableLambdaImpl = composableLambdaImpl2;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(function2, composableLambdaImpl, composableLambdaImpl3, function23, composableLambdaImpl4, f2, function0, i10, bottomSheetState, iA);
        }
        return Unit.f24250a;
    }
}
