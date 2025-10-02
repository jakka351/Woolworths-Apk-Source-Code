package me.oriient.ui.contentview.utils;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {
    private static final a l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0420b f26627a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h = -1;
    private int i = -1;
    private float j;
    private boolean k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: me.oriient.ui.contentview.utils.b$b, reason: collision with other inner class name */
    public interface InterfaceC0420b {
        boolean onRotation(float f);
    }

    public b(InterfaceC0420b interfaceC0420b) {
        this.f26627a = interfaceC0420b;
    }

    private final float a(float f) {
        return f % 360.0f;
    }

    private final float b(float f, float f2) {
        return (f + f2) / 2;
    }

    public final float a() {
        return this.j;
    }

    public final boolean a(MotionEvent event) {
        int i;
        b bVar;
        Intrinsics.h(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.d = event.getX();
            this.e = event.getY();
            this.h = event.getPointerId(0);
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = true;
        } else if (actionMasked == 1) {
            this.h = -1;
        } else if (actionMasked == 2) {
            try {
                if (this.h != -1 && (i = this.i) != -1) {
                    float x = event.getX(event.findPointerIndex(i));
                    float y = event.getY(event.findPointerIndex(this.i));
                    float x2 = event.getX(event.findPointerIndex(this.h));
                    float y2 = event.getY(event.findPointerIndex(this.h));
                    if (this.k) {
                        this.j = BitmapDescriptorFactory.HUE_RED;
                        this.k = false;
                        bVar = this;
                    } else {
                        try {
                            bVar = this;
                            try {
                                bVar.j = a(this.b, this.c, this.d, this.e, x, y, x2, y2);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    InterfaceC0420b interfaceC0420b = bVar.f26627a;
                    if (interfaceC0420b != null) {
                        interfaceC0420b.onRotation(a());
                    }
                    bVar.b = x;
                    bVar.c = y;
                    bVar.d = x2;
                    bVar.e = y2;
                }
            } catch (Exception unused3) {
            }
        } else if (actionMasked == 5) {
            this.b = event.getX();
            this.c = event.getY();
            this.f = b(this.b, this.d);
            this.g = b(this.c, this.e);
            this.i = event.getPointerId(event.getActionIndex());
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = true;
        } else if (actionMasked == 6) {
            this.i = -1;
        }
        return true;
    }

    private final float a(float f, float f2) {
        float fA = a(f) - a(f2);
        return fA < -180.0f ? fA + 360.0f : fA > 180.0f ? fA - 360.0f : fA;
    }

    private final float a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return a((float) Math.toDegrees((float) Math.atan2(f2 - f4, f - f3)), (float) Math.toDegrees((float) Math.atan2(f6 - f8, f5 - f7)));
    }
}
