package androidx.camera.core.processing.util;

import YU.a;
import androidx.camera.core.processing.util.GraphicDeviceInfo;

/* loaded from: classes2.dex */
final class AutoValue_GraphicDeviceInfo extends GraphicDeviceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f557a;
    public final String b;
    public final String c;
    public final String d;

    public static final class Builder extends GraphicDeviceInfo.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f558a;
        public String b;
        public String c;
        public String d;

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final GraphicDeviceInfo a() {
            String strG = this.f558a == null ? " glVersion" : "";
            if (this.b == null) {
                strG = strG.concat(" eglVersion");
            }
            if (this.c == null) {
                strG = a.g(strG, " glExtensions");
            }
            if (this.d == null) {
                strG = a.g(strG, " eglExtensions");
            }
            if (strG.isEmpty()) {
                return new AutoValue_GraphicDeviceInfo(this.f558a, this.b, this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final GraphicDeviceInfo.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.d = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final GraphicDeviceInfo.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.b = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final GraphicDeviceInfo.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.c = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final GraphicDeviceInfo.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f558a = str;
            return this;
        }
    }

    public AutoValue_GraphicDeviceInfo(String str, String str2, String str3, String str4) {
        this.f557a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final String b() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final String c() {
        return this.b;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final String d() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final String e() {
        return this.f557a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GraphicDeviceInfo)) {
            return false;
        }
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) obj;
        return this.f557a.equals(graphicDeviceInfo.e()) && this.b.equals(graphicDeviceInfo.c()) && this.c.equals(graphicDeviceInfo.d()) && this.d.equals(graphicDeviceInfo.b());
    }

    public final int hashCode() {
        return ((((((this.f557a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f557a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return a.o(sb, this.d, "}");
    }
}
