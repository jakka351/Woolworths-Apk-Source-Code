package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public interface DrawingContent extends Content {
    void a(RectF rectF, Matrix matrix, boolean z);

    void d(Canvas canvas, Matrix matrix, int i);
}
