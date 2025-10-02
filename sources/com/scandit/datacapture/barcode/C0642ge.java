package com.scandit.datacapture.barcode;

import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.ge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0642ge implements InterfaceC0626fe {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f17684a;
    private final Function3 b;
    private final Function1 c;
    private Object d;

    public C0642ge(Function1 selectedItemForTouchLocation, Function3 shouldAcceptItemForTouch, Function1 onTouchConfirmed) {
        Intrinsics.h(selectedItemForTouchLocation, "selectedItemForTouchLocation");
        Intrinsics.h(shouldAcceptItemForTouch, "shouldAcceptItemForTouch");
        Intrinsics.h(onTouchConfirmed, "onTouchConfirmed");
        this.f17684a = selectedItemForTouchLocation;
        this.b = shouldAcceptItemForTouch;
        this.c = onTouchConfirmed;
    }

    public final boolean a(MotionEvent event) {
        Object obj;
        Object objInvoke;
        Intrinsics.h(event, "event");
        Point point = new Point(event.getX(), event.getY());
        if (event.getAction() == 0 && (objInvoke = this.f17684a.invoke(point)) != null) {
            this.d = objInvoke;
            return true;
        }
        if (event.getAction() != 1 || (obj = this.d) == null) {
            return false;
        }
        this.d = null;
        if (((Boolean) this.b.invoke(obj, this.f17684a.invoke(point), point)).booleanValue()) {
            this.c.invoke(obj);
            return true;
        }
        return false;
    }
}
