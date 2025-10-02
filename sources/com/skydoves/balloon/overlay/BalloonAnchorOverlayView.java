package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.skydoves.balloon.internals.ViewPropertyDelegate;
import com.skydoves.balloon.internals.ViewPropertyKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\u001eR+\u0010*\u001a\u00020$2\u0006\u0010\f\u001a\u00020$8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R/\u00101\u001a\u0004\u0018\u00010+2\b\u0010\f\u001a\u0004\u0018\u00010+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00108\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getStatusBarHeight", "()I", "<set-?>", "d", "Lcom/skydoves/balloon/internals/ViewPropertyDelegate;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "", "e", "getAnchorViewList", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", "f", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", "g", "getOverlayPaddingColor", "setOverlayPaddingColor", "overlayPaddingColor", "", "h", "getOverlayPadding", "()F", "setOverlayPadding", "(F)V", "overlayPadding", "Landroid/graphics/Point;", "i", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", "j", "getBalloonOverlayShape", "()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", "setBalloonOverlayShape", "(Lcom/skydoves/balloon/overlay/BalloonOverlayShape;)V", "balloonOverlayShape", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BalloonAnchorOverlayView extends View {
    public static final /* synthetic */ KProperty[] o;

    /* renamed from: d, reason: from kotlin metadata */
    public final ViewPropertyDelegate anchorView;

    /* renamed from: e, reason: from kotlin metadata */
    public final ViewPropertyDelegate anchorViewList;

    /* renamed from: f, reason: from kotlin metadata */
    public final ViewPropertyDelegate overlayColor;

    /* renamed from: g, reason: from kotlin metadata */
    public final ViewPropertyDelegate overlayPaddingColor;

    /* renamed from: h, reason: from kotlin metadata */
    public final ViewPropertyDelegate overlayPadding;

    /* renamed from: i, reason: from kotlin metadata */
    public final ViewPropertyDelegate overlayPosition;

    /* renamed from: j, reason: from kotlin metadata */
    public final ViewPropertyDelegate balloonOverlayShape;
    public Bitmap k;
    public final Paint l;
    public final Paint m;
    public boolean n;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        o = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0, reflectionFactory), b.y(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0, reflectionFactory), b.y(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0, reflectionFactory), b.y(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F", 0, reflectionFactory), b.y(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0, reflectionFactory), b.y(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0, reflectionFactory)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void a(View view, Canvas canvas) throws Resources.NotFoundException {
        RectF rectF;
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            if (getOverlayPosition() != null) {
                rectF = new RectF(r1.x - getOverlayPadding(), (r1.y - getOverlayPadding()) + getStatusBarHeight(), getOverlayPadding() + view.getWidth() + r1.x, getOverlayPadding() + view.getHeight() + r1.y + getStatusBarHeight());
            } else {
                rectF = new RectF(r0.left - getOverlayPadding(), r0.top - getOverlayPadding(), getOverlayPadding() + r0.right, getOverlayPadding() + r0.bottom);
            }
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            BalloonOverlayShape balloonOverlayShape = getBalloonOverlayShape();
            if (balloonOverlayShape instanceof BalloonOverlayEmpty) {
                return;
            }
            boolean z = balloonOverlayShape instanceof BalloonOverlayRect;
            Paint paint = this.m;
            Paint paint2 = this.l;
            if (z) {
                canvas.drawRect(rectF, paint2);
                canvas.drawRect(rectF2, paint);
                return;
            }
            if (balloonOverlayShape instanceof BalloonOverlayOval) {
                canvas.drawOval(rectF, paint2);
                canvas.drawOval(rectF2, paint);
                return;
            }
            if (balloonOverlayShape instanceof BalloonOverlayCircle) {
                return;
            }
            if (!(balloonOverlayShape instanceof BalloonOverlayRoundRect)) {
                throw new NoWhenBranchMatchedException();
            }
            BalloonOverlayRoundRect balloonOverlayRoundRect = (BalloonOverlayRoundRect) balloonOverlayShape;
            Pair pair = balloonOverlayRoundRect.f19024a;
            if (pair != null) {
                Object obj = pair.e;
                Number number = (Number) pair.d;
                Number number2 = (Number) obj;
                canvas.drawRoundRect(rectF, number.floatValue(), number2.floatValue(), paint2);
                canvas.drawRoundRect(rectF2, number.floatValue() - overlayPadding, number2.floatValue() - overlayPadding, paint);
            }
            Pair pair2 = balloonOverlayRoundRect.b;
            if (pair2 != null) {
                Object obj2 = pair2.e;
                Object obj3 = pair2.d;
                Context context = getContext();
                Intrinsics.g(context, "context");
                Number number3 = (Number) obj3;
                float dimension = context.getResources().getDimension(number3.intValue());
                Context context2 = getContext();
                Intrinsics.g(context2, "context");
                Number number4 = (Number) obj2;
                canvas.drawRoundRect(rectF, dimension, context2.getResources().getDimension(number4.intValue()), paint2);
                Context context3 = getContext();
                Intrinsics.g(context3, "context");
                float dimension2 = context3.getResources().getDimension(number3.intValue()) - overlayPadding;
                Context context4 = getContext();
                Intrinsics.g(context4, "context");
                canvas.drawRoundRect(rectF2, dimension2, context4.getResources().getDimension(number4.intValue()) - overlayPadding, paint);
            }
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) throws Resources.NotFoundException {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        if ((this.n || (bitmap = this.k) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.k;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.k = bitmapCreateBitmap;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            Paint paint = this.l;
            paint.setXfermode(porterDuffXfermode);
            paint.setColor(getOverlayColor());
            canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            int overlayPaddingColor = getOverlayPaddingColor();
            Paint paint2 = this.m;
            paint2.setColor(overlayPaddingColor);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList == null || anchorViewList.isEmpty()) {
                a(getAnchorView(), canvas2);
            } else {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        a((View) it.next(), canvas2);
                    }
                }
            }
            this.n = false;
        }
        Bitmap bitmap3 = this.k;
        if (bitmap3 == null || bitmap3.isRecycled() || canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmap3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    @Nullable
    public final View getAnchorView() {
        return (View) this.anchorView.getValue(this, o[0]);
    }

    @Nullable
    public final List<View> getAnchorViewList() {
        return (List) this.anchorViewList.getValue(this, o[1]);
    }

    @NotNull
    public final BalloonOverlayShape getBalloonOverlayShape() {
        return (BalloonOverlayShape) this.balloonOverlayShape.getValue(this, o[6]);
    }

    @ColorInt
    public final int getOverlayColor() {
        return ((Number) this.overlayColor.getValue(this, o[2])).intValue();
    }

    @Px
    public final float getOverlayPadding() {
        return ((Number) this.overlayPadding.getValue(this, o[4])).floatValue();
    }

    @ColorInt
    public final int getOverlayPaddingColor() {
        return ((Number) this.overlayPaddingColor.getValue(this, o[3])).intValue();
    }

    @Nullable
    public final Point getOverlayPosition() {
        return (Point) this.overlayPosition.getValue(this, o[5]);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n = true;
    }

    public final void setAnchorView(@Nullable View view) {
        this.anchorView.setValue(this, o[0], view);
    }

    public final void setAnchorViewList(@Nullable List<? extends View> list) {
        this.anchorViewList.setValue(this, o[1], list);
    }

    public final void setBalloonOverlayShape(@NotNull BalloonOverlayShape balloonOverlayShape) {
        Intrinsics.h(balloonOverlayShape, "<set-?>");
        this.balloonOverlayShape.setValue(this, o[6], balloonOverlayShape);
    }

    public final void setOverlayColor(int i) {
        this.overlayColor.setValue(this, o[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(float f) {
        this.overlayPadding.setValue(this, o[4], Float.valueOf(f));
    }

    public final void setOverlayPaddingColor(int i) {
        this.overlayPaddingColor.setValue(this, o[3], Integer.valueOf(i));
    }

    public final void setOverlayPosition(@Nullable Point point) {
        this.overlayPosition.setValue(this, o[5], point);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.anchorView = ViewPropertyKt.a(this, null);
        this.anchorViewList = ViewPropertyKt.a(this, null);
        this.overlayColor = ViewPropertyKt.a(this, 0);
        this.overlayPaddingColor = ViewPropertyKt.a(this, 0);
        this.overlayPadding = ViewPropertyKt.a(this, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        this.overlayPosition = ViewPropertyKt.a(this, null);
        this.balloonOverlayShape = ViewPropertyKt.a(this, BalloonOverlayOval.f19022a);
        Paint paint = new Paint(1);
        this.l = paint;
        Paint paint2 = new Paint(1);
        this.m = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }
}
