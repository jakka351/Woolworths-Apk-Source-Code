package nl.dionsegijn.konfetti.models;

import YU.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape;", "", "Circle", "Companion", "DrawableShape", "Rectangle", "Square", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface Shape {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape$Circle;", "Lnl/dionsegijn/konfetti/models/Shape;", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final class Circle implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public static final RectF f26652a = new RectF();

        @Override // nl.dionsegijn.konfetti.models.Shape
        public final void a(Canvas canvas, Paint paint, float f) {
            Intrinsics.h(paint, "paint");
            RectF rectF = f26652a;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f);
            canvas.drawOval(rectF, paint);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape$Companion;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape$DrawableShape;", "Lnl/dionsegijn/konfetti/models/Shape;", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class DrawableShape implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public final float f26653a;
        public final Drawable b;
        public final boolean c;

        public DrawableShape(Drawable drawable, boolean z) {
            this.b = drawable;
            this.c = z;
            this.f26653a = (drawable.getIntrinsicHeight() == -1 && drawable.getIntrinsicWidth() == -1) ? 1.0f : (drawable.getIntrinsicHeight() == -1 || drawable.getIntrinsicWidth() == -1) ? BitmapDescriptorFactory.HUE_RED : drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
        }

        @Override // nl.dionsegijn.konfetti.models.Shape
        public final void a(Canvas canvas, Paint paint, float f) {
            Intrinsics.h(paint, "paint");
            boolean z = this.c;
            Drawable drawable = this.b;
            if (z) {
                drawable.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setAlpha(paint.getAlpha());
            }
            int i = (int) (this.f26653a * f);
            int i2 = (int) ((f - i) / 2.0f);
            drawable.setBounds(0, i2, (int) f, i + i2);
            drawable.draw(canvas);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawableShape)) {
                return false;
            }
            DrawableShape drawableShape = (DrawableShape) obj;
            return Intrinsics.c(this.b, drawableShape.b) && this.c == drawableShape.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            Drawable drawable = this.b;
            int iHashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
            boolean z = this.c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawableShape(drawable=");
            sb.append(this.b);
            sb.append(", tint=");
            return a.k(")", sb, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape$Rectangle;", "Lnl/dionsegijn/konfetti/models/Shape;", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final class Rectangle implements Shape {
        @Override // nl.dionsegijn.konfetti.models.Shape
        public final void a(Canvas canvas, Paint paint, float f) {
            Intrinsics.h(paint, "paint");
            float f2 = BitmapDescriptorFactory.HUE_RED * f;
            float f3 = (f - f2) / 2.0f;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f3, f, f3 + f2, paint);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Shape$Square;", "Lnl/dionsegijn/konfetti/models/Shape;", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final class Square implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public static final Square f26654a = new Square();

        @Override // nl.dionsegijn.konfetti.models.Shape
        public final void a(Canvas canvas, Paint paint, float f) {
            Intrinsics.h(paint, "paint");
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, paint);
        }
    }

    void a(Canvas canvas, Paint paint, float f);
}
