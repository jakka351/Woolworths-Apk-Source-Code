package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Paint;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class I2 {
    public static final K8 a(BarcodePickBrush barcodePickBrush, List shadows) {
        Intrinsics.h(barcodePickBrush, "<this>");
        Intrinsics.h(shadows, "shadows");
        Brush brushAsBrush = barcodePickBrush.asBrush();
        if (brushAsBrush == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(brushAsBrush.getFillColor());
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(brushAsBrush.getStrokeColor());
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(PixelExtensionsKt.pxFromDp$default(brushAsBrush.getStrokeWidth(), (Context) null, 1, (Object) null));
        return new K8(paint, paint2, shadows);
    }
}
