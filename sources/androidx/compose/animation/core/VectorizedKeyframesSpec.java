package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.ArcSpline;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntList f797a;
    public final MutableIntObjectMap b;
    public final int c;
    public final Easing d;
    public int[] e = VectorizedAnimationSpecKt.f789a;
    public float[] f;
    public AnimationVector g;
    public AnimationVector h;
    public AnimationVector i;
    public AnimationVector j;
    public float[] k;
    public float[] l;
    public ArcSpline m;

    public VectorizedKeyframesSpec(MutableIntList mutableIntList, MutableIntObjectMap mutableIntObjectMap, int i, Easing easing) {
        this.f797a = mutableIntList;
        this.b = mutableIntObjectMap;
        this.c = i;
        this.d = easing;
        float[] fArr = VectorizedAnimationSpecKt.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = VectorizedAnimationSpecKt.c;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* renamed from: c, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int i;
        long jA = VectorizedAnimationSpecKt.a(this, j / 1000000);
        if (jA < 0) {
            return animationVector3;
        }
        i(animationVector, animationVector2, animationVector3);
        AnimationVector animationVector4 = this.h;
        Intrinsics.e(animationVector4);
        int i2 = 0;
        if (this.m != VectorizedAnimationSpecKt.c) {
            int i3 = (int) jA;
            MutableIntList mutableIntList = this.f797a;
            int i4 = mutableIntList.b;
            if (i4 <= 0) {
                RuntimeHelpersKt.c("");
                throw null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i = -(i6 + 1);
                    break;
                }
                i = (i6 + i5) >>> 1;
                int i7 = mutableIntList.f676a[i];
                if (i7 >= i3) {
                    if (i7 <= i3) {
                        break;
                    }
                    i5 = i - 1;
                } else {
                    i6 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float fH = h(i, i3, false);
            float[] fArr = this.l;
            ArcSpline.Arc[][] arcArr = this.m.f749a;
            float f = arcArr[0][0].f750a;
            float f2 = arcArr[arcArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (ArcSpline.Arc[] arcArr2 : arcArr) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < length - 1) {
                    ArcSpline.Arc arc = arcArr2[i9];
                    if (f2 <= arc.b) {
                        if (arc.p) {
                            fArr[i8] = arc.q;
                            fArr[i8 + 1] = arc.r;
                        } else {
                            arc.c(f2);
                            fArr[i8] = arc.a();
                            fArr[i8 + 1] = arc.b();
                        }
                        z = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i2 < length2) {
                animationVector4.e(fArr[i2], i2);
                i2++;
            }
        } else {
            AnimationVector animationVectorF = f((jA - 1) * 1000000, animationVector, animationVector2, animationVector3);
            AnimationVector animationVectorF2 = f(jA * 1000000, animationVector, animationVector2, animationVector3);
            int iB = animationVectorF.b();
            while (i2 < iB) {
                animationVector4.e((animationVectorF.a(i2) - animationVectorF2.a(i2)) * 1000.0f, i2);
                i2++;
            }
        }
        return animationVector4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int i;
        AnimationVector animationVector4;
        AnimationVector animationVector5;
        int i2;
        float f;
        ArcSpline.Arc[][] arcArr;
        boolean z;
        AnimationVector animationVector6 = animationVector;
        AnimationVector animationVector7 = animationVector2;
        int iA = (int) VectorizedAnimationSpecKt.a(this, j / 1000000);
        MutableIntObjectMap mutableIntObjectMap = this.b;
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) mutableIntObjectMap.b(iA);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return vectorizedKeyframeSpecElementInfo.f796a;
        }
        if (iA >= this.c) {
            return animationVector7;
        }
        if (iA <= 0) {
            return animationVector6;
        }
        i(animationVector6, animationVector7, animationVector3);
        AnimationVector animationVector8 = this.g;
        Intrinsics.e(animationVector8);
        ArcSpline arcSpline = this.m;
        ArcSpline arcSpline2 = VectorizedAnimationSpecKt.c;
        MutableIntList mutableIntList = this.f797a;
        int i3 = 0;
        boolean z2 = true;
        if (arcSpline != arcSpline2) {
            int i4 = mutableIntList.b;
            if (i4 <= 0) {
                RuntimeHelpersKt.c("");
                throw null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i2 = -(i6 + 1);
                    break;
                }
                i2 = (i6 + i5) >>> 1;
                int i7 = mutableIntList.f676a[i2];
                if (i7 >= iA) {
                    if (i7 <= iA) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i6 = i2 + 1;
                }
            }
            if (i2 < -1) {
                i2 = -(i2 + 2);
            }
            float fH = h(i2, iA, false);
            float[] fArr = this.k;
            ArcSpline.Arc[][] arcArr2 = this.m.f749a;
            int length = arcArr2.length - 1;
            float f2 = arcArr2[0][0].f750a;
            float f3 = arcArr2[length][0].b;
            int length2 = fArr.length;
            if (fH < f2 || fH > f3) {
                if (fH > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = fH - f2;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2 - 1) {
                    ArcSpline.Arc arc = arcArr2[length][i9];
                    boolean z3 = arc.p;
                    float f5 = arc.r;
                    float f6 = arc.q;
                    if (z3) {
                        float f7 = arc.f750a;
                        float f8 = arc.k;
                        f = f4;
                        float f9 = arc.c;
                        arcArr = arcArr2;
                        fArr[i8] = (f * f6) + YU.a.a(arc.e, f9, (f2 - f7) * f8, f9);
                        float f10 = (f2 - f7) * f8;
                        float f11 = arc.d;
                        fArr[i8 + 1] = (f * f5) + YU.a.a(arc.f, f11, f10, f11);
                    } else {
                        f = f4;
                        arcArr = arcArr2;
                        arc.c(f2);
                        fArr[i8] = (arc.a() * f) + (arc.n * arc.h) + f6;
                        fArr[i8 + 1] = (arc.b() * f) + (arc.o * arc.i) + f5;
                    }
                    i8 += 2;
                    i9++;
                    f4 = f;
                    arcArr2 = arcArr;
                }
            } else {
                int length3 = arcArr2.length;
                int i10 = 0;
                boolean z4 = false;
                while (i10 < length3) {
                    int i11 = i3;
                    int i12 = i11;
                    while (i11 < length2 - 1) {
                        ArcSpline.Arc arc2 = arcArr2[i10][i12];
                        if (fH <= arc2.b) {
                            if (arc2.p) {
                                float f12 = arc2.f750a;
                                float f13 = arc2.k;
                                float f14 = arc2.c;
                                z = z2;
                                fArr[i11] = YU.a.a(arc2.e, f14, (fH - f12) * f13, f14);
                                float f15 = arc2.d;
                                fArr[i11 + 1] = YU.a.a(arc2.f, f15, (fH - f12) * f13, f15);
                            } else {
                                z = z2;
                                arc2.c(fH);
                                fArr[i11] = (arc2.n * arc2.h) + arc2.q;
                                fArr[i11 + 1] = (arc2.o * arc2.i) + arc2.r;
                            }
                            z4 = z;
                        } else {
                            z = z2;
                        }
                        i11 += 2;
                        i12++;
                        z2 = z;
                    }
                    boolean z5 = z2;
                    if (z4) {
                        break;
                    }
                    i10++;
                    z2 = z5;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i13 = 0; i13 < length4; i13++) {
                animationVector8.e(fArr[i13], i13);
            }
        } else {
            int i14 = mutableIntList.b;
            if (i14 <= 0) {
                RuntimeHelpersKt.c("");
                throw null;
            }
            int i15 = i14 - 1;
            int i16 = 0;
            while (true) {
                if (i16 > i15) {
                    i = -(i16 + 1);
                    break;
                }
                i = (i16 + i15) >>> 1;
                int i17 = mutableIntList.f676a[i];
                if (i17 >= iA) {
                    if (i17 <= iA) {
                        break;
                    }
                    i15 = i - 1;
                } else {
                    i16 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float fH2 = h(i, iA, true);
            VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) mutableIntObjectMap.b(mutableIntList.a(i));
            if (vectorizedKeyframeSpecElementInfo2 != null && (animationVector5 = vectorizedKeyframeSpecElementInfo2.f796a) != null) {
                animationVector6 = animationVector5;
            }
            VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo3 = (VectorizedKeyframeSpecElementInfo) mutableIntObjectMap.b(mutableIntList.a(i + 1));
            if (vectorizedKeyframeSpecElementInfo3 != null && (animationVector4 = vectorizedKeyframeSpecElementInfo3.f796a) != null) {
                animationVector7 = animationVector4;
            }
            int iB = animationVector8.b();
            for (int i18 = 0; i18 < iB; i18++) {
                animationVector8.e((animationVector7.a(i18) * fH2) + ((1 - fH2) * animationVector6.a(i18)), i18);
            }
        }
        return animationVector8;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* renamed from: g */
    public final int getF799a() {
        return 0;
    }

    public final float h(int i, int i2, boolean z) {
        Easing easing;
        float f;
        MutableIntList mutableIntList = this.f797a;
        if (i >= mutableIntList.b - 1) {
            f = i2;
        } else {
            int iA = mutableIntList.a(i);
            int iA2 = mutableIntList.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.b.b(iA);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.b) == null) {
                    easing = this.d;
                }
                float f2 = i3;
                float fA = easing.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000;
    }

    public final void i(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        float[] fArr;
        boolean z = this.m != VectorizedAnimationSpecKt.c;
        AnimationVector animationVector4 = this.g;
        MutableIntObjectMap mutableIntObjectMap = this.b;
        MutableIntList mutableIntList = this.f797a;
        if (animationVector4 == null) {
            this.g = animationVector.c();
            this.h = animationVector3.c();
            int i = mutableIntList.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = mutableIntList.a(i2) / 1000;
            }
            this.f = fArr2;
            int i3 = mutableIntList.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != VectorizedAnimationSpecKt.c && Intrinsics.c(this.i, animationVector) && Intrinsics.c(this.j, animationVector2)) {
                return;
            }
            this.i = animationVector;
            this.j = animationVector2;
            int iB = animationVector.b() + (animationVector.b() % 2);
            this.k = new float[iB];
            this.l = new float[iB];
            int i5 = mutableIntList.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iA = mutableIntList.a(i6);
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) mutableIntObjectMap.b(iA);
                if (iA == 0 && vectorizedKeyframeSpecElementInfo == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = animationVector.a(i7);
                    }
                } else if (iA == this.c && vectorizedKeyframeSpecElementInfo == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = animationVector2.a(i8);
                    }
                } else {
                    Intrinsics.e(vectorizedKeyframeSpecElementInfo);
                    AnimationVector animationVector5 = vectorizedKeyframeSpecElementInfo.f796a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = animationVector5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new ArcSpline(this.e, this.f, fArr3);
        }
    }
}
