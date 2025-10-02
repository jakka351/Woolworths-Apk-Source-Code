package io.card.payment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes7.dex */
class OverlayView extends View {
    public static final GradientDrawable.Orientation[] y = {GradientDrawable.Orientation.TOP_BOTTOM, GradientDrawable.Orientation.LEFT_RIGHT, GradientDrawable.Orientation.BOTTOM_TOP, GradientDrawable.Orientation.RIGHT_LEFT};
    public final WeakReference d;
    public DetectionInfo e;
    public Bitmap f;
    public Rect g;
    public CreditCard h;
    public int i;
    public int j;
    public boolean k;
    public String l;
    public GradientDrawable m;
    public final Paint n;
    public final Paint o;
    public Path p;
    public Rect q;
    public final Torch r;
    public final Logo s;
    public Rect t;
    public Rect u;
    public final boolean v;
    public int w;
    public final float x;

    public OverlayView(CardIOActivity cardIOActivity, boolean z) {
        super(cardIOActivity, null);
        this.x = 1.0f;
        this.v = z;
        this.d = new WeakReference(cardIOActivity);
        this.w = 1;
        float f = getResources().getDisplayMetrics().density / 1.5f;
        this.x = f;
        Torch torch = new Torch();
        torch.f23880a = false;
        torch.b = 70.0f * f;
        torch.c = f * 50.0f;
        this.r = torch;
        this.s = new Logo(cardIOActivity);
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.o = paint;
        paint.clearShadowLayer();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1157627904);
        this.l = LocalizedStrings.a(StringKey.q);
    }

    public final Rect a(int i, int i2, int i3, int i4) {
        int i5 = (int) (this.x * 8.0f);
        Rect rect = new Rect();
        rect.left = Math.min(i, i3) - i5;
        rect.right = Math.max(i, i3) + i5;
        rect.top = Math.min(i2, i4) - i5;
        rect.bottom = Math.max(i2, i4) + i5;
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.g == null || this.q == null) {
            return;
        }
        canvas.save();
        this.m.draw(canvas);
        int i2 = this.i;
        if (i2 == 0 || i2 == 180) {
            Rect rect = this.g;
            i = (rect.bottom - rect.top) / 4;
        } else {
            Rect rect2 = this.g;
            i = (rect2.right - rect2.left) / 4;
        }
        DetectionInfo detectionInfo = this.e;
        if (detectionInfo != null) {
            if ((detectionInfo.topEdge ? 1 : 0) + (detectionInfo.bottomEdge ? 1 : 0) + (detectionInfo.leftEdge ? 1 : 0) + (detectionInfo.rightEdge ? 1 : 0) == 4) {
                canvas.drawPath(this.p, this.o);
            }
        }
        Paint paint = this.n;
        paint.clearShadowLayer();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.j);
        Rect rect3 = this.g;
        int i3 = rect3.left;
        int i4 = rect3.top;
        canvas.drawRect(a(i3, i4, i3 + i, i4), paint);
        Rect rect4 = this.g;
        int i5 = rect4.left;
        int i6 = rect4.top;
        canvas.drawRect(a(i5, i6, i5, i6 + i), paint);
        Rect rect5 = this.g;
        int i7 = rect5.right;
        int i8 = rect5.top;
        canvas.drawRect(a(i7, i8, i7 - i, i8), paint);
        Rect rect6 = this.g;
        int i9 = rect6.right;
        int i10 = rect6.top;
        canvas.drawRect(a(i9, i10, i9, i10 + i), paint);
        Rect rect7 = this.g;
        int i11 = rect7.left;
        int i12 = rect7.bottom;
        canvas.drawRect(a(i11, i12, i11 + i, i12), paint);
        Rect rect8 = this.g;
        int i13 = rect8.left;
        int i14 = rect8.bottom;
        canvas.drawRect(a(i13, i14, i13, i14 - i), paint);
        Rect rect9 = this.g;
        int i15 = rect9.right;
        int i16 = rect9.bottom;
        canvas.drawRect(a(i15, i16, i15 - i, i16), paint);
        Rect rect10 = this.g;
        int i17 = rect10.right;
        int i18 = rect10.bottom;
        canvas.drawRect(a(i17, i18, i17, i18 - i), paint);
        DetectionInfo detectionInfo2 = this.e;
        float f = this.x;
        if (detectionInfo2 != null) {
            if (detectionInfo2.topEdge) {
                Rect rect11 = this.g;
                int i19 = rect11.left;
                int i20 = rect11.top;
                canvas.drawRect(a(i19, i20, rect11.right, i20), paint);
            }
            if (this.e.bottomEdge) {
                Rect rect12 = this.g;
                int i21 = rect12.left;
                int i22 = rect12.bottom;
                canvas.drawRect(a(i21, i22, rect12.right, i22), paint);
            }
            if (this.e.leftEdge) {
                Rect rect13 = this.g;
                int i23 = rect13.left;
                canvas.drawRect(a(i23, rect13.top, i23, rect13.bottom), paint);
            }
            if (this.e.rightEdge) {
                Rect rect14 = this.g;
                int i24 = rect14.right;
                canvas.drawRect(a(i24, rect14.top, i24, rect14.bottom), paint);
            }
            DetectionInfo detectionInfo3 = this.e;
            if ((detectionInfo3.topEdge ? 1 : 0) + (detectionInfo3.bottomEdge ? 1 : 0) + (detectionInfo3.leftEdge ? 1 : 0) + (detectionInfo3.rightEdge ? 1 : 0) < 3) {
                float f2 = 34.0f * f;
                float f3 = 26.0f * f;
                Util.c(paint);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(f3);
                Rect rect15 = this.g;
                float fWidth = (rect15.width() / 2) + rect15.left;
                Rect rect16 = this.g;
                canvas.translate(fWidth, (rect16.height() / 2) + rect16.top);
                canvas.rotate(this.w * this.i);
                String str = this.l;
                if (str != null && str != "") {
                    float f4 = (-((((r8.length - 1) * f2) - f3) / 2.0f)) - 3.0f;
                    for (String str2 : str.split("\n")) {
                        canvas.drawText(str2, BitmapDescriptorFactory.HUE_RED, f4, paint);
                        f4 += f2;
                    }
                }
            }
        }
        canvas.restore();
        if (!this.k) {
            canvas.save();
            canvas.translate(this.u.exactCenterX(), this.u.exactCenterY());
            canvas.rotate(this.w * this.i);
            float f5 = 100.0f * f;
            float f6 = f * 50.0f;
            Logo logo = this.s;
            if (logo.b == null) {
                logo.a(false);
            }
            canvas.save();
            float height = logo.b.getHeight() / logo.b.getWidth();
            if (f6 / f5 < height) {
                f5 = f6 / height;
            } else {
                f6 = f5 * height;
            }
            float f7 = f5 / 2.0f;
            float f8 = f6 / 2.0f;
            canvas.drawBitmap(logo.b, new Rect(0, 0, logo.b.getWidth(), logo.b.getHeight()), new RectF(-f7, -f8, f7, f8), logo.f23879a);
            canvas.restore();
            canvas.restore();
        }
        if (this.v) {
            canvas.save();
            canvas.translate(this.t.exactCenterX(), this.t.exactCenterY());
            canvas.rotate(this.w * this.i);
            Torch torch = this.r;
            torch.getClass();
            canvas.save();
            float f9 = torch.b;
            float f10 = torch.c;
            canvas.translate((-f9) / 2.0f, (-f10) / 2.0f);
            Paint paint2 = new Paint();
            paint2.setColor(-16777216);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(1.5f);
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(-1);
            if (torch.f23880a) {
                paint3.setAlpha(BERTags.PRIVATE);
            } else {
                paint3.setAlpha(96);
            }
            float[] fArr = new float[8];
            Arrays.fill(fArr, 5.0f);
            RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
            roundRectShape.resize(f9, f10);
            roundRectShape.draw(canvas, paint3);
            roundRectShape.draw(canvas, paint2);
            Paint paint4 = new Paint();
            paint4.setStyle(Paint.Style.FILL_AND_STROKE);
            paint4.setAntiAlias(true);
            if (torch.f23880a) {
                paint4.setColor(-1);
            } else {
                paint4.setColor(-16777216);
            }
            Path path = new Path();
            path.moveTo(10.0f, BitmapDescriptorFactory.HUE_RED);
            path.lineTo(BitmapDescriptorFactory.HUE_RED, 11.0f);
            path.lineTo(6.0f, 11.0f);
            path.lineTo(2.0f, 20.0f);
            path.lineTo(13.0f, 8.0f);
            path.lineTo(7.0f, 8.0f);
            path.lineTo(10.0f, BitmapDescriptorFactory.HUE_RED);
            path.setLastPoint(10.0f, BitmapDescriptorFactory.HUE_RED);
            Matrix matrix = new Matrix();
            matrix.postTranslate(-6.5f, -10.0f);
            matrix.postScale(0.05f, 0.05f);
            path.transform(matrix);
            Matrix matrix2 = new Matrix();
            float f11 = 0.8f * f10;
            matrix2.postScale(f11, f11);
            path.transform(matrix2);
            canvas.translate(f9 / 2.0f, f10 / 2.0f);
            canvas.drawPath(path, paint4);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        try {
            if ((motionEvent.getAction() & 255) == 0) {
                Rect rectB = Util.b(new Point((int) motionEvent.getX(), (int) motionEvent.getY()), 20, 20);
                boolean z = this.v;
                WeakReference weakReference = this.d;
                if (z && (rect = this.t) != null && Rect.intersects(rect, rectB)) {
                    ((CardIOActivity) weakReference.get()).h(!r4.r.m.getParameters().getFlashMode().equals("torch"));
                } else {
                    ((CardIOActivity) weakReference.get()).r.j(true);
                }
            }
            return false;
        } catch (NullPointerException unused) {
            Log.d("OverlayView", "NullPointerException caught in onTouchEvent method");
            return false;
        }
    }
}
