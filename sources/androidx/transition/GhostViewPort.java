package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;

@SuppressLint
/* loaded from: classes2.dex */
class GhostViewPort extends ViewGroup implements GhostView {
    public static final /* synthetic */ int j = 0;
    public ViewGroup d;
    public View e;
    public final View f;
    public int g;
    public Matrix h;
    public final ViewTreeObserver.OnPreDrawListener i;

    public GhostViewPort(View view) {
        super(view.getContext());
        this.i = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                View view2;
                GhostViewPort ghostViewPort = GhostViewPort.this;
                ghostViewPort.postInvalidateOnAnimation();
                ViewGroup viewGroup = ghostViewPort.d;
                if (viewGroup == null || (view2 = ghostViewPort.e) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view2);
                ghostViewPort.d.postInvalidateOnAnimation();
                ghostViewPort.d = null;
                ghostViewPort.e = null;
                return true;
            }
        };
        this.f = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // androidx.transition.GhostView
    public final void a(View view, ViewGroup viewGroup) {
        this.d = viewGroup;
        this.e = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f;
        view.setTag(com.woolworths.R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.i);
        ViewUtils.c(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f;
        view.getViewTreeObserver().removeOnPreDrawListener(this.i);
        ViewUtils.c(0, view);
        view.setTag(com.woolworths.R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.a(canvas, true);
        canvas.setMatrix(this.h);
        View view = this.f;
        ViewUtils.c(0, view);
        view.invalidate();
        ViewUtils.c(4, view);
        drawChild(canvas, view, getDrawingTime());
        CanvasUtils.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, androidx.transition.GhostView
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f;
        if (((GhostViewPort) view.getTag(com.woolworths.R.id.ghost_view)) == this) {
            ViewUtils.c(i == 0 ? 4 : 0, view);
        }
    }
}
