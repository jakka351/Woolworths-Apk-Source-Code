package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.encoder.SystemTimeProvider;
import androidx.camera.video.internal.encoder.TimeProvider;

/* loaded from: classes2.dex */
public class VideoTimebaseConverter {

    /* renamed from: a, reason: collision with root package name */
    public final TimeProvider f639a;
    public final Timebase b;
    public final CameraUseInconsistentTimebaseQuirk c;
    public long d = -1;
    public Timebase e;

    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f640a;

        static {
            int[] iArr = new int[Timebase.values().length];
            f640a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f640a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoTimebaseConverter(SystemTimeProvider systemTimeProvider, Timebase timebase, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f639a = systemTimeProvider;
        this.b = timebase;
        this.c = cameraUseInconsistentTimebaseQuirk;
    }
}
