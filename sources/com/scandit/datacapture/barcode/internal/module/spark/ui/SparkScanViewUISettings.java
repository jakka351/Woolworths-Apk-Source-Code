package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SparkScanViewUISettings {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f17778a = new CopyOnWriteArrayList();
    private boolean b = SparkScanViewDefaults.getDefaultScanningBehaviorButtonVisible();
    private boolean c = SparkScanViewDefaults.getDefaultHandModeButtonVisible();
    private boolean d = SparkScanViewDefaults.getDefaultTorchButtonVisible();
    private boolean e = SparkScanViewDefaults.getDefaultBarcodeCountButtonVisible();
    private boolean f = SparkScanViewDefaults.getDefaultBarcodeFindButtonVisible();
    private boolean g = SparkScanViewDefaults.getDefaultTargetModeButtonVisible();
    private boolean h = SparkScanViewDefaults.getDefaultSoundModeButtonVisible();
    private boolean i = SparkScanViewDefaults.getDefaultHapticModeButtonVisible();
    private boolean j = SparkScanViewDefaults.getDefaultCameraSwitchButtonVisible();
    private String k = SparkScanViewDefaults.getDefaultStopCapturingText();
    private String l = SparkScanViewDefaults.getDefaultStartCapturingText();
    private String m = SparkScanViewDefaults.getDefaultResumeCapturingText();
    private String n = SparkScanViewDefaults.getDefaultScanningCapturingText();
    private Integer o = SparkScanViewDefaults.getDefaultCaptureButtonActiveBackgroundColor();
    private Integer p = SparkScanViewDefaults.getDefaultCaptureButtonBackgroundColor();
    private Integer q = SparkScanViewDefaults.getDefaultCaptureButtonTintColor();
    private Integer r = SparkScanViewDefaults.getDefaultToolbarBackgroundColor();
    private Integer s = SparkScanViewDefaults.getDefaultToolbarIconActiveTintColor();
    private Integer t = SparkScanViewDefaults.getDefaultToolbarIconInactiveTintColor();

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c() {
        return this.j;
    }

    public final void d(boolean z) {
        this.c = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("handModeButtonVisible");
        }
    }

    public final void e(boolean z) {
        this.i = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("hapticModeButtonVisible");
        }
    }

    public final void f(boolean z) {
        this.b = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("scanningBehaviorButtonVisible");
        }
    }

    public final boolean g() {
        return this.c;
    }

    public final void h(boolean z) {
        this.g = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("targetModeButtonVisible");
        }
    }

    public final void i(boolean z) {
        this.d = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("torchButtonVisible");
        }
    }

    public final boolean j() {
        return this.b;
    }

    public final String k() {
        return this.n;
    }

    public final CopyOnWriteArrayList l() {
        return this.f17778a;
    }

    public final boolean m() {
        return this.h;
    }

    public final String n() {
        return this.l;
    }

    public final String o() {
        return this.k;
    }

    public final boolean p() {
        return this.g;
    }

    public final Integer q() {
        return this.r;
    }

    public final Integer r() {
        return this.s;
    }

    public final Integer s() {
        return this.t;
    }

    public final boolean t() {
        return this.d;
    }

    public final void a(boolean z) {
        this.e = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("barcodeCountButtonVisible");
        }
    }

    public final void b(boolean z) {
        this.f = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("barcodeFindButtonVisible");
        }
    }

    public final void c(boolean z) {
        this.j = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("cameraSwitchButtonVisible");
        }
    }

    public final void g(boolean z) {
        this.h = z;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("soundModeButtonVisible");
        }
    }

    public final void d(String str) {
        this.k = str;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("stopCapturingText");
        }
    }

    public final Integer e() {
        return this.p;
    }

    public final Integer f() {
        return this.q;
    }

    public final boolean h() {
        return this.i;
    }

    public final String i() {
        return this.m;
    }

    public final void a(String str) {
        this.m = str;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("resumeCapturingText");
        }
    }

    public final void b(String str) {
        this.n = str;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("scanningCapturingText");
        }
    }

    public final void c(String str) {
        this.l = str;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("startCapturingText");
        }
    }

    public final void e(Integer num) {
        this.s = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("toolbarIconActiveTintColor");
        }
    }

    public final void f(Integer num) {
        this.t = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("toolbarIconInactiveTintColor");
        }
    }

    public final Integer d() {
        return this.o;
    }

    public final void a(Integer num) {
        this.o = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("captureButtonActiveBackgroundColor");
        }
    }

    public final void b(Integer num) {
        this.p = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("captureButtonBackgroundColor");
        }
    }

    public final void c(Integer num) {
        this.q = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("captureButtonTintColor");
        }
    }

    public final void d(Integer num) {
        this.r = num;
        Iterator it = this.f17778a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke("toolbarBackgroundColor");
        }
    }
}
