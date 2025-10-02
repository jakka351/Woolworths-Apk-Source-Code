package org.bouncycastle.crypto.engines;

import YU.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public class SparkleEngine implements AEADCipher {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_BYTES;
    private final int KEY_WORDS;
    private final int RATE_BYTES;
    private final int RATE_WORDS;
    private final int SCHWAEMM_KEY_LEN;
    private final int SCHWAEMM_NONCE_LEN;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_BYTES;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private String algorithmName;
    private boolean encrypted;
    private byte[] initialAssociatedText;
    private final int[] k;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private final int[] npub;
    private final int[] state;
    private byte[] tag;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* renamed from: org.bouncycastle.crypto.engines.SparkleEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecAad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecFinal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncData.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncFinal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncAad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters = iArr2;
            try {
                iArr2[SparkleParameters.SCHWAEMM128_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM192_192.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_256.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    public enum State {
        Uninitialized,
        EncInit,
        EncAad,
        EncData,
        EncFinal,
        DecInit,
        DecAad,
        DecData,
        DecFinal
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SparkleEngine(org.bouncycastle.crypto.engines.SparkleEngine.SparkleParameters r9) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.SparkleEngine.<init>(org.bouncycastle.crypto.engines.SparkleEngine$SparkleParameters):void");
    }

    private static int ELL(int i) {
        return (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ Integers.rotateRight(i, 16);
    }

    private void checkAAD() {
        State state;
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i == 1) {
            state = State.DecAad;
        } else {
            if (i == 2) {
                return;
            }
            if (i == 6) {
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            if (i != 7) {
                if (i == 8) {
                    return;
                }
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                finishAAD(State.DecData);
                return false;
            case 3:
                return false;
            case 4:
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            case 5:
                return true;
            case 6:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 7:
            case 8:
                finishAAD(State.EncData);
                return true;
        }
    }

    private void finishAAD(State state) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i == 2 || i == 8) {
            processFinalAAD();
        }
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.RATE_WORDS;
            if (i2 >= i3 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i4 = (i3 / 2) + i2;
            int[] iArr = this.state;
            int i5 = iArr[i2];
            int i6 = iArr[i4];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i2 * 4) + i);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i4 * 4) + i);
            int[] iArr2 = this.state;
            int i7 = this.RATE_WORDS;
            iArr2[i2] = (iLittleEndianToInt ^ i6) ^ iArr2[i7 + i2];
            iArr2[i4] = ((i6 ^ i5) ^ iLittleEndianToInt2) ^ iArr2[i7 + (this.CAP_MASK & i4)];
            i2++;
        }
    }

    private void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = ((i6 ^ i7) ^ iLittleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = (i6 ^ iLittleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    private void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = (i7 ^ iLittleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = ((i6 ^ i7) ^ iLittleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    private void processFinalAAD() {
        int i = this.m_bufPos;
        int i2 = 0;
        if (i < this.RATE_BYTES) {
            int[] iArr = this.state;
            int i3 = this.STATE_WORDS - 1;
            iArr[i3] = iArr[i3] ^ this._A0;
            this.m_buf[i] = -128;
            while (true) {
                int i4 = this.m_bufPos + 1;
                this.m_bufPos = i4;
                if (i4 >= this.RATE_BYTES) {
                    break;
                } else {
                    this.m_buf[i4] = 0;
                }
            }
        } else {
            int[] iArr2 = this.state;
            int i5 = this.STATE_WORDS - 1;
            iArr2[i5] = iArr2[i5] ^ this._A1;
        }
        while (true) {
            int i6 = this.RATE_WORDS;
            if (i2 >= i6 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i7 = (i6 / 2) + i2;
            int[] iArr3 = this.state;
            int i8 = iArr3[i2];
            int i9 = iArr3[i7];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_buf, i2 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_buf, i7 * 4);
            int[] iArr4 = this.state;
            int i10 = this.RATE_WORDS;
            iArr4[i2] = (iLittleEndianToInt ^ i9) ^ iArr4[i10 + i2];
            iArr4[i7] = ((i9 ^ i8) ^ iLittleEndianToInt2) ^ iArr4[i10 + (this.CAP_MASK & i7)];
            i2++;
        }
    }

    private static void sparkle_opt(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i);
        } else if (length == 12) {
            sparkle_opt12(iArr, i);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i);
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i);
    }

    public static void sparkle_opt8(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        char c = 2;
        int i4 = iArr[2];
        char c2 = 3;
        int i5 = iArr[3];
        char c3 = 4;
        int i6 = iArr[4];
        char c4 = 5;
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = 0;
        while (i10 < i) {
            int[] iArr2 = RCON;
            int i11 = i3 ^ iArr2[i10 & 7];
            int i12 = i5 ^ i10;
            int i13 = iArr2[0];
            char c5 = c;
            int iRotateRight = Integers.rotateRight(i11, 31) + i2;
            char c6 = c2;
            int iRotateRight2 = i11 ^ Integers.rotateRight(iRotateRight, 24);
            char c7 = c3;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i13);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i14 = (iRotateRight3 ^ i13) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i14, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i14 ^ i13);
            char c8 = c4;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i15 = iRotateRight6 ^ i13;
            int i16 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i12, 31) + i4;
            int iRotateRight9 = i12 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i16);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i17 = (iRotateRight10 ^ i16) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i17, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i17 ^ i16);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i18 = iRotateRight13 ^ i16;
            int i19 = iArr2[c5];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = i7 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i19);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i20 = (iRotateRight17 ^ i19) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i20, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i20 ^ i19);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i21 = iArr2[c6];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = i9 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i21);
            int iRotateRight25 = Integers.rotateRight(iRotateRight24, 17) ^ iRotateRight23;
            int i22 = (iRotateRight24 ^ i21) + iRotateRight25;
            int iRotateRight26 = Integers.rotateRight(i22, 31) ^ iRotateRight25;
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i22 ^ i21);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int iELL = ELL(i15 ^ i18);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i23 = ((iRotateRight27 ^ i21) ^ i18) ^ iELL2;
            int i24 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i25 = iELL ^ (iRotateRight21 ^ iRotateRight7);
            i10++;
            i7 = iRotateRight7;
            i3 = i24;
            i8 = i18;
            i9 = iRotateRight14;
            i5 = i25;
            i4 = ((iRotateRight20 ^ i19) ^ i15) ^ iELL2;
            c = c5;
            c3 = c7;
            c4 = c8;
            i6 = i15;
            i2 = i23;
            c2 = c6;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[c] = i4;
        iArr[c2] = i5;
        iArr[c3] = i6;
        iArr[c4] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        int i2;
        int i3;
        boolean zCheckData = checkData();
        int i4 = this.m_bufPos;
        int i5 = this.TAG_BYTES;
        if (zCheckData) {
            i2 = i4 + i5;
        } else {
            if (i4 < i5) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 = i4 - i5;
            this.m_bufPos = i2;
        }
        if (i > bArr.length - i2) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i6 = this.STATE_WORDS - 1;
            iArr[i6] = iArr[i6] ^ (this.m_bufPos < this.RATE_BYTES ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i7 = 0;
            while (true) {
                i3 = this.m_bufPos;
                if (i7 >= i3) {
                    break;
                }
                int i8 = i7 >>> 2;
                iArr2[i8] = iArr2[i8] | ((this.m_buf[i7] & 255) << ((i7 & 3) << 3));
                i7++;
            }
            if (i3 < this.RATE_BYTES) {
                if (!zCheckData) {
                    int i9 = (i3 & 3) << 3;
                    int i10 = i3 >>> 2;
                    int i11 = iArr2[i10];
                    int[] iArr3 = this.state;
                    iArr2[i10] = ((iArr3[i3 >>> 2] >>> i9) << i9) | i11;
                    int i12 = (i3 >>> 2) + 1;
                    System.arraycopy(iArr3, i12, iArr2, i12, this.RATE_WORDS - i12);
                }
                int i13 = this.m_bufPos;
                int i14 = i13 >>> 2;
                iArr2[i14] = (128 << ((i13 & 3) << 3)) ^ iArr2[i14];
            }
            int i15 = 0;
            while (true) {
                int i16 = this.RATE_WORDS;
                if (i15 >= i16 / 2) {
                    break;
                }
                int i17 = (i16 / 2) + i15;
                int[] iArr4 = this.state;
                int i18 = iArr4[i15];
                int i19 = iArr4[i17];
                if (zCheckData) {
                    iArr4[i15] = (iArr2[i15] ^ i19) ^ iArr4[i16 + i15];
                    iArr4[i17] = iArr4[i16 + (this.CAP_MASK & i17)] ^ ((i18 ^ i19) ^ iArr2[i17]);
                } else {
                    iArr4[i15] = ((i18 ^ i19) ^ iArr2[i15]) ^ iArr4[i16 + i15];
                    iArr4[i17] = iArr4[i16 + (this.CAP_MASK & i17)] ^ (iArr2[i17] ^ i18);
                }
                iArr2[i15] = iArr2[i15] ^ i18;
                iArr2[i17] = iArr2[i17] ^ i19;
                i15++;
            }
            int i20 = 0;
            while (i20 < this.m_bufPos) {
                bArr[i] = (byte) (iArr2[i20 >>> 2] >>> ((i20 & 3) << 3));
                i20++;
                i++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i21 = 0; i21 < this.KEY_WORDS; i21++) {
            int[] iArr5 = this.state;
            int i22 = this.RATE_WORDS + i21;
            iArr5[i22] = iArr5[i22] ^ this.k[i21];
        }
        byte[] bArr2 = new byte[this.TAG_BYTES];
        this.tag = bArr2;
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, bArr2, 0);
        if (zCheckData) {
            System.arraycopy(this.tag, 0, bArr, i, this.TAG_BYTES);
        } else if (!Arrays.constantTimeAreEqual(this.TAG_BYTES, this.tag, 0, this.m_buf, this.m_bufPos)) {
            throw new InvalidCipherTextException(a.o(new StringBuilder(), this.algorithmName, " mac does not match"));
        }
        reset(!zCheckData);
        return i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getIVBytesSize() {
        return this.RATE_BYTES;
    }

    public int getKeyBytesSize() {
        return this.KEY_BYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int iMax = Math.max(0, i);
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                return Math.max(0, iMax - this.TAG_BYTES);
            case 3:
            case 4:
                return Math.max(0, (iMax + this.m_bufPos) - this.TAG_BYTES);
            case 5:
            case 6:
                return iMax + this.m_bufPos + this.TAG_BYTES;
            default:
                return iMax + this.TAG_BYTES;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2;
        int iMax = Math.max(0, i) - 1;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 3:
            case 4:
                iMax += this.m_bufPos;
            case 1:
            case 2:
                i2 = iMax - this.TAG_BYTES;
                iMax = Math.max(0, i2);
                break;
            case 5:
            case 6:
                i2 = iMax + this.m_bufPos;
                iMax = Math.max(0, i2);
                break;
        }
        return iMax - (iMax % this.RATE_BYTES);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter key;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.TAG_BYTES * 8) {
                throw new IllegalArgumentException(a.d(macSize, "Invalid value for MAC size: "));
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Sparkle");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            CipherParameters parameters = parametersWithIV.getParameters();
            key = parameters instanceof KeyParameter ? (KeyParameter) parameters : null;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException("Sparkle init parameters must include a key");
        }
        int i = this.KEY_WORDS * 4;
        if (i != key.getKeyLength()) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i + " bytes of key");
        }
        int i2 = this.RATE_WORDS * 4;
        if (iv == null || i2 != iv.length) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i2 + " bytes of IV");
        }
        Pack.littleEndianToInt(key.getKey(), 0, this.k);
        Pack.littleEndianToInt(iv, 0, this.npub);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.m_state = z ? State.EncInit : State.DecInit;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        checkAAD();
        if (this.m_bufPos == this.RATE_BYTES) {
            processBufferAAD(this.m_buf, 0);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i = this.m_bufPos;
        this.m_bufPos = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (i > bArr.length - i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 <= 0) {
            return;
        }
        checkAAD();
        int i3 = this.m_bufPos;
        if (i3 > 0) {
            int i4 = this.RATE_BYTES - i3;
            if (i2 <= i4) {
                System.arraycopy(bArr, i, this.m_buf, i3, i2);
                this.m_bufPos += i2;
                return;
            } else {
                System.arraycopy(bArr, i, this.m_buf, i3, i4);
                i += i4;
                i2 -= i4;
                processBufferAAD(this.m_buf, 0);
            }
        }
        while (i2 > this.RATE_BYTES) {
            processBufferAAD(bArr, i);
            int i5 = this.RATE_BYTES;
            i += i5;
            i2 -= i5;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        return processBytes(new byte[]{b}, 0, 1, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        int i5;
        if (i > bArr.length - i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i6 = this.m_bufPos;
            if (i6 > 0) {
                int i7 = this.RATE_BYTES - i6;
                if (i2 <= i7) {
                    System.arraycopy(bArr, i, this.m_buf, i6, i2);
                    this.m_bufPos += i2;
                    return 0;
                }
                System.arraycopy(bArr, i, this.m_buf, i6, i7);
                i += i7;
                i2 -= i7;
                processBufferEncrypt(this.m_buf, 0, bArr2, i3);
                i5 = this.RATE_BYTES;
            } else {
                i5 = 0;
            }
            while (i2 > this.RATE_BYTES) {
                processBufferEncrypt(bArr, i, bArr2, i3 + i5);
                int i8 = this.RATE_BYTES;
                i += i8;
                i2 -= i8;
                i5 += i8;
            }
            System.arraycopy(bArr, i, this.m_buf, 0, i2);
            this.m_bufPos = i2;
            return i5;
        }
        int i9 = this.m_bufferSizeDecrypt;
        int i10 = this.m_bufPos;
        int i11 = i9 - i10;
        if (i2 <= i11) {
            System.arraycopy(bArr, i, this.m_buf, i10, i2);
            this.m_bufPos += i2;
            return 0;
        }
        if (i10 > this.RATE_BYTES) {
            processBufferDecrypt(this.m_buf, 0, bArr2, i3);
            int i12 = this.m_bufPos;
            int i13 = this.RATE_BYTES;
            int i14 = i12 - i13;
            this.m_bufPos = i14;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i13, bArr3, 0, i14);
            i4 = this.RATE_BYTES;
            if (i2 <= i11 + i4) {
                System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
                this.m_bufPos += i2;
                return i4;
            }
        } else {
            i4 = 0;
        }
        int i15 = this.RATE_BYTES;
        int i16 = this.m_bufPos;
        int i17 = i15 - i16;
        System.arraycopy(bArr, i, this.m_buf, i16, i17);
        i += i17;
        i2 -= i17;
        processBufferDecrypt(this.m_buf, 0, bArr2, i3 + i4);
        i5 = i4 + this.RATE_BYTES;
        while (i2 > this.m_bufferSizeDecrypt) {
            processBufferDecrypt(bArr, i, bArr2, i3 + i5);
            int i18 = this.RATE_BYTES;
            i += i18;
            i2 -= i18;
            i5 += i18;
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
        return i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z) {
        if (z) {
            this.tag = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        this.encrypted = false;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 7:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.DecInit;
                break;
            case 5:
            case 6:
            case 8:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public static void sparkle_opt12(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char c = 4;
        int i6 = iArr[4];
        char c2 = 5;
        int i7 = iArr[5];
        char c3 = 6;
        int i8 = iArr[6];
        char c4 = 7;
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 0;
        int i15 = i11;
        while (i14 < i) {
            int[] iArr2 = RCON;
            int i16 = i3 ^ iArr2[i14 & 7];
            int i17 = i5 ^ i14;
            int i18 = iArr2[0];
            char c5 = c;
            int iRotateRight = Integers.rotateRight(i16, 31) + i2;
            char c6 = c2;
            int iRotateRight2 = i16 ^ Integers.rotateRight(iRotateRight, 24);
            char c7 = c3;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i18);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i19 = (iRotateRight3 ^ i18) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i19, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i19 ^ i18);
            char c8 = c4;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i20 = iRotateRight6 ^ i18;
            int i21 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i17, 31) + i4;
            int iRotateRight9 = i17 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i21);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i22 = (iRotateRight10 ^ i21) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i22, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i22 ^ i21);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i23 = iRotateRight13 ^ i21;
            int i24 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = i7 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i24);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i25 = (iRotateRight17 ^ i24) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i25, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i25 ^ i24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i26 = iRotateRight20 ^ i24;
            int i27 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = i9 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i27);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i28 = (iRotateRight24 ^ i27) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i28, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i28 ^ i27);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i29 = iRotateRight27 ^ i27;
            int i30 = iArr2[c5];
            int iRotateRight29 = Integers.rotateRight(i15, 31) + i10;
            int iRotateRight30 = i15 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i30);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i31 = (iRotateRight31 ^ i30) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i31, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i31 ^ i30);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i32 = iRotateRight34 ^ i30;
            int i33 = iArr2[c6];
            int iRotateRight36 = Integers.rotateRight(i13, 31) + i12;
            int iRotateRight37 = i13 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i33);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i34 = (iRotateRight38 ^ i33) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i34, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i34 ^ i33);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i35 = iRotateRight41 ^ i33;
            int iELL = ELL((i20 ^ i23) ^ i26);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i36 = (i32 ^ i23) ^ iELL2;
            int i37 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i38 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i39 = iELL ^ (iRotateRight28 ^ iRotateRight7);
            i14++;
            i9 = iRotateRight7;
            i10 = i23;
            i4 = (i35 ^ i26) ^ iELL2;
            i12 = i26;
            i6 = (i29 ^ i20) ^ iELL2;
            c = c5;
            c4 = c8;
            i3 = i37;
            i8 = i20;
            i15 = iRotateRight14;
            i2 = i36;
            c3 = c7;
            i5 = i38;
            i13 = iRotateRight21;
            i7 = i39;
            c2 = c6;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[c] = i6;
        iArr[c2] = i7;
        iArr[c3] = i8;
        iArr[c4] = i9;
        iArr[8] = i10;
        iArr[9] = i15;
        iArr[10] = i12;
        iArr[11] = i13;
    }

    public static void sparkle_opt16(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        char c = 6;
        int i8 = iArr[6];
        char c2 = 7;
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = i13;
        int i18 = i15;
        int i19 = iArr[15];
        int i20 = 0;
        int i21 = i11;
        while (i20 < i) {
            int[] iArr2 = RCON;
            int i22 = i3 ^ iArr2[i20 & 7];
            int i23 = i5 ^ i20;
            int i24 = iArr2[0];
            char c3 = c;
            int iRotateRight = Integers.rotateRight(i22, 31) + i2;
            char c4 = c2;
            int iRotateRight2 = i22 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i24);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i25 = (iRotateRight3 ^ i24) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i25, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i25 ^ i24);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i26 = iRotateRight6 ^ i24;
            int i27 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i23, 31) + i4;
            int iRotateRight9 = i23 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i27);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i28 = (iRotateRight10 ^ i27) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i28, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i28 ^ i27);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i29 = iRotateRight13 ^ i27;
            int i30 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = i7 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i30);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i31 = (iRotateRight17 ^ i30) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i31, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i31 ^ i30);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i32 = iRotateRight20 ^ i30;
            int i33 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = i9 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i33);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i34 = (iRotateRight24 ^ i33) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i34, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i34 ^ i33);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i35 = i33 ^ iRotateRight27;
            int i36 = iArr2[4];
            int iRotateRight29 = Integers.rotateRight(i21, 31) + i10;
            int iRotateRight30 = i21 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i36);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i37 = (iRotateRight31 ^ i36) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i37, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i37 ^ i36);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i38 = iRotateRight34 ^ i36;
            int i39 = iArr2[5];
            int iRotateRight36 = Integers.rotateRight(i17, 31) + i12;
            int iRotateRight37 = i17 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i39);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i40 = (iRotateRight38 ^ i39) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i40, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i40 ^ i39);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i41 = iRotateRight41 ^ i39;
            int i42 = iArr2[c3];
            int iRotateRight43 = Integers.rotateRight(i18, 31) + i14;
            int iRotateRight44 = i18 ^ Integers.rotateRight(iRotateRight43, 24);
            int iRotateRight45 = Integers.rotateRight(iRotateRight44, 17) + (iRotateRight43 ^ i42);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i43 = (iRotateRight45 ^ i42) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i43, 31);
            int iRotateRight48 = Integers.rotateRight(iRotateRight47, 24) + (i43 ^ i42);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i44 = iRotateRight48 ^ i42;
            int i45 = iArr2[c4];
            int iRotateRight50 = Integers.rotateRight(i19, 31) + i16;
            int iRotateRight51 = i19 ^ Integers.rotateRight(iRotateRight50, 24);
            int iRotateRight52 = Integers.rotateRight(iRotateRight51, 17) + (iRotateRight50 ^ i45);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i46 = (iRotateRight52 ^ i45) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i46, 31);
            int iRotateRight55 = Integers.rotateRight(iRotateRight54, 24) + (i46 ^ i45);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i47 = iRotateRight55 ^ i45;
            int iELL = ELL(((i26 ^ i29) ^ i32) ^ i35);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i48 = iRotateRight14 ^ iRotateRight42;
            int i49 = (i41 ^ i29) ^ iELL2;
            int i50 = (i44 ^ i32) ^ iELL2;
            int i51 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i52 = (i47 ^ i35) ^ iELL2;
            int i53 = (i26 ^ i38) ^ iELL2;
            i9 = (iRotateRight7 ^ iRotateRight35) ^ iELL;
            i20++;
            i7 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i21 = iRotateRight7;
            i3 = i48 ^ iELL;
            i12 = i29;
            i4 = i50;
            i18 = iRotateRight21;
            i8 = i53;
            i2 = i49;
            i17 = iRotateRight14;
            i16 = i35;
            i5 = i51;
            c = c3;
            i10 = i26;
            i14 = i32;
            i6 = i52;
            i19 = iRotateRight28;
            c2 = c4;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[c] = i8;
        iArr[c2] = i9;
        iArr[8] = i10;
        iArr[9] = i21;
        iArr[10] = i12;
        iArr[11] = i17;
        iArr[12] = i14;
        iArr[13] = i18;
        iArr[14] = i16;
        iArr[15] = i19;
    }
}
