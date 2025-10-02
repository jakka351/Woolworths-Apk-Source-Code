package com.otaliastudios.zoom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.internal.StateController;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b \u0010\u001aJ\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b&\u0010$J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0018\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b/\u0010\u001aJ\u0018\u00100\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b0\u0010\u001aJ\u0018\u00102\u001a\u00020\u00142\u0006\u0010)\u001a\u000201H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b4\u0010\u001aJ\u0018\u00105\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b5\u0010\u001aJ\u0018\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b7\u0010\u0016J\u0018\u00108\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b8\u0010\u001aJ\u0018\u00109\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b9\u0010\u001aJ\u0018\u0010:\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b:\u0010\u001aJ\u0015\u0010<\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0017¢\u0006\u0004\b<\u0010\u001aR\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\u0011R\u0014\u0010F\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010\u0011R\u0014\u0010H\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010\u0011R\u0014\u0010J\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010\u0011R\u0014\u0010L\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010\u0011R\u0014\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010\u0011R\u0014\u0010R\u001a\u00020O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/otaliastudios/zoom/ZoomApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMaxZoomType", "()I", "getMinZoomType", "", "getMaxZoom", "()F", "getMinZoom", "alignment", "", "setAlignment", "(I)V", "", "allow", "setAllowFlingInOverscroll", "(Z)V", "", "duration", "setAnimationDuration", "(J)V", "enabled", "setFlingEnabled", "setHorizontalPanEnabled", "maxZoom", "setMaxZoom", "(F)V", "minZoom", "setMinZoom", "setOneFingerScrollEnabled", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "setOverPanRange", "(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V", "overPinchable", "setOverPinchable", "overScroll", "setOverScrollHorizontal", "setOverScrollVertical", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "setOverZoomRange", "(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V", "setScrollEnabled", "setThreeFingersScrollEnabled", "transformation", "setTransformation", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "hasClickableChildren", "setHasClickableChildren", "Lcom/otaliastudios/zoom/ZoomEngine;", "d", "Lcom/otaliastudios/zoom/ZoomEngine;", "getEngine", "()Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "getPanX", "panX", "getPanY", "panY", "getRealZoom", "realZoom", "getScaledPanX", "scaledPanX", "getScaledPanY", "scaledPanY", "getZoom", "zoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "getPan", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "getScaledPan", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class ZoomLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ZoomApi {
    public static final ZoomLogger f = new ZoomLogger("ZoomLayout");

    /* renamed from: d, reason: from kotlin metadata */
    public final ZoomEngine engine;
    public boolean e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLayout$Companion;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ZoomLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public final void a() {
        if (!this.e) {
            invalidate();
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setPivotX(BitmapDescriptorFactory.HUE_RED);
            childAt.setPivotY(BitmapDescriptorFactory.HUE_RED);
            ZoomEngine zoomEngine = this.engine;
            MatrixController matrixController = zoomEngine.l;
            MatrixController matrixController2 = zoomEngine.l;
            childAt.setTranslationX(matrixController.e.left);
            childAt.setTranslationY(matrixController2.e.top);
            childAt.setScaleX(matrixController2.g());
            childAt.setScaleY(matrixController2.g());
        }
        if ((isHorizontalScrollBarEnabled() || isVerticalScrollBarEnabled()) && !awakenScrollBars()) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        Intrinsics.h(child, "child");
        Intrinsics.h(params, "params");
        if (getChildCount() > 0) {
            throw new RuntimeException(Intrinsics.m(" accepts only a single child.", "ZoomLayout"));
        }
        super.addView(child, i, params);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return (int) (-this.engine.l.e.left);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return (int) this.engine.l.e.width();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return (int) (-this.engine.l.e.top);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return (int) this.engine.l.e.height();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(child, "child");
        if (this.e) {
            return super.drawChild(canvas, child, j);
        }
        int iSave = canvas.save();
        MatrixController matrixController = this.engine.l;
        Matrix matrix = matrixController.i;
        matrix.set(matrixController.g);
        canvas.concat(matrix);
        boolean zDrawChild = super.drawChild(canvas, child, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @NotNull
    public final ZoomEngine getEngine() {
        return this.engine;
    }

    public float getMaxZoom() {
        return this.engine.k.f;
    }

    public int getMaxZoomType() {
        return this.engine.k.g;
    }

    public float getMinZoom() {
        return this.engine.k.d;
    }

    public int getMinZoomType() {
        return this.engine.k.e;
    }

    @NotNull
    public AbsolutePoint getPan() {
        return this.engine.e();
    }

    public float getPanX() {
        return this.engine.l.d();
    }

    public float getPanY() {
        return this.engine.l.e();
    }

    public float getRealZoom() {
        return this.engine.l.g();
    }

    @NotNull
    public ScaledPoint getScaledPan() {
        return this.engine.f();
    }

    public float getScaledPanX() {
        return this.engine.l.e.left;
    }

    public float getScaledPanY() {
        return this.engine.l.e.top;
    }

    public float getZoom() {
        return this.engine.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        this.engine.l(childAt.getWidth(), childAt.getHeight(), false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.getClass();
        StateController stateController = zoomEngine.i;
        stateController.getClass();
        return stateController.a(ev) > 1 || (this.e && super.onInterceptTouchEvent(ev));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException(Intrinsics.m(" must be used with fixed dimensions (e.g. match_parent)", "ZoomLayout"));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measureChildren(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        if (this.engine.h(ev)) {
            return true;
        }
        return this.e && super.onTouchEvent(ev);
    }

    public void setAlignment(int alignment) {
        this.engine.j.g = alignment;
    }

    public void setAllowFlingInOverscroll(boolean allow) {
        this.engine.m.p = allow;
    }

    public void setAnimationDuration(long duration) {
        this.engine.l.n = duration;
    }

    public void setFlingEnabled(boolean enabled) {
        this.engine.m.k = enabled;
    }

    public final void setHasClickableChildren(boolean hasClickableChildren) {
        f.b("setHasClickableChildren:", "old:", Boolean.valueOf(this.e), "new:", Boolean.valueOf(hasClickableChildren));
        if (this.e && !hasClickableChildren && getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            childAt.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            childAt.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        this.e = hasClickableChildren;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        if (this.e) {
            a();
        } else {
            invalidate();
        }
    }

    public void setHorizontalPanEnabled(boolean enabled) {
        this.engine.j.e = enabled;
    }

    public void setMaxZoom(float maxZoom) {
        this.engine.m(maxZoom, 0);
    }

    public void setMinZoom(float minZoom) {
        this.engine.n(minZoom, 0);
    }

    public void setOneFingerScrollEnabled(boolean enabled) {
        this.engine.m.m = enabled;
    }

    public void setOverPanRange(@NotNull OverPanRangeProvider provider) {
        Intrinsics.h(provider, "provider");
        PanManager panManager = this.engine.j;
        panManager.getClass();
        panManager.h = provider;
    }

    public void setOverPinchable(boolean overPinchable) {
        this.engine.k.j = overPinchable;
    }

    public void setOverScrollHorizontal(boolean overScroll) {
        this.engine.j.c = overScroll;
    }

    public void setOverScrollVertical(boolean overScroll) {
        this.engine.j.d = overScroll;
    }

    public void setOverZoomRange(@NotNull OverZoomRangeProvider provider) {
        Intrinsics.h(provider, "provider");
        ZoomManager zoomManager = this.engine.k;
        zoomManager.getClass();
        zoomManager.h = provider;
    }

    public void setScrollEnabled(boolean enabled) {
        this.engine.m.l = enabled;
    }

    public void setThreeFingersScrollEnabled(boolean enabled) {
        this.engine.m.o = enabled;
    }

    public void setTransformation(int transformation) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.d = transformation;
        zoomEngine.e = 0;
    }

    public void setTwoFingersScrollEnabled(boolean enabled) {
        this.engine.m.n = enabled;
    }

    public void setVerticalPanEnabled(boolean enabled) {
        this.engine.j.f = enabled;
    }

    public void setZoomEnabled(boolean enabled) {
        this.engine.k.i = enabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ZoomLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ZoomLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public ZoomLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        Intrinsics.h(context, "context");
        ZoomEngine zoomEngine = new ZoomEngine(context);
        super(context, attributeSet, i);
        this.engine = zoomEngine;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f16811a, i, 0);
        Intrinsics.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, defStyleAttr, 0)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(13, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(19, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(11, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(14, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(10, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(18, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(15, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        float f2 = typedArrayObtainStyledAttributes.getFloat(8, 0.8f);
        float f3 = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(9, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(7, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(16, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(17, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 51);
        long j = typedArrayObtainStyledAttributes.getInt(2, 280);
        typedArrayObtainStyledAttributes.recycle();
        zoomEngine.j(this);
        zoomEngine.b(new ZoomEngine.Listener() { // from class: com.otaliastudios.zoom.ZoomLayout.1
            @Override // com.otaliastudios.zoom.ZoomEngine.Listener
            public final void a(ZoomEngine zoomEngine2, Matrix matrix) {
                ZoomLogger zoomLogger = ZoomLayout.f;
                ZoomLayout.this.a();
            }

            @Override // com.otaliastudios.zoom.ZoomEngine.Listener
            public final void b(ZoomEngine zoomEngine2) {
            }
        });
        zoomEngine.d = integer3;
        zoomEngine.e = i2;
        setAlignment(i3);
        setOverScrollHorizontal(z);
        setOverScrollVertical(z2);
        setHorizontalPanEnabled(z3);
        setVerticalPanEnabled(z4);
        setOverPinchable(z5);
        setZoomEnabled(z6);
        setFlingEnabled(z7);
        setScrollEnabled(z8);
        setOneFingerScrollEnabled(z9);
        setTwoFingersScrollEnabled(z10);
        setThreeFingersScrollEnabled(z11);
        setAllowFlingInOverscroll(z12);
        setAnimationDuration(j);
        zoomEngine.n(f2, integer);
        zoomEngine.m(f3, integer2);
        setHasClickableChildren(z13);
        setWillNotDraw(false);
    }
}
