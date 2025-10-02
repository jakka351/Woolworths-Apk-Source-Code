package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;

/* loaded from: classes2.dex */
class StreamConfigurationMapCompatBaseImpl implements StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f308a;

    @RequiresApi
    public static class Api23Impl {
    }

    public StreamConfigurationMapCompatBaseImpl(StreamConfigurationMap streamConfigurationMap) {
        this.f308a = streamConfigurationMap;
    }
}
