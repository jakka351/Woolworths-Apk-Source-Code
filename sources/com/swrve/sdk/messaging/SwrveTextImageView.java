package com.swrve.sdk.messaging;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveTextTemplating;
import com.swrve.sdk.config.SwrveInAppMessageConfig;
import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveTextImageView extends SwrveBaseImageView {
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwrveTextImageView(Context context, SwrveWidget swrveWidget, Map map, SwrveInAppMessageConfig swrveInAppMessageConfig, int i, int i2) throws SwrveSDKTextTemplatingException {
        super(context, swrveInAppMessageConfig.f19080a);
        swrveInAppMessageConfig.getClass();
        String strA = SwrveTextTemplating.a(swrveWidget.f(), map);
        this.h = strA;
        d(swrveWidget, map, strA);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint();
        paint.setTypeface(null);
        paint.setColor(swrveInAppMessageConfig.b);
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            paint.setTextSize(SwrveHelper.m(paint, str, i, i2));
        }
        Rect rect = new Rect();
        paint.setTextAlign(Paint.Align.LEFT);
        String str2 = this.h;
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(this.h, ((i - rect.width()) / 2.0f) - rect.left, ((rect.height() + i2) / 2.0f) - rect.bottom, paint);
        setImageBitmap(bitmapCreateBitmap);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public String getText() {
        return this.h;
    }
}
