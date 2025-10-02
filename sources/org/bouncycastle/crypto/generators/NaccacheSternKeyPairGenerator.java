package org.bouncycastle.crypto.generators;

import YU.a;
import com.google.android.gms.wallet.WalletConstants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) throws IllegalArgumentException {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = iNextInt % i;
        } while ((i - 1) + (iNextInt - i2) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws IllegalArgumentException {
        long j;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        BigInteger bigInteger6;
        PrintStream printStream;
        StringBuilder sb;
        int i;
        BigInteger bigIntegerCreateRandomPrime;
        int i2;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply = ONE;
        BigInteger bigIntegerMultiply2 = bigIntegerMultiply;
        for (int i3 = 0; i3 < vectorPermuteList.size() / 2; i3++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(i3));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2.multiply(bigIntegerMultiply);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j = j2 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply4 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply4.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (!bigIntegerMultiply3.gcd(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (z) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sbR = a.r(strength, "key size too small. Should be ", " but is actually ");
                        sbR.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbR.toString());
                    }
                }
            } else {
                z = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
            }
            j2 = j;
            zIsDebug = z;
            bigIntegerShiftLeft2 = bigInteger2;
        }
        if (z) {
            bigInteger3 = bigIntegerGeneratePrime4;
            System.out.println("needed " + j + " tries to generate p and q.");
        } else {
            bigInteger3 = bigIntegerGeneratePrime4;
        }
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = bigIntegerAdd;
            bigInteger5 = bigIntegerAdd2;
            int i4 = 0;
            while (i4 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i4));
                while (true) {
                    j3++;
                    i = i4;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i2 = strength;
                    secureRandom = random;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply5).equals(ONE)) {
                        i4 = i;
                        strength = i2;
                        random = secureRandom;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i4 = i + 1;
                strength = i2;
                random = secureRandom;
            }
            int i5 = strength;
            SecureRandom secureRandom2 = random;
            bigIntegerMod = ONE;
            for (int i6 = 0; i6 < vectorPermuteList.size(); i6++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i6)).modPow(bigIntegerMultiply3.divide((BigInteger) vectorPermuteList.elementAt(i6)), bigIntegerMultiply5)).mod(bigIntegerMultiply5);
            }
            int i7 = 0;
            while (true) {
                if (i7 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply5);
                    BigInteger bigInteger7 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger7)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply5).equals(bigInteger7)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply5).equals(bigInteger7)) {
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime3), bigIntegerMultiply5).equals(bigInteger7)) {
                                    bigInteger6 = bigInteger3;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply5).equals(bigInteger7)) {
                                        break;
                                    }
                                    if (z) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else if (z) {
                                    printStream = System.out;
                                    sb = new StringBuilder("g has order phi(n)/a\n g: ");
                                    sb.append(bigIntegerMod);
                                    printStream.println(sb.toString());
                                }
                            } else if (z) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb.append(bigIntegerMod);
                                printStream.println(sb.toString());
                            }
                        } else if (z) {
                            printStream = System.out;
                            sb = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb.append(bigIntegerMod);
                            printStream.println(sb.toString());
                        }
                    } else if (z) {
                        printStream = System.out;
                        sb = new StringBuilder("g has order phi(n)/4\n g:");
                        sb.append(bigIntegerMod);
                        printStream.println(sb.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i7)), bigIntegerMultiply5).equals(ONE)) {
                    i7++;
                } else if (z) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i7) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger6 = bigInteger3;
            bigInteger3 = bigInteger6;
            bigIntegerAdd2 = bigInteger5;
            bigIntegerAdd = bigInteger4;
            strength = i5;
            random = secureRandom2;
        }
        if (z) {
            System.out.println("needed " + j3 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb2 = new StringBuilder("a:.......... ");
            sb2.append(bigIntegerGeneratePrime3);
            printStream3.println(sb2.toString());
            System.out.println("b:.......... " + bigInteger6);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigInteger4);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply5);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
