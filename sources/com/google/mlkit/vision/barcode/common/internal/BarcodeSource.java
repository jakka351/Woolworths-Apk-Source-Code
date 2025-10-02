package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes6.dex */
public interface BarcodeSource {
    String a();

    int b();

    String c();

    Rect getBoundingBox();

    Point[] getCornerPoints();

    int getFormat();
}
