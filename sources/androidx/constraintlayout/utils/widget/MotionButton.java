package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class MotionButton extends AppCompatButton {
    public float d;
    public float e;
    public Path f;
    public ViewOutlineProvider g;
    public RectF h;

    public MotionButton(Context context) {
        super(context);
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.e;
    }

    public float getRoundPercent() {
        return this.d;
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.e = f;
            float f2 = this.d;
            this.d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.e != f;
        this.e = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        MotionButton motionButton = MotionButton.this;
                        outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.e);
                    }
                };
                this.g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.f.reset();
            Path path = this.f;
            RectF rectF = this.h;
            float f3 = this.e;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.d != f;
        this.d = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        MotionButton motionButton = MotionButton.this;
                        outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), (Math.min(r3, r4) * motionButton.d) / 2.0f);
                    }
                };
                this.g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.d) / 2.0f;
            this.h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.f.reset();
            this.f.addRoundRect(this.h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = Float.NaN;
        a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = Float.NaN;
        a(context, attributeSet);
    }
}
