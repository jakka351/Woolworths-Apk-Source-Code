package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    public final Path f3789a = new Path();
    public final Matrix b = new Matrix();

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.i);
        try {
            String strE = TypedArrayUtils.e(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strE == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(PathParser.d(strE));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double dAtan2 = Math.atan2(f5, f3 - f);
        Matrix matrix = this.b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f3789a.transform(matrix, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.b;
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r2 * r2)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, this.f3789a);
    }
}
