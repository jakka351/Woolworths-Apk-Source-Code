package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.UUID;

@AutoValue
/* loaded from: classes2.dex */
public abstract class OutConfig {
    public static OutConfig h(int i, int i2, Rect rect, Size size, int i3, boolean z) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i, i2, rect, size, i3, z);
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    public abstract UUID f();

    public abstract boolean g();

    public abstract boolean i();
}
