package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B implements BarcodeCountBrushHandler {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0627g f17099a;
    private final ConcurrentHashMap b;
    private final ConcurrentHashMap c;
    private final ConcurrentHashMap d;

    public B(BarcodeCountBasicOverlay delegate) {
        Intrinsics.h(delegate, "delegate");
        this.f17099a = delegate;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public static final Brush e(B b) {
        return b.f17099a.getNotInListBrush();
    }

    public static final Brush f(B b) {
        return b.f17099a.getRecognizedBrush();
    }

    public static final Brush g(B b) {
        return b.f17099a.getUnrecognizedBrush();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void a(TrackedBarcode barcode, Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.b.put(Integer.valueOf(barcode.getIdentifier()), brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void b(TrackedBarcode barcode, Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.d.put(Integer.valueOf(barcode.getIdentifier()), brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void c(TrackedBarcode barcode, Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.c.put(Integer.valueOf(barcode.getIdentifier()), brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final Brush a(TrackedBarcode barcode, EnumC0813r9 scanStatus, EnumC0668i8 listStatus) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(scanStatus, "scanStatus");
        Intrinsics.h(listStatus, "listStatus");
        if (((Boolean) a(scanStatus, listStatus, barcode, new C0893w(this, barcode), new C0908x(this, barcode), new C0923y(this, barcode), C0938z.f18279a, A.f17085a)).booleanValue()) {
            return (Brush) a(scanStatus, listStatus, barcode, new C0803r(this, barcode), new C0818s(this, barcode), new C0840t(this, barcode), C0863u.f18214a, C0878v.f18230a);
        }
        if (this.f17099a.isListenerSet()) {
            return (Brush) a(scanStatus, listStatus, barcode, new C0723m(this), new C0739n(this), new C0755o(this), new C0770p(this), C0788q.f17975a);
        }
        return (Brush) a(scanStatus, listStatus, Unit.f24250a, new C0643h(this), new C0659i(this), new C0675j(this), C0691k.f17825a, C0707l.f17834a);
    }

    private static Object a(EnumC0813r9 enumC0813r9, EnumC0668i8 enumC0668i8, Object obj, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        EnumC0813r9 enumC0813r92 = EnumC0813r9.SCANNED;
        if (enumC0813r9 == enumC0813r92 && (enumC0668i8 == EnumC0668i8.NOT_USING_LIST || enumC0668i8 == EnumC0668i8.IN_LIST)) {
            return function1.invoke(obj);
        }
        if (enumC0813r9 == enumC0813r92 && enumC0668i8 == EnumC0668i8.NOT_IN_LIST) {
            return function13.invoke(obj);
        }
        if (enumC0813r9 == EnumC0813r9.UNSCANNED) {
            return function12.invoke(obj);
        }
        if (enumC0813r9 == EnumC0813r9.FILTERED_OUT) {
            return function14.invoke(obj);
        }
        return function15.invoke(obj);
    }
}
