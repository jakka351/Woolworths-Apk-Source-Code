package coil3.memory;

import coil3.Image;
import coil3.util.Collections_jvmCommonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil3/memory/MemoryCache;", "", "Key", "Value", "Builder", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MemoryCache {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/MemoryCache$Builder;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public a f13112a;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/MemoryCache$Key;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key {

        /* renamed from: a, reason: collision with root package name */
        public final String f13113a;
        public final Map b;

        public Key(String str, Map map) {
            this.f13113a = str;
            this.b = Collections_jvmCommonKt.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.c(this.f13113a, key.f13113a) && Intrinsics.c(this.b, key.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f13113a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(key=");
            sb.append(this.f13113a);
            sb.append(", extras=");
            return android.support.v4.media.session.a.u(sb, this.b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/MemoryCache$Value;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Value {

        /* renamed from: a, reason: collision with root package name */
        public final Image f13114a;
        public final Map b;

        public Value(Image image, Map map) {
            this.f13114a = image;
            this.b = Collections_jvmCommonKt.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.c(this.f13114a, value.f13114a) && Intrinsics.c(this.b, value.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f13114a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Value(image=");
            sb.append(this.f13114a);
            sb.append(", extras=");
            return android.support.v4.media.session.a.u(sb, this.b, ')');
        }
    }

    void a(long j);

    Value b(Key key);

    void c(Key key, Value value);

    void clear();

    long getSize();
}
