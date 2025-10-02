package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes4.dex */
public class LPaint extends Paint {
    public LPaint(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            PointF pointF = MiscUtils.f13479a;
            super.setAlpha(Math.max(0, Math.min(255, i)));
        } else {
            int color = getColor();
            PointF pointF2 = MiscUtils.f13479a;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
