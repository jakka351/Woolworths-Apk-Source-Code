package androidx.recyclerview.widget;

import YU.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeCallback;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final ShoppingListItemSwipeCallback m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public ItemTouchHelperGestureListener y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3670a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.ViewHolder c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final Runnable s = new AnonymousClass1();
    public View w = null;
    public final RecyclerView.OnItemTouchListener z = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void a(MotionEvent motionEvent) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            Runnable runnable = itemTouchHelper.s;
            itemTouchHelper.x.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = itemTouchHelper.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (itemTouchHelper.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(itemTouchHelper.l);
            if (iFindPointerIndex >= 0) {
                itemTouchHelper.k(motionEvent, actionMasked, iFindPointerIndex);
            }
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.c;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        itemTouchHelper.t(motionEvent, itemTouchHelper.o, iFindPointerIndex);
                        itemTouchHelper.q(viewHolder);
                        itemTouchHelper.r.removeCallbacks(runnable);
                        ((AnonymousClass1) runnable).run();
                        itemTouchHelper.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == itemTouchHelper.l) {
                        itemTouchHelper.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        itemTouchHelper.t(motionEvent, itemTouchHelper.o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            itemTouchHelper.s(null, 0);
            itemTouchHelper.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void d(boolean z) {
            if (z) {
                ItemTouchHelper.this.s(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean e(MotionEvent motionEvent) {
            int iFindPointerIndex;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            itemTouchHelper.x.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            RecoverAnimation recoverAnimation = null;
            if (actionMasked == 0) {
                itemTouchHelper.l = motionEvent.getPointerId(0);
                itemTouchHelper.d = motionEvent.getX();
                itemTouchHelper.e = motionEvent.getY();
                VelocityTracker velocityTracker = itemTouchHelper.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                itemTouchHelper.t = VelocityTracker.obtain();
                if (itemTouchHelper.c == null) {
                    ArrayList arrayList = itemTouchHelper.p;
                    if (!arrayList.isEmpty()) {
                        View viewN = itemTouchHelper.n(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            RecoverAnimation recoverAnimation2 = (RecoverAnimation) arrayList.get(size);
                            if (recoverAnimation2.h.itemView == viewN) {
                                recoverAnimation = recoverAnimation2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (recoverAnimation != null) {
                        RecyclerView.ViewHolder viewHolder = recoverAnimation.h;
                        itemTouchHelper.d -= recoverAnimation.l;
                        itemTouchHelper.e -= recoverAnimation.m;
                        itemTouchHelper.m(viewHolder, true);
                        if (itemTouchHelper.f3670a.remove(viewHolder.itemView)) {
                            itemTouchHelper.m.c(itemTouchHelper.r, viewHolder);
                        }
                        itemTouchHelper.s(viewHolder, recoverAnimation.i);
                        itemTouchHelper.t(motionEvent, itemTouchHelper.o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                itemTouchHelper.l = -1;
                itemTouchHelper.s(null, 0);
            } else {
                int i = itemTouchHelper.l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    itemTouchHelper.k(motionEvent, actionMasked, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = itemTouchHelper.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return itemTouchHelper.c != null;
        }
    };

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.AnonymousClass1.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public final int a(int i, int i2) {
            throw null;
        }
    }

    public static abstract class Callback {
        public static final Interpolator b = new AnonymousClass1();
        public static final Interpolator c = new AnonymousClass2();

        /* renamed from: a, reason: collision with root package name */
        public int f3672a;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$1, reason: invalid class name */
        public class AnonymousClass1 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$2, reason: invalid class name */
        public class AnonymousClass2 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public static int e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int g(int i, int i2) {
            int i3 = i2 | i;
            return (i << 16) | (i2 << 8) | i3;
        }

        public RecyclerView.ViewHolder b(RecyclerView.ViewHolder viewHolder, List list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = viewHolder.itemView.getWidth() + i;
            int height = viewHolder.itemView.getHeight() + i2;
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                ViewCompat.F(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }

        public final int f(RecyclerView recyclerView, int i, int i2, long j) {
            if (this.f3672a == -1) {
                this.f3672a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * this.f3672a * ((AnonymousClass2) c).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * ((AnonymousClass1) b).getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            return iSignum == 0 ? i2 > 0 ? 1 : -1 : iSignum;
        }

        public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float fValueOf = Float.valueOf(ViewCompat.k(view));
                int childCount = recyclerView.getChildCount();
                float f3 = BitmapDescriptorFactory.HUE_RED;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float fK = ViewCompat.k(childAt);
                        if (fK > f3) {
                            f3 = fK;
                        }
                    }
                }
                ViewCompat.F(view, f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void i(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).b(viewHolder.itemView, viewHolder2.itemView);
                return;
            }
            if (layoutManager.g()) {
                if (RecyclerView.LayoutManager.E(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.o0(i2);
                }
                if (RecyclerView.LayoutManager.H(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.o0(i2);
                }
            }
            if (layoutManager.h()) {
                if (RecyclerView.LayoutManager.I(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.o0(i2);
                }
                if (RecyclerView.LayoutManager.C(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.o0(i2);
                }
            }
        }
    }

    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        public boolean d = true;

        public ItemTouchHelperGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View viewN;
            RecyclerView.ViewHolder viewHolderO;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = itemTouchHelper.m;
            if (!this.d || (viewN = itemTouchHelper.n(motionEvent)) == null || (viewHolderO = itemTouchHelper.r.O(viewN)) == null) {
                return;
            }
            RecyclerView recyclerView = itemTouchHelper.r;
            if ((Callback.d(shoppingListItemSwipeCallback.k(recyclerView, viewHolderO), recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = itemTouchHelper.l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    itemTouchHelper.d = x;
                    itemTouchHelper.e = y;
                    itemTouchHelper.i = BitmapDescriptorFactory.HUE_RED;
                    itemTouchHelper.h = BitmapDescriptorFactory.HUE_RED;
                    shoppingListItemSwipeCallback.getClass();
                    itemTouchHelper.s(viewHolderO, 2);
                }
            }
        }
    }

    @VisibleForTesting
    public static class RecoverAnimation implements Animator.AnimatorListener {
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final RecyclerView.ViewHolder h;
        public final int i;
        public final ValueAnimator j;
        public boolean k;
        public float l;
        public float m;
        public boolean n = false;
        public boolean o = false;
        public float p;

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i, float f, float f2, float f3, float f4) {
            this.i = i;
            this.h = viewHolder;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.j = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.p = valueAnimator.getAnimatedFraction();
                }
            });
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.p = BitmapDescriptorFactory.HUE_RED;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.p = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.o) {
                this.h.setIsRecyclable(true);
            }
            this.o = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class SimpleCallback extends Callback {
    }

    public interface ViewDropHandler {
        void b(View view, View view2);
    }

    public ItemTouchHelper(ShoppingListItemSwipeCallback shoppingListItemSwipeCallback) {
        this.m = shoppingListItemSwipeCallback;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void b(View view) {
        r(view);
        RecyclerView.ViewHolder viewHolderO = this.r.O(view);
        if (viewHolderO == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.c;
        if (viewHolder != null && viewHolderO == viewHolder) {
            s(null, 0);
            return;
        }
        m(viewHolderO, false);
        if (this.f3670a.remove(viewHolderO.itemView)) {
            this.m.c(this.r, viewHolderO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void c(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        RecyclerView.ViewHolder viewHolder = this.c;
        int i = this.n;
        ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
        shoppingListItemSwipeCallback.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) arrayList.get(i2);
            RecyclerView.ViewHolder viewHolder2 = recoverAnimation.h;
            float f4 = recoverAnimation.d;
            float f5 = recoverAnimation.f;
            if (f4 == f5) {
                recoverAnimation.l = viewHolder2.itemView.getTranslationX();
            } else {
                recoverAnimation.l = a.a(f5, f4, recoverAnimation.p, f4);
            }
            float f6 = recoverAnimation.e;
            float f7 = recoverAnimation.g;
            if (f6 == f7) {
                recoverAnimation.m = viewHolder2.itemView.getTranslationY();
            } else {
                recoverAnimation.m = a.a(f7, f6, recoverAnimation.p, f6);
            }
            int iSave = canvas.save();
            shoppingListItemSwipeCallback.h(canvas, recyclerView, recoverAnimation.h, recoverAnimation.l, recoverAnimation.m, recoverAnimation.i, false);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            shoppingListItemSwipeCallback.h(canvas, recyclerView, viewHolder, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        RecyclerView.ViewHolder viewHolder = this.c;
        ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
        shoppingListItemSwipeCallback.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) arrayList.get(i);
            int iSave = canvas.save();
            shoppingListItemSwipeCallback.o(canvas, recyclerView, recoverAnimation.h);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            shoppingListItemSwipeCallback.o(canvas, recyclerView, viewHolder);
            canvas.restoreToCount(iSave2);
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            RecoverAnimation recoverAnimation2 = (RecoverAnimation) arrayList.get(i2);
            boolean z2 = recoverAnimation2.o;
            if (z2 && !recoverAnimation2.k) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        RecyclerView.OnItemTouchListener onItemTouchListener = this.z;
        if (recyclerView2 != null) {
            recyclerView2.k0(this);
            RecyclerView recyclerView3 = this.r;
            recyclerView3.u.remove(onItemTouchListener);
            if (recyclerView3.v == onItemTouchListener) {
                recyclerView3.v = null;
            }
            ArrayList arrayList = this.r.G;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecoverAnimation recoverAnimation = (RecoverAnimation) arrayList2.get(0);
                recoverAnimation.j.cancel();
                this.m.c(this.r, recoverAnimation.h);
            }
            arrayList2.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.y;
            if (itemTouchHelperGestureListener != null) {
                itemTouchHelperGestureListener.d = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.i(this);
            this.r.u.add(onItemTouchListener);
            this.r.j(this);
            this.y = new ItemTouchHelperGestureListener();
            this.x = new GestureDetector(this.r.getContext(), this.y);
        }
    }

    public final int j(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            shoppingListItemSwipeCallback.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth();
        shoppingListItemSwipeCallback.m(viewHolder);
        float f2 = 0.5f * width;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void k(MotionEvent motionEvent, int i, int i2) {
        View viewN;
        if (this.c == null && i == 2 && this.n != 2) {
            ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
            shoppingListItemSwipeCallback.getClass();
            if (this.r.getScrollState() == 1) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            RecyclerView.ViewHolder viewHolderO = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.d;
                float y = motionEvent.getY(iFindPointerIndex) - this.e;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.q;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.g()) && ((fAbs2 <= fAbs || !layoutManager.h()) && (viewN = n(motionEvent)) != null))) {
                    viewHolderO = this.r.O(viewN);
                }
            }
            if (viewHolderO == null) {
                return;
            }
            RecyclerView recyclerView = this.r;
            int iD = (Callback.d(shoppingListItemSwipeCallback.k(recyclerView, viewHolderO), recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (iD == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.d;
            float f3 = y2 - this.e;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.q;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < BitmapDescriptorFactory.HUE_RED && (iD & 4) == 0) {
                        return;
                    }
                    if (f2 > BitmapDescriptorFactory.HUE_RED && (iD & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < BitmapDescriptorFactory.HUE_RED && (iD & 1) == 0) {
                        return;
                    }
                    if (f3 > BitmapDescriptorFactory.HUE_RED && (iD & 2) == 0) {
                        return;
                    }
                }
                this.i = BitmapDescriptorFactory.HUE_RED;
                this.h = BitmapDescriptorFactory.HUE_RED;
                this.l = motionEvent.getPointerId(0);
                s(viewHolderO, 1);
            }
        }
    }

    public final int l(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            shoppingListItemSwipeCallback.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight();
        shoppingListItemSwipeCallback.m(viewHolder);
        float f2 = 0.5f * height;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void m(RecyclerView.ViewHolder viewHolder, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) arrayList.get(size);
            if (recoverAnimation.h == viewHolder) {
                recoverAnimation.n |= z;
                if (!recoverAnimation.o) {
                    recoverAnimation.j.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.c;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (p(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) arrayList.get(size);
            View view2 = recoverAnimation.h.itemView;
            if (p(view2, x, y, recoverAnimation.l, recoverAnimation.m)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int iC = recyclerView.i.c() - 1; iC >= 0; iC--) {
            View viewB = recyclerView.i.b(iC);
            float translationX = viewB.getTranslationX();
            float translationY = viewB.getTranslationY();
            if (x >= viewB.getLeft() + translationX && x <= viewB.getRight() + translationX && y >= viewB.getTop() + translationY && y <= viewB.getBottom() + translationY) {
                return viewB;
            }
        }
        return null;
    }

    public final void o(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    public final void q(RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        if (!this.r.isLayoutRequested() && this.n == 2) {
            ShoppingListItemSwipeCallback shoppingListItemSwipeCallback = this.m;
            shoppingListItemSwipeCallback.getClass();
            Intrinsics.h(viewHolder, "viewHolder");
            EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) viewHolder;
            int i3 = (int) (this.j + this.h);
            int i4 = (int) (this.k + this.i);
            if (Math.abs(i4 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * 0.5f || Math.abs(i3 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * 0.5f) {
                ArrayList arrayList = this.u;
                if (arrayList == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    arrayList.clear();
                    this.v.clear();
                }
                int iRound = Math.round(this.j + this.h);
                int iRound2 = Math.round(this.k + this.i);
                int width = viewHolder.itemView.getWidth() + iRound;
                int height = viewHolder.itemView.getHeight() + iRound2;
                int i5 = (iRound + width) / 2;
                int i6 = (iRound2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.r.getLayoutManager();
                int iZ = layoutManager.z();
                int i7 = 0;
                while (i7 < iZ) {
                    int i8 = i5;
                    View viewY = layoutManager.y(i7);
                    int i9 = i7;
                    if (viewY != viewHolder.itemView && viewY.getBottom() >= iRound2 && viewY.getTop() <= height && viewY.getRight() >= iRound && viewY.getLeft() <= width) {
                        RecyclerView.ViewHolder target = this.r.O(viewY);
                        i = iRound;
                        RecyclerView recyclerView = this.r;
                        i2 = iRound2;
                        RecyclerView.ViewHolder current = this.c;
                        Intrinsics.h(recyclerView, "recyclerView");
                        Intrinsics.h(current, "current");
                        Intrinsics.h(target, "target");
                        EpoxyViewHolder epoxyViewHolder2 = (EpoxyViewHolder) target;
                        shoppingListItemSwipeCallback.getClass();
                        epoxyViewHolder2.c();
                        if (shoppingListItemSwipeCallback.q(epoxyViewHolder2.f13318a)) {
                            int iAbs = Math.abs(i8 - ((viewY.getRight() + viewY.getLeft()) / 2));
                            int iAbs2 = Math.abs(i6 - ((viewY.getBottom() + viewY.getTop()) / 2));
                            int i10 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                            int size = this.u.size();
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < size) {
                                int i13 = size;
                                if (i10 <= ((Integer) this.v.get(i11)).intValue()) {
                                    break;
                                }
                                i12++;
                                i11++;
                                size = i13;
                            }
                            this.u.add(i12, target);
                            this.v.add(i12, Integer.valueOf(i10));
                        }
                    } else {
                        i = iRound;
                        i2 = iRound2;
                    }
                    i7 = i9 + 1;
                    i5 = i8;
                    iRound = i;
                    iRound2 = i2;
                }
                ArrayList arrayList2 = this.u;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderB = shoppingListItemSwipeCallback.b(viewHolder, arrayList2, i3, i4);
                if (viewHolderB == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderB.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                RecyclerView recyclerView2 = this.r;
                Intrinsics.h(recyclerView2, "recyclerView");
                EpoxyViewHolder epoxyViewHolder3 = (EpoxyViewHolder) viewHolderB;
                EpoxyController epoxyController = shoppingListItemSwipeCallback.d;
                if (epoxyController == null) {
                    throw new IllegalStateException("A controller must be provided in the constructor if dragging is enabled");
                }
                epoxyController.moveModel(epoxyViewHolder.getAdapterPosition(), epoxyViewHolder3.getAdapterPosition());
                epoxyViewHolder.c();
                EpoxyModel epoxyModel = epoxyViewHolder.f13318a;
                if (shoppingListItemSwipeCallback.q(epoxyModel)) {
                    shoppingListItemSwipeCallback.t();
                    this.m.i(this.r, viewHolder, absoluteAdapterPosition2, viewHolderB, absoluteAdapterPosition, i3, i4);
                } else {
                    throw new IllegalStateException("A model was dragged that is not a valid target: " + epoxyModel.getClass());
                }
            }
        }
    }

    public final void r(View view) {
        if (view == this.w) {
            this.w = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.s(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public final void t(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(BitmapDescriptorFactory.HUE_RED, f);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(BitmapDescriptorFactory.HUE_RED, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(BitmapDescriptorFactory.HUE_RED, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(BitmapDescriptorFactory.HUE_RED, this.i);
        }
    }
}
