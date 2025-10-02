package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Objects;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes2.dex */
public class MotionLabel extends View implements FloatLayout {
    public int A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public Drawable F;
    public Matrix G;
    public Bitmap H;
    public BitmapShader I;
    public Matrix J;
    public float K;
    public float L;
    public float M;
    public float N;
    public final Paint O;
    public int P;
    public Rect Q;
    public Paint R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final TextPaint d;
    public Path e;
    public int f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public ViewOutlineProvider k;
    public RectF l;
    public float m;
    public float n;
    public int o;
    public int p;
    public float q;
    public String r;
    public boolean s;
    public final Rect t;
    public int u;
    public int v;
    public int w;
    public int x;
    public String y;
    public int z;

    public MotionLabel(Context context) {
        super(context);
        this.d = new TextPaint();
        this.e = new Path();
        this.f = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.g = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.h = false;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.m = 48.0f;
        this.n = Float.NaN;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = "Hello World";
        this.s = true;
        this.t = new Rect();
        this.u = 1;
        this.v = 1;
        this.w = 1;
        this.x = 1;
        this.z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        c(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.n) ? 1.0f : this.m / this.n;
        String str = this.r;
        return ((this.M + 1.0f) * ((((Float.isNaN(this.D) ? getMeasuredWidth() : this.D) - getPaddingLeft()) - getPaddingRight()) - (this.d.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.n) ? 1.0f : this.m / this.n;
        Paint.FontMetrics fontMetrics = this.d.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.E) ? getMeasuredHeight() : this.E) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.N) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i = typedValue.data;
        this.f = i;
        this.d.setColor(i);
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public final void a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.C = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.D = f5;
        float f6 = f4 - f2;
        this.E = f6;
        if (this.J != null) {
            this.D = f5;
            this.E = f6;
            d();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.B) {
            Rect rect = this.Q;
            TextPaint textPaint = this.d;
            if (rect == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(textPaint);
                this.S = this.R.getTextSize();
            }
            this.D = f5;
            this.E = f6;
            Paint paint = this.R;
            String str = this.r;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            float fHeight = this.Q.height() * 1.3f;
            float f7 = (f5 - this.v) - this.u;
            float f8 = (f6 - this.x) - this.w;
            float fWidth = this.Q.width();
            if (fWidth * f8 > fHeight * f7) {
                textPaint.setTextSize((this.S * f7) / fWidth);
            } else {
                textPaint.setTextSize((this.S * f8) / fHeight);
            }
            if (this.h || !Float.isNaN(this.n)) {
                b(Float.isNaN(this.n) ? 1.0f : this.m / this.n);
            }
        }
    }

    public final void b(float f) {
        if (this.h || f != 1.0f) {
            this.e.reset();
            String str = this.r;
            int length = str.length();
            TextPaint textPaint = this.d;
            Rect rect = this.t;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.e);
            if (f != 1.0f) {
                Log.v("MotionLabel", Debug.a() + " scale " + f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.e.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.s = false;
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 5) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.y = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.n);
                } else if (index == 0) {
                    this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.m);
                } else if (index == 2) {
                    this.o = typedArrayObtainStyledAttributes.getInt(index, this.o);
                } else if (index == 1) {
                    this.p = typedArrayObtainStyledAttributes.getInt(index, this.p);
                } else if (index == 3) {
                    this.f = typedArrayObtainStyledAttributes.getColor(index, this.f);
                } else if (index == 9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    this.j = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    this.i = f;
                    setRoundPercent(f);
                } else if (index == 4) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    this.h = true;
                } else if (index == 18) {
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    this.h = true;
                } else if (index == 12) {
                    this.F = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.h = true;
                } else if (index == 13) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == 14) {
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                } else if (index == 19) {
                    this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                } else if (index == 20) {
                    this.N = typedArrayObtainStyledAttributes.getFloat(index, this.N);
                } else if (index == 15) {
                    this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                } else if (index == 16) {
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                } else if (index == 23) {
                    this.K = typedArrayObtainStyledAttributes.getDimension(index, this.K);
                } else if (index == 24) {
                    this.L = typedArrayObtainStyledAttributes.getDimension(index, this.L);
                } else if (index == 22) {
                    this.P = typedArrayObtainStyledAttributes.getInt(index, this.P);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.F != null) {
            this.J = new Matrix();
            int intrinsicWidth = this.F.getIntrinsicWidth();
            int intrinsicHeight = this.F.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.L) ? 128 : (int) this.L;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.K) ? 128 : (int) this.K;
            }
            if (this.P != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.H = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.H);
            this.F.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.F.setFilterBitmap(true);
            this.F.draw(canvas);
            if (this.P != 0) {
                Bitmap bitmap = this.H;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i2 = 0; i2 < 4 && width >= 32 && height >= 32; i2++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.H = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.H;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.I = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.u = getPaddingLeft();
        this.v = getPaddingRight();
        this.w = getPaddingTop();
        this.x = getPaddingBottom();
        String str = this.y;
        int i3 = this.p;
        int i4 = this.o;
        TextPaint textPaint = this.d;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i4);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f);
            textPaint.setStrokeWidth(this.q);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.m);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i3 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i3 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i3 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (i4 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typefaceCreate, i4);
            setTypeface(typefaceDefaultFromStyle);
            int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
            textPaint.setFakeBoldText((i5 & 1) != 0);
            if ((i5 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint.setTextSkewX(f2);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f);
        textPaint.setStrokeWidth(this.q);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.m);
        textPaint.setAntiAlias(true);
    }

    public final void d() {
        boolean zIsNaN = Float.isNaN(this.T);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zIsNaN ? 0.0f : this.T;
        float f3 = Float.isNaN(this.U) ? 0.0f : this.U;
        float f4 = Float.isNaN(this.V) ? 1.0f : this.V;
        if (!Float.isNaN(this.W)) {
            f = this.W;
        }
        this.J.reset();
        float width = this.H.getWidth();
        float height = this.H.getHeight();
        float f5 = Float.isNaN(this.L) ? this.D : this.L;
        float f6 = Float.isNaN(this.K) ? this.E : this.K;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.J.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.K)) {
            f11 = this.K / 2.0f;
        }
        if (!Float.isNaN(this.L)) {
            f9 = this.L / 2.0f;
        }
        this.J.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.J.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.I.setLocalMatrix(this.J);
    }

    public float getRound() {
        return this.j;
    }

    public float getRoundPercent() {
        return this.i;
    }

    public float getScaleFromTextSize() {
        return this.n;
    }

    public float getTextBackgroundPanX() {
        return this.T;
    }

    public float getTextBackgroundPanY() {
        return this.U;
    }

    public float getTextBackgroundRotate() {
        return this.W;
    }

    public float getTextBackgroundZoom() {
        return this.V;
    }

    public int getTextOutlineColor() {
        return this.g;
    }

    public float getTextPanX() {
        return this.M;
    }

    public float getTextPanY() {
        return this.N;
    }

    public float getTextureHeight() {
        return this.K;
    }

    public float getTextureWidth() {
        return this.L;
    }

    public Typeface getTypeface() {
        return this.d.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.n);
        float f = zIsNaN ? 1.0f : this.m / this.n;
        this.D = i3 - i;
        this.E = i4 - i2;
        if (this.B) {
            Rect rect = this.Q;
            TextPaint textPaint = this.d;
            if (rect == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(textPaint);
                this.S = this.R.getTextSize();
            }
            Paint paint = this.R;
            String str = this.r;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            int iWidth = this.Q.width();
            int iHeight = (int) (this.Q.height() * 1.3f);
            float f2 = (this.D - this.v) - this.u;
            float f3 = (this.E - this.x) - this.w;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    textPaint.setTextSize((this.S * f2) / f4);
                } else {
                    textPaint.setTextSize((this.S * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.h || !zIsNaN) {
            float f8 = i;
            float f9 = i2;
            float f10 = i3;
            float f11 = i4;
            if (this.J != null) {
                this.D = f10 - f8;
                this.E = f11 - f9;
                d();
            }
            b(f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.n) ? 1.0f : this.m / this.n;
        super.onDraw(canvas);
        boolean z = this.h;
        TextPaint textPaint = this.d;
        if (!z && f == 1.0f) {
            canvas.drawText(this.r, this.C + this.u + getHorizontalOffset(), this.w + getVerticalOffset(), textPaint);
            return;
        }
        if (this.s) {
            b(f);
        }
        if (this.G == null) {
            this.G = new Matrix();
        }
        if (!this.h) {
            float horizontalOffset = this.u + getHorizontalOffset();
            float verticalOffset = this.w + getVerticalOffset();
            this.G.reset();
            this.G.preTranslate(horizontalOffset, verticalOffset);
            this.e.transform(this.G);
            textPaint.setColor(this.f);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.q);
            canvas.drawPath(this.e, textPaint);
            this.G.reset();
            this.G.preTranslate(-horizontalOffset, -verticalOffset);
            this.e.transform(this.G);
            return;
        }
        Paint paint = this.O;
        paint.set(textPaint);
        this.G.reset();
        float horizontalOffset2 = this.u + getHorizontalOffset();
        float verticalOffset2 = this.w + getVerticalOffset();
        this.G.postTranslate(horizontalOffset2, verticalOffset2);
        this.G.preScale(f, f);
        this.e.transform(this.G);
        if (this.I != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.I);
        } else {
            textPaint.setColor(this.f);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.q);
        canvas.drawPath(this.e, textPaint);
        if (this.I != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.g);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.q);
        canvas.drawPath(this.e, textPaint);
        this.G.reset();
        this.G.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.e.transform(this.G);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.B = false;
        this.u = getPaddingLeft();
        this.v = getPaddingRight();
        this.w = getPaddingTop();
        this.x = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.r;
            int length = str.length();
            this.d.getTextBounds(str, 0, length, this.t);
            if (mode != 1073741824) {
                size = (int) (r7.width() + 0.99999f);
            }
            size += this.u + this.v;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (r6.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.w + this.x + fontMetricsInt;
            }
        } else if (this.A != 0) {
            this.B = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.z) {
            invalidate();
        }
        this.z = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.N = -1.0f;
        } else if (i2 != 80) {
            this.N = BitmapDescriptorFactory.HUE_RED;
        } else {
            this.N = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.M = BitmapDescriptorFactory.HUE_RED;
                        return;
                    }
                }
            }
            this.M = 1.0f;
            return;
        }
        this.M = -1.0f;
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.j = f;
            float f2 = this.i;
            this.i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.j != f;
        this.j = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.e == null) {
                this.e = new Path();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.k == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        MotionLabel motionLabel = MotionLabel.this;
                        outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.j);
                    }
                };
                this.k = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.l.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.e.reset();
            Path path = this.e;
            RectF rectF = this.l;
            float f3 = this.j;
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
        boolean z = this.i != f;
        this.i = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.e == null) {
                this.e = new Path();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.k == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        MotionLabel motionLabel = MotionLabel.this;
                        outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r3, r4) * motionLabel.i) / 2.0f);
                    }
                };
                this.k = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.i) / 2.0f;
            this.l.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.e.reset();
            this.e.addRoundRect(this.l, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.n = f;
    }

    public void setText(CharSequence charSequence) {
        this.r = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.T = f;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.U = f;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.W = f;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.V = f;
        d();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.g = i;
        this.h = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.q = f;
        this.h = true;
        if (Float.isNaN(f)) {
            this.q = 1.0f;
            this.h = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.M = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.N = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.m = f;
        if (!Float.isNaN(this.n)) {
            f = this.n;
        }
        this.d.setTextSize(f);
        b(Float.isNaN(this.n) ? 1.0f : this.m / this.n);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.K = f;
        d();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.L = f;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.d;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new TextPaint();
        this.e = new Path();
        this.f = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.g = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.h = false;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.m = 48.0f;
        this.n = Float.NaN;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = "Hello World";
        this.s = true;
        this.t = new Rect();
        this.u = 1;
        this.v = 1;
        this.w = 1;
        this.x = 1;
        this.z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        c(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new TextPaint();
        this.e = new Path();
        this.f = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.g = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.h = false;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.m = 48.0f;
        this.n = Float.NaN;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = "Hello World";
        this.s = true;
        this.t = new Rect();
        this.u = 1;
        this.v = 1;
        this.w = 1;
        this.x = 1;
        this.z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        c(context, attributeSet);
    }
}
