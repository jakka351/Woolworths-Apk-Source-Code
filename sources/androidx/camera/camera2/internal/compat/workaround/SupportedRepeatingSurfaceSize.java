package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: classes2.dex */
public class SupportedRepeatingSurfaceSize {
    public static final Size b = new Size(DilithiumEngine.DilithiumPolyT1PackedBytes, 240);
    public static final CompareSizesByArea c = new CompareSizesByArea(false);

    /* renamed from: a, reason: collision with root package name */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f365a = (RepeatingStreamConstraintForVideoRecordingQuirk) DeviceQuirks.f327a.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);
}
