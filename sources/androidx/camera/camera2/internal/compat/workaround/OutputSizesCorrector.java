package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;

/* loaded from: classes2.dex */
public class OutputSizesCorrector {

    /* renamed from: a, reason: collision with root package name */
    public final ExtraSupportedOutputSizeQuirk f357a = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.f327a.b(ExtraSupportedOutputSizeQuirk.class);
    public final ExcludedSupportedSizesContainer b;

    public OutputSizesCorrector(String str) {
        this.b = new ExcludedSupportedSizesContainer(str);
    }
}
