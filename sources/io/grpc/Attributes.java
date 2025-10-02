package io.grpc;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

@ExperimentalApi
@Immutable
/* loaded from: classes7.dex */
public final class Attributes {
    public static final Attributes b = new Attributes(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f23916a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Attributes f23917a;
        public IdentityHashMap b;

        public Builder(Attributes attributes) {
            this.f23917a = attributes;
        }

        public final Attributes a() {
            if (this.b != null) {
                for (Map.Entry entry : this.f23917a.f23916a.entrySet()) {
                    if (!this.b.containsKey(entry.getKey())) {
                        this.b.put((Key) entry.getKey(), entry.getValue());
                    }
                }
                this.f23917a = new Attributes(this.b);
                this.b = null;
            }
            return this.f23917a;
        }

        public final void b(Key key, Object obj) {
            if (this.b == null) {
                this.b = new IdentityHashMap(1);
            }
            this.b.put(key, obj);
        }
    }

    @Immutable
    public static final class Key<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f23918a;

        public Key(String str) {
            this.f23918a = str;
        }

        public final String toString() {
            return this.f23918a;
        }
    }

    public Attributes(IdentityHashMap identityHashMap) {
        this.f23916a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Attributes.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((Attributes) obj).f23916a;
        IdentityHashMap identityHashMap2 = this.f23916a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !Objects.a(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f23916a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f23916a.toString();
    }
}
