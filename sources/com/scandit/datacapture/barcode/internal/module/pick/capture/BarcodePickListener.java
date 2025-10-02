package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.core.data.FrameData;
import java.util.Map;

/* loaded from: classes6.dex */
public interface BarcodePickListener {
    void a(BarcodePickInternal barcodePickInternal);

    void a(BarcodePickInternal barcodePickInternal, BarcodePickSession barcodePickSession, FrameData frameData);

    void a(BarcodePickInternal barcodePickInternal, String str, boolean z);

    void a(BarcodePickInternal barcodePickInternal, Map map);

    void a(TrackedObject trackedObject);

    void b(BarcodePickInternal barcodePickInternal);

    void b(BarcodePickInternal barcodePickInternal, BarcodePickSession barcodePickSession, FrameData frameData);
}
