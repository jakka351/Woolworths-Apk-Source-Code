package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.p6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC0777p6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f17880a;
    private static final Paint b;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = 255;
        paint.setColor((RangesKt.c((int) (RangesKt.b(0.3f, BitmapDescriptorFactory.HUE_RED, 1.0f) * f), 0, 255) << 24) | 16711680);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        f17880a = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor((RangesKt.c((int) (RangesKt.b(0.3f, BitmapDescriptorFactory.HUE_RED, 1.0f) * f), 0, 255) << 24) | 65280);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(PixelExtensionsKt.pxFromDp$default(2.0f, (Context) null, 1, (Object) null));
        b = paint2;
    }

    public static Paint a() {
        return b;
    }

    public static Paint b() {
        return f17880a;
    }
}
