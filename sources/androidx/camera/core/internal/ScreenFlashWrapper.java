package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "Companion", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {

    /* renamed from: a, reason: collision with root package name */
    public final ImageCapture.ScreenFlash f530a;
    public final Object b = new Object();
    public boolean c;
    public ImageCapture.ScreenFlashListener d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper$Companion;", "", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.f530a = screenFlash;
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void a(long j, ImageCapture.ScreenFlashListener screenFlashListener) {
        Unit unit;
        Intrinsics.h(screenFlashListener, "screenFlashListener");
        synchronized (this.b) {
            this.c = true;
            this.d = screenFlashListener;
        }
        ImageCapture.ScreenFlash screenFlash = this.f530a;
        if (screenFlash != null) {
            screenFlash.a(j, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.c
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper this$0 = this.f533a;
                    Intrinsics.h(this$0, "this$0");
                    synchronized (this$0.b) {
                        try {
                            if (this$0.d == null) {
                                Logger.e("ScreenFlashWrapper", "apply: pendingListener is null!");
                            }
                            this$0.c();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Logger.b("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        Unit unit;
        synchronized (this.b) {
            try {
                if (this.c) {
                    ImageCapture.ScreenFlash screenFlash = this.f530a;
                    if (screenFlash != null) {
                        screenFlash.clear();
                        unit = Unit.f24250a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        Logger.b("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    Logger.e("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                ImageCapture.ScreenFlashListener screenFlashListener = this.d;
                if (screenFlashListener != null) {
                    screenFlashListener.onCompleted();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void clear() {
        b();
    }
}
