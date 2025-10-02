package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f962a;
    public final Arrangement.Horizontal b;
    public final Arrangement.Vertical c;
    public final float d;
    public final CrossAxisAlignment e;
    public final float f;
    public final int g;
    public final int h;
    public final FlowLayoutOverflowState i;

    public FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f962a = z;
        this.b = horizontal;
        this.c = vertical;
        this.d = f;
        this.e = crossAxisAlignment;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = flowLayoutOverflowState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        MutableVector mutableVector;
        int i;
        FlowLineInfo flowLineInfo;
        Measurable measurableA;
        long j2;
        IntIntPair intIntPair;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo;
        int i2;
        int i3;
        int iG;
        int b;
        int f1885a;
        int i4;
        Measurable measurableA2;
        Iterator it;
        IntIntPair intIntPair2;
        Integer num;
        Integer numValueOf;
        IntIntPair intIntPair3;
        int iMin;
        MutableIntList mutableIntList;
        int i5;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo2;
        MutableIntList mutableIntList2;
        int i6;
        boolean z;
        int i7;
        int i8;
        final FlowMeasurePolicy flowMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        if (flowMeasurePolicy.h != 0 && flowMeasurePolicy.g != 0 && !((ArrayList) list).isEmpty()) {
            int iG2 = Constraints.g(j);
            final FlowLayoutOverflowState flowLayoutOverflowState = flowMeasurePolicy.i;
            if (iG2 != 0) {
                List list2 = (List) CollectionsKt.D(list);
                if (list2.isEmpty()) {
                    return measureScope2.L0(0, 0, EmptyMap.d, FlowMeasurePolicy$measure$2.h);
                }
                List list3 = (List) CollectionsKt.J(1, list);
                Measurable measurable = list3 != null ? (Measurable) CollectionsKt.F(list3) : null;
                List list4 = (List) CollectionsKt.J(2, list);
                Measurable measurable2 = list4 != null ? (Measurable) CollectionsKt.F(list4) : null;
                flowLayoutOverflowState.b = list2.size();
                LayoutOrientation layoutOrientation = flowMeasurePolicy.getF962a() ? LayoutOrientation.d : LayoutOrientation.e;
                long jC = OrientationIndependentConstraints.c(OrientationIndependentConstraints.b(10, OrientationIndependentConstraints.a(j, layoutOrientation)), layoutOrientation);
                if (measurable != null) {
                    FlowLayoutKt.c(measurable, flowMeasurePolicy, jC, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int iJ;
                            int iG3;
                            Placeable placeable = (Placeable) obj;
                            if (placeable != null) {
                                FlowLineMeasurePolicy flowLineMeasurePolicy = flowMeasurePolicy;
                                iJ = flowLineMeasurePolicy.j(placeable);
                                iG3 = flowLineMeasurePolicy.g(placeable);
                            } else {
                                iJ = 0;
                                iG3 = 0;
                            }
                            new IntIntPair(IntIntPair.a(iJ, iG3));
                            return Unit.f24250a;
                        }
                    });
                    flowLayoutOverflowState.c = measurable;
                }
                if (measurable2 != null) {
                    FlowLayoutKt.c(measurable2, flowMeasurePolicy, jC, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int iJ;
                            int iG3;
                            Placeable placeable = (Placeable) obj;
                            if (placeable != null) {
                                FlowLineMeasurePolicy flowLineMeasurePolicy = flowMeasurePolicy;
                                iJ = flowLineMeasurePolicy.j(placeable);
                                iG3 = flowLineMeasurePolicy.g(placeable);
                            } else {
                                iJ = 0;
                                iG3 = 0;
                            }
                            new IntIntPair(IntIntPair.a(iJ, iG3));
                            return Unit.f24250a;
                        }
                    });
                    flowLayoutOverflowState.d = measurable2;
                }
                Iterator it2 = list2.iterator();
                long jA = OrientationIndependentConstraints.a(j, flowMeasurePolicy.f962a ? LayoutOrientation.d : LayoutOrientation.e);
                MutableVector mutableVector2 = new MutableVector(new MeasureResult[16], 0);
                int iH = Constraints.h(jA);
                int iJ = Constraints.j(jA);
                int iG3 = Constraints.g(jA);
                MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
                MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
                int iCeil = (int) Math.ceil(measureScope2.T1(flowMeasurePolicy.d));
                int iCeil2 = (int) Math.ceil(measureScope2.T1(flowMeasurePolicy.f));
                ArrayList arrayList = new ArrayList();
                long jA2 = ConstraintsKt.a(0, iH, 0, iG3);
                long jC2 = OrientationIndependentConstraints.c(OrientationIndependentConstraints.b(14, jA2), flowMeasurePolicy.getF962a() ? LayoutOrientation.d : LayoutOrientation.e);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (it2 instanceof ContextualFlowItemIterator) {
                    mutableVector = mutableVector2;
                    i = iJ;
                    flowLineInfo = new FlowLineInfo(measureScope2.B(iH), measureScope2.B(iG3));
                } else {
                    mutableVector = mutableVector2;
                    i = iJ;
                    flowLineInfo = null;
                }
                if (it2.hasNext()) {
                    try {
                        if (it2 instanceof ContextualFlowItemIterator) {
                            Intrinsics.e(flowLineInfo);
                            measurableA = ((ContextualFlowItemIterator) it2).a(flowLineInfo);
                        } else {
                            measurableA = (Measurable) it2.next();
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                } else {
                    measurableA = null;
                }
                if (measurableA != null) {
                    j2 = jA2;
                    intIntPair = new IntIntPair(FlowLayoutKt.c(measurableA, flowMeasurePolicy, jC2, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            objectRef.d = (Placeable) obj;
                            return Unit.f24250a;
                        }
                    }));
                } else {
                    j2 = jA2;
                    intIntPair = null;
                }
                Integer numValueOf2 = intIntPair != null ? Integer.valueOf((int) (intIntPair.f675a >> 32)) : null;
                Integer numValueOf3 = intIntPair != null ? Integer.valueOf((int) (intIntPair.f675a & 4294967295L)) : null;
                MutableIntList mutableIntList3 = new MutableIntList();
                Measurable measurable3 = measurableA;
                MutableIntList mutableIntList4 = new MutableIntList();
                IntIntPair intIntPair4 = intIntPair;
                int i9 = flowMeasurePolicy.g;
                FlowLayoutOverflowState flowLayoutOverflowState2 = flowMeasurePolicy.i;
                FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i9, flowLayoutOverflowState2, jA, flowMeasurePolicy.h, iCeil, iCeil2);
                Integer num2 = numValueOf3;
                FlowLayoutOverflowState flowLayoutOverflowState3 = flowLayoutOverflowState2;
                FlowLayoutBuildingBlocks.WrapInfo wrapInfoB = flowLayoutBuildingBlocks.b(it2.hasNext(), 0, IntIntPair.a(iH, iG3), intIntPair4, 0, 0, 0, false, false);
                if (wrapInfoB.b) {
                    wrapInfo = wrapInfoB;
                    flowLayoutBuildingBlocks.a(wrapInfo, intIntPair4 != null, -1, 0, iH, 0);
                } else {
                    wrapInfo = wrapInfoB;
                }
                FlowLayoutBuildingBlocks.WrapInfo wrapInfo3 = wrapInfo;
                Integer num3 = num2;
                int i10 = i;
                MutableIntList mutableIntList5 = mutableIntList4;
                int i11 = iH;
                int i12 = i11;
                int i13 = iG3;
                Measurable measurable4 = measurable3;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                MutableIntList mutableIntList6 = mutableIntList3;
                int i19 = 0;
                while (!wrapInfo3.b && measurable4 != null) {
                    Intrinsics.e(numValueOf2);
                    int iIntValue = numValueOf2.intValue();
                    Intrinsics.e(num3);
                    int iIntValue2 = num3.intValue();
                    int i20 = i10;
                    int i21 = i15 + iIntValue;
                    int iMax = Math.max(i19, iIntValue2);
                    int i22 = i11 - iIntValue;
                    int i23 = i14 + 1;
                    flowLayoutOverflowState3.f960a = i23;
                    FlowLayoutOverflowState flowLayoutOverflowState4 = flowLayoutOverflowState3;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(measurable4);
                    mutableIntObjectMap2.h(i14, objectRef.d);
                    int i24 = i23 - i16;
                    boolean z2 = i24 < i9;
                    if (flowLineInfo != null) {
                        if (z2) {
                            i4 = i24;
                            i6 = i17;
                        } else {
                            i4 = i24;
                            i6 = i17 + 1;
                        }
                        if (z2) {
                            int i25 = i22 - iCeil;
                            z = z2;
                            i7 = i25 < 0 ? 0 : i25;
                        } else {
                            z = z2;
                            i7 = i12;
                        }
                        measureScope2.B(i7);
                        if (z) {
                            i8 = i13;
                        } else {
                            i8 = (i13 - iMax) - iCeil2;
                            if (i8 < 0) {
                                i8 = 0;
                            }
                        }
                        measureScope2.B(i8);
                        flowLineInfo.f961a = i6;
                    } else {
                        i4 = i24;
                    }
                    if (it2.hasNext()) {
                        try {
                            if (it2 instanceof ContextualFlowItemIterator) {
                                Intrinsics.e(flowLineInfo);
                                measurableA2 = ((ContextualFlowItemIterator) it2).a(flowLineInfo);
                            } else {
                                measurableA2 = (Measurable) it2.next();
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            measurableA2 = null;
                        }
                        measurable4 = measurableA2;
                    } else {
                        measurable4 = null;
                    }
                    objectRef.d = null;
                    if (measurable4 != null) {
                        it = it2;
                        intIntPair2 = new IntIntPair(FlowLayoutKt.c(measurable4, flowMeasurePolicy, jC2, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                objectRef.d = (Placeable) obj;
                                return Unit.f24250a;
                            }
                        }));
                    } else {
                        it = it2;
                        intIntPair2 = null;
                    }
                    Integer numValueOf4 = intIntPair2 != null ? Integer.valueOf(((int) (intIntPair2.f675a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = intIntPair2 != null ? Integer.valueOf((int) (intIntPair2.f675a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA3 = IntIntPair.a(i22, i13);
                    if (intIntPair2 == null) {
                        num = numValueOf5;
                        numValueOf = numValueOf4;
                        intIntPair3 = null;
                    } else {
                        Intrinsics.e(numValueOf4);
                        int iIntValue3 = numValueOf4.intValue();
                        Intrinsics.e(numValueOf5);
                        num = numValueOf5;
                        numValueOf = numValueOf4;
                        intIntPair3 = new IntIntPair(IntIntPair.a(iIntValue3, num.intValue()));
                    }
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoB2 = flowLayoutBuildingBlocks.b(zHasNext, i4, jA3, intIntPair3, i17, i18, iMax, false, false);
                    if (wrapInfoB2.f959a) {
                        int i26 = i12;
                        iMin = Math.min(Math.max(i20, i21), i26);
                        int i27 = i18 + iMax;
                        wrapInfo2 = wrapInfoB2;
                        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks2 = flowLayoutBuildingBlocks;
                        int i28 = i17;
                        flowLayoutBuildingBlocks2.a(wrapInfo2, intIntPair2 != null, i28, i27, i22, i4);
                        flowLayoutBuildingBlocks = flowLayoutBuildingBlocks2;
                        mutableIntList2 = mutableIntList5;
                        mutableIntList2.c(iMax);
                        int i29 = (iG3 - i27) - iCeil2;
                        mutableIntList = mutableIntList6;
                        mutableIntList.c(i23);
                        i17 = i28 + 1;
                        i18 = i27 + iCeil2;
                        i11 = i26;
                        i5 = i11;
                        numValueOf = numValueOf != null ? Integer.valueOf(numValueOf.intValue() - iCeil) : null;
                        i16 = i23;
                        i19 = 0;
                        i15 = 0;
                        i13 = i29;
                    } else {
                        i11 = i22;
                        iMin = i20;
                        mutableIntList = mutableIntList6;
                        i5 = i12;
                        wrapInfo2 = wrapInfoB2;
                        mutableIntList2 = mutableIntList5;
                        i19 = iMax;
                        i15 = i21;
                    }
                    i10 = iMin;
                    measureScope2 = measureScope;
                    it2 = it;
                    mutableIntList5 = mutableIntList2;
                    mutableIntList6 = mutableIntList;
                    arrayList = arrayList2;
                    i14 = i23;
                    wrapInfo3 = wrapInfo2;
                    i12 = i5;
                    flowLayoutOverflowState3 = flowLayoutOverflowState4;
                    num3 = num;
                    numValueOf2 = numValueOf;
                    flowMeasurePolicy = this;
                }
                ArrayList arrayList3 = arrayList;
                int i30 = i10;
                MutableIntList mutableIntList7 = mutableIntList6;
                MutableIntList mutableIntList8 = mutableIntList5;
                int size = arrayList3.size();
                ArrayList arrayList4 = arrayList3;
                Placeable[] placeableArr = new Placeable[size];
                for (int i31 = 0; i31 < size; i31++) {
                    placeableArr[i31] = mutableIntObjectMap2.b(i31);
                }
                int i32 = mutableIntList7.b;
                int[] iArr = new int[i32];
                int[] iArr2 = new int[i32];
                int[] iArr3 = mutableIntList7.f676a;
                int i33 = i30;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i35 < i32) {
                    int i37 = iArr3[i35];
                    ArrayList arrayList5 = arrayList4;
                    MutableIntList mutableIntList9 = mutableIntList8;
                    int i38 = i32;
                    MutableVector mutableVector3 = mutableVector;
                    MeasureResult measureResultA = RowColumnMeasurePolicyKt.a(this, i33, Constraints.i(j2), Constraints.h(j2), mutableIntList8.a(i35), iCeil, measureScope, arrayList5, placeableArr, i34, i37, iArr, i35);
                    int i39 = i33;
                    if (getF962a()) {
                        b = measureResultA.getF1877a();
                        f1885a = measureResultA.getB();
                    } else {
                        b = measureResultA.getB();
                        f1885a = measureResultA.getF1877a();
                    }
                    iArr2[i35] = f1885a;
                    i36 += f1885a;
                    int iMax2 = Math.max(i39, b);
                    mutableVector3.c(measureResultA);
                    i35++;
                    i33 = iMax2;
                    arrayList4 = arrayList5;
                    i34 = i37;
                    mutableVector = mutableVector3;
                    i32 = i38;
                    mutableIntList8 = mutableIntList9;
                }
                final MutableVector mutableVector4 = mutableVector;
                int i40 = i33;
                if (mutableVector4.f == 0) {
                    i3 = 0;
                    i2 = 0;
                } else {
                    i2 = i40;
                    i3 = i36;
                }
                boolean f962a = getF962a();
                Arrangement.Vertical c = getC();
                Arrangement.Horizontal b2 = getB();
                if (f962a) {
                    int iC = a.c(mutableVector4.f, 1, measureScope.r1(c.getD()), i3);
                    int i41 = Constraints.i(jA);
                    iG = Constraints.g(jA);
                    if (iC < i41) {
                        iC = i41;
                    }
                    if (iC <= iG) {
                        iG = iC;
                    }
                    c.c(measureScope, iG, iArr2, iArr);
                } else {
                    int iC2 = a.c(mutableVector4.f, 1, measureScope.r1(b2.getD()), i3);
                    int i42 = Constraints.i(jA);
                    int iG4 = Constraints.g(jA);
                    if (iC2 < i42) {
                        iC2 = i42;
                    }
                    int i43 = iC2 > iG4 ? iG4 : iC2;
                    b2.b(measureScope, i43, iArr2, measureScope.getD(), iArr);
                    iG = i43;
                }
                int iJ2 = Constraints.j(jA);
                int iH2 = Constraints.h(jA);
                if (i2 < iJ2) {
                    i2 = iJ2;
                }
                if (i2 <= iH2) {
                    iH2 = i2;
                }
                if (f962a) {
                    int i44 = iG;
                    iG = iH2;
                    iH2 = i44;
                }
                return measureScope.L0(iG, iH2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MutableVector mutableVector5 = mutableVector4;
                        Object[] objArr = mutableVector5.d;
                        int i45 = mutableVector5.f;
                        for (int i46 = 0; i46 < i45; i46++) {
                            ((MeasureResult) objArr[i46]).q();
                        }
                        return Unit.f24250a;
                    }
                });
            }
            flowLayoutOverflowState.getClass();
            FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
            FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
        }
        return measureScope2.L0(0, 0, EmptyMap.d, FlowMeasurePolicy$measure$1.h);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.J(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.F(list2) : null;
        List list3 = (List) CollectionsKt.J(2, list);
        this.i.a(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.F(list3) : null, this.f962a, ConstraintsKt.b(i, 0, 13));
        boolean z = this.f962a;
        float f = this.f;
        float f2 = this.d;
        List list4 = EmptyList.d;
        if (z) {
            List list5 = (List) CollectionsKt.F(list);
            return k(list5 == null ? list4 : list5, i, intrinsicMeasureScope.r1(f2), intrinsicMeasureScope.r1(f), this.g, this.h, this.i);
        }
        List list6 = (List) CollectionsKt.F(list);
        if (list6 != null) {
            list4 = list6;
        }
        return r(list4, i, intrinsicMeasureScope.r1(f2), intrinsicMeasureScope.r1(f), this.g, this.h, this.i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.J(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.F(list2) : null;
        List list3 = (List) CollectionsKt.J(2, list);
        this.i.a(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.F(list3) : null, this.f962a, ConstraintsKt.b(0, i, 7));
        boolean z = this.f962a;
        float f = this.f;
        float f2 = this.d;
        List list4 = EmptyList.d;
        if (z) {
            List list5 = (List) CollectionsKt.F(list);
            return r(list5 == null ? list4 : list5, i, intrinsicMeasureScope.r1(f2), intrinsicMeasureScope.r1(f), this.g, this.h, this.i);
        }
        List list6 = (List) CollectionsKt.F(list);
        if (list6 != null) {
            list4 = list6;
        }
        return k(list4, i, intrinsicMeasureScope.r1(f2), intrinsicMeasureScope.r1(f), this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.f962a == flowMeasurePolicy.f962a && this.b.equals(flowMeasurePolicy.b) && this.c.equals(flowMeasurePolicy.c) && Dp.a(this.d, flowMeasurePolicy.d) && this.e.equals(flowMeasurePolicy.e) && Dp.a(this.f, flowMeasurePolicy.f) && this.g == flowMeasurePolicy.g && this.h == flowMeasurePolicy.h && Intrinsics.c(this.i, flowMeasurePolicy.i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.J(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.F(list2) : null;
        List list3 = (List) CollectionsKt.J(2, list);
        this.i.a(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.F(list3) : null, this.f962a, ConstraintsKt.b(i, 0, 13));
        boolean z = this.f962a;
        float f = this.d;
        List list4 = EmptyList.d;
        if (z) {
            List list5 = (List) CollectionsKt.F(list);
            return k(list5 == null ? list4 : list5, i, intrinsicMeasureScope.r1(f), intrinsicMeasureScope.r1(this.f), this.g, this.h, this.i);
        }
        List list6 = (List) CollectionsKt.F(list);
        if (list6 != null) {
            list4 = list6;
        }
        return q(i, intrinsicMeasureScope.r1(f), list4);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.J(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.F(list2) : null;
        List list3 = (List) CollectionsKt.J(2, list);
        this.i.a(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.F(list3) : null, this.f962a, ConstraintsKt.b(0, i, 7));
        boolean z = this.f962a;
        float f = this.d;
        List list4 = EmptyList.d;
        if (!z) {
            List list5 = (List) CollectionsKt.F(list);
            return k(list5 == null ? list4 : list5, i, intrinsicMeasureScope.r1(f), intrinsicMeasureScope.r1(this.f), this.g, this.h, this.i);
        }
        List list6 = (List) CollectionsKt.F(list);
        if (list6 != null) {
            list4 = list6;
        }
        return q(i, intrinsicMeasureScope.r1(f), list4);
    }

    public final int hashCode() {
        return this.i.hashCode() + b.a(this.h, b.a(this.g, a.b(this.f, (this.e.hashCode() + a.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f962a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final int k(List list, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int iA0;
        long jA = IntIntPair.a(0, 0);
        if (!list.isEmpty()) {
            int i6 = Integer.MAX_VALUE;
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, ConstraintsKt.a(0, i, 0, Integer.MAX_VALUE), i5, i2, i3);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.J(0, list);
            boolean z = this.f962a;
            int iT = intrinsicMeasurable != null ? z ? intrinsicMeasurable.T(i) : intrinsicMeasurable.a0(i) : 0;
            int iA02 = intrinsicMeasurable != null ? z ? intrinsicMeasurable.a0(iT) : intrinsicMeasurable.T(iT) : 0;
            int i7 = 0;
            if (flowLayoutBuildingBlocks.b(list.size() > 1, 0, IntIntPair.a(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new IntIntPair(IntIntPair.a(iA02, iT)), 0, 0, 0, false, false).b) {
                flowLayoutOverflowState.getClass();
                FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
                jA = jA;
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    int i14 = i8 - iA02;
                    int i15 = i11 + 1;
                    int iMax = Math.max(i10, iT);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.J(i15, list);
                    iT = intrinsicMeasurable2 != null ? z ? intrinsicMeasurable2.T(i) : intrinsicMeasurable2.a0(i) : 0;
                    if (intrinsicMeasurable2 != null) {
                        iA0 = (z ? intrinsicMeasurable2.a0(iT) : intrinsicMeasurable2.T(iT)) + i2;
                    } else {
                        iA0 = 0;
                    }
                    int i16 = i15 - i13;
                    int i17 = iA0;
                    int i18 = i9;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoB = flowLayoutBuildingBlocks.b(i11 + 2 < list.size(), i16, IntIntPair.a(i14, i6), intrinsicMeasurable2 == null ? null : new IntIntPair(IntIntPair.a(iA0, iT)), i18, i7, iMax, false, false);
                    if (wrapInfoB.f959a) {
                        int i19 = iMax + i3 + i7;
                        flowLayoutBuildingBlocks.a(wrapInfoB, intrinsicMeasurable2 != null, i18, i19, i14, i16);
                        int i20 = i17 - i2;
                        i9 = i18 + 1;
                        if (wrapInfoB.b) {
                            i7 = i19;
                            i12 = i15;
                            break;
                        }
                        i8 = i;
                        i13 = i15;
                        iA02 = i20;
                        i7 = i19;
                        i10 = 0;
                    } else {
                        iA02 = i17;
                        i8 = i14;
                        i9 = i18;
                        i10 = iMax;
                    }
                    i11 = i15;
                    i12 = i11;
                    i6 = Integer.MAX_VALUE;
                }
                jA = IntIntPair.a(i7 - i3, i12);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: l, reason: from getter */
    public final Arrangement.Horizontal getB() {
        return this.b;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: m, reason: from getter */
    public final CrossAxisAlignment getE() {
        return this.e;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: n, reason: from getter */
    public final Arrangement.Vertical getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: p, reason: from getter */
    public final boolean getF962a() {
        return this.f962a;
    }

    public final int q(int i, int i2, List list) {
        int size = list.size();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < size) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            int iB0 = (this.f962a ? intrinsicMeasurable.b0(i) : intrinsicMeasurable.J(i)) + i2;
            int i6 = i3 + 1;
            if (i6 - i4 == this.g || i6 == list.size()) {
                iMax = Math.max(iMax, (i5 + iB0) - i2);
                i5 = 0;
                i4 = i3;
            } else {
                i5 += iB0;
            }
            i3 = i6;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int r(List list, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        long jA;
        int i10;
        IntIntPair intIntPair;
        int i11 = i4;
        int i12 = i5;
        int i13 = 0;
        long jA2 = IntIntPair.a(0, 0);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr2 = new int[size];
        int size2 = list.size();
        int[] iArr3 = new int[size2];
        List list2 = list;
        int size3 = list2.size();
        int i14 = 0;
        while (i14 < size3) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i14);
            int i15 = i13;
            boolean z = this.f962a;
            int i16 = size2;
            int iA0 = z ? intrinsicMeasurable.a0(i) : intrinsicMeasurable.T(i);
            iArr2[i14] = iA0;
            iArr3[i14] = z ? intrinsicMeasurable.T(iA0) : intrinsicMeasurable.a0(iA0);
            i14++;
            i13 = i15;
            size2 = i16;
        }
        int i17 = size2;
        int i18 = i13;
        int i19 = (i12 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i11 * i12;
        if (i19 < list.size()) {
            flowLayoutOverflowState.getClass();
            FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
            FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
            FlowLayoutOverflow.OverflowType overflowType3 = FlowLayoutOverflow.OverflowType.d;
        }
        if (i19 >= list.size()) {
            flowLayoutOverflowState.getClass();
            if (i12 >= 0) {
                FlowLayoutOverflow.OverflowType overflowType4 = FlowLayoutOverflow.OverflowType.d;
                FlowLayoutOverflow.OverflowType overflowType5 = FlowLayoutOverflow.OverflowType.d;
            }
        }
        int iMin = Math.min(i19, list.size());
        int i20 = i18;
        int i21 = i20;
        while (i20 < size) {
            i21 += iArr2[i20];
            i20++;
        }
        int size4 = ((list.size() - 1) * i2) + i21;
        if (i17 == 0) {
            throw new NoSuchElementException();
        }
        int i22 = iArr3[i18];
        IntProgressionIterator it = new IntRange(1, i17 - 1, 1).iterator();
        while (it.f) {
            int i23 = iArr3[it.nextInt()];
            if (i22 < i23) {
                i22 = i23;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i24 = iArr2[i18];
        IntProgressionIterator it2 = new IntRange(1, size - 1, 1).iterator();
        int i25 = i24;
        while (it2.f) {
            int i26 = iArr2[it2.nextInt()];
            if (i25 < i26) {
                i25 = i26;
            }
        }
        int i27 = i25;
        int i28 = size4;
        while (i27 <= i28 && i22 != i) {
            int i29 = (i27 + i28) / 2;
            if (list.isEmpty()) {
                i7 = i27;
                i8 = iMin;
                jA = jA2;
                j = jA;
                iArr = iArr2;
                i6 = i29;
            } else {
                int i30 = i18;
                long j2 = jA2;
                i6 = i29;
                j = j2;
                i7 = i27;
                i8 = iMin;
                int i31 = i30;
                iArr = iArr2;
                boolean z2 = true;
                FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i11, flowLayoutOverflowState, ConstraintsKt.a(i30, i29, i30, Integer.MAX_VALUE), i12, i2, i3);
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.J(i31, list);
                int i32 = intrinsicMeasurable2 != null ? iArr3[i31] : i31;
                int i33 = intrinsicMeasurable2 != null ? iArr[i31] : i31;
                int i34 = 0;
                if (flowLayoutBuildingBlocks.b(list.size() > 1 ? 1 : i31, 0, IntIntPair.a(i6, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : new IntIntPair(IntIntPair.a(i33, i32)), 0, 0, 0, false, false).b) {
                    flowLayoutOverflowState.getClass();
                    FlowLayoutOverflow.OverflowType overflowType6 = FlowLayoutOverflow.OverflowType.d;
                    jA = j;
                } else {
                    int size5 = list2.size();
                    int i35 = i32;
                    int i36 = i6;
                    int i37 = i31;
                    int i38 = i37;
                    int i39 = 0;
                    int i40 = 0;
                    while (true) {
                        i9 = i38;
                        if (i38 >= size5) {
                            break;
                        }
                        i36 -= i33;
                        int i41 = i38 + 1;
                        int iMax = Math.max(i40, i35);
                        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.J(i41, list);
                        i35 = intrinsicMeasurable3 != null ? iArr3[i41] : i31;
                        int i42 = intrinsicMeasurable3 != null ? iArr[i41] + i2 : i31;
                        boolean z3 = i38 + 2 < list.size() ? z2 : false;
                        int i43 = i41 - i37;
                        int i44 = i39;
                        long jA3 = IntIntPair.a(i36, Integer.MAX_VALUE);
                        if (intrinsicMeasurable3 == null) {
                            i10 = i41;
                            intIntPair = null;
                        } else {
                            i10 = i41;
                            intIntPair = new IntIntPair(IntIntPair.a(i42, i35));
                        }
                        FlowLayoutBuildingBlocks.WrapInfo wrapInfoB = flowLayoutBuildingBlocks.b(z3, i43, jA3, intIntPair, i44, i34, iMax, false, false);
                        if (wrapInfoB.f959a) {
                            int i45 = iMax + i3 + i34;
                            flowLayoutBuildingBlocks.a(wrapInfoB, intrinsicMeasurable3 != null, i44, i45, i36, i43);
                            int i46 = i42 - i2;
                            i39 = i44 + 1;
                            if (wrapInfoB.b) {
                                i9 = i10;
                                i34 = i45;
                                break;
                            }
                            i33 = i46;
                            i36 = i6;
                            i37 = i10;
                            i34 = i45;
                            i40 = 0;
                        } else {
                            i33 = i42;
                            i39 = i44;
                            i40 = iMax;
                        }
                        i38 = i10;
                        i31 = 0;
                        z2 = true;
                    }
                    jA = IntIntPair.a(i34 - i3, i9);
                }
            }
            i22 = (int) (jA >> 32);
            int i47 = (int) (jA & 4294967295L);
            int i48 = i8;
            if (i22 > i || i47 < i48) {
                i27 = i6 + 1;
                if (i27 > i28) {
                    return i27;
                }
                i12 = i5;
                iMin = i48;
                size4 = i6;
            } else {
                if (i22 >= i) {
                    return i6;
                }
                i28 = i6 - 1;
                i12 = i5;
                iMin = i48;
                size4 = i6;
                i27 = i7;
            }
            jA2 = j;
            iArr2 = iArr;
            i18 = 0;
            i11 = i4;
        }
        return size4;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f962a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", mainAxisSpacing=" + ((Object) Dp.b(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) Dp.b(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=" + this.h + ", overflow=" + this.i + ')';
    }
}
