package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0745n5 implements InterfaceC0729m5 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17858a;
    private final Function0 b;
    private final Function0 c;
    private final Function0 d;
    private final Function0 e;
    private EnumC0648h4 f;
    private C4 g;

    public C0745n5(Function0 startScanning, Function0 stopScanning, Function0 onFreezeScanning, Function0 release, Function0 resetScanning, EnumC0648h4 initialLifecycleState, C4 initialScanState) {
        Intrinsics.h(startScanning, "startScanning");
        Intrinsics.h(stopScanning, "stopScanning");
        Intrinsics.h(onFreezeScanning, "onFreezeScanning");
        Intrinsics.h(release, "release");
        Intrinsics.h(resetScanning, "resetScanning");
        Intrinsics.h(initialLifecycleState, "initialLifecycleState");
        Intrinsics.h(initialScanState, "initialScanState");
        this.f17858a = startScanning;
        this.b = stopScanning;
        this.c = onFreezeScanning;
        this.d = release;
        this.e = resetScanning;
        this.f = initialLifecycleState;
        this.g = initialScanState;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void a() {
        C4 c4D = d();
        C4 c4 = C4.Frozen;
        if (c4D == c4) {
            return;
        }
        this.g = c4;
        EnumC0648h4 enumC0648h4G = g();
        enumC0648h4G.getClass();
        if (enumC0648h4G == EnumC0648h4.Resumed) {
            this.c.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void b() {
        EnumC0648h4 enumC0648h4G = g();
        EnumC0648h4 enumC0648h4 = EnumC0648h4.Resumed;
        if (enumC0648h4G == enumC0648h4) {
            return;
        }
        this.f = enumC0648h4;
        if (d().a()) {
            this.f17858a.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void c() {
        try {
            if (d().a()) {
                a();
            } else {
                start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0761o5
    public final synchronized C4 d() {
        return this.g;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void e() {
        EnumC0648h4 enumC0648h4G = g();
        EnumC0648h4 enumC0648h4 = EnumC0648h4.Paused;
        if (enumC0648h4G == enumC0648h4) {
            return;
        }
        this.f = enumC0648h4;
        if (d().a()) {
            this.b.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void f() {
        try {
            EnumC0648h4 enumC0648h4G = g();
            EnumC0648h4 enumC0648h4 = EnumC0648h4.Destroyed;
            if (enumC0648h4G == enumC0648h4) {
                return;
            }
            this.f = enumC0648h4;
            if (d().a()) {
                stop();
            }
            this.d.invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized EnumC0648h4 g() {
        return this.f;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void reset() {
        this.e.invoke();
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void start() {
        C4 c4D = d();
        C4 c4 = C4.Started;
        if (c4D == c4) {
            return;
        }
        this.g = c4;
        EnumC0648h4 enumC0648h4G = g();
        enumC0648h4G.getClass();
        if (enumC0648h4G == EnumC0648h4.Resumed) {
            this.f17858a.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0729m5
    public final synchronized void stop() {
        C4 c4D = d();
        C4 c4 = C4.Stopped;
        if (c4D == c4) {
            return;
        }
        this.g = c4;
        this.b.invoke();
    }
}
