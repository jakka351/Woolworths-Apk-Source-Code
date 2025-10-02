package com.scandit.datacapture.barcode;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.td, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0854td extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0877ud f18143a;

    public C0854td(C0877ud c0877ud) {
        this.f18143a = c0877ud;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        InterfaceC0802qd interfaceC0802qdB;
        Intrinsics.h(e1, "e1");
        Intrinsics.h(e2, "e2");
        boolean z = f2 > BitmapDescriptorFactory.HUE_RED;
        C0877ud c0877ud = this.f18143a;
        if (z && (interfaceC0802qdB = c0877ud.b()) != null) {
            R5 r5 = (R5) interfaceC0802qdB;
            if (r5.f17286a.a().size() > 1) {
                S5 s5 = r5.b;
                int i = S5.j;
                s5.a(false, true);
            }
        }
        return z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.h(e, "e");
        InterfaceC0802qd interfaceC0802qdB = this.f18143a.b();
        if (interfaceC0802qdB != null) {
            R5 r5 = (R5) interfaceC0802qdB;
            if (r5.f17286a.a().size() > 1) {
                S5 s5 = r5.b;
                int i = S5.j;
                s5.a(false, true);
            } else if (((C0914x5) CollectionsKt.F(r5.f17286a.a())) != null) {
                r5.b.e();
            }
        }
        return true;
    }
}
