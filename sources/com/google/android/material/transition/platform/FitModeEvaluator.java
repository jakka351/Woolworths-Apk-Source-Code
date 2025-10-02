package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes6.dex */
interface FitModeEvaluator {
    FitModeResult a(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean b(FitModeResult fitModeResult);

    void c(RectF rectF, float f, FitModeResult fitModeResult);
}
