package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil3.decode.DecodeUtils;
import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.IntPair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/transform/RoundedCornersTransformation;", "Lcoil3/transform/Transformation;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RoundedCornersTransformation extends Transformation {
    @Override // coil3.transform.Transformation
    public final Bitmap a(Bitmap bitmap, Size size) {
        long jA;
        Paint paint = new Paint(3);
        if (Intrinsics.c(size, Size.c)) {
            jA = IntPair.a(bitmap.getWidth(), bitmap.getHeight());
        } else {
            Dimension dimension = size.f13149a;
            Dimension dimension2 = size.b;
            if ((dimension instanceof Dimension.Pixels) && (dimension2 instanceof Dimension.Pixels)) {
                jA = IntPair.a(((Dimension.Pixels) dimension).f13147a, ((Dimension.Pixels) dimension2).f13147a);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Dimension dimension3 = size.f13149a;
                double dB = DecodeUtils.b(width, height, dimension3 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension3).f13147a : Integer.MIN_VALUE, dimension2 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension2).f13147a : Integer.MIN_VALUE, Scale.d);
                jA = IntPair.a(MathKt.a(bitmap.getWidth() * dB), MathKt.a(dB * bitmap.getHeight()));
            }
        }
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fB = (float) DecodeUtils.b(bitmap.getWidth(), bitmap.getHeight(), i, i2, Scale.d);
        float f = 2;
        matrix.setTranslate((i - (bitmap.getWidth() * fB)) / f, (i2 - (bitmap.getHeight() * fB)) / f);
        matrix.preScale(fB, fB);
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
}
