package org.bouncycastle.crypto.constraints;

import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: classes8.dex */
public class ConstraintUtils {
    public static int bitsOfSecurityFor(BigInteger bigInteger) {
        return bitsOfSecurityForFF(bigInteger.bitLength());
    }

    public static int bitsOfSecurityForFF(int i) {
        if (i < 2048) {
            return i >= 1024 ? 80 : 20;
        }
        if (i < 3072) {
            return 112;
        }
        if (i < 7680) {
            return 128;
        }
        if (i >= 15360) {
            return 256;
        }
        return BERTags.PRIVATE;
    }

    public static int bitsOfSecurityFor(ECCurve eCCurve) {
        int fieldSize = (eCCurve.getFieldSize() + 1) / 2;
        if (fieldSize > 256) {
            return 256;
        }
        return fieldSize;
    }
}
