package androidx.camera.core.impl.utils;

/* loaded from: classes2.dex */
final class Present<T> extends Optional<T> {
    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Optional.of(null)";
    }
}
