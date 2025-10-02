package androidx.camera.camera2.internal;

import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a;

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f380a) {
            case 0:
                int i = Camera2CapturePipeline.ScreenFlashTask.g;
                return Boolean.FALSE;
            case 1:
                int i2 = Camera2CapturePipeline.TorchTask.h;
                return Boolean.FALSE;
            case 2:
                return Boolean.TRUE;
            case 3:
                return null;
            default:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
        }
    }
}
