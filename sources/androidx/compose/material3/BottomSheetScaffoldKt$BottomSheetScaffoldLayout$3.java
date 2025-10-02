package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ ComposableLambdaImpl j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ ComposableLambdaImpl l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ SheetState n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function0 function0, SheetState sheetState, long j, long j2, int i) {
        super(2);
        this.h = modifier;
        this.i = function2;
        this.j = composableLambdaImpl;
        this.k = composableLambdaImpl2;
        this.l = composableLambdaImpl3;
        this.m = function0;
        this.n = sheetState;
        this.o = j;
        this.p = j2;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Modifier modifier;
        ComposableLambdaImpl composableLambdaImpl;
        final Function0 function0;
        Function2 function2;
        long j;
        final SheetState sheetState;
        int i2;
        Function0 function02;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.q | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(-1651214892);
        int i3 = iA & 6;
        final Modifier modifier2 = this.h;
        if (i3 == 0) {
            i = (composerImplV.n(modifier2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        Function2 function22 = this.i;
        if (i4 == 0) {
            i |= composerImplV.I(function22) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        final ComposableLambdaImpl composableLambdaImpl2 = this.j;
        if (i5 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        }
        int i6 = iA & 3072;
        ComposableLambdaImpl composableLambdaImpl3 = this.k;
        if (i6 == 0) {
            i |= composerImplV.I(composableLambdaImpl3) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        ComposableLambdaImpl composableLambdaImpl4 = this.l;
        if (i7 == 0) {
            i |= composerImplV.I(composableLambdaImpl4) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        Function0 function03 = this.m;
        if (i8 == 0) {
            i |= composerImplV.I(function03) ? 131072 : 65536;
        }
        int i9 = 1572864 & iA;
        SheetState sheetState2 = this.n;
        if (i9 == 0) {
            i |= composerImplV.n(sheetState2) ? 1048576 : 524288;
        }
        int i10 = 12582912 & iA;
        final long j2 = this.o;
        if (i10 == 0) {
            i |= composerImplV.s(j2) ? 8388608 : 4194304;
        }
        int i11 = 100663296 & iA;
        final long j3 = this.p;
        if (i11 == 0) {
            i |= composerImplV.s(j3) ? 67108864 : 33554432;
        }
        if ((38347923 & i) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            function02 = function03;
            modifier = modifier2;
            composableLambdaImpl = composableLambdaImpl3;
            i2 = iA;
            function2 = function22;
            j = j3;
            sheetState = sheetState2;
        } else {
            List listR = CollectionsKt.R(function22 == null ? ComposableSingletons$BottomSheetScaffoldKt.f1416a : function22, ComposableLambdaKt.c(398963586, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        SurfaceKt.a(modifier2, null, j2, j3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, composableLambdaImpl2, composer, 0, 114);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composableLambdaImpl3, composableLambdaImpl4);
            boolean z = ((i & 458752) == 131072) | ((3670016 & i) == 1048576);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                modifier = modifier2;
                composableLambdaImpl = composableLambdaImpl3;
                function0 = function03;
                function2 = function22;
                j = j3;
                sheetState = sheetState2;
                objG = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list, long j4) {
                        Integer numValueOf;
                        ArrayList arrayList = (ArrayList) list;
                        List list2 = (List) arrayList.get(0);
                        List list3 = (List) arrayList.get(1);
                        List list4 = (List) arrayList.get(2);
                        List list5 = (List) arrayList.get(3);
                        final int iH = Constraints.h(j4);
                        final int iG = Constraints.g(j4);
                        long jA = Constraints.a(j4, 0, 0, 0, 0, 10);
                        final ArrayList arrayList2 = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int iF = 0; iF < size; iF = androidx.camera.core.impl.b.f((Measurable) list4.get(iF), jA, arrayList2, iF, 1)) {
                        }
                        final ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int iF2 = 0; iF2 < size2; iF2 = androidx.camera.core.impl.b.f((Measurable) list2.get(iF2), jA, arrayList3, iF2, 1)) {
                        }
                        if (arrayList3.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList3.get(0)).e);
                            int I = CollectionsKt.I(arrayList3);
                            if (1 <= I) {
                                int i12 = 1;
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList3.get(i12)).e);
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i12 == I) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jA2 = Constraints.a(jA, 0, 0, 0, iG - iIntValue, 7);
                        final ArrayList arrayList4 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int iF3 = 0; iF3 < size3; iF3 = androidx.camera.core.impl.b.f((Measurable) list3.get(iF3), jA2, arrayList4, iF3, 1)) {
                        }
                        final ArrayList arrayList5 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int iF4 = 0; iF4 < size4; iF4 = androidx.camera.core.impl.b.f((Measurable) list5.get(iF4), jA, arrayList5, iF4, 1)) {
                        }
                        final SheetState sheetState3 = sheetState;
                        final Function0 function04 = function0;
                        return measureScope.L0(iH, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[2] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[0] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iB;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj3;
                                ArrayList arrayList6 = arrayList2;
                                Integer numValueOf5 = null;
                                if (arrayList6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(((Placeable) arrayList6.get(0)).d);
                                    int I2 = CollectionsKt.I(arrayList6);
                                    if (1 <= I2) {
                                        int i13 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(((Placeable) arrayList6.get(i13)).d);
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i13 == I2) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                }
                                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                int i14 = iH;
                                int iMax = Integer.max(0, (i14 - iIntValue2) / 2);
                                ArrayList arrayList7 = arrayList5;
                                if (arrayList7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(((Placeable) arrayList7.get(0)).d);
                                    int I3 = CollectionsKt.I(arrayList7);
                                    if (1 <= I3) {
                                        int i15 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(((Placeable) arrayList7.get(i15)).d);
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i15 == I3) {
                                                break;
                                            }
                                            i15++;
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                if (!arrayList7.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(((Placeable) arrayList7.get(0)).e);
                                    int I4 = CollectionsKt.I(arrayList7);
                                    if (1 <= I4) {
                                        int i16 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(((Placeable) arrayList7.get(i16)).e);
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i16 == I4) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                }
                                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i17 = (i14 - iIntValue3) / 2;
                                int iOrdinal = sheetState3.b().ordinal();
                                if (iOrdinal == 0 || iOrdinal == 1) {
                                    iB = iG;
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iB = MathKt.b(((Number) function04.invoke()).floatValue());
                                }
                                int i18 = iB - iIntValue4;
                                ArrayList arrayList8 = arrayList4;
                                int size5 = arrayList8.size();
                                for (int i19 = 0; i19 < size5; i19++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList8.get(i19), 0, iIntValue);
                                }
                                ArrayList arrayList9 = arrayList3;
                                int size6 = arrayList9.size();
                                for (int i20 = 0; i20 < size6; i20++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList9.get(i20), 0, 0);
                                }
                                int size7 = arrayList6.size();
                                for (int i21 = 0; i21 < size7; i21++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList6.get(i21), iMax, 0);
                                }
                                int size8 = arrayList7.size();
                                for (int i22 = 0; i22 < size8; i22++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList7.get(i22), i17, i18);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            } else {
                modifier = modifier2;
                composableLambdaImpl = composableLambdaImpl3;
                function0 = function03;
                function2 = function22;
                j = j3;
                sheetState = sheetState2;
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
            i2 = iA;
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            function02 = function0;
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                androidx.camera.core.impl.b.B(i12, composerImplV, i12, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y(0, composableLambdaImplB, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(modifier, function2, composableLambdaImpl2, composableLambdaImpl, composableLambdaImpl4, function02, sheetState, j2, j, i2);
        }
        return Unit.f24250a;
    }
}
