package androidx.camera.core.impl;

import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.Map;

@AutoValue
/* loaded from: classes2.dex */
public abstract class SurfaceSizeDefinition {
    public static SurfaceSizeDefinition a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        return new AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4);
    }

    public abstract Size b();

    public abstract Map c();

    public abstract Size d();

    public abstract Size e();

    public abstract Map f();

    public abstract Map g();

    public abstract Map h();
}
