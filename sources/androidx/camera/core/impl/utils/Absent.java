package androidx.camera.core.impl.utils;

/* loaded from: classes2.dex */
final class Absent<T> extends Optional<T> {
    public static final Absent d = new Absent();

    private Object readResolve() {
        return d;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
