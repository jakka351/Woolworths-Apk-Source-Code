package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;

/* loaded from: classes2.dex */
public interface UseCaseConfigFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final UseCaseConfigFactory f507a = new AnonymousClass1();

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements UseCaseConfigFactory {
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public final Config a(CaptureType captureType, int i) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CaptureType {
        public static final CaptureType d;
        public static final CaptureType e;
        public static final CaptureType f;
        public static final CaptureType g;
        public static final CaptureType h;
        public static final CaptureType i;
        public static final /* synthetic */ CaptureType[] j;

        static {
            CaptureType captureType = new CaptureType("IMAGE_CAPTURE", 0);
            d = captureType;
            CaptureType captureType2 = new CaptureType("PREVIEW", 1);
            e = captureType2;
            CaptureType captureType3 = new CaptureType("IMAGE_ANALYSIS", 2);
            f = captureType3;
            CaptureType captureType4 = new CaptureType("VIDEO_CAPTURE", 3);
            g = captureType4;
            CaptureType captureType5 = new CaptureType("STREAM_SHARING", 4);
            h = captureType5;
            CaptureType captureType6 = new CaptureType("METERING_REPEATING", 5);
            i = captureType6;
            j = new CaptureType[]{captureType, captureType2, captureType3, captureType4, captureType5, captureType6};
        }

        public static CaptureType valueOf(String str) {
            return (CaptureType) Enum.valueOf(CaptureType.class, str);
        }

        public static CaptureType[] values() {
            return (CaptureType[]) j.clone();
        }
    }

    public interface Provider {
        Camera2UseCaseConfigFactory a(Context context);
    }

    Config a(CaptureType captureType, int i);
}
