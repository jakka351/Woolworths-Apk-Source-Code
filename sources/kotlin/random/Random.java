package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.jdk8.PlatformThreadLocalRandom;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/random/Random;", "", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Random {
    public static final Default d = new Default();
    public static final AbstractPlatformRandom e;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Serialized implements Serializable {
            public static final Serialized d = new Serialized();

            private final Object readResolve() {
                return Random.d;
            }
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.d;
        }

        @Override // kotlin.random.Random
        public final int a(int i) {
            return Random.e.a(i);
        }

        @Override // kotlin.random.Random
        public final double b() {
            return Random.e.b();
        }

        @Override // kotlin.random.Random
        public final double c(double d, double d2) {
            return Random.e.c(0.0d, 360.0d);
        }

        @Override // kotlin.random.Random
        public final int d() {
            return Random.e.d();
        }

        @Override // kotlin.random.Random
        public final int e(int i, int i2) {
            return Random.e.e(0, i2);
        }
    }

    static {
        e = JDK8PlatformImplementations.b(34) ? new PlatformThreadLocalRandom() : new FallbackThreadLocalRandom();
    }

    public abstract int a(int i);

    public double b() {
        return PlatformRandomKt.a(a(26), a(27));
    }

    public double c(double d2, double d3) {
        double dB;
        RandomKt.b(d2, d3);
        double d4 = d3 - d2;
        if (!Double.isInfinite(d4) || Math.abs(d2) > Double.MAX_VALUE || Math.abs(d3) > Double.MAX_VALUE) {
            dB = d2 + (b() * d4);
        } else {
            double d5 = 2;
            double dB2 = ((d3 / d5) - (d2 / d5)) * b();
            dB = d2 + dB2 + dB2;
        }
        return dB >= d3 ? Math.nextAfter(d3, Double.NEGATIVE_INFINITY) : dB;
    }

    public int d() {
        return a(32);
    }

    public int e(int i, int i2) {
        int iD;
        int i3;
        int iA;
        RandomKt.c(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(RandomKt.d(i4));
            } else {
                do {
                    iD = d() >>> 1;
                    i3 = iD % i4;
                } while ((i4 - 1) + (iD - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iD2 = d();
            if (i <= iD2 && iD2 < i2) {
                return iD2;
            }
        }
    }
}
