package com.medallia.digital.mobilesdk;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
final class i1 {
    private static final long e = 400;

    /* renamed from: a, reason: collision with root package name */
    private Animation f16525a;
    private Animation b;
    private int c;
    private int d;

    private void a(int i) {
        this.c = i;
    }

    private void b(int i) {
        this.d = i;
    }

    public Animation c(View view) {
        if (!a(view) || this.f16525a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -view.getMeasuredHeight(), BitmapDescriptorFactory.HUE_RED);
            this.f16525a = translateAnimation;
            translateAnimation.setDuration(e);
            a(view.getMeasuredHeight());
        }
        return this.f16525a;
    }

    public Animation d(View view) {
        if (!a(view) || this.f16525a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getMeasuredHeight(), BitmapDescriptorFactory.HUE_RED);
            this.f16525a = translateAnimation;
            translateAnimation.setDuration(e);
            a(view.getMeasuredHeight());
        }
        return this.f16525a;
    }

    public Animation e(View view) {
        if (!b(view) || this.b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getMeasuredWidth());
            this.b = translateAnimation;
            translateAnimation.setDuration(e);
            b(view.getMeasuredHeight());
        }
        return this.b;
    }

    public Animation f(View view) {
        if (!b(view) || this.b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, -view.getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.b = translateAnimation;
            translateAnimation.setDuration(e);
            b(view.getMeasuredHeight());
        }
        return this.b;
    }

    public Animation g(View view) {
        if (!b(view) || this.b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, view.getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.b = translateAnimation;
            translateAnimation.setDuration(e);
            b(view.getMeasuredHeight());
        }
        return this.b;
    }

    public Animation h(View view) {
        if (!b(view) || this.b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -view.getMeasuredWidth());
            this.b = translateAnimation;
            translateAnimation.setDuration(e);
            b(view.getMeasuredHeight());
        }
        return this.b;
    }

    private boolean a(int i, View view) {
        return i == view.getMeasuredHeight();
    }

    private boolean b(View view) {
        return a(this.d, view);
    }

    private boolean a(View view) {
        return a(this.c, view);
    }
}
