package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.List;

/* loaded from: classes6.dex */
public interface BarcodePickDrawer {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17769a = a.f17770a;

    void a();

    void a(int i);

    void a(TrackedObject trackedObject, BarcodePickState barcodePickState);

    void a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle);

    void a(List list);

    void b(TrackedObject trackedObject, BarcodePickState barcodePickState);

    boolean b();

    void start();

    void stop();
}
