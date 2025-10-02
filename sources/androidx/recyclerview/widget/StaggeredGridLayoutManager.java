package androidx.recyclerview.widget;

import YU.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public final LazySpanLookup B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final AnchorInfo H;
    public final boolean I;
    public int[] J;
    public final Runnable K;
    public final int p;
    public final Span[] q;
    public final OrientationHelper r;
    public final OrientationHelper s;
    public final int t;
    public int u;
    public final LayoutState v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public int f3702a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public AnchorInfo() {
            a();
        }

        public final void a() {
            this.f3702a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public Span e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f3703a;
        public ArrayList b;

        @SuppressLint
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new AnonymousClass1();
            public int d;
            public int e;
            public int[] f;
            public boolean g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, reason: invalid class name */
            public class AnonymousClass1 implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.d = parcel.readInt();
                    fullSpanItem.e = parcel.readInt();
                    fullSpanItem.g = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        fullSpanItem.f = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.d + ", mGapDir=" + this.e + ", mHasUnwantedGapAfter=" + this.g + ", mGapPerSpan=" + Arrays.toString(this.f) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
                parcel.writeInt(this.g ? 1 : 0);
                int[] iArr = this.f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f3703a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void b(int i) {
            int[] iArr = this.f3703a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f3703a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f3703a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3703a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i, int i2) {
            int[] iArr = this.f3703a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f3703a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f3703a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.d;
                if (i4 >= i) {
                    fullSpanItem.d = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.f3703a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f3703a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f3703a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.d;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.d = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;
        public int e;
        public int f;
        public int[] g;
        public int h;
        public int[] i;
        public ArrayList j;
        public boolean k;
        public boolean l;
        public boolean m;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                int i = parcel.readInt();
                savedState.f = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    savedState.g = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                savedState.h = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    savedState.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.k = parcel.readInt() == 1;
                savedState.l = parcel.readInt() == 1;
                savedState.m = parcel.readInt() == 1;
                savedState.j = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
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
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.h);
            if (this.h > 0) {
                parcel.writeIntArray(this.i);
            }
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeList(this.j);
        }
    }

    public class Span {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3704a = new ArrayList();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public Span(int i) {
            this.e = i;
        }

        public final void a() {
            View view = (View) a.c(1, this.f3704a);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.r.d(view);
            layoutParams.getClass();
        }

        public final void b() {
            this.f3704a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.w ? e(r1.size() - 1, -1) : e(0, this.f3704a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.w ? e(0, this.f3704a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iM = staggeredGridLayoutManager.r.m();
            int i3 = staggeredGridLayoutManager.r.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f3704a.get(i);
                int iG = staggeredGridLayoutManager.r.g(view);
                int iD = staggeredGridLayoutManager.r.d(view);
                boolean z = iG <= i3;
                boolean z2 = iD >= iM;
                if (z && z2 && (iG < iM || iD > i3)) {
                    return RecyclerView.LayoutManager.O(view);
                }
                i += i4;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3704a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList arrayList = this.f3704a;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = (View) arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.LayoutManager.O(view2) >= i) || ((!staggeredGridLayoutManager.w && RecyclerView.LayoutManager.O(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && RecyclerView.LayoutManager.O(view3) <= i) || ((!staggeredGridLayoutManager.w && RecyclerView.LayoutManager.O(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            ArrayList arrayList = this.f3704a;
            if (arrayList.size() == 0) {
                return i;
            }
            View view = (View) arrayList.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.r.g(view);
            layoutParams.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.B = lazySpanLookup;
        this.C = 2;
        this.G = new Rect();
        this.H = new AnchorInfo();
        this.I = true;
        this.K = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
            @Override // java.lang.Runnable
            public final void run() {
                StaggeredGridLayoutManager.this.R0();
            }
        };
        RecyclerView.LayoutManager.Properties propertiesP = RecyclerView.LayoutManager.P(context, attributeSet, i, i2);
        int i3 = propertiesP.f3691a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i3 != this.t) {
            this.t = i3;
            OrientationHelper orientationHelper = this.r;
            this.r = this.s;
            this.s = orientationHelper;
            C0();
        }
        int i4 = propertiesP.b;
        d(null);
        if (i4 != this.p) {
            lazySpanLookup.a();
            C0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new Span[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new Span(i5);
            }
            C0();
        }
        boolean z = propertiesP.c;
        d(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.k != z) {
            savedState.k = z;
        }
        this.w = z;
        C0();
        LayoutState layoutState = new LayoutState();
        layoutState.f3674a = true;
        layoutState.f = 0;
        layoutState.g = 0;
        this.v = layoutState;
        this.r = OrientationHelper.b(this, this.t);
        this.s = OrientationHelper.b(this, 1 - this.t);
    }

    public static int r1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int B(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.t == 1) {
            return Math.min(this.p, state.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int D0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return n1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void E0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.d != i) {
            savedState.g = null;
            savedState.f = 0;
            savedState.d = -1;
            savedState.e = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int F0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return n1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void I0(Rect rect, int i, int i2) {
        int iJ;
        int iJ2;
        int iM = M() + L();
        int iK = K() + N();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + iK;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            iJ2 = RecyclerView.LayoutManager.j(i2, iHeight, recyclerView.getMinimumHeight());
            iJ = RecyclerView.LayoutManager.j(i, (this.u * i4) + iM, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            iJ = RecyclerView.LayoutManager.j(i, iWidth, recyclerView2.getMinimumWidth());
            iJ2 = RecyclerView.LayoutManager.j(i2, (this.u * i4) + iK, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iJ, iJ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void O0(int i, RecyclerView recyclerView) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f3697a = i;
        P0(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int Q(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.t == 0) {
            return Math.min(this.p, state.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean Q0() {
        return this.F == null;
    }

    public final boolean R0() {
        int iY0;
        if (z() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iY0 = Z0();
                Y0();
            } else {
                iY0 = Y0();
                Z0();
            }
            if (iY0 == 0 && d1() != null) {
                this.B.a();
                this.f = true;
                C0();
                return true;
            }
        }
        return false;
    }

    public final int S0(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ScrollbarHelper.b(state, this.r, V0(z), U0(z), this, this.I, this.x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean T() {
        return this.C != 0;
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int T0(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        Span span;
        ?? r8;
        int iH;
        int iE;
        int iM;
        int iE2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.y.set(0, this.p, true);
        LayoutState layoutState2 = this.v;
        int i6 = layoutState2.i ? layoutState.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : layoutState.e == 1 ? layoutState.g + layoutState.b : layoutState.f - layoutState.b;
        int i7 = layoutState.e;
        for (int i8 = 0; i8 < this.p; i8++) {
            if (!this.q[i8].f3704a.isEmpty()) {
                q1(this.q[i8], i7, i6);
            }
        }
        int i9 = this.x ? this.r.i() : this.r.m();
        boolean z = false;
        while (true) {
            int i10 = layoutState.c;
            if (i10 < 0 || i10 >= state.b() || (!layoutState2.i && this.y.isEmpty())) {
                break;
            }
            View view = recycler.m(layoutState.c, Long.MAX_VALUE).itemView;
            layoutState.c += layoutState.d;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int layoutPosition = layoutParams.f3692a.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.B;
            int[] iArr = lazySpanLookup.f3703a;
            int i11 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i11 == -1) {
                if (h1(layoutState.e)) {
                    i3 = this.p - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.p;
                    i3 = i4;
                }
                Span span2 = null;
                if (layoutState.e == i5) {
                    int iM2 = this.r.m();
                    int i12 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        Span span3 = this.q[i3];
                        int iF = span3.f(iM2);
                        if (iF < i12) {
                            i12 = iF;
                            span2 = span3;
                        }
                        i3 += i;
                    }
                } else {
                    int i13 = this.r.i();
                    int i14 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        Span span4 = this.q[i3];
                        int iH2 = span4.h(i13);
                        if (iH2 > i14) {
                            span2 = span4;
                            i14 = iH2;
                        }
                        i3 += i;
                    }
                }
                span = span2;
                lazySpanLookup.b(layoutPosition);
                lazySpanLookup.f3703a[layoutPosition] = span.e;
            } else {
                span = this.q[i11];
            }
            layoutParams.e = span;
            if (layoutState.e == 1) {
                r8 = 0;
                c(view, -1, false);
            } else {
                r8 = 0;
                c(view, 0, false);
            }
            if (this.t == 1) {
                f1(view, RecyclerView.LayoutManager.A(this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) layoutParams).width, r8), RecyclerView.LayoutManager.A(this.o, this.m, K() + N(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true));
            } else {
                f1(view, RecyclerView.LayoutManager.A(this.n, this.l, M() + L(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.A(this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false));
            }
            if (layoutState.e == 1) {
                iE = span.f(i9);
                iH = this.r.e(view) + iE;
            } else {
                iH = span.h(i9);
                iE = iH - this.r.e(view);
            }
            if (layoutState.e == 1) {
                Span span5 = layoutParams.e;
                span5.getClass();
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.e = span5;
                ArrayList arrayList = span5.f3704a;
                arrayList.add(view);
                span5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    span5.b = Integer.MIN_VALUE;
                }
                if (layoutParams2.f3692a.isRemoved() || layoutParams2.f3692a.isUpdated()) {
                    span5.d = StaggeredGridLayoutManager.this.r.e(view) + span5.d;
                }
            } else {
                Span span6 = layoutParams.e;
                span6.getClass();
                LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
                layoutParams3.e = span6;
                ArrayList arrayList2 = span6.f3704a;
                arrayList2.add(0, view);
                span6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    span6.c = Integer.MIN_VALUE;
                }
                if (layoutParams3.f3692a.isRemoved() || layoutParams3.f3692a.isUpdated()) {
                    span6.d = StaggeredGridLayoutManager.this.r.e(view) + span6.d;
                }
            }
            if (e1() && this.t == 1) {
                iE2 = this.s.i() - (((this.p - 1) - span.e) * this.u);
                iM = iE2 - this.s.e(view);
            } else {
                iM = this.s.m() + (span.e * this.u);
                iE2 = this.s.e(view) + iM;
            }
            if (this.t == 1) {
                RecyclerView.LayoutManager.X(view, iM, iE, iE2, iH);
            } else {
                RecyclerView.LayoutManager.X(view, iE, iM, iH, iE2);
            }
            q1(span, layoutState2.e, i6);
            j1(recycler, layoutState2);
            if (layoutState2.h && view.hasFocusable()) {
                this.y.set(span.e, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        if (!z) {
            j1(recycler, layoutState2);
        }
        int iM3 = layoutState2.e == -1 ? this.r.m() - b1(this.r.m()) : a1(this.r.i()) - this.r.i();
        if (iM3 > 0) {
            return Math.min(layoutState.b, iM3);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean U() {
        return this.w;
    }

    public final View U0(boolean z) {
        int iM = this.r.m();
        int i = this.r.i();
        View view = null;
        for (int iZ = z() - 1; iZ >= 0; iZ--) {
            View viewY = y(iZ);
            int iG = this.r.g(viewY);
            int iD = this.r.d(viewY);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewY;
                }
                if (view == null) {
                    view = viewY;
                }
            }
        }
        return view;
    }

    public final View V0(boolean z) {
        int iM = this.r.m();
        int i = this.r.i();
        int iZ = z();
        View view = null;
        for (int i2 = 0; i2 < iZ; i2++) {
            View viewY = y(i2);
            int iG = this.r.g(viewY);
            if (this.r.d(viewY) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewY;
                }
                if (view == null) {
                    view = viewY;
                }
            }
        }
        return view;
    }

    public final void W0(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i;
        int iA1 = a1(Integer.MIN_VALUE);
        if (iA1 != Integer.MIN_VALUE && (i = this.r.i() - iA1) > 0) {
            int i2 = i - (-n1(-i, recycler, state));
            if (!z || i2 <= 0) {
                return;
            }
            this.r.q(i2);
        }
    }

    public final void X0(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iM;
        int iB1 = b1(Integer.MAX_VALUE);
        if (iB1 != Integer.MAX_VALUE && (iM = iB1 - this.r.m()) > 0) {
            int iN1 = iM - n1(iM, recycler, state);
            if (!z || iN1 <= 0) {
                return;
            }
            this.r.q(-iN1);
        }
    }

    public final int Y0() {
        if (z() == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.O(y(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void Z(int i) {
        super.Z(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            Span span = this.q[i2];
            int i3 = span.b;
            if (i3 != Integer.MIN_VALUE) {
                span.b = i3 + i;
            }
            int i4 = span.c;
            if (i4 != Integer.MIN_VALUE) {
                span.c = i4 + i;
            }
        }
    }

    public final int Z0() {
        int iZ = z();
        if (iZ == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.O(y(iZ - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.z()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.Y0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void a0(int i) {
        super.a0(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            Span span = this.q[i2];
            int i3 = span.b;
            if (i3 != Integer.MIN_VALUE) {
                span.b = i3 + i;
            }
            int i4 = span.c;
            if (i4 != Integer.MIN_VALUE) {
                span.c = i4 + i;
            }
        }
    }

    public final int a1(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void b0(RecyclerView.Adapter adapter) {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final int b1(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.x
            if (r0 == 0) goto L9
            int r0 = r9.Z0()
            goto Ld
        L9:
            int r0 = r9.Y0()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r9.B
            int[] r5 = r4.f3703a
            if (r5 != 0) goto L26
            goto L9a
        L26:
            int r5 = r5.length
            if (r3 < r5) goto L2b
            goto L9a
        L2b:
            java.util.ArrayList r5 = r4.b
            r6 = -1
            if (r5 != 0) goto L32
        L30:
            r5 = r6
            goto L80
        L32:
            if (r5 != 0) goto L35
            goto L4d
        L35:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3b:
            if (r5 < 0) goto L4d
            java.util.ArrayList r7 = r4.b
            java.lang.Object r7 = r7.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r7
            int r8 = r7.d
            if (r8 != r3) goto L4a
            goto L4e
        L4a:
            int r5 = r5 + (-1)
            goto L3b
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L55
            java.util.ArrayList r5 = r4.b
            r5.remove(r7)
        L55:
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            r7 = 0
        L5c:
            if (r7 >= r5) goto L6e
            java.util.ArrayList r8 = r4.b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r8
            int r8 = r8.d
            if (r8 < r3) goto L6b
            goto L6f
        L6b:
            int r7 = r7 + 1
            goto L5c
        L6e:
            r7 = r6
        L6f:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r5
            java.util.ArrayList r8 = r4.b
            r8.remove(r7)
            int r5 = r5.d
        L80:
            if (r5 != r6) goto L8c
            int[] r5 = r4.f3703a
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f3703a
            int r5 = r5.length
            goto L9a
        L8c:
            int r5 = r5 + 1
            int[] r7 = r4.f3703a
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f3703a
            java.util.Arrays.fill(r7, r3, r5, r6)
        L9a:
            r5 = 1
            if (r12 == r5) goto Lae
            r6 = 2
            if (r12 == r6) goto Laa
            if (r12 == r1) goto La3
            goto Lb1
        La3:
            r4.d(r10, r5)
            r4.c(r11, r5)
            goto Lb1
        Laa:
            r4.d(r10, r11)
            goto Lb1
        Lae:
            r4.c(r10, r11)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r10 = r9.x
            if (r10 == 0) goto Lbd
            int r10 = r9.Y0()
            goto Lc1
        Lbd:
            int r10 = r9.Z0()
        Lc1:
            if (r3 > r10) goto Lc6
            r9.C0()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void d0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d1() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1():android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View e0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    public final boolean e1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (z() > 0) {
            View viewV0 = V0(false);
            View viewU0 = U0(false);
            if (viewV0 == null || viewU0 == null) {
                return;
            }
            int iO = RecyclerView.LayoutManager.O(viewV0);
            int iO2 = RecyclerView.LayoutManager.O(viewU0);
            if (iO < iO2) {
                accessibilityEvent.setFromIndex(iO);
                accessibilityEvent.setToIndex(iO2);
            } else {
                accessibilityEvent.setFromIndex(iO2);
                accessibilityEvent.setToIndex(iO);
            }
        }
    }

    public final void f1(View view, int i, int i2) {
        Rect rect = this.G;
        f(rect, view);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iR1 = r1(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iR12 = r1(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (L0(view, iR1, iR12, layoutParams)) {
            view.measure(iR1, iR12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean g() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void g0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g0(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.l("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g1(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g1(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean h() {
        return this.t == 1;
    }

    public final boolean h1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == e1();
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
        if (this.t == 0) {
            Span span = layoutParams2.e;
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(span != null ? span.e : -1, 1, -1, -1, false, false));
        } else {
            Span span2 = layoutParams2.e;
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(-1, -1, span2 != null ? span2.e : -1, 1, false, false));
        }
    }

    public final void i1(int i, RecyclerView.State state) {
        int iY0;
        int i2;
        if (i > 0) {
            iY0 = Z0();
            i2 = 1;
        } else {
            iY0 = Y0();
            i2 = -1;
        }
        LayoutState layoutState = this.v;
        layoutState.f3674a = true;
        p1(iY0, state);
        o1(i2);
        layoutState.c = iY0 + layoutState.d;
        layoutState.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void j0(int i, int i2) {
        c1(i, i2, 1);
    }

    public final void j1(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f3674a || layoutState.i) {
            return;
        }
        if (layoutState.b == 0) {
            if (layoutState.e == -1) {
                k1(layoutState.g, recycler);
                return;
            } else {
                l1(layoutState.f, recycler);
                return;
            }
        }
        int i = 1;
        if (layoutState.e == -1) {
            int i2 = layoutState.f;
            int iH = this.q[0].h(i2);
            while (i < this.p) {
                int iH2 = this.q[i].h(i2);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i3 = i2 - iH;
            k1(i3 < 0 ? layoutState.g : layoutState.g - Math.min(i3, layoutState.b), recycler);
            return;
        }
        int i4 = layoutState.g;
        int iF = this.q[0].f(i4);
        while (i < this.p) {
            int iF2 = this.q[i].f(i4);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i5 = iF - layoutState.g;
        l1(i5 < 0 ? layoutState.f : Math.min(i5, layoutState.b) + layoutState.f, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void k(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        LayoutState layoutState;
        int iF;
        int iH;
        if (this.t != 0) {
            i = i2;
        }
        if (z() == 0 || i == 0) {
            return;
        }
        i1(i, state);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            layoutState = this.v;
            if (i3 >= i5) {
                break;
            }
            if (layoutState.d == -1) {
                iF = layoutState.f;
                iH = this.q[i3].h(iF);
            } else {
                iF = this.q[i3].f(layoutState.g);
                iH = layoutState.g;
            }
            int i6 = iF - iH;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = layoutState.c;
            if (i8 < 0 || i8 >= state.b()) {
                return;
            }
            ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).a(layoutState.c, this.J[i7]);
            layoutState.c += layoutState.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void k0() {
        this.B.a();
        C0();
    }

    public final void k1(int i, RecyclerView.Recycler recycler) {
        for (int iZ = z() - 1; iZ >= 0; iZ--) {
            View viewY = y(iZ);
            if (this.r.g(viewY) < i || this.r.p(viewY) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewY.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.e.f3704a.size() == 1) {
                return;
            }
            Span span = layoutParams.e;
            ArrayList arrayList = span.f3704a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.e = null;
            if (layoutParams2.f3692a.isRemoved() || layoutParams2.f3692a.isUpdated()) {
                span.d -= StaggeredGridLayoutManager.this.r.e(view);
            }
            if (size == 1) {
                span.b = Integer.MIN_VALUE;
            }
            span.c = Integer.MIN_VALUE;
            z0(viewY);
            recycler.i(viewY);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void l0(int i, int i2) {
        c1(i, i2, 8);
    }

    public final void l1(int i, RecyclerView.Recycler recycler) {
        while (z() > 0) {
            View viewY = y(0);
            if (this.r.d(viewY) > i || this.r.o(viewY) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewY.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.e.f3704a.size() == 1) {
                return;
            }
            Span span = layoutParams.e;
            ArrayList arrayList = span.f3704a;
            View view = (View) arrayList.remove(0);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.e = null;
            if (arrayList.size() == 0) {
                span.c = Integer.MIN_VALUE;
            }
            if (layoutParams2.f3692a.isRemoved() || layoutParams2.f3692a.isUpdated()) {
                span.d -= StaggeredGridLayoutManager.this.r.e(view);
            }
            span.b = Integer.MIN_VALUE;
            z0(viewY);
            recycler.i(viewY);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int m(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ScrollbarHelper.a(state, this.r, V0(z), U0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void m0(int i, int i2) {
        c1(i, i2, 2);
    }

    public final void m1() {
        if (this.t == 1 || !e1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int n(RecyclerView.State state) {
        return S0(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void n0(int i, int i2) {
        c1(i, i2, 4);
    }

    public final int n1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (z() == 0 || i == 0) {
            return 0;
        }
        i1(i, state);
        LayoutState layoutState = this.v;
        int iT0 = T0(recycler, layoutState, state);
        if (layoutState.b >= iT0) {
            i = i < 0 ? -iT0 : iT0;
        }
        this.r.q(-i);
        this.D = this.x;
        layoutState.b = 0;
        j1(recycler, layoutState);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int o(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ScrollbarHelper.c(state, this.r, V0(z), U0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void o0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        g1(recycler, state, true);
    }

    public final void o1(int i) {
        LayoutState layoutState = this.v;
        layoutState.e = i;
        layoutState.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int p(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ScrollbarHelper.a(state, this.r, V0(z), U0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void p0(RecyclerView.State state) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void p1(int i, RecyclerView.State state) {
        int iN;
        int iN2;
        int i2;
        LayoutState layoutState = this.v;
        boolean z = false;
        layoutState.b = 0;
        layoutState.c = i;
        RecyclerView.SmoothScroller smoothScroller = this.e;
        if (smoothScroller == null || !smoothScroller.e || (i2 = state.f3699a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = this.r.n();
                iN2 = 0;
            } else {
                iN2 = this.r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.k) {
            layoutState.g = this.r.h() + iN;
            layoutState.f = -iN2;
        } else {
            layoutState.f = this.r.m() - iN2;
            layoutState.g = this.r.i() + iN;
        }
        layoutState.h = false;
        layoutState.f3674a = true;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z = true;
        }
        layoutState.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int q(RecyclerView.State state) {
        return S0(state);
    }

    public final void q1(Span span, int i, int i2) {
        int i3 = span.d;
        int i4 = span.e;
        if (i != -1) {
            int i5 = span.c;
            if (i5 == Integer.MIN_VALUE) {
                span.a();
                i5 = span.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = span.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) span.f3704a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            span.b = StaggeredGridLayoutManager.this.r.g(view);
            layoutParams.getClass();
            i6 = span.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int r(RecyclerView.State state) {
        if (z() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ScrollbarHelper.c(state, this.r, V0(z), U0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.z != -1) {
                savedState.d = -1;
                savedState.e = -1;
                savedState.g = null;
                savedState.f = 0;
                savedState.h = 0;
                savedState.i = null;
                savedState.j = null;
            }
            C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable s0() {
        int iH;
        int iM;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f = savedState.f;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.g = savedState.g;
            savedState2.h = savedState.h;
            savedState2.i = savedState.i;
            savedState2.k = savedState.k;
            savedState2.l = savedState.l;
            savedState2.m = savedState.m;
            savedState2.j = savedState.j;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.k = this.w;
        savedState3.l = this.D;
        savedState3.m = this.E;
        LazySpanLookup lazySpanLookup = this.B;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3703a) == null) {
            savedState3.h = 0;
        } else {
            savedState3.i = iArr;
            savedState3.h = iArr.length;
            savedState3.j = lazySpanLookup.b;
        }
        if (z() <= 0) {
            savedState3.d = -1;
            savedState3.e = -1;
            savedState3.f = 0;
            return savedState3;
        }
        savedState3.d = this.D ? Z0() : Y0();
        View viewU0 = this.x ? U0(true) : V0(true);
        savedState3.e = viewU0 != null ? RecyclerView.LayoutManager.O(viewU0) : -1;
        int i = this.p;
        savedState3.f = i;
        savedState3.g = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            if (this.D) {
                iH = this.q[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.r.i();
                    iH -= iM;
                }
            } else {
                iH = this.q[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.r.m();
                    iH -= iM;
                }
            }
            savedState3.g[i2] = iH;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void t0(int i) {
        if (i == 0) {
            R0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams v() {
        return this.t == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams w(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }
}
