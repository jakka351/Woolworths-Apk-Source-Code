package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class Joiner {

    /* renamed from: a, reason: collision with root package name */
    public final String f14862a;

    /* renamed from: com.google.common.base.Joiner$2, reason: invalid class name */
    class AnonymousClass2 extends Joiner {
        @Override // com.google.common.base.Joiner
        public final void a(StringBuilder sb, Iterator it) {
            Preconditions.j(it, "parts");
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
        }

        @Override // com.google.common.base.Joiner
        public final Joiner e() {
            throw null;
        }
    }

    /* renamed from: com.google.common.base.Joiner$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractList<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            if (i == 0 || i == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static final class MapJoiner {

        /* renamed from: a, reason: collision with root package name */
        public final Joiner f14863a;

        public MapJoiner(Joiner joiner) {
            this.f14863a = joiner;
        }

        public final void a(StringBuilder sb, Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Joiner joiner = this.f14863a;
                sb.append(joiner.d(key));
                sb.append("=");
                sb.append(joiner.d(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) joiner.f14862a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(joiner.d(entry2.getKey()));
                    sb.append("=");
                    sb.append(joiner.d(entry2.getValue()));
                }
            }
        }
    }

    public Joiner(String str) {
        str.getClass();
        this.f14862a = str;
    }

    public void a(StringBuilder sb, Iterator it) {
        if (it.hasNext()) {
            sb.append(d(it.next()));
            while (it.hasNext()) {
                sb.append((CharSequence) this.f14862a);
                sb.append(d(it.next()));
            }
        }
    }

    public final void b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public CharSequence d(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner e() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            public final CharSequence d(Object obj) {
                return obj == null ? "null" : Joiner.this.d(obj);
            }

            @Override // com.google.common.base.Joiner
            public final Joiner e() {
                throw null;
            }
        };
    }

    public Joiner(Joiner joiner) {
        this.f14862a = joiner.f14862a;
    }
}
