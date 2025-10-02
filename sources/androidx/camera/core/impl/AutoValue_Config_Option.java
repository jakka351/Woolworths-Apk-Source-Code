package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* loaded from: classes2.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f459a;
    public final Class b;
    public final Object c;

    public AutoValue_Config_Option(Class cls, Object obj, String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f459a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = obj;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final String c() {
        return this.f459a;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final Object d() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final Class e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (!this.f459a.equals(option.c()) || !this.b.equals(option.e())) {
            return false;
        }
        Object obj2 = this.c;
        return obj2 == null ? option.d() == null : obj2.equals(option.d());
    }

    public final int hashCode() {
        int iHashCode = (((this.f459a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.f459a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return android.support.v4.media.session.a.o(this.c, "}", sb);
    }
}
