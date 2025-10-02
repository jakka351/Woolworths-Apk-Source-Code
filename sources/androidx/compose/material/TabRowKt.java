package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabRowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1338a = 90;
    public static final TweenSpec b = AnimationSpecKt.e(250, 0, EasingKt.f756a, 2);

    public static final void a(final float f, final int i, final int i2, final long j, final long j2, Composer composer, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, Function3 function3) {
        int i3;
        final float f2;
        final ComposableLambdaImpl composableLambdaImpl2;
        ComposerImpl composerImpl;
        final Function3 function32;
        final Function3 function3C;
        ComposerImpl composerImplV = composer.v(-1473476840);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.s(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i3 |= composerImplV.q(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        int i4 = i3 | 196608;
        if ((i2 & 1572864) == 0) {
            i4 |= composerImplV.I(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i4 |= composerImplV.I(composableLambdaImpl2) ? 8388608 : 4194304;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        int i5 = i4;
        if (composerImplV.z(i5 & 1, (4793491 & i5) != 4793490)) {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                function3C = ComposableLambdaKt.c(-655609869, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        TabRowDefaults.f1337a.b(BitmapDescriptorFactory.HUE_RED, 3072, 6, 0L, (Composer) obj2, TabRowDefaults.c((TabPosition) ((List) obj).get(i)));
                        return Unit.f24250a;
                    }
                }, composerImplV);
            } else {
                composerImplV.j();
                function3C = function3;
            }
            composerImplV.W();
            composerImpl = composerImplV;
            SurfaceKt.a(modifier, null, j, j2, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1455860572, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ScrollState scrollStateA = ScrollKt.a(composer2);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG == obj3) {
                            objG = a.i(composer2.y(), composer2);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objG;
                        boolean zN = composer2.n(scrollStateA) | composer2.n(coroutineScope);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == obj3) {
                            objG2 = new ScrollableTabData(scrollStateA, coroutineScope);
                            composer2.A(objG2);
                        }
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objG2;
                        Modifier modifierB = ClipKt.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.z(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.d, 2), scrollStateA, false)));
                        boolean zQ = composer2.q(f2);
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        boolean zN2 = zQ | composer2.n(composableLambdaImpl3) | composer2.n(function2) | composer2.n(function3C) | composer2.I(scrollableTabData) | composer2.r(i);
                        Object objG3 = composer2.G();
                        if (zN2 || objG3 == obj3) {
                            final float f3 = f2;
                            final Function2 function22 = function2;
                            final int i6 = i;
                            final Function3 function33 = function3C;
                            Object obj4 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    final SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj5;
                                    final long j3 = ((Constraints) obj6).f2197a;
                                    int iR1 = subcomposeMeasureScope.r1(TabRowKt.f1338a);
                                    final int iR12 = subcomposeMeasureScope.r1(f3);
                                    long jA = Constraints.a(j3, iR1, 0, 0, 0, 14);
                                    List listX0 = subcomposeMeasureScope.X0(TabSlots.d, composableLambdaImpl3);
                                    final ArrayList arrayList = new ArrayList(listX0.size());
                                    int size = listX0.size();
                                    for (int iF = 0; iF < size; iF = b.f((Measurable) listX0.get(iF), jA, arrayList, iF, 1)) {
                                    }
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.d = iR12 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    int size2 = arrayList.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        Placeable placeable = (Placeable) arrayList.get(i7);
                                        intRef.d += placeable.d;
                                        intRef2.d = Math.max(intRef2.d, placeable.e);
                                    }
                                    int i8 = intRef.d;
                                    int i9 = intRef2.d;
                                    final int i10 = i6;
                                    final Function3 function34 = function33;
                                    final Function2 function23 = function22;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    return subcomposeMeasureScope.L0(i8, i9, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            SubcomposeMeasureScope subcomposeMeasureScope2;
                                            Ref.IntRef intRef3;
                                            Ref.IntRef intRef4;
                                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj7;
                                            final ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = arrayList;
                                            int size3 = arrayList3.size();
                                            int i11 = iR12;
                                            int i12 = i11;
                                            int i13 = 0;
                                            while (true) {
                                                subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                if (i13 >= size3) {
                                                    break;
                                                }
                                                Placeable placeable2 = (Placeable) arrayList3.get(i13);
                                                Placeable.PlacementScope.h(placementScope, placeable2, i12, 0);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.B(i12), subcomposeMeasureScope2.B(placeable2.d)));
                                                i12 += placeable2.d;
                                                i13++;
                                            }
                                            List listX02 = subcomposeMeasureScope2.X0(TabSlots.e, function23);
                                            int size4 = listX02.size();
                                            int i14 = 0;
                                            while (true) {
                                                intRef3 = intRef2;
                                                intRef4 = intRef;
                                                if (i14 >= size4) {
                                                    break;
                                                }
                                                Measurable measurable = (Measurable) listX02.get(i14);
                                                int i15 = intRef4.d;
                                                Placeable placeableC0 = measurable.c0(Constraints.a(j3, i15, i15, 0, 0, 8));
                                                Placeable.PlacementScope.h(placementScope, placeableC0, 0, intRef3.d - placeableC0.e);
                                                i14++;
                                            }
                                            TabSlots tabSlots = TabSlots.f;
                                            final Function3 function35 = function34;
                                            List listX03 = subcomposeMeasureScope2.X0(tabSlots, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj8, Object obj9) {
                                                    Composer composer3 = (Composer) obj8;
                                                    int iIntValue2 = ((Number) obj9).intValue();
                                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        function35.invoke(arrayList2, composer3, 0);
                                                    } else {
                                                        composer3.j();
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -411868839));
                                            int size5 = listX03.size();
                                            for (int i16 = 0; i16 < size5; i16++) {
                                                Placeable.PlacementScope.h(placementScope, ((Measurable) listX03.get(i16)).c0(Constraints.Companion.c(intRef4.d, intRef3.d)), 0, 0);
                                            }
                                            ScrollableTabData scrollableTabData3 = scrollableTabData2;
                                            ScrollState scrollState = scrollableTabData3.f1320a;
                                            Integer num = scrollableTabData3.c;
                                            int i17 = i10;
                                            if (num == null || num.intValue() != i17) {
                                                scrollableTabData3.c = Integer.valueOf(i17);
                                                TabPosition tabPosition = (TabPosition) CollectionsKt.J(i17, arrayList2);
                                                if (tabPosition != null) {
                                                    TabPosition tabPosition2 = (TabPosition) CollectionsKt.O(arrayList2);
                                                    int iR13 = subcomposeMeasureScope2.r1(tabPosition2.f1336a + tabPosition2.b) + i11;
                                                    int iD = iR13 - ((SnapshotMutableIntStateImpl) scrollState.d).d();
                                                    int iR14 = subcomposeMeasureScope2.r1(tabPosition.f1336a) - ((iD / 2) - (subcomposeMeasureScope2.r1(tabPosition.b) / 2));
                                                    int i18 = iR13 - iD;
                                                    if (i18 < 0) {
                                                        i18 = 0;
                                                    }
                                                    int iC = RangesKt.c(iR14, 0, i18);
                                                    if (((SnapshotMutableIntStateImpl) scrollState.f848a).d() != iC) {
                                                        BuildersKt.c(scrollableTabData3.b, null, null, new ScrollableTabData$onLaidOut$1$1(scrollableTabData3, iC, null), 3);
                                                    }
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    });
                                }
                            };
                            composer2.A(obj4);
                            objG3 = obj4;
                        }
                        SubcomposeLayoutKt.a(modifierB, (Function2) objG3, composer2, 0, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i5 >> 3) & 14) | 1572864 | (i5 & 896) | (i5 & 7168), 50);
            function32 = function3C;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            function32 = function3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i2 | 1);
                    TabRowKt.a(f, i, iA, j, j2, (Composer) obj, composableLambdaImpl, modifier, function2, function32);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final int r23, androidx.compose.ui.Modifier r24, final long r25, final long r27, kotlin.jvm.functions.Function3 r29, kotlin.jvm.functions.Function2 r30, final androidx.compose.runtime.internal.ComposableLambdaImpl r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.b(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
