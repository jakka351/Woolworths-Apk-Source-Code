package com.tealium.core.persistence;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/tealium/core/persistence/Expiry;", "", "a", "Companion", "b", "c", "d", "Lcom/tealium/core/persistence/Expiry$c;", "Lcom/tealium/core/persistence/Expiry$b;", "Lcom/tealium/core/persistence/Expiry$d;", "Lcom/tealium/core/persistence/Expiry$a;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class Expiry {

    /* renamed from: a, reason: collision with root package name */
    public static final Expiry f19166a = new c();
    public static final Expiry b = new b();
    public static final Expiry c = new d();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/persistence/Expiry$Companion;", "", "Lcom/tealium/core/persistence/Expiry;", "FOREVER", "Lcom/tealium/core/persistence/Expiry;", "SESSION", "UNTIL_RESTART", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static Expiry a(long j) {
            return j == -3 ? Expiry.c : j == -2 ? Expiry.f19166a : j == -1 ? Expiry.b : new a(j, 0L);
        }

        public static boolean b(Expiry expiry) {
            return (expiry == null || (expiry instanceof b) || (expiry instanceof c) || (expiry instanceof d) || expiry.b() >= 0) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/Expiry$a;", "Lcom/tealium/core/persistence/Expiry;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class a extends Expiry {
        public final long d;
        public final long e;

        public a(long j, long j2) {
            this.d = j;
            this.e = j2;
        }

        @Override // com.tealium.core.persistence.Expiry
        public final long a() {
            return this.e + this.d;
        }

        @Override // com.tealium.core.persistence.Expiry
        public final long b() {
            return (this.e + this.d) - n0.a();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/Expiry$b;", "Lcom/tealium/core/persistence/Expiry;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class b extends Expiry {
        @Override // com.tealium.core.persistence.Expiry
        public final long a() {
            return -1L;
        }

        @Override // com.tealium.core.persistence.Expiry
        public final long b() {
            return -1L;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/Expiry$c;", "Lcom/tealium/core/persistence/Expiry;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class c extends Expiry {
        @Override // com.tealium.core.persistence.Expiry
        public final long a() {
            return -2L;
        }

        @Override // com.tealium.core.persistence.Expiry
        public final long b() {
            return -2L;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/Expiry$d;", "Lcom/tealium/core/persistence/Expiry;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class d extends Expiry {
        @Override // com.tealium.core.persistence.Expiry
        public final long a() {
            return -3L;
        }

        @Override // com.tealium.core.persistence.Expiry
        public final long b() {
            return -3L;
        }
    }

    public abstract long a();

    public abstract long b();

    public final boolean equals(Object obj) {
        return (obj instanceof Expiry) && a() == ((Expiry) obj).a();
    }

    public final int hashCode() {
        long jA = a();
        return (Companion.b(this) ? 1 : 0) + ((((int) (jA ^ (jA >> 32))) + 217) * 31);
    }
}
