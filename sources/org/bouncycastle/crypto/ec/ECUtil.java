package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
class ECUtil {
    public static BigInteger generateK(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, secureRandom);
            if (!bigIntegerCreateRandomBigInteger.equals(ECConstants.ZERO) && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
    }
}
