package au.com.woolworths.android.onesite.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import au.com.woolworths.android.onesite.base.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/ui/ConstraintLayoutWithShadow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintLayoutWithShadow extends ConstraintLayout {
    public Bitmap d;
    public final Paint e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/ui/ConstraintLayoutWithShadow$Companion;", "", "", "DEFAULT_SHADOW_SIZE", "F", "DEFAULT_SHADOW_DX", "DEFAULT_SHADOW_DY", "DEFAULT_SHADOW_ALPHA", "", "ALPHA_BASE", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayoutWithShadow(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.e);
            } else {
                Intrinsics.p("shadowBitmap");
                throw null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayoutWithShadow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ConstraintLayoutWithShadow(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayoutWithShadow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        Paint paint = new Paint();
        this.e = paint;
        this.f = 22.0f;
        this.i = 21;
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.f4224a, 0, 0);
            try {
                this.f = typedArrayObtainStyledAttributes.getDimension(3, 22.0f);
                this.g = typedArrayObtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
                this.h = typedArrayObtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
                this.i = (int) Math.ceil(typedArrayObtainStyledAttributes.getFraction(0, 255, 255, 21.0f));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, paint);
        paint.setShadowLayer(this.f, this.g, this.h, Color.argb(this.i, 0, 0, 0));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.android.onesite.ui.ConstraintLayoutWithShadow$initLayoutListener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ConstraintLayoutWithShadow constraintLayoutWithShadow = this.d;
                if (constraintLayoutWithShadow.isLaidOut()) {
                    constraintLayoutWithShadow.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    if (!constraintLayoutWithShadow.isLaidOut()) {
                        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(constraintLayoutWithShadow.getWidth(), constraintLayoutWithShadow.getHeight(), config);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.translate(-constraintLayoutWithShadow.getScrollX(), -constraintLayoutWithShadow.getScrollY());
                    constraintLayoutWithShadow.draw(canvas);
                    constraintLayoutWithShadow.d = bitmapCreateBitmap.extractAlpha();
                }
            }
        });
    }
}
