package io.github.douglasjunior.androidSimpleTooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import au.com.woolworths.product.details.epoxy.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public class SimpleTooltip implements PopupWindow.OnDismissListener {
    public final Context d;
    public a e;
    public PopupWindow f;
    public final int g;
    public final int h;
    public final View i;
    public final LinearLayout j;
    public final View k;
    public View l;
    public ViewGroup m;
    public final ImageView n;
    public final boolean o;
    public AnimatorSet p;
    public final float q;
    public final float r;
    public final long s;
    public boolean t = false;
    public final View.OnTouchListener u = new View.OnTouchListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.3
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            SimpleTooltip.this.getClass();
            return false;
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener v = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.4
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SimpleTooltip simpleTooltip = SimpleTooltip.this;
            PopupWindow popupWindow = simpleTooltip.f;
            if (popupWindow == null || simpleTooltip.t) {
                return;
            }
            SimpleTooltipUtils.c(popupWindow.getContentView(), this);
            popupWindow.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(simpleTooltip.w);
            float f = simpleTooltip.q;
            PointF pointF = new PointF();
            RectF rectFA = SimpleTooltipUtils.a(simpleTooltip.k);
            PointF pointF2 = new PointF(rectFA.centerX(), rectFA.centerY());
            int i = simpleTooltip.g;
            if (i == 17) {
                pointF.x = pointF2.x - (simpleTooltip.f.getContentView().getWidth() / 2.0f);
                pointF.y = pointF2.y - (simpleTooltip.f.getContentView().getHeight() / 2.0f);
            } else if (i == 48) {
                pointF.x = pointF2.x - (simpleTooltip.f.getContentView().getWidth() / 2.0f);
                pointF.y = (rectFA.top - simpleTooltip.f.getContentView().getHeight()) - f;
            } else if (i == 80) {
                pointF.x = pointF2.x - (simpleTooltip.f.getContentView().getWidth() / 2.0f);
                pointF.y = rectFA.bottom + f;
            } else if (i == 8388611) {
                pointF.x = (rectFA.left - simpleTooltip.f.getContentView().getWidth()) - f;
                pointF.y = pointF2.y - (simpleTooltip.f.getContentView().getHeight() / 2.0f);
            } else {
                if (i != 8388613) {
                    throw new IllegalArgumentException("Gravity must have be CENTER, START, END, TOP or BOTTOM.");
                }
                pointF.x = rectFA.right + f;
                pointF.y = pointF2.y - (simpleTooltip.f.getContentView().getHeight() / 2.0f);
            }
            popupWindow.setClippingEnabled(true);
            popupWindow.update((int) pointF.x, (int) pointF.y, popupWindow.getWidth(), popupWindow.getHeight());
            popupWindow.getContentView().requestLayout();
            View view = new View(simpleTooltip.d);
            simpleTooltip.l = view;
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            simpleTooltip.l.setOnTouchListener(simpleTooltip.u);
            simpleTooltip.m.addView(simpleTooltip.l);
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener w = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.5
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            float fWidth;
            float top;
            SimpleTooltip simpleTooltip = SimpleTooltip.this;
            int i = simpleTooltip.h;
            PopupWindow popupWindow = simpleTooltip.f;
            if (popupWindow == null || simpleTooltip.t) {
                return;
            }
            SimpleTooltipUtils.c(popupWindow.getContentView(), this);
            popupWindow.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(simpleTooltip.y);
            popupWindow.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(simpleTooltip.x);
            RectF rectFB = SimpleTooltipUtils.b(simpleTooltip.k);
            RectF rectFB2 = SimpleTooltipUtils.b(simpleTooltip.j);
            if (i == 1 || i == 3) {
                float paddingLeft = (Resources.getSystem().getDisplayMetrics().density * 2.0f) + simpleTooltip.j.getPaddingLeft();
                float fWidth2 = ((rectFB2.width() / 2.0f) - (simpleTooltip.n.getWidth() / 2.0f)) - (rectFB2.centerX() - rectFB.centerX());
                fWidth = fWidth2 > paddingLeft ? (((float) simpleTooltip.n.getWidth()) + fWidth2) + paddingLeft > rectFB2.width() ? (rectFB2.width() - simpleTooltip.n.getWidth()) - paddingLeft : fWidth2 : paddingLeft;
                top = simpleTooltip.n.getTop() + (i != 3 ? 1 : -1);
            } else {
                top = (Resources.getSystem().getDisplayMetrics().density * 2.0f) + simpleTooltip.j.getPaddingTop();
                float fHeight = ((rectFB2.height() / 2.0f) - (simpleTooltip.n.getHeight() / 2.0f)) - (rectFB2.centerY() - rectFB.centerY());
                if (fHeight > top) {
                    top = (((float) simpleTooltip.n.getHeight()) + fHeight) + top > rectFB2.height() ? (rectFB2.height() - simpleTooltip.n.getHeight()) - top : fHeight;
                }
                fWidth = simpleTooltip.n.getLeft() + (i != 2 ? 1 : -1);
            }
            simpleTooltip.n.setX((int) fWidth);
            simpleTooltip.n.setY((int) top);
            popupWindow.getContentView().requestLayout();
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener x = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.6
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SimpleTooltip simpleTooltip = SimpleTooltip.this;
            PopupWindow popupWindow = simpleTooltip.f;
            if (popupWindow == null || simpleTooltip.t) {
                return;
            }
            SimpleTooltipUtils.c(popupWindow.getContentView(), this);
            simpleTooltip.j.setVisibility(0);
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener y = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.7
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            final SimpleTooltip simpleTooltip = SimpleTooltip.this;
            PopupWindow popupWindow = simpleTooltip.f;
            if (popupWindow == null || simpleTooltip.t) {
                return;
            }
            SimpleTooltipUtils.c(popupWindow.getContentView(), this);
            if (simpleTooltip.o) {
                long j = simpleTooltip.s;
                float f = simpleTooltip.r;
                int i = simpleTooltip.g;
                String str = (i == 48 || i == 80) ? "translationY" : "translationX";
                float f2 = -f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(simpleTooltip.j, str, f2, f);
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(simpleTooltip.j, str, f, f2);
                objectAnimatorOfFloat2.setDuration(j);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                simpleTooltip.p = animatorSet;
                animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                simpleTooltip.p.addListener(new AnimatorListenerAdapter() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.8
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        PopupWindow popupWindow2;
                        SimpleTooltip simpleTooltip2 = SimpleTooltip.this;
                        if (simpleTooltip2.t || (popupWindow2 = simpleTooltip2.f) == null || !popupWindow2.isShowing()) {
                            return;
                        }
                        animator.start();
                    }
                });
                simpleTooltip.p.start();
            }
            popupWindow.getContentView().requestLayout();
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener z = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.9
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SimpleTooltip simpleTooltip = SimpleTooltip.this;
            if (simpleTooltip.f == null || simpleTooltip.t || simpleTooltip.m.isShown() || simpleTooltip.t) {
                return;
            }
            simpleTooltip.t = true;
            PopupWindow popupWindow = simpleTooltip.f;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    };

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f23915a;
        public View b;
        public View e;
        public ArrowDrawable i;
        public a n;
        public long o;
        public int p;
        public int q;
        public int r;
        public float s;
        public float t;
        public int c = android.R.id.text1;
        public String d = "";
        public int f = 4;
        public int g = 80;
        public float h = -1.0f;
        public boolean j = false;
        public float k = -1.0f;
        public float l = -1.0f;
        public float m = -1.0f;
        public int u = 0;

        public Builder(Context context) {
            this.f23915a = context;
        }
    }

    public interface OnDismissListener {
    }

    public interface OnShowListener {
    }

    public SimpleTooltip(Builder builder) {
        Context context = builder.f23915a;
        this.d = context;
        this.g = builder.g;
        int i = builder.f;
        this.h = i;
        View view = builder.b;
        this.i = view;
        int i2 = builder.c;
        String str = builder.d;
        View view2 = builder.e;
        this.k = view2;
        float f = builder.t;
        float f2 = builder.s;
        ArrowDrawable arrowDrawable = builder.i;
        boolean z = builder.j;
        this.o = z;
        this.q = builder.k;
        float f3 = builder.l;
        float f4 = builder.m;
        this.r = f4;
        this.s = builder.o;
        this.e = builder.n;
        ViewGroup viewGroup = (ViewGroup) view2.getRootView();
        if (viewGroup.getChildCount() == 1 && (viewGroup.getChildAt(0) instanceof FrameLayout)) {
            viewGroup = (ViewGroup) viewGroup.getChildAt(0);
        }
        this.m = viewGroup;
        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, android.R.attr.popupWindowStyle);
        this.f = popupWindow;
        popupWindow.setOnDismissListener(this);
        this.f.setWidth(-2);
        this.f.setHeight(-2);
        int i3 = 0;
        this.f.setBackgroundDrawable(new ColorDrawable(0));
        this.f.setOutsideTouchable(true);
        this.f.setTouchable(true);
        this.f.setTouchInterceptor(new View.OnTouchListener() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                motionEvent.getX();
                motionEvent.getY();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                SimpleTooltip simpleTooltip = SimpleTooltip.this;
                if (!simpleTooltip.t) {
                    simpleTooltip.t = true;
                    PopupWindow popupWindow2 = simpleTooltip.f;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
                return true;
            }
        });
        this.f.setClippingEnabled(false);
        this.f.setFocusable(false);
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
        } else {
            TextView textView = (TextView) view.findViewById(i2);
            if (textView != null) {
                textView.setText(str);
            }
        }
        int i4 = (int) f3;
        view.setPadding(i4, i4, i4, i4);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        if (i != 0 && i != 2) {
            i3 = 1;
        }
        linearLayout.setOrientation(i3);
        int i5 = (int) (z ? f4 : 0.0f);
        linearLayout.setPadding(i5, i5, i5, i5);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageDrawable(arrowDrawable);
        LinearLayout.LayoutParams layoutParams = (i == 1 || i == 3) ? new LinearLayout.LayoutParams((int) f, (int) f2, BitmapDescriptorFactory.HUE_RED) : new LinearLayout.LayoutParams((int) f2, (int) f, BitmapDescriptorFactory.HUE_RED);
        layoutParams.gravity = 17;
        this.n.setLayoutParams(layoutParams);
        if (i == 3 || i == 2) {
            linearLayout.addView(view);
            linearLayout.addView(this.n);
        } else {
            linearLayout.addView(this.n);
            linearLayout.addView(view);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, BitmapDescriptorFactory.HUE_RED);
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        this.j = linearLayout;
        linearLayout.setVisibility(4);
        this.f.setContentView(this.j);
    }

    public final void a() {
        if (this.t) {
            throw new IllegalArgumentException("Tooltip has been dismissed.");
        }
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(this.v);
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(this.z);
        this.m.post(new Runnable() { // from class: io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.2
            @Override // java.lang.Runnable
            public final void run() {
                SimpleTooltip simpleTooltip = SimpleTooltip.this;
                if (!simpleTooltip.m.isShown()) {
                    Log.e("SimpleTooltip", "Tooltip cannot be shown, root view is invalid or has been closed.");
                    return;
                }
                PopupWindow popupWindow = simpleTooltip.f;
                ViewGroup viewGroup = simpleTooltip.m;
                popupWindow.showAtLocation(viewGroup, 0, viewGroup.getWidth(), simpleTooltip.m.getHeight());
            }
        });
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        this.t = true;
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.p.end();
            this.p.cancel();
            this.p = null;
        }
        ViewGroup viewGroup = this.m;
        if (viewGroup != null && (view = this.l) != null) {
            viewGroup.removeView(view);
        }
        this.m = null;
        this.l = null;
        a aVar = this.e;
        if (aVar != null) {
            ((Function0) aVar.e).invoke();
        }
        this.e = null;
        SimpleTooltipUtils.c(this.f.getContentView(), this.v);
        SimpleTooltipUtils.c(this.f.getContentView(), this.w);
        SimpleTooltipUtils.c(this.f.getContentView(), this.x);
        SimpleTooltipUtils.c(this.f.getContentView(), this.y);
        SimpleTooltipUtils.c(this.f.getContentView(), this.z);
        this.f = null;
    }
}
