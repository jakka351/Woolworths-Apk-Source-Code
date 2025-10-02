package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ArcMotion extends PathMotion {
    public static final float d = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public final float f3777a;
    public final float b;
    public final float c;

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = BitmapDescriptorFactory.HUE_RED;
        this.f3777a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.b = b(!TypedArrayUtils.f(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED));
        this.f3777a = b(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED) : f);
        this.c = b(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float fA;
        float fA2;
        float f5;
        Path path = new Path();
        path.moveTo(f, f2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = 0.25f * f8;
        boolean z = f2 > f4;
        if (Math.abs(f6) < Math.abs(f7)) {
            float fAbs = Math.abs(f8 / (f7 * 2.0f));
            if (z) {
                fA2 = fAbs + f4;
                fA = f3;
            } else {
                fA2 = fAbs + f2;
                fA = f;
            }
            f5 = this.b;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fA2 = f2;
                fA = f12 + f;
            } else {
                fA = f3 - f12;
                fA2 = f4;
            }
            f5 = this.f3777a;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fA;
        float f15 = f10 - fA2;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.c;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fA = YU.a.a(fA, f9, fSqrt, f9);
            fA2 = YU.a.a(fA2, f10, fSqrt, f10);
        }
        path.cubicTo((f + fA) / 2.0f, (f2 + fA2) / 2.0f, (fA + f3) / 2.0f, (fA2 + f4) / 2.0f, f3, f4);
        return path;
    }
}
