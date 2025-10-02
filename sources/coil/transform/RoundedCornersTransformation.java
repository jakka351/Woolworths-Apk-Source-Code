package coil.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.session.a;
import coil.decode.DecodeUtils;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/transform/RoundedCornersTransformation;", "Lcoil/transform/Transformation;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RoundedCornersTransformation implements Transformation {
    @Override // coil.transform.Transformation
    public final Bitmap a(Bitmap bitmap, Size size) {
        Pair pair;
        Paint paint = new Paint(3);
        if (Intrinsics.c(size, Size.c)) {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            Dimension dimension = size.f13028a;
            Dimension dimension2 = size.b;
            if ((dimension instanceof Dimension.Pixels) && (dimension2 instanceof Dimension.Pixels)) {
                pair = new Pair(Integer.valueOf(((Dimension.Pixels) dimension).f13026a), Integer.valueOf(((Dimension.Pixels) dimension2).f13026a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Dimension dimension3 = size.f13028a;
                double dA = DecodeUtils.a(width, height, dimension3 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension3).f13026a : Integer.MIN_VALUE, dimension2 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension2).f13026a : Integer.MIN_VALUE, Scale.d);
                pair = new Pair(Integer.valueOf(MathKt.a(bitmap.getWidth() * dA)), Integer.valueOf(MathKt.a(dA * bitmap.getHeight())));
            }
        }
        int iIntValue = ((Number) pair.d).intValue();
        int iIntValue2 = ((Number) pair.e).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fA = (float) DecodeUtils.a(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, Scale.d);
        float f = 2;
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fA)) / f, (iIntValue2 - (bitmap.getHeight() * fA)) / f);
        matrix.preScale(fA, fA);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RoundedCornersTransformation);
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + a.b(BitmapDescriptorFactory.HUE_RED, a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31);
    }
}
