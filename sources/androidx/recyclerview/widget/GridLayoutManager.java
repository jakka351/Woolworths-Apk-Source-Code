package androidx.recyclerview.widget;

import YU.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public SpanSizeLookup K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    @RequiresApi
    public static class Api21Impl {
    }

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int b(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int c(int i) {
            return 1;
        }
    }

    public static abstract class SpanSizeLookup {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f3669a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;

        public final int a(int i, int i2) {
            int iC = c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int iC2 = c(i5);
                i3 += iC2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = iC2;
                }
            }
            return i3 + iC > i2 ? i4 + 1 : i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004f -> B:28:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0051 -> B:28:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0053 -> B:28:0x0054). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int b(int r8, int r9) {
            /*
                r7 = this;
                int r0 = r7.c(r8)
                r1 = 0
                if (r0 != r9) goto L8
                goto L5b
            L8:
                boolean r2 = r7.c
                if (r2 == 0) goto L44
                android.util.SparseIntArray r2 = r7.f3669a
                int r3 = r2.size()
                int r3 = r3 + (-1)
                r4 = r1
            L15:
                if (r4 > r3) goto L28
                int r5 = r4 + r3
                int r5 = r5 >>> 1
                int r6 = r2.keyAt(r5)
                if (r6 >= r8) goto L24
                int r4 = r5 + 1
                goto L15
            L24:
                int r5 = r5 + (-1)
                r3 = r5
                goto L15
            L28:
                int r4 = r4 + (-1)
                if (r4 < 0) goto L37
                int r3 = r2.size()
                if (r4 >= r3) goto L37
                int r3 = r2.keyAt(r4)
                goto L38
            L37:
                r3 = -1
            L38:
                if (r3 < 0) goto L44
                int r2 = r2.get(r3)
                int r4 = r7.c(r3)
                int r4 = r4 + r2
                goto L54
            L44:
                r3 = r1
                r4 = r3
            L46:
                if (r3 >= r8) goto L57
                int r2 = r7.c(r3)
                int r4 = r4 + r2
                if (r4 != r9) goto L51
                r4 = r1
                goto L54
            L51:
                if (r4 <= r9) goto L54
                r4 = r2
            L54:
                int r3 = r3 + 1
                goto L46
            L57:
                int r0 = r0 + r4
                if (r0 > r9) goto L5b
                return r4
            L5b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.b(int, int):int");
        }

        public abstract int c(int i);

        public final void d() {
            this.f3669a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new DefaultSpanSizeLookup();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        J1(RecyclerView.LayoutManager.P(context, attributeSet, i, i2).b);
    }

    public final int A1(int i) {
        if (this.p == 0) {
            RecyclerView recyclerView = this.b;
            return F1(i, recyclerView.f, recyclerView.l0);
        }
        RecyclerView recyclerView2 = this.b;
        return G1(i, recyclerView2.f, recyclerView2.l0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int B(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.p == 1) {
            return Math.min(this.F, J());
        }
        if (state.b() < 1) {
            return 0;
        }
        return F1(state.b() - 1, recycler, state) + 1;
    }

    public final int B1(int i) {
        if (this.p == 1) {
            RecyclerView recyclerView = this.b;
            return F1(i, recyclerView.f, recyclerView.l0);
        }
        RecyclerView recyclerView2 = this.b;
        return G1(i, recyclerView2.f, recyclerView2.l0);
    }

    public final HashSet C1(int i) {
        return D1(B1(i), i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int D0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        K1();
        z1();
        return super.D0(i, recycler, state);
    }

    public final HashSet D1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iH1 = H1(i2, recyclerView.f, recyclerView.l0);
        for (int i3 = i; i3 < i + iH1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int E1(int i, int i2) {
        if (this.p != 1 || !l1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int F0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        K1();
        z1();
        return super.F0(i, recycler, state);
    }

    public final int F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            return this.K.a(i, this.F);
        }
        int iC = recycler.c(i);
        if (iC != -1) {
            return this.K.a(iC, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int G1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            SpanSizeLookup spanSizeLookup = this.K;
            int i2 = this.F;
            SparseIntArray sparseIntArray = spanSizeLookup.f3669a;
            if (!spanSizeLookup.c) {
                return spanSizeLookup.b(i, i2);
            }
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iB = spanSizeLookup.b(i, i2);
            sparseIntArray.put(i, iB);
            return iB;
        }
        int i4 = this.J.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int iC = recycler.c(i);
        if (iC == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        SpanSizeLookup spanSizeLookup2 = this.K;
        int i5 = this.F;
        SparseIntArray sparseIntArray2 = spanSizeLookup2.f3669a;
        if (!spanSizeLookup2.c) {
            return spanSizeLookup2.b(iC, i5);
        }
        int i6 = sparseIntArray2.get(iC, -1);
        if (i6 != -1) {
            return i6;
        }
        int iB2 = spanSizeLookup2.b(iC, i5);
        sparseIntArray2.put(iC, iB2);
        return iB2;
    }

    public final int H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.g) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iC = recycler.c(i);
        if (iC != -1) {
            return this.K.c(iC);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void I0(Rect rect, int i, int i2) {
        int iJ;
        int iJ2;
        if (this.G == null) {
            super.I0(rect, i, i2);
        }
        int iM = M() + L();
        int iK = K() + N();
        if (this.p == 1) {
            int iHeight = rect.height() + iK;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            iJ2 = RecyclerView.LayoutManager.j(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iJ = RecyclerView.LayoutManager.j(i, iArr[iArr.length - 1] + iM, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            iJ = RecyclerView.LayoutManager.j(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iJ2 = RecyclerView.LayoutManager.j(i2, iArr2[iArr2.length - 1] + iK, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iJ, iJ2);
    }

    public final void I1(View view, int i, boolean z) {
        int iA;
        int iA2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iE1 = E1(layoutParams.e, layoutParams.f);
        if (this.p == 1) {
            iA2 = RecyclerView.LayoutManager.A(iE1, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            iA = RecyclerView.LayoutManager.A(this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int iA3 = RecyclerView.LayoutManager.A(iE1, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int iA4 = RecyclerView.LayoutManager.A(this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            iA = iA3;
            iA2 = iA4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? N0(view, iA2, iA, layoutParams2) : L0(view, iA2, iA, layoutParams2)) {
            view.measure(iA2, iA);
        }
    }

    public final void J1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(a.d(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.d();
        C0();
    }

    public final void K1() {
        int iK;
        int iN;
        if (this.p == 1) {
            iK = this.n - M();
            iN = L();
        } else {
            iK = this.o - K();
            iN = N();
        }
        y1(iK - iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int Q(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.p == 0) {
            return Math.min(this.F, J());
        }
        if (state.b() < 1) {
            return 0;
        }
        return F1(state.b() - 1, recycler, state) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean Q0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i;
        int iC = this.F;
        for (int i2 = 0; i2 < this.F && (i = layoutState.d) >= 0 && i < state.b() && iC > 0; i2++) {
            int i3 = layoutState.d;
            ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).a(i3, Math.max(0, layoutState.g));
            iC -= this.K.c(i3);
            layoutState.d += layoutState.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        if (r16 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0138, code lost:
    
        return r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff A[PHI: r19 r21
  0x00ff: PHI (r19v8 int) = (r19v5 int), (r19v5 int), (r19v10 int) binds: [B:70:0x00f3, B:76:0x00fd, B:55:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r21v1 int) = (r21v0 int), (r21v0 int), (r21v2 int) binds: [B:70:0x00f3, B:76:0x00fd, B:55:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View e0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.Recycler r25, androidx.recyclerview.widget.RecyclerView.State r26) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void g0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g0(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.l(GridView.class.getName());
        RecyclerView.Adapter adapter = this.b.p;
        if (adapter == null || adapter.i() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View g1(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int iZ;
        int iZ2 = z();
        int i2 = 1;
        if (z2) {
            iZ = z() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iZ2;
            iZ = 0;
        }
        int iB = state.b();
        X0();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        while (iZ != i) {
            View viewY = y(iZ);
            int iO = RecyclerView.LayoutManager.O(viewY);
            if (iO >= 0 && iO < iB && G1(iO, recycler, state) == 0) {
                if (((RecyclerView.LayoutParams) viewY.getLayoutParams()).f3692a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewY;
                    }
                } else {
                    if (this.r.g(viewY) < i3 && this.r.d(viewY) >= iM) {
                        return viewY;
                    }
                    if (view == null) {
                        view = viewY;
                    }
                }
            }
            iZ += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean i(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void i0(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            h0(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iF1 = F1(layoutParams2.f3692a.getLayoutPosition(), recycler, state);
        if (this.p == 0) {
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(layoutParams2.e, layoutParams2.f, iF1, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(iF1, 1, layoutParams2.e, layoutParams2.f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void j0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void k0() {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void l0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void m0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void m1(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int iF;
        int iN;
        int iL;
        int iF2;
        int iA;
        int iA2;
        boolean z;
        int i4;
        View viewB;
        int iL2 = this.r.l();
        boolean z2 = iL2 != 1073741824;
        int i5 = z() > 0 ? this.G[this.F] : 0;
        if (z2) {
            K1();
        }
        boolean z3 = layoutState.e == 1;
        int iG1 = this.F;
        if (!z3) {
            iG1 = G1(layoutState.d, recycler, state) + H1(layoutState.d, recycler, state);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = layoutState.d) >= 0 && i4 < state.b() && iG1 > 0) {
            int i7 = layoutState.d;
            int iH1 = H1(i7, recycler, state);
            if (iH1 > this.F) {
                throw new IllegalArgumentException(a.m(a.q(i7, iH1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iG1 -= iH1;
            if (iG1 < 0 || (viewB = layoutState.b(recycler)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            layoutChunkResult.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iH12 = H1(RecyclerView.LayoutManager.O(view), recycler, state);
            layoutParams.f = iH12;
            layoutParams.e = i8;
            i8 += iH12;
            i += i3;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (layoutState.k != null) {
                z = false;
                if (z3) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                c(view2, -1, false);
            } else {
                z = false;
                c(view2, 0, false);
            }
            f(this.L, view2);
            I1(view2, iL2, z);
            int iE = this.r.e(view2);
            if (iE > i9) {
                i9 = iE;
            }
            float f2 = (this.r.f(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            y1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                I1(view3, 1073741824, true);
                int iE2 = this.r.e(view3);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.e(view4) != i9) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iE1 = E1(layoutParams2.e, layoutParams2.f);
                if (this.p == 1) {
                    iA2 = RecyclerView.LayoutManager.A(iE1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    iA = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iA = RecyclerView.LayoutManager.A(iE1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    iA2 = iMakeMeasureSpec;
                }
                if (N0(view4, iA2, iA, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(iA2, iA);
                }
            }
        }
        layoutChunkResult.f3676a = i9;
        if (this.p != 1) {
            if (layoutState.f == -1) {
                int i15 = layoutState.b;
                iL = i15 - i9;
                iN = 0;
                iF = i15;
            } else {
                int i16 = layoutState.b;
                iF = i16 + i9;
                iN = 0;
                iL = i16;
            }
            iF2 = iN;
        } else if (layoutState.f == -1) {
            iF2 = layoutState.b;
            iN = iF2 - i9;
            iL = 0;
            iF = 0;
        } else {
            int i17 = layoutState.b;
            iF = 0;
            iN = i17;
            iF2 = i17 + i9;
            iL = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.p != 1) {
                iN = N() + this.G[layoutParams3.e];
                iF2 = this.r.f(view5) + iN;
            } else if (l1()) {
                int iL3 = L() + this.G[this.F - layoutParams3.e];
                iF = iL3;
                iL = iL3 - this.r.f(view5);
            } else {
                iL = L() + this.G[layoutParams3.e];
                iF = this.r.f(view5) + iL;
            }
            RecyclerView.LayoutManager.X(view5, iL, iN, iF, iF2);
            if (layoutParams3.f3692a.isRemoved() || layoutParams3.f3692a.isUpdated()) {
                layoutChunkResult.c = true;
            }
            layoutChunkResult.d = view5.hasFocusable() | layoutChunkResult.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int n(RecyclerView.State state) {
        return U0(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void n0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void n1(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        K1();
        if (state.b() > 0 && !state.g) {
            boolean z = i == 1;
            int iG1 = G1(anchorInfo.b, recycler, state);
            if (z) {
                while (iG1 > 0) {
                    int i2 = anchorInfo.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    anchorInfo.b = i3;
                    iG1 = G1(i3, recycler, state);
                }
            } else {
                int iB = state.b() - 1;
                int i4 = anchorInfo.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iG12 = G1(i5, recycler, state);
                    if (iG12 <= iG1) {
                        break;
                    }
                    i4 = i5;
                    iG1 = iG12;
                }
                anchorInfo.b = i4;
            }
        }
        z1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int o(RecyclerView.State state) {
        return V0(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void o0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iZ = z();
            for (int i = 0; i < iZ; i++) {
                LayoutParams layoutParams = (LayoutParams) y(i).getLayoutParams();
                int layoutPosition = layoutParams.f3692a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, layoutParams.f);
                sparseIntArray.put(layoutPosition, layoutParams.e);
            }
        }
        super.o0(recycler, state);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void p0(RecyclerView.State state) {
        View viewU;
        super.p0(state);
        this.E = false;
        int i = this.M;
        if (i == -1 || (viewU = u(i)) == null) {
            return;
        }
        viewU.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int q(RecyclerView.State state) {
        return U0(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int r(RecyclerView.State state) {
        return V0(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.u0(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void u1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.u1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams v() {
        return this.p == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams w(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams x(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.e = -1;
            layoutParams2.f = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.e = -1;
        layoutParams3.f = 0;
        return layoutParams3;
    }

    public final void y1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void z1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new DefaultSpanSizeLookup();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        J1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new DefaultSpanSizeLookup();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        J1(i);
    }
}
