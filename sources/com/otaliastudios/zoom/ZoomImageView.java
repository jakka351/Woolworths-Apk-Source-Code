package com.otaliastudios.zoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b \u0010\u0019J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b&\u0010\u0019J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b,\u0010\u0019J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b.\u0010\u0019J\u0018\u0010/\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b/\u0010\u0019J\u0018\u00101\u001a\u00020\u00132\u0006\u0010(\u001a\u000200H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b3\u0010\u0019J\u0018\u00104\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b4\u0010\u0019J\u0018\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b6\u0010\u0015J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b7\u0010\u0019J\u0018\u00108\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b8\u0010\u0019J\u0018\u00109\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b9\u0010\u0019J\u0019\u0010<\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010\u0010R\u0014\u0010G\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010\u0010R\u0014\u0010I\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010\u0010R\u0014\u0010K\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010\u0010R\u0014\u0010M\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010\u0010R\u0014\u0010O\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010\u0010R\u0014\u0010S\u001a\u00020P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/otaliastudios/zoom/ZoomImageView;", "Landroid/widget/ImageView;", "Lcom/otaliastudios/zoom/ZoomApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMaxZoomType", "()I", "getMinZoomType", "", "getMaxZoom", "()F", "getMinZoom", "alignment", "", "setAlignment", "(I)V", "", "allow", "setAllowFlingInOverscroll", "(Z)V", "", "duration", "setAnimationDuration", "(J)V", "enabled", "setFlingEnabled", "setHorizontalPanEnabled", "maxZoom", "setMaxZoom", "(F)V", "minZoom", "setMinZoom", "setOneFingerScrollEnabled", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "setOverPanRange", "(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V", "overPinchable", "setOverPinchable", "overScroll", "setOverScrollHorizontal", "setOverScrollVertical", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "setOverZoomRange", "(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V", "setScrollEnabled", "setThreeFingersScrollEnabled", "transformation", "setTransformation", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/otaliastudios/zoom/ZoomEngine;", "d", "Lcom/otaliastudios/zoom/ZoomEngine;", "getEngine", "()Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "getPanX", "panX", "getPanY", "panY", "getRealZoom", "realZoom", "getScaledPanX", "scaledPanX", "getScaledPanY", "scaledPanY", "getZoom", "zoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "getPan", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "getScaledPan", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint
/* loaded from: classes6.dex */
public class ZoomImageView extends ImageView implements ZoomApi {

    /* renamed from: d, reason: from kotlin metadata */
    public final ZoomEngine engine;
    public final Matrix e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ZoomImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
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

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (getWidth() != getMeasuredWidth() || getHeight() != getMeasuredHeight()) {
            setImageMatrix(this.e);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.engine.k(getWidth(), getHeight(), true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        return super.onTouchEvent(ev) | this.engine.h(ev);
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

    public void setHorizontalPanEnabled(boolean enabled) {
        this.engine.j.e = enabled;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
                throw new IllegalArgumentException("Drawables without intrinsic dimensions (such as a solid color) are not supported");
            }
            this.engine.l(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), false);
        }
        super.setImageDrawable(drawable);
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
    public ZoomImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ZoomImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public ZoomImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        Intrinsics.h(context, "context");
        ZoomEngine zoomEngine = new ZoomEngine(context);
        super(context, attributeSet, i);
        this.engine = zoomEngine;
        Matrix matrix = new Matrix();
        this.e = matrix;
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
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.8f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(9, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(7, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(16, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(17, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 51);
        long j = typedArrayObtainStyledAttributes.getInt(2, 280);
        typedArrayObtainStyledAttributes.recycle();
        zoomEngine.j(this);
        zoomEngine.b(new ZoomEngine.Listener() { // from class: com.otaliastudios.zoom.ZoomImageView.1
            @Override // com.otaliastudios.zoom.ZoomEngine.Listener
            public final void a(ZoomEngine zoomEngine2, Matrix matrix2) {
                ZoomImageView zoomImageView = ZoomImageView.this;
                Matrix matrix3 = zoomImageView.e;
                matrix3.set(matrix2);
                zoomImageView.setImageMatrix(matrix3);
                zoomImageView.awakenScrollBars();
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
        zoomEngine.n(f, integer);
        zoomEngine.m(f2, integer2);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
