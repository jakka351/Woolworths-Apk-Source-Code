package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes6.dex */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFA = TabIndicatorInterpolator.a(tabLayout, view);
        RectF rectFA2 = TabIndicatorInterpolator.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d = (f * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (f * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        drawable.setBounds(AnimationUtils.c(fSin, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, AnimationUtils.c(fCos, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
