package com.scandit.datacapture.barcode;

import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC0762o6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f17870a;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor((RangesKt.c((int) (RangesKt.b(0.3f, BitmapDescriptorFactory.HUE_RED, 1.0f) * 255), 0, 255) << 24) | 16711680);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        f17870a = paint;
    }

    public static Paint a() {
        return f17870a;
    }
}
