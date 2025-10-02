package androidx.recyclerview.widget;

import YU.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public final AnchorInfo A;
    public final LayoutChunkResult B;
    public int C;
    public final int[] D;
    public int p;
    public LayoutState q;
    public OrientationHelper r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public SavedState z;

    public static class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public OrientationHelper f3675a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public AnchorInfo() {
            d();
        }

        public final void a() {
            this.c = this.d ? this.f3675a.i() : this.f3675a.m();
        }

        public final void b(int i, View view) {
            if (this.d) {
                int iD = this.f3675a.d(view);
                OrientationHelper orientationHelper = this.f3675a;
                this.c = (Integer.MIN_VALUE == orientationHelper.b ? 0 : orientationHelper.n() - orientationHelper.b) + iD;
            } else {
                this.c = this.f3675a.g(view);
            }
            this.b = i;
        }

        public final void c(int i, View view) {
            OrientationHelper orientationHelper = this.f3675a;
            int iN = Integer.MIN_VALUE == orientationHelper.b ? 0 : orientationHelper.n() - orientationHelper.b;
            if (iN >= 0) {
                b(i, view);
                return;
            }
            this.b = i;
            if (!this.d) {
                int iG = this.f3675a.g(view);
                int iM = iG - this.f3675a.m();
                this.c = iG;
                if (iM > 0) {
                    int i2 = (this.f3675a.i() - Math.min(0, (this.f3675a.i() - iN) - this.f3675a.d(view))) - (this.f3675a.e(view) + iG);
                    if (i2 < 0) {
                        this.c -= Math.min(iM, -i2);
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = (this.f3675a.i() - iN) - this.f3675a.d(view);
            this.c = this.f3675a.i() - i3;
            if (i3 > 0) {
                int iE = this.c - this.f3675a.e(view);
                int iM2 = this.f3675a.m();
                int iMin = iE - (Math.min(this.f3675a.g(view) - iM2, 0) + iM2);
                if (iMin < 0) {
                    this.c = Math.min(i3, -iMin) + this.c;
                }
            }
        }

        public final void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return b.s(sb, this.e, '}');
        }
    }

    public static class LayoutChunkResult {

        /* renamed from: a, reason: collision with root package name */
        public int f3676a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class LayoutState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3677a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List k;
        public boolean l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.ViewHolder) this.k.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.f3692a.isRemoved() && (layoutPosition = (layoutParams.f3692a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f3692a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.Recycler recycler) {
            List list = this.k;
            if (list == null) {
                View view = recycler.m(this.d, Long.MAX_VALUE).itemView;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = ((RecyclerView.ViewHolder) this.k.get(i)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.f3692a.isRemoved() && this.d == layoutParams.f3692a.getLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;
        public int e;
        public boolean f;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                savedState.f = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public LinearLayoutManager(@SuppressLint Context context) {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int D0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.p == 1) {
            return 0;
        }
        return r1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void E0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.d = -1;
        }
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int F0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.p == 0) {
            return 0;
        }
        return r1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean M0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iZ = z();
            for (int i = 0; i < iZ; i++) {
                ViewGroup.LayoutParams layoutParams = y(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void O0(int i, RecyclerView recyclerView) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f3697a = i;
        P0(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean Q0() {
        return this.z == null && this.s == this.v;
    }

    public void R0(RecyclerView.State state, int[] iArr) {
        int i;
        int iN = state.f3699a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void S0(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = layoutState.d;
        if (i < 0 || i >= state.b()) {
            return;
        }
        ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).a(i, Math.max(0, layoutState.g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean T() {
        return true;
    }

    public final int T0(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        X0();
        OrientationHelper orientationHelper = this.r;
        boolean z = !this.w;
        return ScrollbarHelper.a(state, orientationHelper, a1(z), Z0(z), this, this.w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean U() {
        return this.t;
    }

    public final int U0(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        X0();
        OrientationHelper orientationHelper = this.r;
        boolean z = !this.w;
        return ScrollbarHelper.b(state, orientationHelper, a1(z), Z0(z), this, this.w, this.u);
    }

    public final int V0(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        X0();
        OrientationHelper orientationHelper = this.r;
        boolean z = !this.w;
        return ScrollbarHelper.c(state, orientationHelper, a1(z), Z0(z), this, this.w);
    }

    public final int W0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && l1()) ? -1 : 1 : (this.p != 1 && l1()) ? 1 : -1;
    }

    public final void X0() {
        if (this.q == null) {
            LayoutState layoutState = new LayoutState();
            layoutState.f3677a = true;
            layoutState.h = 0;
            layoutState.i = 0;
            layoutState.k = null;
            this.q = layoutState;
        }
    }

    public final int Y0(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z) {
        int i;
        int i2 = layoutState.c;
        int i3 = layoutState.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                layoutState.g = i3 + i2;
            }
            o1(recycler, layoutState);
        }
        int i4 = layoutState.c + layoutState.h;
        while (true) {
            if ((!layoutState.l && i4 <= 0) || (i = layoutState.d) < 0 || i >= state.b()) {
                break;
            }
            LayoutChunkResult layoutChunkResult = this.B;
            layoutChunkResult.f3676a = 0;
            layoutChunkResult.b = false;
            layoutChunkResult.c = false;
            layoutChunkResult.d = false;
            m1(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.b) {
                int i5 = layoutState.b;
                int i6 = layoutChunkResult.f3676a;
                layoutState.b = (layoutState.f * i6) + i5;
                if (!layoutChunkResult.c || layoutState.k != null || !state.g) {
                    layoutState.c -= i6;
                    i4 -= i6;
                }
                int i7 = layoutState.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    layoutState.g = i8;
                    int i9 = layoutState.c;
                    if (i9 < 0) {
                        layoutState.g = i8 + i9;
                    }
                    o1(recycler, layoutState);
                }
                if (z && layoutChunkResult.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.c;
    }

    public final View Z0(boolean z) {
        return this.u ? f1(0, z(), z, true) : f1(z() - 1, -1, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF a(int i) {
        if (z() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.LayoutManager.O(y(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, i2);
    }

    public final View a1(boolean z) {
        return this.u ? f1(z() - 1, -1, z, true) : f1(0, z(), z, true);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public final void b(View view, View view2) {
        d("Cannot drop a view during a scroll or layout calculation");
        X0();
        q1();
        int iO = RecyclerView.LayoutManager.O(view);
        int iO2 = RecyclerView.LayoutManager.O(view2);
        char c = iO < iO2 ? (char) 1 : (char) 65535;
        if (this.u) {
            if (c == 1) {
                s1(iO2, this.r.i() - (this.r.e(view) + this.r.g(view2)));
                return;
            } else {
                s1(iO2, this.r.i() - this.r.d(view2));
                return;
            }
        }
        if (c == 65535) {
            s1(iO2, this.r.g(view2));
        } else {
            s1(iO2, this.r.d(view2) - this.r.e(view));
        }
    }

    public final int b1() {
        View viewF1 = f1(0, z(), false, true);
        if (viewF1 == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.O(viewF1);
    }

    public final int c1() {
        View viewF1 = f1(z() - 1, -1, true, false);
        if (viewF1 == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.O(viewF1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void d(String str) {
        if (this.z == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void d0(RecyclerView recyclerView) {
    }

    public final int d1() {
        View viewF1 = f1(z() - 1, -1, false, true);
        if (viewF1 == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.O(viewF1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View e0(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iW0;
        q1();
        if (z() != 0 && (iW0 = W0(i)) != Integer.MIN_VALUE) {
            X0();
            v1(iW0, (int) (this.r.n() * 0.33333334f), false, state);
            LayoutState layoutState = this.q;
            layoutState.g = Integer.MIN_VALUE;
            layoutState.f3677a = false;
            Y0(recycler, layoutState, state, true);
            View viewE1 = iW0 == -1 ? this.u ? e1(z() - 1, -1) : e1(0, z()) : this.u ? e1(0, z()) : e1(z() - 1, -1);
            View viewK1 = iW0 == -1 ? k1() : j1();
            if (!viewK1.hasFocusable()) {
                return viewE1;
            }
            if (viewE1 != null) {
                return viewK1;
            }
        }
        return null;
    }

    public final View e1(int i, int i2) {
        int i3;
        int i4;
        X0();
        if (i2 <= i && i2 >= i) {
            return y(i);
        }
        if (this.r.g(y(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (z() > 0) {
            accessibilityEvent.setFromIndex(b1());
            accessibilityEvent.setToIndex(d1());
        }
    }

    public final View f1(int i, int i2, boolean z, boolean z2) {
        X0();
        int i3 = DilithiumEngine.DilithiumPolyT1PackedBytes;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.p == 0 ? this.c.a(i, i2, i4, i3) : this.d.a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean g() {
        return this.p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void g0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g0(recycler, state, accessibilityNodeInfoCompat);
        RecyclerView.Adapter adapter = this.b.p;
        if (adapter == null || adapter.i() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View g1(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.X0()
            int r1 = r0.z()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.z()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.OrientationHelper r7 = r0.r
            int r7 = r7.m()
            androidx.recyclerview.widget.OrientationHelper r8 = r0.r
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.y(r1)
            int r13 = androidx.recyclerview.widget.RecyclerView.LayoutManager.O(r12)
            androidx.recyclerview.widget.OrientationHelper r14 = r0.r
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.OrientationHelper r15 = r0.r
            int r15 = r15.d(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r13
            androidx.recyclerview.widget.RecyclerView$ViewHolder r13 = r13.f3692a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.g1(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean h() {
        return this.p == 1;
    }

    public final int h1(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -r1(-i3, recycler, state);
        int i5 = i + i4;
        if (!z || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.q(i2);
        return i2 + i4;
    }

    public final int i1(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -r1(iM2, recycler, state);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.q(-iM);
        return i2 - iM;
    }

    public final View j1() {
        return y(this.u ? 0 : z() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void k(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.p != 0) {
            i = i2;
        }
        if (z() == 0 || i == 0) {
            return;
        }
        X0();
        v1(i > 0 ? 1 : -1, Math.abs(i), true, state);
        S0(state, this.q, layoutPrefetchRegistry);
    }

    public final View k1() {
        return y(this.u ? z() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void l(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.z;
        if (savedState == null || (i2 = savedState.d) < 0) {
            q1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).a(i2, 0);
            i2 += i3;
        }
    }

    public boolean l1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int m(RecyclerView.State state) {
        return T0(state);
    }

    public void m1(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int iL;
        int i;
        int i2;
        int iF;
        View viewB = layoutState.b(recycler);
        if (viewB == null) {
            layoutChunkResult.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        if (layoutState.k == null) {
            if (this.u == (layoutState.f == -1)) {
                c(viewB, -1, false);
            } else {
                c(viewB, 0, false);
            }
        } else {
            if (this.u == (layoutState.f == -1)) {
                c(viewB, -1, true);
            } else {
                c(viewB, 0, true);
            }
        }
        Y(viewB);
        layoutChunkResult.f3676a = this.r.e(viewB);
        if (this.p == 1) {
            if (l1()) {
                iF = this.n - M();
                iL = iF - this.r.f(viewB);
            } else {
                iL = L();
                iF = this.r.f(viewB) + iL;
            }
            if (layoutState.f == -1) {
                i = layoutState.b;
                i2 = i - layoutChunkResult.f3676a;
            } else {
                i2 = layoutState.b;
                i = layoutChunkResult.f3676a + i2;
            }
        } else {
            int iN = N();
            int iF2 = this.r.f(viewB) + iN;
            if (layoutState.f == -1) {
                int i3 = layoutState.b;
                int i4 = i3 - layoutChunkResult.f3676a;
                iF = i3;
                i = iF2;
                iL = i4;
                i2 = iN;
            } else {
                int i5 = layoutState.b;
                int i6 = layoutChunkResult.f3676a + i5;
                iL = i5;
                i = iF2;
                i2 = iN;
                iF = i6;
            }
        }
        RecyclerView.LayoutManager.X(viewB, iL, i2, iF, i);
        if (layoutParams.f3692a.isRemoved() || layoutParams.f3692a.isUpdated()) {
            layoutChunkResult.c = true;
        }
        layoutChunkResult.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int n(RecyclerView.State state) {
        return U0(state);
    }

    public void n1(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int o(RecyclerView.State state) {
        return V0(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o0(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.o0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public final void o1(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f3677a || layoutState.l) {
            return;
        }
        int i = layoutState.g;
        int i2 = layoutState.i;
        if (layoutState.f == -1) {
            int iZ = z();
            if (i < 0) {
                return;
            }
            int iH = (this.r.h() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iZ; i3++) {
                    View viewY = y(i3);
                    if (this.r.g(viewY) < iH || this.r.p(viewY) < iH) {
                        p1(recycler, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iZ - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewY2 = y(i5);
                if (this.r.g(viewY2) < iH || this.r.p(viewY2) < iH) {
                    p1(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iZ2 = z();
        if (!this.u) {
            for (int i7 = 0; i7 < iZ2; i7++) {
                View viewY3 = y(i7);
                if (this.r.d(viewY3) > i6 || this.r.o(viewY3) > i6) {
                    p1(recycler, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iZ2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewY4 = y(i9);
            if (this.r.d(viewY4) > i6 || this.r.o(viewY4) > i6) {
                p1(recycler, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int p(RecyclerView.State state) {
        return T0(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p0(RecyclerView.State state) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void p1(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                y0(i, recycler);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                y0(i3, recycler);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int q(RecyclerView.State state) {
        return U0(state);
    }

    public final void q1() {
        if (this.p == 1 || !l1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int r(RecyclerView.State state) {
        return V0(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void r0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState;
            if (this.x != -1) {
                savedState.d = -1;
            }
            C0();
        }
    }

    public final int r1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (z() != 0 && i != 0) {
            X0();
            this.q.f3677a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            v1(i2, iAbs, true, state);
            LayoutState layoutState = this.q;
            int iY0 = Y0(recycler, layoutState, state, false) + layoutState.g;
            if (iY0 >= 0) {
                if (iAbs > iY0) {
                    i = i2 * iY0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable s0() {
        SavedState savedState = this.z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (z() <= 0) {
            savedState3.d = -1;
            return savedState3;
        }
        X0();
        boolean z = this.s ^ this.u;
        savedState3.f = z;
        if (z) {
            View viewJ1 = j1();
            savedState3.e = this.r.i() - this.r.d(viewJ1);
            savedState3.d = RecyclerView.LayoutManager.O(viewJ1);
            return savedState3;
        }
        View viewK1 = k1();
        savedState3.d = RecyclerView.LayoutManager.O(viewK1);
        savedState3.e = this.r.g(viewK1) - this.r.m();
        return savedState3;
    }

    public void s1(int i, int i2) {
        this.x = i;
        this.y = i2;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.d = -1;
        }
        C0();
    }

    public final void t1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.d(i, "invalid orientation:"));
        }
        d(null);
        if (i != this.p || this.r == null) {
            OrientationHelper orientationHelperB = OrientationHelper.b(this, i);
            this.r = orientationHelperB;
            this.A.f3675a = orientationHelperB;
            this.p = i;
            C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View u(int i) {
        int iZ = z();
        if (iZ == 0) {
            return null;
        }
        int iO = i - RecyclerView.LayoutManager.O(y(0));
        if (iO >= 0 && iO < iZ) {
            View viewY = y(iO);
            if (RecyclerView.LayoutManager.O(viewY) == i) {
                return viewY;
            }
        }
        return super.u(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean u0(int i, Bundle bundle) {
        int iMin;
        if (super.u0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, Q(recyclerView.f, recyclerView.l0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, B(recyclerView2.f, recyclerView2.l0) - 1);
            }
            if (iMin >= 0) {
                s1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public void u1(boolean z) {
        d(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams v() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void v1(int i, int i2, boolean z, RecyclerView.State state) {
        int iM;
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        R0(state, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        LayoutState layoutState = this.q;
        int i3 = z2 ? iMax2 : iMax;
        layoutState.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        layoutState.i = iMax;
        if (z2) {
            layoutState.h = this.r.j() + i3;
            View viewJ1 = j1();
            LayoutState layoutState2 = this.q;
            layoutState2.e = this.u ? -1 : 1;
            int iO = RecyclerView.LayoutManager.O(viewJ1);
            LayoutState layoutState3 = this.q;
            layoutState2.d = iO + layoutState3.e;
            layoutState3.b = this.r.d(viewJ1);
            iM = this.r.d(viewJ1) - this.r.i();
        } else {
            View viewK1 = k1();
            LayoutState layoutState4 = this.q;
            layoutState4.h = this.r.m() + layoutState4.h;
            LayoutState layoutState5 = this.q;
            layoutState5.e = this.u ? 1 : -1;
            int iO2 = RecyclerView.LayoutManager.O(viewK1);
            LayoutState layoutState6 = this.q;
            layoutState5.d = iO2 + layoutState6.e;
            layoutState6.b = this.r.g(viewK1);
            iM = (-this.r.g(viewK1)) + this.r.m();
        }
        LayoutState layoutState7 = this.q;
        layoutState7.c = i2;
        if (z) {
            layoutState7.c = i2 - iM;
        }
        layoutState7.g = iM;
    }

    public final void w1(int i, int i2) {
        this.q.c = this.r.i() - i2;
        LayoutState layoutState = this.q;
        layoutState.e = this.u ? -1 : 1;
        layoutState.d = i;
        layoutState.f = 1;
        layoutState.b = i2;
        layoutState.g = Integer.MIN_VALUE;
    }

    public final void x1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        LayoutState layoutState = this.q;
        layoutState.d = i;
        layoutState.e = this.u ? 1 : -1;
        layoutState.f = -1;
        layoutState.b = i2;
        layoutState.g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new AnchorInfo();
        this.B = new LayoutChunkResult();
        this.C = 2;
        this.D = new int[2];
        t1(i);
        d(null);
        if (this.t) {
            this.t = false;
            C0();
        }
    }

    @SuppressLint
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new AnchorInfo();
        this.B = new LayoutChunkResult();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.LayoutManager.Properties propertiesP = RecyclerView.LayoutManager.P(context, attributeSet, i, i2);
        t1(propertiesP.f3691a);
        boolean z = propertiesP.c;
        d(null);
        if (z != this.t) {
            this.t = z;
            C0();
        }
        u1(propertiesP.d);
    }
}
