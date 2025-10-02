package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.PointF;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.InterfaceC0708l0;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public interface BarcodeFindViewLayout {
    void a();

    void a(int i, int i2);

    void a(int i, int i2, int i3, int i4);

    void a(RelativeLayout relativeLayout, InterfaceC0708l0 interfaceC0708l0);

    void a(BarcodeFindItem barcodeFindItem);

    void a(BarcodeFindViewPresenter barcodeFindViewPresenter);

    void a(Anchor anchor);

    void a(String str);

    void a(String str, NativeToastHintStyle nativeToastHintStyle, String str2);

    void a(ArrayList arrayList);

    void a(List list);

    void a(Map map, Set set);

    void a(Set set);

    void a(Function0 function0);

    void a(boolean z);

    void b(BarcodeFindItem barcodeFindItem);

    void b(String str);

    void b(boolean z);

    boolean b();

    void c(String str);

    void c(boolean z);

    boolean c();

    void d();

    void d(String str);

    void d(boolean z);

    void e(boolean z);

    boolean e();

    void f();

    void f(boolean z);

    void g();

    void g(boolean z);

    boolean getShouldShowHints();

    void h(boolean z);

    boolean h();

    Anchor i();

    boolean j();

    void k();

    void l();

    void m();

    PointF mapFramePointToView(Point point);

    void n();

    boolean o();

    String p();

    void setShouldShowHints(boolean z);
}
