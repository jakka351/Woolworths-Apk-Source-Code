package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.StreamSpec;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* loaded from: classes2.dex */
public abstract class AttachedSurfaceInfo {
    public static AttachedSurfaceInfo a(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List list, Config config, Range range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i, size, dynamicRange, list, config, range);
    }

    public abstract List b();

    public abstract DynamicRange c();

    public abstract int d();

    public abstract Config e();

    public abstract Size f();

    public abstract SurfaceConfig g();

    public abstract Range h();

    public final StreamSpec i(Camera2ImplConfig camera2ImplConfig) {
        StreamSpec.Builder builderA = StreamSpec.a(f());
        builderA.b(c());
        ((AutoValue_StreamSpec.Builder) builderA).d = camera2ImplConfig;
        if (h() != null) {
            builderA.c(h());
        }
        return builderA.a();
    }
}
