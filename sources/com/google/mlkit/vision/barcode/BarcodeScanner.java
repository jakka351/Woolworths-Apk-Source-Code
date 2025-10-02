package com.google.mlkit.vision.barcode;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;

/* loaded from: classes6.dex */
public interface BarcodeScanner extends Detector<List<Barcode>>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void close();
}
