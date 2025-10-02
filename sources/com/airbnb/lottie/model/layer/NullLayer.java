package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class NullLayer extends BaseLayer {
    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void j(Canvas canvas, Matrix matrix, int i) {
    }
}
