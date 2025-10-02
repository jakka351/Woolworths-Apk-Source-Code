package com.scandit.datacapture.barcode;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.e7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC0603e7 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private float f17627a;
    private float b;
    private I c;
    private float d;
    private float e;
    private long f;

    public ViewOnTouchListenerC0603e7() {
        I i = this.c;
        float f = BitmapDescriptorFactory.HUE_RED;
        this.d = i != null ? i.a() : 0.0f;
        I i2 = this.c;
        this.e = i2 != null ? i2.b() : f;
    }

    public final void a(I i) {
        this.c = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX;
        if (view == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = System.currentTimeMillis();
            this.f17627a = view.getX() - motionEvent.getRawX();
            this.b = view.getY() - motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX2 = motionEvent.getRawX() + this.f17627a;
                float rawY = BitmapDescriptorFactory.HUE_RED;
                if (rawX2 < BitmapDescriptorFactory.HUE_RED) {
                    rawX = 0.0f;
                } else {
                    float rawX3 = motionEvent.getRawX() + this.f17627a + view.getWidth();
                    Object parent = view.getParent();
                    Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
                    rawX = rawX3 > ((float) ((View) parent).getWidth()) ? this.d : motionEvent.getRawX() + this.f17627a;
                }
                this.d = rawX;
                if (motionEvent.getRawY() + this.b >= BitmapDescriptorFactory.HUE_RED) {
                    float rawY2 = motionEvent.getRawY() + this.b + view.getHeight();
                    Object parent2 = view.getParent();
                    Intrinsics.f(parent2, "null cannot be cast to non-null type android.view.View");
                    rawY = rawY2 > ((float) ((View) parent2).getHeight()) ? this.e : motionEvent.getRawY() + this.b;
                }
                this.e = rawY;
                view.setX(this.d);
                view.setY(this.e);
            }
        } else if (System.currentTimeMillis() - this.f < 200) {
            view.performClick();
        } else {
            I i = this.c;
            if (i != null) {
                i.a(this.d);
            }
            I i2 = this.c;
            if (i2 != null) {
                i2.b(this.e);
            }
        }
        return true;
    }
}
