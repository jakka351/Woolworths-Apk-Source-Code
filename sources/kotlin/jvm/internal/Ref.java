package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class Ref {

    /* loaded from: classes.dex */
    public static final class BooleanRef implements Serializable {
        public boolean d;

        public final String toString() {
            return String.valueOf(this.d);
        }
    }

    public static final class ByteRef implements Serializable {
        public final String toString() {
            return String.valueOf(0);
        }
    }

    public static final class CharRef implements Serializable {
        public final String toString() {
            return String.valueOf((char) 0);
        }
    }

    public static final class DoubleRef implements Serializable {
        public final String toString() {
            return String.valueOf(0.0d);
        }
    }

    public static final class FloatRef implements Serializable {
        public float d;

        public final String toString() {
            return String.valueOf(this.d);
        }
    }

    /* loaded from: classes.dex */
    public static final class IntRef implements Serializable {
        public int d;

        public final String toString() {
            return String.valueOf(this.d);
        }
    }

    public static final class LongRef implements Serializable {
        public long d;

        public final String toString() {
            return String.valueOf(this.d);
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectRef<T> implements Serializable {
        public Object d;

        public final String toString() {
            return String.valueOf(this.d);
        }
    }

    public static final class ShortRef implements Serializable {
        public final String toString() {
            return String.valueOf(0);
        }
    }
}
