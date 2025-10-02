package androidx.camera.view.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.quirk.a;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;

/* loaded from: classes2.dex */
public class DeviceQuirks {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Quirks f663a;

    static {
        QuirkSettingsHolder.c.a(CameraXExecutors.a(), new a(3));
    }
}
