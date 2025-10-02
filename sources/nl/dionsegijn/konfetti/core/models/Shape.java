package nl.dionsegijn.konfetti.core.models;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Shape;", "", "Circle", "DrawableShape", "Rectangle", "Square", "Lnl/dionsegijn/konfetti/core/models/Shape$Circle;", "Lnl/dionsegijn/konfetti/core/models/Shape$Square;", "Lnl/dionsegijn/konfetti/core/models/Shape$Rectangle;", "Lnl/dionsegijn/konfetti/core/models/Shape$DrawableShape;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Shape {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Shape$Circle;", "Lnl/dionsegijn/konfetti/core/models/Shape;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Circle implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public static final Circle f26644a = new Circle();

        static {
            new RectF();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Shape$DrawableShape;", "Lnl/dionsegijn/konfetti/core/models/Shape;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DrawableShape implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable f26645a;
        public final boolean b;
        public final float c;

        public DrawableShape(Drawable drawable, boolean z) {
            this.f26645a = drawable;
            this.b = z;
            this.c = (drawable.getIntrinsicHeight() == -1 && drawable.getIntrinsicWidth() == -1) ? 1.0f : (drawable.getIntrinsicHeight() == -1 || drawable.getIntrinsicWidth() == -1) ? BitmapDescriptorFactory.HUE_RED : drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawableShape)) {
                return false;
            }
            DrawableShape drawableShape = (DrawableShape) obj;
            return Intrinsics.c(this.f26645a, drawableShape.f26645a) && this.b == drawableShape.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int iHashCode = this.f26645a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawableShape(drawable=");
            sb.append(this.f26645a);
            sb.append(", tint=");
            return b.s(sb, this.b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Shape$Rectangle;", "Lnl/dionsegijn/konfetti/core/models/Shape;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Rectangle implements Shape {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Shape$Square;", "Lnl/dionsegijn/konfetti/core/models/Shape;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Square implements Shape {

        /* renamed from: a, reason: collision with root package name */
        public static final Square f26646a = new Square();
    }
}
