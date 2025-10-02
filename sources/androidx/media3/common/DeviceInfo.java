package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
public final class DeviceInfo {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2851a = 0;
    public final int b = 0;

    public static final class Builder {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
    }

    public DeviceInfo(Builder builder) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f2851a == deviceInfo.f2851a && this.b == deviceInfo.b;
    }

    public final int hashCode() {
        return (((16337 + this.f2851a) * 31) + this.b) * 31;
    }
}
