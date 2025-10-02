package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class DiscreteDomain<C extends Comparable> {

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {
        public static final BigIntegerDomain d = new BigIntegerDomain(true);

        static {
            BigInteger.valueOf(Long.MIN_VALUE);
            BigInteger.valueOf(Long.MAX_VALUE);
        }

        private Object readResolve() {
            return d;
        }

        public final String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        public static final IntegerDomain d = new IntegerDomain(true);

        private Object readResolve() {
            return d;
        }

        public final String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        public static final LongDomain d = new LongDomain(true);

        private Object readResolve() {
            return d;
        }

        public final String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public DiscreteDomain() {
        this(false);
    }

    public DiscreteDomain(boolean z) {
    }
}
