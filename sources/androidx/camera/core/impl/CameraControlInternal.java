package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public interface CameraControlInternal extends CameraControl {

    /* renamed from: a, reason: collision with root package name */
    public static final CameraControlInternal f474a = new AnonymousClass2();

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$2, reason: invalid class name */
    public class AnonymousClass2 implements CameraControlInternal {
        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture b(float f) {
            return Futures.g(null);
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture c(float f) {
            return Futures.g(null);
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture d(boolean z) {
            return Futures.g(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture e(int i, int i2, ArrayList arrayList) {
            return Futures.g(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture f(FocusMeteringAction focusMeteringAction) {
            return Futures.g(new FocusMeteringResult(false));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void h(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final Rect i() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void j(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final Config k() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void l(SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void o() {
        }
    }

    public static final class CameraControlException extends Exception {
    }

    public interface ControlUpdateCallback {
    }

    default void a() {
    }

    ListenableFuture e(int i, int i2, ArrayList arrayList);

    default void g() {
    }

    void h(Config config);

    Rect i();

    void j(int i);

    Config k();

    void l(SessionConfig.Builder builder);

    default ListenableFuture m(int i, int i2) {
        return Futures.g(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public final ListenableFuture a() {
                return Futures.g(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public final ListenableFuture b() {
                return Futures.g(null);
            }
        });
    }

    default void n(ImageCapture.ScreenFlash screenFlash) {
    }

    void o();
}
