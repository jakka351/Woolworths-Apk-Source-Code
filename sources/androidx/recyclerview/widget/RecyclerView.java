package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.compose.ui.input.pointer.a;
import androidx.core.os.TraceCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.preference.Preference;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.ViewInfoStore;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    public static boolean I0 = false;
    public static boolean J0 = false;
    public static final int[] K0 = {R.attr.nestedScrollingEnabled};
    public static final float L0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean M0 = true;
    public static final boolean N0 = true;
    public static final Class[] O0;
    public static final Interpolator P0;
    public static final StretchEdgeEffectFactory Q0;
    public boolean A;
    public final Runnable A0;
    public boolean B;
    public boolean B0;
    public boolean C;
    public int C0;
    public int D;
    public int D0;
    public boolean E;
    public final boolean E0;
    public final AccessibilityManager F;
    public final AnonymousClass4 F0;
    public ArrayList G;
    public final DifferentialMotionFlingTarget G0;
    public boolean H;
    public final DifferentialMotionFlingController H0;
    public boolean I;
    public int J;
    public int K;
    public EdgeEffectFactory L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public ItemAnimator Q;
    public int R;
    public int S;
    public VelocityTracker T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public OnFlingListener c0;
    public final float d;
    public final int d0;
    public final RecyclerViewDataObserver e;
    public final int e0;
    public final Recycler f;
    public final float f0;
    public SavedState g;
    public final float g0;
    public final AdapterHelper h;
    public boolean h0;
    public final ChildHelper i;
    public final ViewFlinger i0;
    public final ViewInfoStore j;
    public GapWorker j0;
    public boolean k;
    public final GapWorker.LayoutPrefetchRegistryImpl k0;
    public final Runnable l;
    public final State l0;
    public final Rect m;
    public OnScrollListener m0;
    public final Rect n;
    public ArrayList n0;
    public final RectF o;
    public boolean o0;
    public Adapter p;
    public boolean p0;
    public LayoutManager q;
    public final ItemAnimatorRestoreListener q0;
    public RecyclerListener r;
    public boolean r0;
    public final ArrayList s;
    public RecyclerViewAccessibilityDelegate s0;
    public final ArrayList t;
    public ChildDrawingOrderCallback t0;
    public final ArrayList u;
    public final int[] u0;
    public OnItemTouchListener v;
    public NestedScrollingChildHelper v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final int[] y0;
    public int z;
    public final ArrayList z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$3, reason: invalid class name */
    public class AnonymousClass3 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$4, reason: invalid class name */
    public class AnonymousClass4 implements ViewInfoStore.ProcessCallback {
        public AnonymousClass4() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$6, reason: invalid class name */
    class AnonymousClass6 implements ChildHelper.Callback {
        public AnonymousClass6() {
        }

        public final void a(View view) {
            ViewHolder viewHolderP = RecyclerView.P(view);
            if (viewHolderP != null) {
                viewHolderP.onLeftHiddenState(RecyclerView.this);
            }
        }

        public final void b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.s(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    class AnonymousClass7 implements AdapterHelper.Callback {
        public AnonymousClass7() {
        }

        public final void a(AdapterHelper.UpdateOp updateOp) {
            int i = updateOp.f3648a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.q.j0(updateOp.b, updateOp.d);
                return;
            }
            if (i == 2) {
                recyclerView.q.m0(updateOp.b, updateOp.d);
            } else if (i == 4) {
                recyclerView.q.n0(updateOp.b, updateOp.d);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.q.l0(updateOp.b, updateOp.d);
            }
        }

        public final ViewHolder b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = RecyclerView.this.getChildCount();
            int i2 = 0;
            ViewHolder viewHolder = null;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                ViewHolder viewHolderP = RecyclerView.P(RecyclerView.this.getChildAt(i2));
                if (viewHolderP != null && !viewHolderP.isRemoved() && viewHolderP.mPosition == i) {
                    if (!recyclerView.i.c.contains(viewHolderP.itemView)) {
                        viewHolder = viewHolderP;
                        break;
                    }
                    viewHolder = viewHolderP;
                }
                i2++;
            }
            if (viewHolder != null) {
                if (!recyclerView.i.c.contains(viewHolder.itemView)) {
                    return viewHolder;
                }
                if (RecyclerView.J0) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            }
            return null;
        }

        public final void c(int i, int i2, Object obj) {
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = RecyclerView.this.getChildCount();
            int i5 = i2 + i;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = RecyclerView.this.getChildAt(i6);
                ViewHolder viewHolderP = RecyclerView.P(childAt);
                if (viewHolderP != null && !viewHolderP.shouldIgnore() && (i4 = viewHolderP.mPosition) >= i && i4 < i5) {
                    viewHolderP.addFlags(2);
                    viewHolderP.addChangePayload(obj);
                    ((LayoutParams) childAt.getLayoutParams()).c = true;
                }
            }
            Recycler recycler = recyclerView.f;
            ArrayList arrayList = recycler.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                    viewHolder.addFlags(2);
                    recycler.h(size);
                }
            }
            recyclerView.p0 = true;
        }

        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = RecyclerView.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                ViewHolder viewHolderP = RecyclerView.P(RecyclerView.this.getChildAt(i3));
                if (viewHolderP != null && !viewHolderP.shouldIgnore() && viewHolderP.mPosition >= i) {
                    if (RecyclerView.J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + viewHolderP + " now at position " + (viewHolderP.mPosition + i2));
                    }
                    viewHolderP.offsetPosition(i2, false);
                    recyclerView.l0.f = true;
                }
            }
            ArrayList arrayList = recyclerView.f.c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i4);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    if (RecyclerView.J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + viewHolder + " now at position " + (viewHolder.mPosition + i2));
                    }
                    viewHolder.offsetPosition(i2, false);
                }
            }
            recyclerView.requestLayout();
            recyclerView.o0 = true;
        }

        public final void e(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = RecyclerView.this.getChildCount();
            if (i < i2) {
                i4 = i;
                i3 = i2;
                i5 = -1;
            } else {
                i3 = i;
                i4 = i2;
                i5 = 1;
            }
            boolean z = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewHolder viewHolderP = RecyclerView.P(RecyclerView.this.getChildAt(i11));
                if (viewHolderP != null && (i10 = viewHolderP.mPosition) >= i4 && i10 <= i3) {
                    if (RecyclerView.J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + viewHolderP);
                    }
                    if (viewHolderP.mPosition == i) {
                        viewHolderP.offsetPosition(i2 - i, false);
                    } else {
                        viewHolderP.offsetPosition(i5, false);
                    }
                    recyclerView.l0.f = true;
                }
            }
            ArrayList arrayList = recyclerView.f.c;
            if (i < i2) {
                i7 = i;
                i6 = i2;
                i8 = -1;
            } else {
                i6 = i;
                i7 = i2;
                i8 = 1;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
                if (viewHolder != null && (i9 = viewHolder.mPosition) >= i7 && i9 <= i6) {
                    if (i9 == i) {
                        viewHolder.offsetPosition(i2 - i, z);
                    } else {
                        viewHolder.offsetPosition(i8, z);
                    }
                    if (RecyclerView.J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + viewHolder);
                    }
                }
                i12++;
                z = false;
            }
            recyclerView.requestLayout();
            recyclerView.o0 = true;
        }

        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.X(i, i2, true);
            recyclerView.o0 = true;
            recyclerView.l0.c += i2;
        }
    }

    public static abstract class Adapter<VH extends ViewHolder> {
        public final AdapterDataObservable d = new AdapterDataObservable();
        public boolean e = false;
        public final StateRestorationPolicy f = StateRestorationPolicy.d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {
            public static final StateRestorationPolicy d;
            public static final /* synthetic */ StateRestorationPolicy[] e;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                d = stateRestorationPolicy;
                e = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) e.clone();
            }
        }

        public void A(ViewHolder viewHolder) {
        }

        public void B(ViewHolder viewHolder) {
        }

        public void C(ViewHolder viewHolder) {
        }

        public final void D(AdapterDataObserver adapterDataObserver) {
            this.d.registerObserver(adapterDataObserver);
        }

        public final void E(boolean z) {
            if (this.d.a()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.e = z;
        }

        public final void F(AdapterDataObserver adapterDataObserver) {
            this.d.unregisterObserver(adapterDataObserver);
        }

        public final ViewHolder e(ViewGroup viewGroup, int i) {
            try {
                if (TraceCompat.a()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                ViewHolder viewHolderX = x(viewGroup, i);
                if (viewHolderX.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                viewHolderX.mItemViewType = i;
                Trace.endSection();
                return viewHolderX;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public int h(Adapter adapter, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int i();

        public long j(int i) {
            return -1L;
        }

        public int k(int i) {
            return 0;
        }

        public final void l() {
            this.d.b();
        }

        public final void m(int i) {
            this.d.d(i, 1, null);
        }

        public final void n(int i, Preference preference) {
            this.d.d(i, 1, preference);
        }

        public final void o(int i) {
            this.d.e(i, 1);
        }

        public final void p(int i, int i2) {
            this.d.c(i, i2);
        }

        public final void q(int i, int i2, Object obj) {
            this.d.d(i, i2, obj);
        }

        public final void r(int i, int i2) {
            this.d.e(i, i2);
        }

        public final void s(int i, int i2) {
            this.d.f(i, i2);
        }

        public final void t(int i) {
            this.d.f(i, 1);
        }

        public void u(RecyclerView recyclerView) {
        }

        public abstract void v(ViewHolder viewHolder, int i);

        public void w(ViewHolder viewHolder, int i, List list) {
            v(viewHolder, i);
        }

        public abstract ViewHolder x(ViewGroup viewGroup, int i);

        public void y(RecyclerView recyclerView) {
        }

        public boolean z(ViewHolder viewHolder) {
            return false;
        }
    }

    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public final void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    public static abstract class AdapterDataObserver {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2) {
        }

        public void f(int i, int i2) {
        }
    }

    @RequiresApi
    public static final class Api35Impl {
        @DoNotInline
        public static void a(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface ChildDrawingOrderCallback {
        int a(int i, int i2);
    }

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {

        /* renamed from: a, reason: collision with root package name */
        public ItemAnimatorRestoreListener f3685a;
        public ArrayList b;
        public long c;
        public long d;
        public long e;
        public long f;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void a();
        }

        public interface ItemAnimatorListener {
        }

        public static class ItemHolderInfo {

            /* renamed from: a, reason: collision with root package name */
            public int f3686a;
            public int b;

            public final void a(ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                this.f3686a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            if (!viewHolder.isInvalid() && (i & 4) == 0) {
                viewHolder.getOldPosition();
                viewHolder.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean b(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean c(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean d(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public boolean f(ViewHolder viewHolder) {
            return true;
        }

        public boolean g(ViewHolder viewHolder, List list) {
            return f(viewHolder);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
            /*
                r10 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimatorRestoreListener r0 = r10.f3685a
                if (r0 == 0) goto Laf
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 1
                r11.setIsRecyclable(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r11.mShadowedHolder
                r3 = 0
                if (r2 == 0) goto L15
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r11.mShadowingHolder
                if (r2 != 0) goto L15
                r11.mShadowedHolder = r3
            L15:
                r11.mShadowingHolder = r3
                boolean r2 = r11.shouldBeKeptAsChild()
                if (r2 != 0) goto Laf
                android.view.View r2 = r11.itemView
                androidx.recyclerview.widget.RecyclerView$Recycler r3 = r0.f
                r0.t0()
                androidx.recyclerview.widget.ChildHelper r4 = r0.i
                androidx.recyclerview.widget.ChildHelper$Bucket r5 = r4.b
                androidx.recyclerview.widget.RecyclerView$6 r6 = r4.f3653a
                int r7 = r4.d
                r8 = 0
                if (r7 != r1) goto L3d
                android.view.View r1 = r4.e
                if (r1 != r2) goto L35
            L33:
                r1 = r8
                goto L66
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
                r11.<init>(r0)
                throw r11
            L3d:
                r9 = 2
                if (r7 == r9) goto La7
                r4.d = r9     // Catch: java.lang.Throwable -> L51
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this     // Catch: java.lang.Throwable -> L51
                int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L51
                r9 = -1
                if (r7 != r9) goto L53
                r4.f(r2)     // Catch: java.lang.Throwable -> L51
            L4e:
                r4.d = r8
                goto L66
            L51:
                r11 = move-exception
                goto La4
            L53:
                boolean r9 = r5.d(r7)     // Catch: java.lang.Throwable -> L51
                if (r9 == 0) goto L63
                r5.f(r7)     // Catch: java.lang.Throwable -> L51
                r4.f(r2)     // Catch: java.lang.Throwable -> L51
                r6.b(r7)     // Catch: java.lang.Throwable -> L51
                goto L4e
            L63:
                r4.d = r8
                goto L33
            L66:
                if (r1 == 0) goto L91
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = androidx.recyclerview.widget.RecyclerView.P(r2)
                r3.n(r4)
                r3.j(r4)
                boolean r3 = androidx.recyclerview.widget.RecyclerView.J0
                if (r3 == 0) goto L91
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "after removing animated view: "
                r3.<init>(r4)
                r3.append(r2)
                java.lang.String r2 = ", "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "RecyclerView"
                android.util.Log.d(r3, r2)
            L91:
                r2 = r1 ^ 1
                r0.v0(r2)
                if (r1 != 0) goto Laf
                boolean r1 = r11.isTmpDetached()
                if (r1 == 0) goto Laf
                android.view.View r11 = r11.itemView
                r0.removeDetachedView(r11, r8)
                return
            La4:
                r4.d = r8
                throw r11
            La7:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
                r11.<init>(r0)
                throw r11
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.ItemAnimator.h(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
        }

        public abstract void i(ViewHolder viewHolder);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        public ItemAnimatorRestoreListener() {
        }
    }

    public static abstract class ItemDecoration {
        public void f(Rect rect, View view, RecyclerView recyclerView, State state) {
            ((LayoutParams) view.getLayoutParams()).f3692a.getLayoutPosition();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, State state) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView, State state) {
        }
    }

    public static abstract class LayoutManager {

        /* renamed from: a, reason: collision with root package name */
        public ChildHelper f3688a;
        public RecyclerView b;
        public final ViewBoundsCheck c;
        public final ViewBoundsCheck d;
        public SmoothScroller e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        public interface LayoutPrefetchRegistry {
        }

        public static class Properties {

            /* renamed from: a, reason: collision with root package name */
            public int f3691a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int a() {
                    return LayoutManager.this.L();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int b() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.n - layoutManager.M();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final View c(int i) {
                    return LayoutManager.this.y(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int d(View view) {
                    return LayoutManager.E(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int e(View view) {
                    return LayoutManager.H(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }
            };
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int a() {
                    return LayoutManager.this.N();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int b() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.o - layoutManager.K();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final View c(int i) {
                    return LayoutManager.this.y(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int d(View view) {
                    return LayoutManager.I(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int e(View view) {
                    return LayoutManager.C(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }
            };
            this.c = new ViewBoundsCheck(callback);
            this.d = new ViewBoundsCheck(callback2);
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int A(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.A(int, int, int, int, boolean):int");
        }

        public static int C(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).b.bottom;
        }

        public static int E(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).b.left;
        }

        public static int F(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int G(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int H(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).b.right;
        }

        public static int I(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).b.top;
        }

        public static int O(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3692a.getLayoutPosition();
        }

        public static Properties P(Context context, AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.f3646a, i, i2);
            properties.f3691a = typedArrayObtainStyledAttributes.getInt(0, 1);
            properties.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            properties.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            properties.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        public static boolean V(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void X(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public static int j(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public final void A0(int i) {
            if (y(i) != null) {
                ChildHelper childHelper = this.f3688a;
                AnonymousClass6 anonymousClass6 = childHelper.f3653a;
                int i2 = childHelper.d;
                if (i2 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i2 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iD = childHelper.d(i);
                    View childAt = RecyclerView.this.getChildAt(iD);
                    if (childAt != null) {
                        childHelper.d = 1;
                        childHelper.e = childAt;
                        if (childHelper.b.f(iD)) {
                            childHelper.f(childAt);
                        }
                        anonymousClass6.b(iD);
                    }
                    childHelper.d = 0;
                    childHelper.e = null;
                } catch (Throwable th) {
                    childHelper.d = 0;
                    childHelper.e = null;
                    throw th;
                }
            }
        }

        public int B(Recycler recycler, State state) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.p == null || !g()) {
                return 1;
            }
            return this.b.p.i();
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean B0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.L()
                int r1 = r8.N()
                int r2 = r8.n
                int r3 = r8.M()
                int r2 = r2 - r3
                int r3 = r8.o
                int r4 = r8.K()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                androidx.recyclerview.widget.RecyclerView r3 = r8.b
                int r3 = r3.getLayoutDirection()
                r7 = 1
                if (r3 != r7) goto L5e
                if (r2 == 0) goto L59
                goto L66
            L59:
                int r2 = java.lang.Math.max(r6, r10)
                goto L66
            L5e:
                if (r6 == 0) goto L61
                goto L65
            L61:
                int r6 = java.lang.Math.min(r4, r2)
            L65:
                r2 = r6
            L66:
                if (r1 == 0) goto L69
                goto L6d
            L69:
                int r1 = java.lang.Math.min(r5, r11)
            L6d:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lb0
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L7e
                goto Lb5
            L7e:
                int r1 = r8.L()
                int r2 = r8.N()
                int r3 = r8.n
                int r4 = r8.M()
                int r3 = r3 - r4
                int r4 = r8.o
                int r5 = r8.K()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.b
                android.graphics.Rect r5 = r5.m
                r8.D(r5, r13)
                int r13 = r5.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lb5
                int r13 = r5.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lb5
                int r13 = r5.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lb5
                int r13 = r5.bottom
                int r13 = r13 - r10
                if (r13 > r2) goto Lb0
                goto Lb5
            Lb0:
                if (r11 != 0) goto Lb6
                if (r10 == 0) goto Lb5
                goto Lb6
            Lb5:
                return r0
            Lb6:
                if (r12 == 0) goto Lbc
                r9.scrollBy(r11, r10)
                return r7
            Lbc:
                r9.r0(r11, r10, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.B0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public final void C0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void D(Rect rect, View view) {
            RecyclerView.Q(rect, view);
        }

        public int D0(int i, Recycler recycler, State state) {
            return 0;
        }

        public void E0(int i) {
            if (RecyclerView.J0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public int F0(int i, Recycler recycler, State state) {
            return 0;
        }

        public final void G0(RecyclerView recyclerView) {
            H0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void H0(int i, int i2) {
            this.n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0 && !RecyclerView.M0) {
                this.n = 0;
            }
            this.o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m = mode2;
            if (mode2 != 0 || RecyclerView.M0) {
                return;
            }
            this.o = 0;
        }

        public void I0(Rect rect, int i, int i2) {
            int iM = M() + L() + rect.width();
            int iK = K() + N() + rect.height();
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            this.b.setMeasuredDimension(j(i, iM, recyclerView.getMinimumWidth()), j(i2, iK, this.b.getMinimumHeight()));
        }

        public final int J() {
            RecyclerView recyclerView = this.b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.i();
            }
            return 0;
        }

        public final void J0(int i, int i2) {
            int iZ = z();
            if (iZ == 0) {
                this.b.r(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iZ; i7++) {
                View viewY = y(i7);
                Rect rect = this.b.m;
                D(rect, viewY);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.m.set(i6, i4, i3, i5);
            I0(this.b.m, i, i2);
        }

        public final int K() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final void K0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.f3688a = null;
                this.n = 0;
                this.o = 0;
            } else {
                this.b = recyclerView;
                this.f3688a = recyclerView.i;
                this.n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.m = 1073741824;
        }

        public final int L() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final boolean L0(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.h && V(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && V(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public final int M() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean M0() {
            return false;
        }

        public final int N() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public final boolean N0(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.h && V(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && V(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void O0(int i, RecyclerView recyclerView) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void P0(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.e;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.e) {
                smoothScroller2.f();
            }
            this.e = smoothScroller;
            RecyclerView recyclerView = this.b;
            ViewFlinger viewFlinger = recyclerView.i0;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f.abortAnimation();
            if (smoothScroller.h) {
                Log.w("RecyclerView", "An instance of " + smoothScroller.getClass().getSimpleName() + " was started more than once. Each instance of" + smoothScroller.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            smoothScroller.b = recyclerView;
            smoothScroller.c = this;
            int i = smoothScroller.f3697a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.l0.f3699a = i;
            smoothScroller.e = true;
            smoothScroller.d = true;
            smoothScroller.f = recyclerView.q.u(i);
            smoothScroller.b.i0.b();
            smoothScroller.h = true;
        }

        public int Q(Recycler recycler, State state) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.p == null || !h()) {
                return 1;
            }
            return this.b.p.i();
        }

        public boolean Q0() {
            return false;
        }

        public final void R(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public final void S(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(a.j(this.b, new StringBuilder("View should be fully attached to be ignored")));
            }
            ViewHolder viewHolderP = RecyclerView.P(view);
            viewHolderP.addFlags(128);
            this.b.j.d(viewHolderP);
        }

        public boolean T() {
            return false;
        }

        public boolean U() {
            return false;
        }

        public final boolean W(View view, boolean z) {
            boolean z2 = this.c.b(view) && this.d.b(view);
            return z ? z2 : !z2;
        }

        public void Y(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectR = this.b.R(view);
            int i = rectR.left + rectR.right;
            int i2 = rectR.top + rectR.bottom;
            int iA = A(this.n, this.l, M() + L() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i, ((ViewGroup.MarginLayoutParams) layoutParams).width, g());
            int iA2 = A(this.o, this.m, K() + N() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, h());
            if (L0(view, iA, iA2, layoutParams)) {
                view.measure(iA, iA2);
            }
        }

        public void Z(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iC = recyclerView.i.c();
                for (int i2 = 0; i2 < iC; i2++) {
                    recyclerView.i.b(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void a0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iC = recyclerView.i.c();
                for (int i2 = 0; i2 < iC; i2++) {
                    recyclerView.i.b(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void b0(Adapter adapter) {
        }

        public final void c(View view, int i, boolean z) {
            ViewHolder viewHolderP = RecyclerView.P(view);
            if (z || viewHolderP.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.b.j.f3707a;
                ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(viewHolderP);
                if (infoRecordA == null) {
                    infoRecordA = ViewInfoStore.InfoRecord.a();
                    simpleArrayMap.put(viewHolderP, infoRecordA);
                }
                infoRecordA.f3708a |= 1;
            } else {
                this.b.j.c(viewHolderP);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (viewHolderP.wasReturnedFromScrap() || viewHolderP.isScrap()) {
                if (viewHolderP.isScrap()) {
                    viewHolderP.unScrap();
                } else {
                    viewHolderP.clearReturnedFromScrapFlag();
                }
                this.f3688a.a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int iE = this.f3688a.e(view);
                if (i == -1) {
                    i = this.f3688a.c();
                }
                if (iE == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.b.indexOfChild(view));
                    throw new IllegalStateException(a.j(this.b, sb));
                }
                if (iE != i) {
                    LayoutManager layoutManager = this.b.q;
                    View viewY = layoutManager.y(iE);
                    if (viewY == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iE + layoutManager.b.toString());
                    }
                    layoutManager.y(iE);
                    ChildHelper childHelper = layoutManager.f3688a;
                    int iD = childHelper.d(iE);
                    childHelper.b.f(iD);
                    RecyclerView recyclerView = RecyclerView.this;
                    View childAt = recyclerView.getChildAt(iD);
                    if (childAt != null) {
                        ViewHolder viewHolderP2 = RecyclerView.P(childAt);
                        if (viewHolderP2 != null) {
                            if (viewHolderP2.isTmpDetached() && !viewHolderP2.shouldIgnore()) {
                                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                                sb2.append(viewHolderP2);
                                throw new IllegalArgumentException(a.j(recyclerView, sb2));
                            }
                            if (RecyclerView.J0) {
                                Log.d("RecyclerView", "tmpDetach " + viewHolderP2);
                            }
                            viewHolderP2.addFlags(256);
                        }
                    } else if (RecyclerView.I0) {
                        StringBuilder sb3 = new StringBuilder("No view at offset ");
                        sb3.append(iD);
                        throw new IllegalArgumentException(a.j(recyclerView, sb3));
                    }
                    recyclerView.detachViewFromParent(iD);
                    layoutManager.e(i, viewY);
                }
            } else {
                ChildHelper childHelper2 = this.f3688a;
                RecyclerView recyclerView2 = RecyclerView.this;
                int childCount = i < 0 ? recyclerView2.getChildCount() : childHelper2.d(i);
                childHelper2.b.e(childCount, false);
                recyclerView2.addView(view, childCount);
                ViewHolder viewHolderP3 = RecyclerView.P(view);
                recyclerView2.Y(view);
                Adapter adapter = recyclerView2.p;
                if (adapter != null && viewHolderP3 != null) {
                    adapter.A(viewHolderP3);
                }
                ArrayList arrayList = recyclerView2.G;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((OnChildAttachStateChangeListener) recyclerView2.G.get(size)).c(view);
                    }
                }
                layoutParams.c = true;
                SmoothScroller smoothScroller = this.e;
                if (smoothScroller != null && smoothScroller.e) {
                    smoothScroller.b.getClass();
                    ViewHolder viewHolderP4 = RecyclerView.P(view);
                    if ((viewHolderP4 != null ? viewHolderP4.getLayoutPosition() : -1) == smoothScroller.f3697a) {
                        smoothScroller.f = view;
                        if (RecyclerView.J0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
            if (layoutParams.d) {
                if (RecyclerView.J0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + layoutParams.f3692a);
                }
                viewHolderP.itemView.invalidate();
                layoutParams.d = false;
            }
        }

        public void c0(RecyclerView recyclerView) {
        }

        public void d(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.l(str);
            }
        }

        public void d0(RecyclerView recyclerView) {
        }

        public final void e(int i, View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            ViewHolder viewHolderP = RecyclerView.P(view);
            if (viewHolderP.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.b.j.f3707a;
                ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(viewHolderP);
                if (infoRecordA == null) {
                    infoRecordA = ViewInfoStore.InfoRecord.a();
                    simpleArrayMap.put(viewHolderP, infoRecordA);
                }
                infoRecordA.f3708a |= 1;
            } else {
                this.b.j.c(viewHolderP);
            }
            this.f3688a.a(view, i, layoutParams, viewHolderP.isRemoved());
        }

        public View e0(View view, int i, Recycler recycler, State state) {
            return null;
        }

        public final void f(Rect rect, View view) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.R(view));
            }
        }

        public void f0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            Recycler recycler = recyclerView.f;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.b.p;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.i());
            }
        }

        public boolean g() {
            return false;
        }

        public void g0(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(8192);
                accessibilityNodeInfoCompat.q(true);
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
                }
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
                accessibilityNodeInfoCompat.q(true);
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
                }
            }
            accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(Q(recycler, state), B(recycler, state), 0));
        }

        public boolean h() {
            return false;
        }

        public final void h0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder viewHolderP = RecyclerView.P(view);
            if (viewHolderP == null || viewHolderP.isRemoved()) {
                return;
            }
            ChildHelper childHelper = this.f3688a;
            if (childHelper.c.contains(viewHolderP.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            i0(recyclerView.f, recyclerView.l0, view, accessibilityNodeInfoCompat);
        }

        public boolean i(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void i0(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(h() ? O(view) : 0, 1, g() ? O(view) : 0, 1, false, false));
        }

        public void j0(int i, int i2) {
        }

        public void k(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void k0() {
        }

        public void l(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void l0(int i, int i2) {
        }

        public int m(State state) {
            return 0;
        }

        public void m0(int i, int i2) {
        }

        public int n(State state) {
            return 0;
        }

        public void n0(int i, int i2) {
        }

        public int o(State state) {
            return 0;
        }

        public void o0(Recycler recycler, State state) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int p(State state) {
            return 0;
        }

        public void p0(State state) {
        }

        public int q(State state) {
            return 0;
        }

        public boolean q0(RecyclerView recyclerView, State state, View view, View view2) {
            SmoothScroller smoothScroller = this.e;
            return (smoothScroller != null && smoothScroller.e) || recyclerView.U();
        }

        public int r(State state) {
            return 0;
        }

        public void r0(Parcelable parcelable) {
        }

        public final void s(Recycler recycler) {
            for (int iZ = z() - 1; iZ >= 0; iZ--) {
                View viewY = y(iZ);
                ViewHolder viewHolderP = RecyclerView.P(viewY);
                if (viewHolderP.shouldIgnore()) {
                    if (RecyclerView.J0) {
                        Log.d("RecyclerView", "ignoring view " + viewHolderP);
                    }
                } else if (!viewHolderP.isInvalid() || viewHolderP.isRemoved() || this.b.p.e) {
                    y(iZ);
                    ChildHelper childHelper = this.f3688a;
                    int iD = childHelper.d(iZ);
                    childHelper.b.f(iD);
                    RecyclerView recyclerView = RecyclerView.this;
                    View childAt = recyclerView.getChildAt(iD);
                    if (childAt != null) {
                        ViewHolder viewHolderP2 = RecyclerView.P(childAt);
                        if (viewHolderP2 != null) {
                            if (viewHolderP2.isTmpDetached() && !viewHolderP2.shouldIgnore()) {
                                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                                sb.append(viewHolderP2);
                                throw new IllegalArgumentException(a.j(recyclerView, sb));
                            }
                            if (RecyclerView.J0) {
                                Log.d("RecyclerView", "tmpDetach " + viewHolderP2);
                            }
                            viewHolderP2.addFlags(256);
                        }
                    } else if (RecyclerView.I0) {
                        StringBuilder sb2 = new StringBuilder("No view at offset ");
                        sb2.append(iD);
                        throw new IllegalArgumentException(a.j(recyclerView, sb2));
                    }
                    recyclerView.detachViewFromParent(iD);
                    recycler.k(viewY);
                    this.b.j.c(viewHolderP);
                } else {
                    A0(iZ);
                    recycler.j(viewHolderP);
                }
            }
        }

        public Parcelable s0() {
            return null;
        }

        public final void t(View view) {
            int iE = this.f3688a.e(view);
            if (iE >= 0) {
                ChildHelper childHelper = this.f3688a;
                int iD = childHelper.d(iE);
                childHelper.b.f(iD);
                RecyclerView recyclerView = RecyclerView.this;
                View childAt = recyclerView.getChildAt(iD);
                if (childAt != null) {
                    ViewHolder viewHolderP = RecyclerView.P(childAt);
                    if (viewHolderP != null) {
                        if (viewHolderP.isTmpDetached() && !viewHolderP.shouldIgnore()) {
                            StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(viewHolderP);
                            throw new IllegalArgumentException(a.j(recyclerView, sb));
                        }
                        if (RecyclerView.J0) {
                            Log.d("RecyclerView", "tmpDetach " + viewHolderP);
                        }
                        viewHolderP.addFlags(256);
                    }
                } else if (RecyclerView.I0) {
                    StringBuilder sb2 = new StringBuilder("No view at offset ");
                    sb2.append(iD);
                    throw new IllegalArgumentException(a.j(recyclerView, sb2));
                }
                recyclerView.detachViewFromParent(iD);
            }
        }

        public void t0(int i) {
        }

        public View u(int i) {
            int iZ = z();
            for (int i2 = 0; i2 < iZ; i2++) {
                View viewY = y(i2);
                ViewHolder viewHolderP = RecyclerView.P(viewY);
                if (viewHolderP != null && viewHolderP.getLayoutPosition() == i && !viewHolderP.shouldIgnore() && (this.b.l0.g || !viewHolderP.isRemoved())) {
                    return viewY;
                }
            }
            return null;
        }

        public boolean u0(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return v0(recyclerView.f, recyclerView.l0, i, bundle);
        }

        public abstract LayoutParams v();

        /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r8
  0x0062: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean v0(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, int r10, android.os.Bundle r11) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.v0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, int, android.os.Bundle):boolean");
        }

        public LayoutParams w(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public final void w0(Recycler recycler) {
            for (int iZ = z() - 1; iZ >= 0; iZ--) {
                if (!RecyclerView.P(y(iZ)).shouldIgnore()) {
                    y0(iZ, recycler);
                }
            }
        }

        public LayoutParams x(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public final void x0(Recycler recycler) {
            ArrayList arrayList = recycler.f3695a;
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = ((ViewHolder) arrayList.get(i)).itemView;
                ViewHolder viewHolderP = RecyclerView.P(view);
                if (!viewHolderP.shouldIgnore()) {
                    viewHolderP.setIsRecyclable(false);
                    if (viewHolderP.isTmpDetached()) {
                        this.b.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.b.Q;
                    if (itemAnimator != null) {
                        itemAnimator.i(viewHolderP);
                    }
                    viewHolderP.setIsRecyclable(true);
                    ViewHolder viewHolderP2 = RecyclerView.P(view);
                    viewHolderP2.mScrapContainer = null;
                    viewHolderP2.mInChangeScrap = false;
                    viewHolderP2.clearReturnedFromScrapFlag();
                    recycler.j(viewHolderP2);
                }
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public final View y(int i) {
            ChildHelper childHelper = this.f3688a;
            if (childHelper != null) {
                return childHelper.b(i);
            }
            return null;
        }

        public final void y0(int i, Recycler recycler) {
            View viewY = y(i);
            A0(i);
            recycler.i(viewY);
        }

        public final int z() {
            ChildHelper childHelper = this.f3688a;
            if (childHelper != null) {
                return childHelper.c();
            }
            return 0;
        }

        public final void z0(View view) {
            ChildHelper childHelper = this.f3688a;
            AnonymousClass6 anonymousClass6 = childHelper.f3653a;
            int i = childHelper.d;
            if (i == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                childHelper.d = 1;
                childHelper.e = view;
                int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (childHelper.b.f(iIndexOfChild)) {
                        childHelper.f(view);
                    }
                    anonymousClass6.b(iIndexOfChild);
                }
                childHelper.d = 0;
                childHelper.e = null;
            } catch (Throwable th) {
                childHelper.d = 0;
                childHelper.e = null;
                throw th;
            }
        }
    }

    public interface OnChildAttachStateChangeListener {
        void b(View view);

        void c(View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean a(int i, int i2);
    }

    public interface OnItemTouchListener {
        void a(MotionEvent motionEvent);

        void d(boolean z);

        boolean e(MotionEvent motionEvent);
    }

    public static abstract class OnScrollListener {
        public void a(int i, RecyclerView recyclerView) {
        }

        public void d(RecyclerView recyclerView, int i, int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    public static class RecycledViewPool {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f3693a = new SparseArray();
        public int b = 0;
        public final Set c = Collections.newSetFromMap(new IdentityHashMap());

        public static class ScrapData {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f3694a = new ArrayList();
            public final int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.f3693a;
                if (i >= sparseArray.size()) {
                    return;
                }
                ScrapData scrapData = (ScrapData) sparseArray.valueAt(i);
                Iterator it = scrapData.f3694a.iterator();
                while (it.hasNext()) {
                    PoolingContainer.b(((ViewHolder) it.next()).itemView);
                }
                scrapData.f3694a.clear();
                i++;
            }
        }

        public ViewHolder b(int i) {
            ScrapData scrapData = (ScrapData) this.f3693a.get(i);
            if (scrapData == null) {
                return null;
            }
            ArrayList arrayList = scrapData.f3694a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((ViewHolder) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (ViewHolder) arrayList.remove(size);
                }
            }
            return null;
        }

        public final ScrapData c(int i) {
            SparseArray sparseArray = this.f3693a;
            ScrapData scrapData = (ScrapData) sparseArray.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            sparseArray.put(i, scrapData2);
            return scrapData2;
        }

        public void d(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = c(itemViewType).f3694a;
            if (((ScrapData) this.f3693a.get(itemViewType)).b <= arrayList.size()) {
                PoolingContainer.b(viewHolder.itemView);
            } else {
                if (RecyclerView.I0 && arrayList.contains(viewHolder)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }
    }

    public final class Recycler {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3695a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public RecycledViewPool g;
        public ViewCacheExtension h;

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.f3695a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(ViewHolder viewHolder, boolean z) {
            RecyclerView.m(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.s0;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                ViewCompat.A(view, accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate ? (AccessibilityDelegateCompat) ((RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ).e.remove(view) : null);
            }
            if (z) {
                RecyclerListener recyclerListener = recyclerView.r;
                ArrayList arrayList = recyclerView.s;
                if (recyclerListener != null) {
                    recyclerListener.a();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((RecyclerListener) arrayList.get(i)).a();
                }
                Adapter adapter = recyclerView.p;
                if (adapter != null) {
                    adapter.C(viewHolder);
                }
                if (recyclerView.l0 != null) {
                    recyclerView.j.d(viewHolder);
                }
                if (RecyclerView.J0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            d().d(viewHolder);
        }

        public final void b(int i, View view) {
            LayoutParams layoutParams;
            ViewHolder viewHolderP = RecyclerView.P(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (viewHolderP == null) {
                throw new IllegalArgumentException(a.j(recyclerView, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int iF = recyclerView.h.f(i, 0);
            if (iF < 0 || iF >= recyclerView.p.i()) {
                StringBuilder sbQ = YU.a.q(i, iF, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbQ.append(recyclerView.l0.b());
                sbQ.append(recyclerView.D());
                throw new IndexOutOfBoundsException(sbQ.toString());
            }
            l(viewHolderP, iF, i, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = viewHolderP.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                viewHolderP.itemView.setLayoutParams(layoutParams);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = (LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
                viewHolderP.itemView.setLayoutParams(layoutParams);
            }
            layoutParams.c = true;
            layoutParams.f3692a = viewHolderP;
            layoutParams.d = viewHolderP.itemView.getParent() == null;
        }

        public final int c(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.l0.b()) {
                return !recyclerView.l0.g ? i : recyclerView.h.f(i, 0);
            }
            StringBuilder sbR = YU.a.r(i, "invalid position ", ". State item count is ");
            sbR.append(recyclerView.l0.b());
            sbR.append(recyclerView.D());
            throw new IndexOutOfBoundsException(sbR.toString());
        }

        public final RecycledViewPool d() {
            if (this.g == null) {
                this.g = new RecycledViewPool();
                e();
            }
            return this.g;
        }

        public final void e() {
            RecyclerView recyclerView;
            Adapter adapter;
            RecycledViewPool recycledViewPool = this.g;
            if (recycledViewPool == null || (adapter = (recyclerView = RecyclerView.this).p) == null || !recyclerView.w) {
                return;
            }
            recycledViewPool.c.add(adapter);
        }

        public final void f(Adapter adapter, boolean z) {
            RecycledViewPool recycledViewPool = this.g;
            if (recycledViewPool != null) {
                SparseArray sparseArray = recycledViewPool.f3693a;
                Set set = recycledViewPool.c;
                set.remove(adapter);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((RecycledViewPool.ScrapData) sparseArray.get(sparseArray.keyAt(i))).f3694a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        PoolingContainer.b(((ViewHolder) arrayList.get(i2)).itemView);
                    }
                }
            }
        }

        public final void g() {
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.N0) {
                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.k0;
                int[] iArr = layoutPrefetchRegistryImpl.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                layoutPrefetchRegistryImpl.d = 0;
            }
        }

        public final void h(int i) {
            if (RecyclerView.J0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            ArrayList arrayList = this.c;
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i);
            if (RecyclerView.J0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + viewHolder);
            }
            a(viewHolder, true);
            arrayList.remove(i);
        }

        public final void i(View view) {
            ViewHolder viewHolderP = RecyclerView.P(view);
            boolean zIsTmpDetached = viewHolderP.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (viewHolderP.isScrap()) {
                viewHolderP.unScrap();
            } else if (viewHolderP.wasReturnedFromScrap()) {
                viewHolderP.clearReturnedFromScrapFlag();
            }
            j(viewHolderP);
            if (recyclerView.Q == null || viewHolderP.isRecyclable()) {
                return;
            }
            recyclerView.Q.i(viewHolderP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(androidx.recyclerview.widget.RecyclerView.ViewHolder r12) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.j(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
        }

        public final void k(View view) {
            ItemAnimator itemAnimator;
            ViewHolder viewHolderP = RecyclerView.P(view);
            boolean zHasAnyOfTheFlags = viewHolderP.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && viewHolderP.isUpdated() && (itemAnimator = recyclerView.Q) != null && !itemAnimator.g(viewHolderP, viewHolderP.getUnmodifiedPayloads())) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                viewHolderP.setScrapContainer(this, true);
                this.b.add(viewHolderP);
                return;
            }
            if (viewHolderP.isInvalid() && !viewHolderP.isRemoved() && !recyclerView.p.e) {
                throw new IllegalArgumentException(a.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            viewHolderP.setScrapContainer(this, false);
            this.f3695a.add(viewHolderP);
        }

        public final boolean l(ViewHolder viewHolder, int i, int i2, long j) {
            boolean z;
            viewHolder.mBindingAdapter = null;
            RecyclerView recyclerView = RecyclerView.this;
            viewHolder.mOwnerRecyclerView = recyclerView;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j2 = this.g.c(itemViewType).d;
                if (j2 != 0 && j2 + nanoTime >= j) {
                    return false;
                }
            }
            if (viewHolder.isTmpDetached()) {
                recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
                z = true;
            } else {
                z = false;
            }
            Adapter<? extends ViewHolder> adapter = recyclerView.p;
            adapter.getClass();
            boolean z2 = viewHolder.mBindingAdapter == null;
            if (z2) {
                viewHolder.mPosition = i;
                if (adapter.e) {
                    viewHolder.mItemId = adapter.j(i);
                }
                viewHolder.setFlags(1, 519);
                if (TraceCompat.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(viewHolder.mItemViewType)));
                }
            }
            viewHolder.mBindingAdapter = adapter;
            if (RecyclerView.I0) {
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow() != viewHolder.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + viewHolder.isTmpDetached() + ", attached to window: " + viewHolder.itemView.isAttachedToWindow() + ", holder: " + viewHolder);
                }
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + viewHolder);
                }
            }
            adapter.w(viewHolder, i, viewHolder.getUnmodifiedPayloads());
            if (z2) {
                viewHolder.clearPayload();
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).c = true;
                }
                Trace.endSection();
            }
            if (z) {
                recyclerView.detachViewFromParent(viewHolder.itemView);
            }
            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
            RecycledViewPool.ScrapData scrapDataC = this.g.c(viewHolder.getItemViewType());
            long j3 = scrapDataC.d;
            if (j3 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
            }
            scrapDataC.d = nanoTime2;
            AccessibilityManager accessibilityManager = recyclerView.F;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                View view = viewHolder.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.s0;
                if (recyclerViewAccessibilityDelegate != null) {
                    AccessibilityDelegateCompat accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                    if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                        RecyclerViewAccessibilityDelegate.ItemDelegate itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                        AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                        if (accessibilityDelegateCompatE != null && accessibilityDelegateCompatE != itemDelegate) {
                            itemDelegate.e.put(view, accessibilityDelegateCompatE);
                        }
                    }
                    ViewCompat.A(view, accessibilityDelegateCompatJ);
                }
            }
            if (recyclerView.l0.g) {
                viewHolder.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x0434 A[PHI: r2 r10
  0x0434: PHI (r2v7 boolean) = (r2v6 boolean), (r2v20 boolean) binds: [B:151:0x02b2, B:209:0x03c4] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r10v3 androidx.recyclerview.widget.RecyclerView$ViewHolder) = 
  (r10v2 androidx.recyclerview.widget.RecyclerView$ViewHolder)
  (r10v7 androidx.recyclerview.widget.RecyclerView$ViewHolder)
 binds: [B:151:0x02b2, B:209:0x03c4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:270:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x04e6  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x0503  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.ViewHolder m(int r22, long r23) {
            /*
                Method dump skipped, instructions count: 1321
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.m(int, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        public final void n(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.b.remove(viewHolder);
            } else {
                this.f3695a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public final void o() {
            LayoutManager layoutManager = RecyclerView.this.q;
            this.f = this.e + (layoutManager != null ? layoutManager.j : 0);
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                h(size);
            }
        }
    }

    public interface RecyclerListener {
        void a();
    }

    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            recyclerView.l0.f = true;
            recyclerView.f0(true);
            if (recyclerView.h.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            AdapterHelper adapterHelper = recyclerView.h;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(4, i, i2, obj));
            adapterHelper.f |= 4;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            AdapterHelper adapterHelper = recyclerView.h;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(1, i, i2, null));
            adapterHelper.f |= 1;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            AdapterHelper adapterHelper = recyclerView.h;
            ArrayList arrayList = adapterHelper.b;
            if (i == i2) {
                return;
            }
            arrayList.add(adapterHelper.h(8, i, i2, null));
            adapterHelper.f |= 8;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l(null);
            AdapterHelper adapterHelper = recyclerView.h;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(2, i, i2, null));
            adapterHelper.f |= 2;
            if (arrayList.size() == 1) {
                g();
            }
        }

        public final void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.x || !recyclerView.w) {
                recyclerView.E = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.l;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                recyclerView.postOnAnimation(runnable);
            }
        }
    }

    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Parcelable f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f, 0);
        }
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void a(MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void d(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean e(MotionEvent motionEvent) {
            return false;
        }
    }

    public static abstract class SmoothScroller {

        /* renamed from: a, reason: collision with root package name */
        public int f3697a = -1;
        public RecyclerView b;
        public LayoutManager c;
        public boolean d;
        public boolean e;
        public View f;
        public final Action g;
        public boolean h;

        public static class Action {

            /* renamed from: a, reason: collision with root package name */
            public int f3698a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.V(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.i0.c(this.f3698a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }

            public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
                this.f3698a = i;
                this.b = i2;
                this.c = i3;
                this.e = baseInterpolator;
                this.f = true;
            }
        }

        public interface ScrollVectorProvider {
            PointF a(int i);
        }

        public SmoothScroller() {
            Action action = new Action();
            action.d = -1;
            action.f = false;
            action.g = 0;
            action.f3698a = 0;
            action.b = 0;
            action.c = Integer.MIN_VALUE;
            action.e = null;
            this.g = action;
        }

        public PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) obj).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public final void b(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.f3697a == -1 || recyclerView == null) {
                f();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.f3697a)) != null) {
                float f = pointFA.x;
                if (f != BitmapDescriptorFactory.HUE_RED || pointFA.y != BitmapDescriptorFactory.HUE_RED) {
                    recyclerView.n0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            Action action = this.g;
            if (view != null) {
                this.b.getClass();
                ViewHolder viewHolderP = RecyclerView.P(view);
                if ((viewHolderP != null ? viewHolderP.getLayoutPosition() : -1) == this.f3697a) {
                    View view2 = this.f;
                    State state = recyclerView.l0;
                    e(view2, action);
                    action.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                State state2 = recyclerView.l0;
                c(i, i2, action);
                boolean z = action.d >= 0;
                action.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.i0.b();
                }
            }
        }

        public abstract void c(int i, int i2, Action action);

        public abstract void d();

        public abstract void e(View view, Action action);

        public final void f() {
            if (this.e) {
                this.e = false;
                d();
                this.b.l0.f3699a = -1;
                this.f = null;
                this.f3697a = -1;
                this.d = false;
                LayoutManager layoutManager = this.c;
                if (layoutManager.e == this) {
                    layoutManager.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class State {

        /* renamed from: a, reason: collision with root package name */
        public int f3699a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f3699a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return b.s(sb, this.k, '}');
        }
    }

    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ViewCacheExtension {
        public abstract View a();
    }

    public class ViewFlinger implements Runnable {
        public int d;
        public int e;
        public OverScroller f;
        public Interpolator g;
        public boolean h;
        public boolean i;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.P0;
            this.g = interpolator;
            this.h = false;
            this.i = false;
            this.f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.e = 0;
            this.d = 0;
            Interpolator interpolator = this.g;
            Interpolator interpolator2 = RecyclerView.P0;
            if (interpolator != interpolator2) {
                this.g = interpolator2;
                this.f = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.h) {
                this.i = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, int i3, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.P0;
            }
            if (this.g != interpolator) {
                this.g = interpolator;
                this.f = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.e = 0;
            this.d = 0;
            recyclerView.setScrollState(2);
            this.f.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.y0;
            if (recyclerView.q == null) {
                recyclerView.removeCallbacks(this);
                this.f.abortAnimation();
                return;
            }
            this.i = false;
            this.h = true;
            recyclerView.q();
            OverScroller overScroller = this.f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.d;
                int i5 = currY - this.e;
                this.d = currX;
                this.e = currY;
                int iP = RecyclerView.p(i4, recyclerView.M, recyclerView.O, recyclerView.getWidth());
                int iP2 = RecyclerView.p(i5, recyclerView.N, recyclerView.P, recyclerView.getHeight());
                int[] iArr2 = recyclerView.y0;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.w(iP, iP2, 1, iArr2, null)) {
                    iP -= iArr[0];
                    iP2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.o(iP, iP2);
                }
                if (recyclerView.p != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.n0(iP, iP2, iArr);
                    int i6 = iArr[0];
                    int i7 = iArr[1];
                    int i8 = iP - i6;
                    iP2 -= i7;
                    SmoothScroller smoothScroller = recyclerView.q.e;
                    if (smoothScroller != null && !smoothScroller.d && smoothScroller.e) {
                        int iB = recyclerView.l0.b();
                        if (iB == 0) {
                            smoothScroller.f();
                        } else if (smoothScroller.f3697a >= iB) {
                            smoothScroller.f3697a = iB - 1;
                            smoothScroller.b(i6, i7);
                        } else {
                            smoothScroller.b(i6, i7);
                        }
                    }
                    i = i8;
                    i2 = i6;
                    i3 = i7;
                } else {
                    i = iP;
                    i2 = 0;
                    i3 = 0;
                }
                int i9 = iP2;
                if (!recyclerView.t.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.y0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.x(i2, null, i3, i, i9, iArr3, 1);
                int i10 = i - iArr[0];
                int i11 = i9 - iArr[1];
                if (i2 != 0 || i3 != 0) {
                    recyclerView.y(i2, i3);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
                SmoothScroller smoothScroller2 = recyclerView.q.e;
                if ((smoothScroller2 == null || !smoothScroller2.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        if (i12 < 0) {
                            recyclerView.A();
                            if (recyclerView.M.isFinished()) {
                                recyclerView.M.onAbsorb(-i12);
                            }
                        } else if (i12 > 0) {
                            recyclerView.B();
                            if (recyclerView.O.isFinished()) {
                                recyclerView.O.onAbsorb(i12);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.C();
                            if (recyclerView.N.isFinished()) {
                                recyclerView.N.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.z();
                            if (recyclerView.P.isFinished()) {
                                recyclerView.P.onAbsorb(currVelocity);
                            }
                        }
                        if (i12 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.N0) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.k0;
                        int[] iArr4 = layoutPrefetchRegistryImpl.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        layoutPrefetchRegistryImpl.d = 0;
                    }
                } else {
                    b();
                    GapWorker gapWorker = recyclerView.j0;
                    if (gapWorker != null) {
                        gapWorker.a(recyclerView, i2, i3);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    Api35Impl.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            SmoothScroller smoothScroller3 = recyclerView.q.e;
            if (smoothScroller3 != null && smoothScroller3.d) {
                smoothScroller3.b(0, 0);
            }
            this.h = false;
            if (!this.i) {
                recyclerView.setScrollState(0);
                recyclerView.w0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.L(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int iL;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iL = this.mOwnerRecyclerView.L(this)) == -1) {
                return -1;
            }
            return adapter.h(this.mBindingAdapter, iL);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            if (!recyclerView.U()) {
                this.itemView.setImportantForAccessibility(4);
            } else {
                this.mPendingAccessibilityState = 4;
                recyclerView.z0.add(this);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.U()) {
                this.mPendingAccessibilityState = i;
                recyclerView.z0.add(this);
            } else {
                this.itemView.setImportantForAccessibility(i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.I0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.I0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.J0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbT = YU.a.t(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbT.append(Integer.toHexString(hashCode()));
            sbT.append(" position=");
            sbT.append(this.mPosition);
            sbT.append(" id=");
            sbT.append(this.mItemId);
            sbT.append(", oldPos=");
            sbT.append(this.mOldPosition);
            sbT.append(", pLpos:");
            sbT.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbT.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.n(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        O0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        P0 = new AnonymousClass3();
        Q0 = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static int N(View view) {
        ViewHolder viewHolderP = P(view);
        if (viewHolderP != null) {
            return viewHolderP.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static ViewHolder P(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3692a;
    }

    public static void Q(Rect rect, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.v0 == null) {
            this.v0 = new NestedScrollingChildHelper(this);
        }
        return this.v0;
    }

    public static void m(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    public static int p(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && EdgeEffectCompat.a(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(EdgeEffectCompat.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || EdgeEffectCompat.a(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(EdgeEffectCompat.b(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        I0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        J0 = z;
    }

    public final void A() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.L.a(this);
        this.M = edgeEffectA;
        if (this.k) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.O != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.L.a(this);
        this.O = edgeEffectA;
        if (this.k) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.N != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.L.a(this);
        this.N = edgeEffectA;
        if (this.k) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String D() {
        return " " + super.toString() + ", adapter:" + this.p + ", layout:" + this.q + ", context:" + getContext();
    }

    public final void E(State state) {
        if (getScrollState() != 2) {
            state.getClass();
            return;
        }
        OverScroller overScroller = this.i0.f;
        overScroller.getFinalX();
        overScroller.getCurrX();
        state.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = (OnItemTouchListener) arrayList.get(i);
            if (onItemTouchListener.e(motionEvent) && action != 3) {
                this.v = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int iC = this.i.c();
        if (iC == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iC; i3++) {
            ViewHolder viewHolderP = P(this.i.b(i3));
            if (!viewHolderP.shouldIgnore()) {
                int layoutPosition = viewHolderP.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final ViewHolder J(int i) {
        ViewHolder viewHolder = null;
        if (this.H) {
            return null;
        }
        int childCount = RecyclerView.this.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder viewHolderP = P(RecyclerView.this.getChildAt(i2));
            if (viewHolderP != null && !viewHolderP.isRemoved() && L(viewHolderP) == i) {
                if (!this.i.c.contains(viewHolderP.itemView)) {
                    return viewHolderP;
                }
                viewHolder = viewHolderP;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.K(int, int, int, int):boolean");
    }

    public final int L(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        int i = viewHolder.mPosition;
        ArrayList arrayList = this.h.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AdapterHelper.UpdateOp updateOp = (AdapterHelper.UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f3648a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = updateOp.b;
                    if (i4 <= i) {
                        int i5 = updateOp.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = updateOp.b;
                    if (i6 == i) {
                        i = updateOp.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (updateOp.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (updateOp.b <= i) {
                i += updateOp.d;
            }
        }
        return i;
    }

    public final long M(ViewHolder viewHolder) {
        return this.p.e ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public final ViewHolder O(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return P(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect R(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.c;
        Rect rect = layoutParams.b;
        if (z) {
            State state = this.l0;
            if (!state.g || (!layoutParams.f3692a.isUpdated() && !layoutParams.f3692a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.t;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.m;
                    rect2.set(0, 0, 0, 0);
                    ((ItemDecoration) arrayList.get(i)).f(rect2, view, this, state);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                layoutParams.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean S() {
        return !this.y || this.H || this.h.g();
    }

    public final void T() {
        if (this.t.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            layoutManager.d("Cannot invalidate item decorations during a scroll or layout");
        }
        W();
        requestLayout();
    }

    public final boolean U() {
        return this.J > 0;
    }

    public final void V(int i) {
        if (this.q == null) {
            return;
        }
        setScrollState(2);
        this.q.E0(i);
        awakenScrollBars();
    }

    public final void W() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) RecyclerView.this.getChildAt(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.f.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) arrayList.get(i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.c = true;
            }
        }
    }

    public final void X(int i, int i2, boolean z) {
        int i3 = i + i2;
        int childCount = RecyclerView.this.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ViewHolder viewHolderP = P(RecyclerView.this.getChildAt(i4));
            if (viewHolderP != null && !viewHolderP.shouldIgnore()) {
                int i5 = viewHolderP.mPosition;
                State state = this.l0;
                if (i5 >= i3) {
                    if (J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + viewHolderP + " now at position " + (viewHolderP.mPosition - i2));
                    }
                    viewHolderP.offsetPosition(-i2, z);
                    state.f = true;
                } else if (i5 >= i) {
                    if (J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + viewHolderP + " now REMOVED");
                    }
                    viewHolderP.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    state.f = true;
                }
            }
        }
        Recycler recycler = this.f;
        ArrayList arrayList = recycler.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i6 = viewHolder.mPosition;
                if (i6 >= i3) {
                    if (J0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + viewHolder + " now at position " + (viewHolder.mPosition - i2));
                    }
                    viewHolder.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    viewHolder.addFlags(8);
                    recycler.h(size);
                }
            }
        }
        requestLayout();
    }

    public void Y(View view) {
    }

    public void Z(View view) {
    }

    public final void a0() {
        this.J++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            layoutManager.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.J - 1;
        this.J = i2;
        if (i2 < 1) {
            if (I0 && i2 < 0) {
                throw new IllegalStateException(a.j(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.J = 0;
            if (z) {
                int i3 = this.D;
                this.D = 0;
                if (i3 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.z0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                    if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                        viewHolder.itemView.setImportantForAccessibility(i);
                        viewHolder.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void c0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.W = x;
            this.U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.a0 = y;
            this.V = y;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.q.i((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.g()) {
            return this.q.m(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.g()) {
            return this.q.n(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.g()) {
            return this.q.o(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.h()) {
            return this.q.p(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.h()) {
            return this.q.q(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null && layoutManager.h()) {
            return this.q.r(this.l0);
        }
        return 0;
    }

    public final void d0() {
        if (this.r0 || !this.w) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        postOnAnimation(this.A0);
        this.r0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LayoutManager layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.h()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        r0(0, measuredHeight, false);
                        return true;
                    }
                    r0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zU = layoutManager.U();
                    if (keyCode == 122) {
                        if (zU) {
                            i = getAdapter().i();
                        }
                    } else if (!zU) {
                        i = getAdapter().i();
                    }
                    s0(i);
                    return true;
                }
            } else if (layoutManager.g()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        r0(measuredWidth, 0, false);
                        return true;
                    }
                    r0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zU2 = layoutManager.U();
                    if (keyCode2 == 122) {
                        if (zU2) {
                            i = getAdapter().i();
                        }
                    } else if (!zU2) {
                        i = getAdapter().i();
                    }
                    s0(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, iArr, i2, i3, i4, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).h(canvas, this, this.l0);
        }
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.M;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.O;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.k) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.Q == null || arrayList.size() <= 0 || !this.Q.k()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        boolean z;
        boolean z2 = false;
        if (this.H) {
            AdapterHelper adapterHelper = this.h;
            adapterHelper.k(adapterHelper.b);
            adapterHelper.k(adapterHelper.c);
            adapterHelper.f = 0;
            if (this.I) {
                this.q.k0();
            }
        }
        if (this.Q == null || !this.q.Q0()) {
            this.h.c();
        } else {
            this.h.j();
        }
        boolean z3 = this.o0 || this.p0;
        boolean z4 = this.y && this.Q != null && ((z = this.H) || z3 || this.q.f) && (!z || this.p.e);
        State state = this.l0;
        state.j = z4;
        if (z4 && z3 && !this.H && this.Q != null && this.q.Q0()) {
            z2 = true;
        }
        state.k = z2;
    }

    public final void f0(boolean z) {
        this.I = z | this.I;
        this.H = true;
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder viewHolderP = P(RecyclerView.this.getChildAt(i));
            if (viewHolderP != null && !viewHolderP.shouldIgnore()) {
                viewHolderP.addFlags(6);
            }
        }
        W();
        Recycler recycler = this.f;
        ArrayList arrayList = recycler.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.p;
        if (adapter == null || !adapter.e) {
            recycler.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        boolean z = this.l0.h;
        ViewInfoStore viewInfoStore = this.j;
        if (z && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            viewInfoStore.b.h(M(viewHolder), viewHolder);
        }
        SimpleArrayMap simpleArrayMap = viewInfoStore.f3707a;
        ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecordA == null) {
            infoRecordA = ViewInfoStore.InfoRecord.a();
            simpleArrayMap.put(viewHolder, infoRecordA);
        }
        infoRecordA.b = itemHolderInfo;
        infoRecordA.f3708a |= 4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            return layoutManager.v();
        }
        throw new IllegalStateException(a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            return layoutManager.w(getContext(), attributeSet);
        }
        throw new IllegalStateException(a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.p;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            return super.getBaseline();
        }
        layoutManager.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.t0;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i, i2) : childDrawingOrderCallback.a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.k;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.s0;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.L;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.q;
    }

    public int getMaxFlingVelocity() {
        return this.e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    public long getNanoTime() {
        if (N0) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.f.d();
    }

    public int getScrollState() {
        return this.R;
    }

    public final void h(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.f.n(O(view));
        if (viewHolder.isTmpDetached()) {
            this.i.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (z) {
            ChildHelper childHelper = this.i;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            childHelper.b.h(iIndexOfChild);
            childHelper.c.add(view);
            AnonymousClass6 anonymousClass6 = childHelper.f3653a;
            ViewHolder viewHolderP = P(view);
            if (viewHolderP != null) {
                viewHolderP.onEnteredHiddenState(RecyclerView.this);
                return;
            }
            return;
        }
        ChildHelper childHelper2 = this.i;
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        childHelper2.b.e(childCount, true);
        childHelper2.c.add(view);
        ViewHolder viewHolderP2 = P(view);
        if (viewHolderP2 != null) {
            viewHolderP2.onEnteredHiddenState(recyclerView);
        }
        recyclerView.addView(view, childCount);
        ViewHolder viewHolderP3 = P(view);
        recyclerView.Y(view);
        Adapter adapter = recyclerView.p;
        if (adapter != null && viewHolderP3 != null) {
            adapter.A(viewHolderP3);
        }
        ArrayList arrayList = recyclerView.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) recyclerView.G.get(size)).c(view);
            }
        }
    }

    public final void h0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.M.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            layoutManager.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(itemDecoration);
        W();
        requestLayout();
    }

    public final int i0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.M;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || EdgeEffectCompat.a(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.O;
            if (edgeEffect2 != null && EdgeEffectCompat.a(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollHorizontally(1)) {
                    this.O.onRelease();
                } else {
                    float fB = EdgeEffectCompat.b(this.O, width, height);
                    if (EdgeEffectCompat.a(this.O) == BitmapDescriptorFactory.HUE_RED) {
                        this.O.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.M.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.b(this.M, -width, 1.0f - height);
                if (EdgeEffectCompat.a(this.M) == BitmapDescriptorFactory.HUE_RED) {
                    this.M.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(onChildAttachStateChangeListener);
    }

    public final int j0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.N;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || EdgeEffectCompat.a(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.P;
            if (edgeEffect2 != null && EdgeEffectCompat.a(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollVertically(1)) {
                    this.P.onRelease();
                } else {
                    float fB = EdgeEffectCompat.b(this.P, height, 1.0f - width);
                    if (EdgeEffectCompat.a(this.P) == BitmapDescriptorFactory.HUE_RED) {
                        this.P.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.N.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.b(this.N, -height, width);
                if (EdgeEffectCompat.a(this.N) == BitmapDescriptorFactory.HUE_RED) {
                    this.N.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void k(OnScrollListener onScrollListener) {
        if (this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(onScrollListener);
    }

    public final void k0(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            layoutManager.d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        arrayList.remove(itemDecoration);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        W();
        requestLayout();
    }

    public final void l(String str) {
        if (U()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a.j(this, new StringBuilder(""))));
        }
    }

    public final void l0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect2 = layoutParams2.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.q.B0(this, view, this.m, !this.y, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void n() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder viewHolderP = P(RecyclerView.this.getChildAt(i));
            if (!viewHolderP.shouldIgnore()) {
                viewHolderP.clearOldPosition();
            }
        }
        Recycler recycler = this.f;
        ArrayList arrayList = recycler.f3695a;
        ArrayList arrayList2 = recycler.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) recycler.b.get(i4)).clearOldPosition();
            }
        }
    }

    public final void n0(int i, int i2, int[] iArr) {
        ViewHolder viewHolder;
        t0();
        a0();
        Trace.beginSection("RV Scroll");
        State state = this.l0;
        E(state);
        Recycler recycler = this.f;
        int iD0 = i != 0 ? this.q.D0(i, recycler, state) : 0;
        int iF0 = i2 != 0 ? this.q.F0(i2, recycler, state) : 0;
        Trace.endSection();
        int iC = this.i.c();
        for (int i3 = 0; i3 < iC; i3++) {
            View viewB = this.i.b(i3);
            ViewHolder viewHolderO = O(viewB);
            if (viewHolderO != null && (viewHolder = viewHolderO.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        b0(true);
        v0(false);
        if (iArr != null) {
            iArr[0] = iD0;
            iArr[1] = iF0;
        }
    }

    public final void o(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.M.onRelease();
            zIsFinished = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.O.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.P.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public void o0(int i) {
        if (this.B) {
            return;
        }
        x0();
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.E0(i);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.J = r0
            r1 = 1
            r5.w = r1
            boolean r2 = r5.y
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.y = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r5.f
            r2.e()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r5.q
            if (r2 == 0) goto L26
            r2.g = r1
            r2.c0(r5)
        L26:
            r5.r0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.N0
            if (r0 == 0) goto L80
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.GapWorker.h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.GapWorker r1 = (androidx.recyclerview.widget.GapWorker) r1
            r5.j0 = r1
            if (r1 != 0) goto L66
            androidx.recyclerview.widget.GapWorker r1 = new androidx.recyclerview.widget.GapWorker
            r1.<init>()
            r5.j0 = r1
            java.util.WeakHashMap r1 = androidx.core.view.ViewCompat.f2488a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            androidx.recyclerview.widget.GapWorker r2 = r5.j0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f = r3
            r0.set(r2)
        L66:
            androidx.recyclerview.widget.GapWorker r0 = r5.j0
            java.util.ArrayList r0 = r0.d
            boolean r1 = androidx.recyclerview.widget.RecyclerView.I0
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.Q;
        if (itemAnimator != null) {
            itemAnimator.j();
        }
        x0();
        this.w = false;
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            layoutManager.g = false;
            layoutManager.d0(this);
        }
        this.z0.clear();
        removeCallbacks(this.A0);
        this.j.getClass();
        while (ViewInfoStore.InfoRecord.d.a() != null) {
        }
        Recycler recycler = this.f;
        ArrayList arrayList = recycler.c;
        for (int i = 0; i < arrayList.size(); i++) {
            PoolingContainer.b(((ViewHolder) arrayList.get(i)).itemView);
        }
        recycler.f(RecyclerView.this.p, false);
        PoolingContainer.c(this);
        if (!N0 || (gapWorker = this.j0) == null) {
            return;
        }
        boolean zRemove = gapWorker.d.remove(this);
        if (I0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.j0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).g(canvas, this, this.l0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.q != null && !this.B && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float axisValue2 = BitmapDescriptorFactory.HUE_RED;
            if (source != 0) {
                float f = this.q.h() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.q.g()) {
                    axisValue2 = motionEvent.getAxisValue(10);
                }
                axisValue = axisValue2;
                i = 0;
                z = false;
                axisValue2 = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.q.h()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    axisValue2 = f2;
                } else if (!this.q.g()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.E0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (axisValue2 * this.g0);
            int i3 = (int) (axisValue * this.f0);
            if (z) {
                OverScroller overScroller = this.i0.f;
                r0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                LayoutManager layoutManager = this.q;
                if (layoutManager == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.B) {
                    int[] iArr = this.y0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zG = layoutManager.g();
                    boolean zH = this.q.h();
                    int i4 = zH ? (zG ? 1 : 0) | 2 : zG ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iI0 = i3 - i0(y, i3);
                    int iJ0 = i2 - j0(x, i2);
                    getScrollingChildHelper().h(i4, 1);
                    if (w(zG ? iI0 : 0, zH ? iJ0 : 0, 1, this.y0, this.w0)) {
                        iI0 -= iArr[0];
                        iJ0 -= iArr[1];
                    }
                    m0(zG ? iI0 : 0, zH ? iJ0 : 0, motionEvent, 1);
                    GapWorker gapWorker = this.j0;
                    if (gapWorker != null && (iI0 != 0 || iJ0 != 0)) {
                        gapWorker.a(this, iI0, iJ0);
                    }
                    w0(1);
                }
            }
            if (i != 0 && !z) {
                this.H0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.B) {
            this.v = null;
            if (G(motionEvent)) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                w0(0);
                h0();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.q;
            if (layoutManager != null) {
                boolean zG = layoutManager.g();
                boolean zH = this.q.h();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                this.T.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.S = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.W = x;
                    this.U = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.a0 = y;
                    this.V = y;
                    EdgeEffect edgeEffect = this.M;
                    if (edgeEffect == null || EdgeEffectCompat.a(edgeEffect) == BitmapDescriptorFactory.HUE_RED || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        EdgeEffectCompat.b(this.M, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.O;
                    if (edgeEffect2 != null && EdgeEffectCompat.a(edgeEffect2) != BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(1)) {
                        EdgeEffectCompat.b(this.O, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.N;
                    if (edgeEffect3 != null && EdgeEffectCompat.a(edgeEffect3) != BitmapDescriptorFactory.HUE_RED && !canScrollVertically(-1)) {
                        EdgeEffectCompat.b(this.N, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.P;
                    if (edgeEffect4 != null && EdgeEffectCompat.a(edgeEffect4) != BitmapDescriptorFactory.HUE_RED && !canScrollVertically(1)) {
                        EdgeEffectCompat.b(this.P, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.R == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        w0(1);
                    }
                    int[] iArr = this.x0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    u0(0);
                } else if (actionMasked == 1) {
                    this.T.clear();
                    w0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.S);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.R != 1) {
                        int i = x2 - this.U;
                        int i2 = y2 - this.V;
                        if (!zG || Math.abs(i) <= this.b0) {
                            z2 = false;
                        } else {
                            this.W = x2;
                            z2 = true;
                        }
                        if (zH && Math.abs(i2) > this.b0) {
                            this.a0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.T;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    w0(0);
                    h0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.S = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.W = x3;
                    this.U = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.a0 = y3;
                    this.V = y3;
                } else if (actionMasked == 6) {
                    c0(motionEvent);
                }
                if (this.R == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            r(i, i2);
            return;
        }
        boolean zT = layoutManager.T();
        boolean z = false;
        State state = this.l0;
        if (zT) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.q.b.r(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.B0 = z;
            if (z || this.p == null) {
                return;
            }
            if (state.d == 1) {
                u();
            }
            this.q.H0(i, i2);
            state.i = true;
            v();
            this.q.J0(i, i2);
            if (this.q.M0()) {
                this.q.H0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                state.i = true;
                v();
                this.q.J0(i, i2);
            }
            this.C0 = getMeasuredWidth();
            this.D0 = getMeasuredHeight();
            return;
        }
        if (this.x) {
            this.q.b.r(i, i2);
            return;
        }
        if (this.E) {
            t0();
            a0();
            e0();
            b0(true);
            if (state.k) {
                state.g = true;
            } else {
                this.h.c();
                state.g = false;
            }
            this.E = false;
            v0(false);
        } else if (state.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.p;
        if (adapter != null) {
            state.e = adapter.i();
        } else {
            state.e = 0;
        }
        t0();
        this.q.b.r(i, i2);
        v0(false);
        state.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (U()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.g = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.g;
        if (savedState2 != null) {
            savedState.f = savedState2.f;
            return savedState;
        }
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            savedState.f = layoutManager.s0();
            return savedState;
        }
        savedState.f = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0111 A[PHI: r1
  0x0111: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:56:0x00fa, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.p;
        RecyclerViewDataObserver recyclerViewDataObserver = this.e;
        if (adapter2 != null) {
            adapter2.F(recyclerViewDataObserver);
            this.p.y(this);
        }
        Recycler recycler = this.f;
        if (!z || z2) {
            ItemAnimator itemAnimator = this.Q;
            if (itemAnimator != null) {
                itemAnimator.j();
            }
            LayoutManager layoutManager = this.q;
            if (layoutManager != null) {
                layoutManager.w0(recycler);
                this.q.x0(recycler);
            }
            recycler.f3695a.clear();
            recycler.g();
        }
        AdapterHelper adapterHelper = this.h;
        adapterHelper.k(adapterHelper.b);
        adapterHelper.k(adapterHelper.c);
        adapterHelper.f = 0;
        Adapter adapter3 = this.p;
        this.p = adapter;
        if (adapter != null) {
            adapter.D(recyclerViewDataObserver);
            adapter.u(this);
        }
        LayoutManager layoutManager2 = this.q;
        if (layoutManager2 != null) {
            layoutManager2.b0(this.p);
        }
        Adapter adapter4 = this.p;
        recycler.f3695a.clear();
        recycler.g();
        recycler.f(adapter3, true);
        RecycledViewPool recycledViewPoolD = recycler.d();
        if (adapter3 != null) {
            recycledViewPoolD.b--;
        }
        if (!z && recycledViewPoolD.b == 0) {
            recycledViewPoolD.a();
        }
        if (adapter4 != null) {
            recycledViewPoolD.b++;
        } else {
            recycledViewPoolD.getClass();
        }
        recycler.e();
        this.l0.f = true;
    }

    public final void q() {
        if (!this.y || this.H) {
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        if (this.h.g()) {
            AdapterHelper adapterHelper = this.h;
            int i = adapterHelper.f;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (adapterHelper.g()) {
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            t0();
            a0();
            this.h.j();
            if (!this.A) {
                int iC = this.i.c();
                int i2 = 0;
                while (true) {
                    if (i2 < iC) {
                        ViewHolder viewHolderP = P(this.i.b(i2));
                        if (viewHolderP != null && !viewHolderP.shouldIgnore() && viewHolderP.isUpdated()) {
                            t();
                            break;
                        }
                        i2++;
                    } else {
                        this.h.b();
                        break;
                    }
                }
            }
            v0(true);
            b0(true);
            Trace.endSection();
        }
    }

    public final boolean q0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = EdgeEffectCompat.a(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.d * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = L0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fA;
    }

    public final void r(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setMeasuredDimension(LayoutManager.j(i, paddingRight, getMinimumWidth()), LayoutManager.j(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r0(int i, int i2, boolean z) {
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!layoutManager.g()) {
            i = 0;
        }
        if (!this.q.h()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.i0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        ViewHolder viewHolderP = P(view);
        if (viewHolderP != null) {
            if (viewHolderP.isTmpDetached()) {
                viewHolderP.clearTmpDetachFlag();
            } else if (!viewHolderP.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(viewHolderP);
                throw new IllegalArgumentException(a.j(this, sb));
            }
        } else if (I0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(a.j(this, sb2));
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.q.q0(this, this.l0, view, view2) && view2 != null) {
            l0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.q.B0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OnItemTouchListener) arrayList.get(i)).d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        ViewHolder viewHolderP = P(view);
        Z(view);
        Adapter adapter = this.p;
        if (adapter != null && viewHolderP != null) {
            adapter.B(viewHolderP);
        }
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.G.get(size)).b(view);
            }
        }
    }

    public void s0(int i) {
        if (this.B) {
            return;
        }
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.O0(i, this);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean zG = layoutManager.g();
        boolean zH = this.q.h();
        if (zG || zH) {
            if (!zG) {
                i = 0;
            }
            if (!zH) {
                i2 = 0;
            }
            m0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!U()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.s0 = recyclerViewAccessibilityDelegate;
        ViewCompat.A(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        p0(adapter, false, true);
        f0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.t0) {
            return;
        }
        this.t0 = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.k) {
            this.P = null;
            this.N = null;
            this.O = null;
            this.M = null;
        }
        this.k = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.L = edgeEffectFactory;
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.Q;
        if (itemAnimator2 != null) {
            itemAnimator2.j();
            this.Q.f3685a = null;
        }
        this.Q = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f3685a = this.q0;
        }
    }

    public void setItemViewCacheSize(int i) {
        Recycler recycler = this.f;
        recycler.e = i;
        recycler.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.q) {
            return;
        }
        x0();
        LayoutManager layoutManager2 = this.q;
        Recycler recycler = this.f;
        if (layoutManager2 != null) {
            ItemAnimator itemAnimator = this.Q;
            if (itemAnimator != null) {
                itemAnimator.j();
            }
            this.q.w0(recycler);
            this.q.x0(recycler);
            recycler.f3695a.clear();
            recycler.g();
            if (this.w) {
                LayoutManager layoutManager3 = this.q;
                layoutManager3.g = false;
                layoutManager3.d0(this);
            }
            this.q.K0(null);
            this.q = null;
        } else {
            recycler.f3695a.clear();
            recycler.g();
        }
        ChildHelper childHelper = this.i;
        AnonymousClass6 anonymousClass6 = childHelper.f3653a;
        childHelper.b.g();
        ArrayList arrayList = childHelper.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            anonymousClass6.a((View) arrayList.get(size));
            arrayList.remove(size);
        }
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.q = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a.j(layoutManager.b, sb));
            }
            layoutManager.K0(this);
            if (this.w) {
                LayoutManager layoutManager4 = this.q;
                layoutManager4.g = true;
                layoutManager4.c0(this);
            }
        }
        recycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.c0 = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.m0 = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.h0 = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        Recycler recycler = this.f;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.f(recyclerView.p, false);
        if (recycler.g != null) {
            r2.b--;
        }
        recycler.g = recycledViewPool;
        if (recycledViewPool != null && recyclerView.getAdapter() != null) {
            recycler.g.b++;
        }
        recycler.e();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.r = recyclerListener;
    }

    public void setScrollState(int i) {
        SmoothScroller smoothScroller;
        if (i == this.R) {
            return;
        }
        if (J0) {
            StringBuilder sbR = YU.a.r(i, "setting scroll state to ", " from ");
            sbR.append(this.R);
            Log.d("RecyclerView", sbR.toString(), new Exception());
        }
        this.R = i;
        if (i != 2) {
            ViewFlinger viewFlinger = this.i0;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f.abortAnimation();
            LayoutManager layoutManager = this.q;
            if (layoutManager != null && (smoothScroller = layoutManager.e) != null) {
                smoothScroller.f();
            }
        }
        LayoutManager layoutManager2 = this.q;
        if (layoutManager2 != null) {
            layoutManager2.t0(i);
        }
        OnScrollListener onScrollListener = this.m0;
        if (onScrollListener != null) {
            onScrollListener.a(i, this);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.n0.get(size)).a(i, this);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.f.h = viewCacheExtension;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.B) {
            l("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
                this.B = true;
                this.C = true;
                x0();
                return;
            }
            this.B = false;
            if (this.A && this.q != null && this.p != null) {
                requestLayout();
            }
            this.A = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void t0() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    public final void u() {
        ViewInfoStore.InfoRecord infoRecord;
        View viewF;
        State state = this.l0;
        state.a(1);
        E(state);
        state.i = false;
        t0();
        ViewInfoStore viewInfoStore = this.j;
        SimpleArrayMap simpleArrayMap = viewInfoStore.f3707a;
        SimpleArrayMap simpleArrayMap2 = viewInfoStore.f3707a;
        simpleArrayMap.clear();
        LongSparseArray longSparseArray = viewInfoStore.b;
        longSparseArray.a();
        a0();
        e0();
        ViewHolder viewHolderO = null;
        View focusedChild = (this.h0 && hasFocus() && this.p != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            viewHolderO = O(viewF);
        }
        if (viewHolderO == null) {
            state.m = -1L;
            state.l = -1;
            state.n = -1;
        } else {
            state.m = this.p.e ? viewHolderO.getItemId() : -1L;
            state.l = this.H ? -1 : viewHolderO.isRemoved() ? viewHolderO.mOldPosition : viewHolderO.getAbsoluteAdapterPosition();
            View focusedChild2 = viewHolderO.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            state.n = id;
        }
        state.h = state.j && this.p0;
        this.p0 = false;
        this.o0 = false;
        state.g = state.k;
        state.e = this.p.i();
        H(this.u0);
        if (state.j) {
            int iC = this.i.c();
            for (int i = 0; i < iC; i++) {
                ViewHolder viewHolderP = P(this.i.b(i));
                if (!viewHolderP.shouldIgnore() && (!viewHolderP.isInvalid() || this.p.e)) {
                    ItemAnimator itemAnimator = this.Q;
                    ItemAnimator.e(viewHolderP);
                    viewHolderP.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.a(viewHolderP);
                    ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap2.get(viewHolderP);
                    if (infoRecordA == null) {
                        infoRecordA = ViewInfoStore.InfoRecord.a();
                        simpleArrayMap2.put(viewHolderP, infoRecordA);
                    }
                    infoRecordA.b = itemHolderInfo;
                    infoRecordA.f3708a |= 4;
                    if (state.h && viewHolderP.isUpdated() && !viewHolderP.isRemoved() && !viewHolderP.shouldIgnore() && !viewHolderP.isInvalid()) {
                        longSparseArray.h(M(viewHolderP), viewHolderP);
                    }
                }
            }
        }
        if (state.k) {
            int childCount = RecyclerView.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewHolder viewHolderP2 = P(RecyclerView.this.getChildAt(i2));
                if (I0 && viewHolderP2.mPosition == -1 && !viewHolderP2.isRemoved()) {
                    throw new IllegalStateException(a.j(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!viewHolderP2.shouldIgnore()) {
                    viewHolderP2.saveOldPosition();
                }
            }
            boolean z = state.f;
            state.f = false;
            this.q.o0(this.f, state);
            state.f = z;
            for (int i3 = 0; i3 < this.i.c(); i3++) {
                ViewHolder viewHolderP3 = P(this.i.b(i3));
                if (!viewHolderP3.shouldIgnore() && ((infoRecord = (ViewInfoStore.InfoRecord) simpleArrayMap2.get(viewHolderP3)) == null || (infoRecord.f3708a & 4) == 0)) {
                    ItemAnimator.e(viewHolderP3);
                    boolean zHasAnyOfTheFlags = viewHolderP3.hasAnyOfTheFlags(8192);
                    ItemAnimator itemAnimator2 = this.Q;
                    viewHolderP3.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo2.a(viewHolderP3);
                    if (zHasAnyOfTheFlags) {
                        g0(viewHolderP3, itemHolderInfo2);
                    } else {
                        ViewInfoStore.InfoRecord infoRecordA2 = (ViewInfoStore.InfoRecord) simpleArrayMap2.get(viewHolderP3);
                        if (infoRecordA2 == null) {
                            infoRecordA2 = ViewInfoStore.InfoRecord.a();
                            simpleArrayMap2.put(viewHolderP3, infoRecordA2);
                        }
                        infoRecordA2.f3708a |= 2;
                        infoRecordA2.b = itemHolderInfo2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        b0(true);
        v0(false);
        state.d = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(int i) {
        boolean zG = this.q.g();
        int i2 = zG;
        if (this.q.h()) {
            i2 = (zG ? 1 : 0) | 2;
        }
        getScrollingChildHelper().h(i2, i);
    }

    public final void v() {
        t0();
        a0();
        State state = this.l0;
        state.a(6);
        this.h.c();
        state.e = this.p.i();
        state.c = 0;
        if (this.g != null) {
            Adapter adapter = this.p;
            int iOrdinal = adapter.f.ordinal();
            if (iOrdinal == 1 ? adapter.i() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.g.f;
                if (parcelable != null) {
                    this.q.r0(parcelable);
                }
                this.g = null;
            }
        }
        state.g = false;
        this.q.o0(this.f, state);
        state.f = false;
        state.j = state.j && this.Q != null;
        state.d = 4;
        b0(true);
        v0(false);
    }

    public final void v0(boolean z) {
        if (this.z < 1) {
            if (I0) {
                throw new IllegalStateException(a.j(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.z = 1;
        }
        if (!z && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z && this.A && !this.B && this.q != null && this.p != null) {
                t();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    public final boolean w(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void w0(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void x(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        getScrollingChildHelper().d(i, iArr, i2, i3, i4, iArr2, i5);
    }

    public final void x0() {
        SmoothScroller smoothScroller;
        setScrollState(0);
        ViewFlinger viewFlinger = this.i0;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.f.abortAnimation();
        LayoutManager layoutManager = this.q;
        if (layoutManager == null || (smoothScroller = layoutManager.e) == null) {
            return;
        }
        smoothScroller.f();
    }

    public final void y(int i, int i2) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        OnScrollListener onScrollListener = this.m0;
        if (onScrollListener != null) {
            onScrollListener.d(this, i, i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.n0.get(size)).d(this, i, i2);
            }
        }
        this.K--;
    }

    public final void z() {
        if (this.P != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.L.a(this);
        this.P = edgeEffectA;
        if (this.k) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        char c;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        ClassLoader classLoader;
        Constructor constructor;
        super(context, attributeSet, i);
        this.e = new RecyclerViewDataObserver();
        this.f = new Recycler();
        this.j = new ViewInfoStore();
        this.l = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.y || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.w) {
                    recyclerView.requestLayout();
                } else if (recyclerView.B) {
                    recyclerView.A = true;
                } else {
                    recyclerView.q();
                }
            }
        };
        this.m = new Rect();
        this.n = new Rect();
        this.o = new RectF();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.z = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = Q0;
        this.Q = new DefaultItemAnimator();
        this.R = 0;
        this.S = -1;
        this.f0 = Float.MIN_VALUE;
        this.g0 = Float.MIN_VALUE;
        this.h0 = true;
        this.i0 = new ViewFlinger();
        Object[] objArr = null;
        this.k0 = N0 ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        State state = new State();
        state.f3699a = -1;
        state.b = 0;
        state.c = 0;
        state.d = 1;
        state.e = 0;
        state.f = false;
        state.g = false;
        state.h = false;
        state.i = false;
        state.j = false;
        state.k = false;
        this.l0 = state;
        this.o0 = false;
        this.p0 = false;
        ItemAnimatorRestoreListener itemAnimatorRestoreListener = new ItemAnimatorRestoreListener();
        this.q0 = itemAnimatorRestoreListener;
        this.r0 = false;
        this.u0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new ArrayList();
        this.A0 = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView = RecyclerView.this;
                ItemAnimator itemAnimator = recyclerView.Q;
                if (itemAnimator != null) {
                    itemAnimator.l();
                }
                recyclerView.r0 = false;
            }
        };
        this.C0 = 0;
        this.D0 = 0;
        this.F0 = new AnonymousClass4();
        DifferentialMotionFlingTarget differentialMotionFlingTarget = new DifferentialMotionFlingTarget() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public final float a() {
                float f;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.q.h()) {
                    f = recyclerView.g0;
                } else {
                    if (!recyclerView.q.g()) {
                        return BitmapDescriptorFactory.HUE_RED;
                    }
                    f = recyclerView.f0;
                }
                return -f;
            }

            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public final boolean b(float f) {
                int i3;
                int i4;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.q.h()) {
                    i4 = (int) f;
                    i3 = 0;
                } else if (recyclerView.q.g()) {
                    i3 = (int) f;
                    i4 = 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (i3 == 0 && i4 == 0) {
                    return false;
                }
                recyclerView.x0();
                return recyclerView.K(i3, i4, 0, Integer.MAX_VALUE);
            }

            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public final void c() {
                RecyclerView.this.x0();
            }
        };
        this.G0 = differentialMotionFlingTarget;
        this.H0 = new DifferentialMotionFlingController(getContext(), differentialMotionFlingTarget);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.g0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.f3685a = itemAnimatorRestoreListener;
        this.h = new AdapterHelper(new AnonymousClass7());
        this.i = new ChildHelper(new AnonymousClass6());
        if (ViewCompat.l(this) == 0) {
            ViewCompat.G(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = androidx.recyclerview.R.styleable.f3646a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.k = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c = 3;
                c2 = 2;
                z = 1;
                typedArray = typedArrayObtainStyledAttributes;
                i2 = 4;
                new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.woolworths.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.woolworths.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.woolworths.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(a.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c = 3;
            z = 1;
            c2 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        this.E0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + JwtParser.SEPARATOR_CHAR + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(O0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[z] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = K0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.z(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.woolworths.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public ViewHolder f3692a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.q;
        if (layoutManager != null) {
            return layoutManager.x(layoutParams);
        }
        throw new IllegalStateException(a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
