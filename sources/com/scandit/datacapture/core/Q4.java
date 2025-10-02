package com.scandit.datacapture.core;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import com.scandit.datacapture.core.internal.sdk.ui.hint.GuidanceHint;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.ToastHint;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q4 extends NativePlatformHintPresenter {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18364a;
    private WeakReference b;
    private final AtomicBoolean c;
    private final AtomicLong d;
    private final WeakReference e;
    private final P4 f;

    public /* synthetic */ Q4(HintHolderV2 hintHolderV2) {
        this(hintHolderV2, new Handler(Looper.getMainLooper()));
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideGuidance(NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.mo317hideGuidancexQ0zqIA(GuidanceHint.m307constructorimpl(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideToast(NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.mo318hideToastsNLnd7M(ToastHint.m328constructorimpl(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void setHintPresenter(NativeHintPresenterV2 presenter) {
        Intrinsics.h(presenter, "presenter");
        this.b = new WeakReference(presenter);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showGuidance(NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.mo319showGuidancexQ0zqIA(GuidanceHint.m307constructorimpl(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showToast(NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.mo320showToastsNLnd7M(ToastHint.m328constructorimpl(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void startUpdateTimer(long j) {
        this.c.set(true);
        this.d.set(j);
        this.f18364a.removeCallbacks(this.f);
        this.f18364a.post(this.f);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void stopUpdateTimer() {
        this.c.set(false);
        this.f18364a.removeCallbacks(this.f);
    }

    public Q4(HintHolderV2 hintHolder, Handler handler) {
        Intrinsics.h(hintHolder, "hintHolder");
        Intrinsics.h(handler, "handler");
        this.f18364a = handler;
        this.b = new WeakReference(null);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicLong(Long.MAX_VALUE);
        this.e = new WeakReference(hintHolder);
        this.f = new P4(this);
    }
}
