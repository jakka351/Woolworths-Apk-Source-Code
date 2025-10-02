package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public interface X4 {
    int a();

    void a(int i);

    void a(int i, int i2);

    void a(int i, boolean z);

    void a(J4 j4);

    void a(BarcodePickStatusIconStyle barcodePickStatusIconStyle);

    void a(Function0 function0);

    void a(Function1 function1);

    int b();

    void b(Function0 function0);

    void c();

    T4 d();

    int e();

    BarcodePickState f();

    View getView();
}
