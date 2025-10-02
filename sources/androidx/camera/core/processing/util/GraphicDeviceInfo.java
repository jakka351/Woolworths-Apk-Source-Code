package androidx.camera.core.processing.util;

import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;
import com.google.auto.value.AutoValue;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class GraphicDeviceInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract GraphicDeviceInfo a();

        public abstract Builder b(String str);

        public abstract Builder c(String str);

        public abstract Builder d(String str);

        public abstract Builder e(String str);
    }

    public static Builder a() {
        AutoValue_GraphicDeviceInfo.Builder builder = new AutoValue_GraphicDeviceInfo.Builder();
        builder.f558a = "0.0";
        builder.b = "0.0";
        builder.c = "";
        builder.d = "";
        return builder;
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
