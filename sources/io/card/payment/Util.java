package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes7.dex */
class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f23881a = Build.MODEL.equals("DROID2");
    public static Boolean b;

    public static boolean a() {
        Camera cameraOpen;
        if (b == null) {
            boolean z = false;
            if (CardScanner.p || !(CardScanner.nUseNeon() || CardScanner.nUseTegra() || CardScanner.nUseX86())) {
                Log.w("card.io", "- Processor type is not supported");
            } else {
                try {
                    cameraOpen = Camera.open();
                } catch (RuntimeException unused) {
                }
                if (cameraOpen == null) {
                    Log.w("card.io", "- No camera found");
                } else {
                    List<Camera.Size> supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                    cameraOpen.release();
                    for (Camera.Size size : supportedPreviewSizes) {
                        if (size.width == 640 && size.height == 480) {
                            z = true;
                            break;
                        }
                    }
                    Log.w("card.io", "- Camera resolution is insufficient");
                }
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static Rect b(Point point, int i, int i2) {
        int i3 = point.x;
        int i4 = i / 2;
        int i5 = point.y;
        int i6 = i2 / 2;
        return new Rect(i3 - i4, i5 - i6, i3 + i4, i5 + i6);
    }

    public static void c(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5f, 0.5f, BitmapDescriptorFactory.HUE_RED, Color.HSVToColor(200, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}));
    }

    public static void d(Intent intent, Intent intent2, OverlayView overlayView) {
        if (!intent.getBooleanExtra(CardIOActivity.EXTRA_RETURN_CARD_IMAGE, false) || overlayView == null || overlayView.f == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        overlayView.f.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        intent2.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, byteArrayOutputStream.toByteArray());
    }
}
