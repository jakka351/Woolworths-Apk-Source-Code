package androidx.camera.core.impl;

/* loaded from: classes2.dex */
final class AutoValue_Identifier extends Identifier {

    /* renamed from: a, reason: collision with root package name */
    public final Object f463a;

    public AutoValue_Identifier(Object obj) {
        this.f463a = obj;
    }

    @Override // androidx.camera.core.impl.Identifier
    public final Object b() {
        return this.f463a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identifier) {
            return this.f463a.equals(((Identifier) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f463a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.session.a.o(this.f463a, "}", new StringBuilder("Identifier{value="));
    }
}
