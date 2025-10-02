package androidx.camera.core;

import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class ImageProxyDownsampler {

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$1, reason: invalid class name */
    class AnonymousClass1 implements ImageProxy.PlaneProxy {
        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final ByteBuffer q() {
            return null;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int r() {
            return 0;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int s() {
            return 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DownsamplingMethod {
        public static final /* synthetic */ DownsamplingMethod[] d = {new DownsamplingMethod("NEAREST_NEIGHBOR", 0), new DownsamplingMethod("AVERAGING", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        DownsamplingMethod EF5;

        public static DownsamplingMethod valueOf(String str) {
            return (DownsamplingMethod) Enum.valueOf(DownsamplingMethod.class, str);
        }

        public static DownsamplingMethod[] values() {
            return (DownsamplingMethod[]) d.clone();
        }
    }

    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getHeight() {
            return 0;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final ImageProxy.PlaneProxy[] getPlanes() {
            return null;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getWidth() {
            return 0;
        }
    }
}
