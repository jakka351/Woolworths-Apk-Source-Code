package androidx.camera.camera2.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoUsageControl {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f291a;
    public final AtomicInteger b = new AtomicInteger(0);

    public VideoUsageControl(Executor executor) {
        this.f291a = executor;
    }
}
