package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final AspectRatioUpdateDispatcher d;
    public AspectRatioListener e;
    public float f;
    public int g;

    public interface AspectRatioListener {
        void a();
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {
        public boolean d;

        public AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d = false;
            AspectRatioListener aspectRatioListener = AspectRatioFrameLayout.this.e;
            if (aspectRatioListener == null) {
                return;
            }
            aspectRatioListener.a();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher = this.d;
        if (fAbs <= 0.01f) {
            aspectRatioUpdateDispatcher.getClass();
            if (aspectRatioUpdateDispatcher.d) {
                return;
            }
            aspectRatioUpdateDispatcher.d = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
            return;
        }
        int i3 = this.g;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f;
                } else if (i3 == 4) {
                    if (f5 > BitmapDescriptorFactory.HUE_RED) {
                        f = this.f;
                    } else {
                        f2 = this.f;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > BitmapDescriptorFactory.HUE_RED) {
            f2 = this.f;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f;
            measuredWidth = (int) (f4 * f);
        }
        aspectRatioUpdateDispatcher.getClass();
        if (!aspectRatioUpdateDispatcher.d) {
            aspectRatioUpdateDispatcher.d = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f != f) {
            this.f = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.e = aspectRatioListener;
    }

    public void setResizeMode(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f3459a, 0, 0);
            try {
                this.g = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.d = new AspectRatioUpdateDispatcher();
    }
}
