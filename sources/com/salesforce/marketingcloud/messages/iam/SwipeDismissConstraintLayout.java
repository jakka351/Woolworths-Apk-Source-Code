package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.R;
import java.util.WeakHashMap;

@MCKeep
@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class SwipeDismissConstraintLayout extends ConstraintLayout {
    private static final float DRAG_SENSITIVITY = 1.0f;
    ViewDragHelper dragHelper;
    int draggingState;
    SwipeDismissListener listener;
    float minScaledFlingVelocity;
    View swipeTarget;
    private int swipeTargetId;

    @MCKeep
    @RestrictTo
    public interface SwipeDismissListener {
        void onDismissed();

        void onSwipeStarted();

        void onViewSettled();
    }

    public class a extends ViewDragHelper.Callback {

        /* renamed from: a, reason: collision with root package name */
        private int f16993a;

        public a() {
        }

        private boolean a(View view, float f) {
            if (Math.abs(f) > SwipeDismissConstraintLayout.this.minScaledFlingVelocity) {
                int left = view.getLeft();
                int i = this.f16993a;
                if (left < i && f < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
                if (left > i && f > BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return MathUtils.b(this.f16993a - view.getWidth(), i, view.getWidth() + this.f16993a);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i) {
            this.f16993a = (int) ((SwipeDismissConstraintLayout.this.getWidth() - view.getWidth()) * 0.5f);
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
            if (swipeDismissListener != null) {
                swipeDismissListener.onSwipeStarted();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            SwipeDismissConstraintLayout.this.draggingState = i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            boolean z;
            int width = view.getWidth();
            if (a(view, f)) {
                int x = (int) (this.f16993a - SwipeDismissConstraintLayout.this.getX());
                int left = view.getLeft();
                int i2 = this.f16993a;
                i = left < i2 ? (i2 - width) - x : i2 + width + x;
                z = true;
            } else {
                i = this.f16993a;
                z = false;
            }
            if (SwipeDismissConstraintLayout.this.dragHelper.t(i, view.getTop())) {
                b bVar = SwipeDismissConstraintLayout.this.new b(view, z);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.postOnAnimation(bVar);
            } else {
                SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
                if (swipeDismissListener != null) {
                    if (z) {
                        swipeDismissListener.onDismissed();
                    } else {
                        swipeDismissListener.onViewSettled();
                    }
                }
            }
            SwipeDismissConstraintLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i) {
            return view == SwipeDismissConstraintLayout.this.swipeTarget;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f16994a;
        private final boolean b;

        public b(View view, boolean z) {
            this.f16994a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = SwipeDismissConstraintLayout.this.dragHelper;
            if (viewDragHelper != null && viewDragHelper.h()) {
                View view = this.f16994a;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.postOnAnimation(this);
                return;
            }
            SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
            if (swipeDismissListener != null) {
                if (this.b) {
                    swipeDismissListener.onDismissed();
                } else {
                    swipeDismissListener.onViewSettled();
                }
            }
        }
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SwipeDismissConstraintLayout, 0, 0);
        try {
            this.swipeTargetId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SwipeDismissConstraintLayout_swipeTargetId, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.dragHelper = ViewDragHelper.i(this, 1.0f, new a());
            this.minScaledFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean isTarget(MotionEvent motionEvent) {
        int i;
        View view = this.swipeTarget;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i2 = iArr[0];
        return rawX > i2 && rawX < this.swipeTarget.getMeasuredWidth() + i2 && rawY > (i = iArr[1]) && rawY < this.swipeTarget.getMeasuredWidth() + i;
    }

    public boolean isMoving() {
        int i = this.draggingState;
        return i == 1 || i == 2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        this.swipeTarget = findViewById(this.swipeTargetId);
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isTarget(motionEvent) && this.dragHelper.u(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isTarget(motionEvent) && !isMoving()) {
            return super.onTouchEvent(motionEvent);
        }
        this.dragHelper.n(motionEvent);
        return true;
    }

    public void setListener(SwipeDismissListener swipeDismissListener) {
        this.listener = swipeDismissListener;
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
