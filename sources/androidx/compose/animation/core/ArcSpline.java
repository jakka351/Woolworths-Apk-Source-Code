package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "Arc", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ArcSpline {

    /* renamed from: a, reason: collision with root package name */
    public final Arc[][] f749a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Arc {

        /* renamed from: a, reason: collision with root package name */
        public final float f750a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public float h;
        public float i;
        public final float[] j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final boolean p;
        public final float q;
        public final float r;

        public Arc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            boolean z;
            int i2;
            float f7;
            float[] fArr;
            this.f750a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            float f8 = f5 - f3;
            float f9 = f6 - f4;
            float f10 = BitmapDescriptorFactory.HUE_RED;
            int i3 = 1;
            boolean z2 = i == 1 || (i == 4 ? f9 > BitmapDescriptorFactory.HUE_RED : !(i != 5 || f9 >= BitmapDescriptorFactory.HUE_RED));
            float f11 = z2 ? -1.0f : 1.0f;
            this.m = f11;
            float f12 = 1 / (f2 - f);
            this.k = f12;
            float[] fArr2 = new float[101];
            this.j = fArr2;
            boolean z3 = i == 3;
            if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
                float fHypot = (float) Math.hypot(f9, f8);
                this.g = fHypot;
                this.l = fHypot * f12;
                this.q = f8 * f12;
                this.r = f9 * f12;
                this.n = Float.NaN;
                this.o = Float.NaN;
                z = true;
            } else {
                this.n = f8 * f11;
                this.o = f9 * (-f11);
                this.q = z2 ? f5 : f3;
                this.r = z2 ? f4 : f6;
                float f13 = f5 - f3;
                float f14 = f4 - f6;
                float f15 = 90;
                float f16 = f14;
                float fHypot2 = 0.0f;
                float f17 = 0.0f;
                int i4 = 1;
                while (true) {
                    i2 = i3;
                    float f18 = f16;
                    double radians = (float) Math.toRadians((i4 * 90.0d) / 90);
                    float fSin = ((float) Math.sin(radians)) * f13;
                    float fCos = ((float) Math.cos(radians)) * f14;
                    f7 = f10;
                    fHypot2 += (float) Math.hypot(fSin - f17, fCos - f18);
                    fArr = ArcSplineKt.f751a;
                    fArr[i4] = fHypot2;
                    if (i4 == 90) {
                        break;
                    }
                    i4++;
                    f17 = fSin;
                    f10 = f7;
                    f16 = fCos;
                    i3 = i2;
                }
                this.g = fHypot2;
                int i5 = i2;
                while (true) {
                    fArr[i5] = fArr[i5] / fHypot2;
                    if (i5 == 90) {
                        break;
                    } else {
                        i5++;
                    }
                }
                int length = fArr2.length;
                for (int i6 = 0; i6 < length; i6++) {
                    float f19 = i6 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f19);
                    if (iBinarySearch >= 0) {
                        fArr2[i6] = iBinarySearch / f15;
                    } else if (iBinarySearch == -1) {
                        fArr2[i6] = f7;
                    } else {
                        int i7 = -iBinarySearch;
                        int i8 = i7 - 2;
                        float f20 = i8;
                        float f21 = fArr[i8];
                        fArr2[i6] = (((f19 - f21) / (fArr[i7 - 1] - f21)) + f20) / f15;
                    }
                }
                this.l = this.g * this.k;
                z = z3;
            }
            this.p = z;
        }

        public final float a() {
            float f = this.n * this.i;
            return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
        }

        public final float b() {
            float f = this.n * this.i;
            float f2 = (-this.o) * this.h;
            return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
        }

        public final void c(float f) {
            float f2 = (this.m == -1.0f ? this.b - f : f - this.f750a) * this.k;
            float fA = BitmapDescriptorFactory.HUE_RED;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                fA = 1.0f;
                if (f2 < 1.0f) {
                    float f3 = f2 * 100;
                    int i = (int) f3;
                    float[] fArr = this.j;
                    float f4 = fArr[i];
                    fA = YU.a.a(fArr[i + 1], f4, f3 - i, f4);
                }
            }
            double d = fA * 1.5707964f;
            this.h = (float) Math.sin(d);
            this.i = (float) Math.cos(d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r9
  0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcSpline(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r3 = new androidx.compose.animation.core.ArcSpline.Arc[r1][]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L73
            r8 = r23[r5]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L24
            if (r8 == r2) goto L2d
            if (r8 == r10) goto L2b
            if (r8 == r9) goto L26
            r9 = 4
            if (r8 == r9) goto L24
            r9 = 5
            if (r8 == r9) goto L24
            r12 = r7
            goto L2f
        L24:
            r12 = r9
            goto L2f
        L26:
            if (r6 != r2) goto L2d
            goto L2b
        L29:
            r12 = r6
            goto L2f
        L2b:
            r6 = r10
            goto L29
        L2d:
            r6 = r2
            goto L29
        L2f:
            r7 = r25[r5]
            int r8 = r5 + 1
            r9 = r25[r8]
            r13 = r0[r5]
            r14 = r0[r8]
            int r11 = r7.length
            int r11 = r11 / r10
            int r15 = r7.length
            int r15 = r15 % r10
            int r10 = r15 + r11
            androidx.compose.animation.core.ArcSpline$Arc[] r11 = new androidx.compose.animation.core.ArcSpline.Arc[r10]
            r15 = r4
        L42:
            if (r15 >= r10) goto L6c
            int r16 = r15 * 2
            r17 = r11
            androidx.compose.animation.core.ArcSpline$Arc r11 = new androidx.compose.animation.core.ArcSpline$Arc
            r18 = r15
            r15 = r7[r16]
            int r19 = r16 + 1
            r20 = r16
            r16 = r7[r19]
            r20 = r9[r20]
            r19 = r9[r19]
            r21 = r19
            r19 = r17
            r17 = r20
            r20 = r18
            r18 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r19[r20] = r11
            int r15 = r20 + 1
            r11 = r19
            goto L42
        L6c:
            r19 = r11
            r3[r5] = r19
            r5 = r8
            r7 = r12
            goto Le
        L73:
            r5 = r22
            r5.f749a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }
}
