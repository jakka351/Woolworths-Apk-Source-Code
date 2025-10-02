package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class MockView extends View {
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public boolean g;
    public boolean h;
    public String i;
    public final Rect j;
    public int k;
    public int l;
    public int m;
    public int n;

    public MockView(Context context) {
        super(context);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = true;
        this.h = true;
        this.i = null;
        this.j = new Rect();
        this.k = Color.argb(255, 0, 0, 0);
        this.l = Color.argb(255, 200, 200, 200);
        this.m = Color.argb(255, 50, 50, 50);
        this.n = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.i = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                } else if (index == 0) {
                    this.k = typedArrayObtainStyledAttributes.getColor(index, this.k);
                } else if (index == 2) {
                    this.m = typedArrayObtainStyledAttributes.getColor(index, this.m);
                } else if (index == 3) {
                    this.l = typedArrayObtainStyledAttributes.getColor(index, this.l);
                } else if (index == 5) {
                    this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.i == null) {
            try {
                this.i = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.k;
        Paint paint = this.d;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.l;
        Paint paint2 = this.e;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f.setColor(this.m);
        this.n = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.n);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.g) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas2 = canvas;
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, this.d);
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f2, f, BitmapDescriptorFactory.HUE_RED, this.d);
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, this.d);
            canvas2.drawLine(f, BitmapDescriptorFactory.HUE_RED, f, f2, this.d);
            canvas2.drawLine(f, f2, BitmapDescriptorFactory.HUE_RED, f2, this.d);
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.d);
        } else {
            canvas2 = canvas;
        }
        String str = this.i;
        if (str == null || !this.h) {
            return;
        }
        int length = str.length();
        Paint paint = this.e;
        Rect rect = this.j;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.n;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas2.drawRect(rect, this.f);
        canvas2.drawText(this.i, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = true;
        this.h = true;
        this.i = null;
        this.j = new Rect();
        this.k = Color.argb(255, 0, 0, 0);
        this.l = Color.argb(255, 200, 200, 200);
        this.m = Color.argb(255, 50, 50, 50);
        this.n = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = true;
        this.h = true;
        this.i = null;
        this.j = new Rect();
        this.k = Color.argb(255, 0, 0, 0);
        this.l = Color.argb(255, 200, 200, 200);
        this.m = Color.argb(255, 50, 50, 50);
        this.n = 4;
        a(context, attributeSet);
    }
}
