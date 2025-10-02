package com.scandit.datacapture.barcode.internal.module.count.ui;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodeCountViewSettings {
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private BarcodeCountToolbarSettings J;

    /* renamed from: a, reason: collision with root package name */
    private boolean f17719a;
    private Brush b;
    private Brush c;
    private Brush d;
    private BarcodeFilterHighlightSettings e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private Anchor q;
    private boolean r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public BarcodeCountViewSettings() {
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f17719a = barcodeCountViewDefaults.getShouldDisableModeOnExitButtonTapped();
        barcodeCountViewDefaults.getTapToUncountEnabled();
        BarcodeCountBasicOverlay.Companion companion = BarcodeCountBasicOverlay.INSTANCE;
        this.b = companion.defaultRecognizedBrush();
        this.c = companion.defaultUnrecognizedBrush();
        this.d = companion.defaultNotInListBrush();
        this.f = barcodeCountViewDefaults.getShouldShowClearHighlightsButton();
        this.g = barcodeCountViewDefaults.getShouldShowExitButton();
        this.h = barcodeCountViewDefaults.getShouldShowFloatingShutterButton();
        this.i = barcodeCountViewDefaults.getShouldShowListButton();
        this.j = barcodeCountViewDefaults.getShouldShowShutterButton();
        this.k = barcodeCountViewDefaults.getShouldShowSingleScanButton();
        this.l = barcodeCountViewDefaults.getShouldShowStatusModeButton();
        this.m = barcodeCountViewDefaults.getShouldShowToolbar();
        this.n = barcodeCountViewDefaults.getShouldShowUserGuidanceView();
        this.o = barcodeCountViewDefaults.getShouldShowListProgressBar();
        this.p = barcodeCountViewDefaults.getShouldShowTorchControl();
        this.q = barcodeCountViewDefaults.getTorchControlPosition();
        this.r = barcodeCountViewDefaults.getShouldShowScanAreaGuides();
        this.s = barcodeCountViewDefaults.getShouldShowHints();
        this.t = barcodeCountViewDefaults.getClearHighlightsButtonText();
        this.u = barcodeCountViewDefaults.getExitButtonText();
        this.v = barcodeCountViewDefaults.getClearHighlightsButtonContentDescription();
        this.w = barcodeCountViewDefaults.getExitButtonContentDescription();
        this.x = barcodeCountViewDefaults.getFloatingShutterButtonContentDescription();
        this.y = barcodeCountViewDefaults.getListButtonContentDescription();
        this.z = barcodeCountViewDefaults.getSingleScanButtonContentDescription();
        this.A = barcodeCountViewDefaults.getShutterButtonContentDescription();
        this.B = barcodeCountViewDefaults.getStatusModeButtonContentDescription();
        this.C = barcodeCountViewDefaults.getTextForUnrecognizedBarcodesDetectedHint();
        this.D = barcodeCountViewDefaults.getTextForBarcodesNotInListDetectedHint();
        this.E = barcodeCountViewDefaults.getTextForTapShutterToScanHint();
        this.F = barcodeCountViewDefaults.getTextForScanningHint();
        this.G = barcodeCountViewDefaults.getTextForMoveCloserAndRescanHint();
        this.H = barcodeCountViewDefaults.getTextForMoveFurtherAndRescanHint();
        this.I = barcodeCountViewDefaults.getTextForTapToUncountHint();
        this.J = new BarcodeCountToolbarSettings();
    }

    public final String A() {
        return this.D;
    }

    public final String B() {
        return this.G;
    }

    public final String C() {
        return this.H;
    }

    public final String D() {
        return this.F;
    }

    public final String E() {
        return this.E;
    }

    public final String F() {
        return this.I;
    }

    public final String G() {
        return this.C;
    }

    public final BarcodeCountToolbarSettings H() {
        return this.J;
    }

    public final Anchor I() {
        return this.q;
    }

    public final Brush J() {
        return this.c;
    }

    public final void a(boolean z) {
        this.f17719a = z;
    }

    public final void b(Brush brush) {
        this.b = brush;
    }

    public final void c(Brush brush) {
        this.c = brush;
    }

    public final void d(boolean z) {
        this.h = z;
    }

    public final BarcodeFilterHighlightSettings e() {
        return this.e;
    }

    public final void f(boolean z) {
        this.i = z;
    }

    public final void g(boolean z) {
        this.o = z;
    }

    public final Brush h() {
        return this.d;
    }

    public final Brush i() {
        return this.b;
    }

    public final boolean j() {
        return this.f17719a;
    }

    public final boolean k() {
        return this.f;
    }

    public final boolean l() {
        return this.g;
    }

    public final boolean m() {
        return this.h;
    }

    public final void n(boolean z) {
        this.n = z;
    }

    public final boolean o() {
        return this.i;
    }

    public final boolean p() {
        return this.o;
    }

    public final boolean q() {
        return this.r;
    }

    public final boolean r() {
        return this.j;
    }

    public final boolean s() {
        return this.k;
    }

    public final boolean t() {
        return this.l;
    }

    public final boolean u() {
        return this.m;
    }

    public final boolean v() {
        return this.p;
    }

    public final boolean w() {
        return this.n;
    }

    public final String x() {
        return this.A;
    }

    public final String y() {
        return this.z;
    }

    public final String z() {
        return this.B;
    }

    public final void a(Brush brush) {
        this.d = brush;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final void c(boolean z) {
        this.g = z;
    }

    public final String d() {
        return this.u;
    }

    public final void e(boolean z) {
        this.s = z;
    }

    public final String f() {
        return this.x;
    }

    public final String g() {
        return this.y;
    }

    public final void h(boolean z) {
        this.r = z;
    }

    public final void i(boolean z) {
        this.j = z;
    }

    public final void j(boolean z) {
        this.k = z;
    }

    public final void k(boolean z) {
        this.l = z;
    }

    public final void l(boolean z) {
        this.m = z;
    }

    public final void m(boolean z) {
        this.p = z;
    }

    public final boolean n() {
        return this.s;
    }

    public final void o(String str) {
        Intrinsics.h(str, "<set-?>");
        this.I = str;
    }

    public final void p(String str) {
        Intrinsics.h(str, "<set-?>");
        this.C = str;
    }

    public final void a(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.e = barcodeFilterHighlightSettings;
    }

    public final String b() {
        return this.t;
    }

    public final String c() {
        return this.w;
    }

    public final void d(String str) {
        Intrinsics.h(str, "<set-?>");
        this.u = str;
    }

    public final void e(String str) {
        Intrinsics.h(str, "<set-?>");
        this.x = str;
    }

    public final void f(String str) {
        Intrinsics.h(str, "<set-?>");
        this.y = str;
    }

    public final void g(String str) {
        Intrinsics.h(str, "<set-?>");
        this.A = str;
    }

    public final void h(String str) {
        Intrinsics.h(str, "<set-?>");
        this.z = str;
    }

    public final void i(String str) {
        Intrinsics.h(str, "<set-?>");
        this.B = str;
    }

    public final void j(String str) {
        Intrinsics.h(str, "<set-?>");
        this.D = str;
    }

    public final void k(String str) {
        Intrinsics.h(str, "<set-?>");
        this.G = str;
    }

    public final void l(String str) {
        Intrinsics.h(str, "<set-?>");
        this.H = str;
    }

    public final void m(String str) {
        Intrinsics.h(str, "<set-?>");
        this.F = str;
    }

    public final void n(String str) {
        Intrinsics.h(str, "<set-?>");
        this.E = str;
    }

    public final void a(Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.q = anchor;
    }

    public final void b(String str) {
        Intrinsics.h(str, "<set-?>");
        this.t = str;
    }

    public final void c(String str) {
        Intrinsics.h(str, "<set-?>");
        this.w = str;
    }

    public final String a() {
        return this.v;
    }

    public final void a(String str) {
        Intrinsics.h(str, "<set-?>");
        this.v = str;
    }

    public final void a(BarcodeCountToolbarSettings barcodeCountToolbarSettings) {
        Intrinsics.h(barcodeCountToolbarSettings, "<set-?>");
        this.J = barcodeCountToolbarSettings;
    }
}
