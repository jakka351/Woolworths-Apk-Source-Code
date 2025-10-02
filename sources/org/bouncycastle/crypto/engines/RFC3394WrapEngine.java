package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.iv.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArr2;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i2 < 16) {
            throw new InvalidCipherTextException("unwrap data too short");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        int i4 = 1;
        this.engine.init(!this.wrapCipherMode, this.param);
        byte[] bArr3 = this.iv;
        byte[] bArr4 = new byte[i2 - bArr3.length];
        byte[] bArr5 = new byte[bArr3.length];
        byte[] bArr6 = new byte[bArr3.length + 8];
        int i5 = i3 - 1;
        if (i5 == 1) {
            this.engine.processBlock(bArr, i, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr5, 0, this.iv.length);
            System.arraycopy(bArr6, this.iv.length, bArr4, 0, 8);
        } else {
            System.arraycopy(bArr, i, bArr5, 0, bArr3.length);
            byte[] bArr7 = this.iv;
            System.arraycopy(bArr, bArr7.length + i, bArr4, 0, i2 - bArr7.length);
            for (int i6 = 5; i6 >= 0; i6--) {
                int i7 = i5;
                while (i7 >= i4) {
                    System.arraycopy(bArr5, 0, bArr6, 0, this.iv.length);
                    int i8 = (i7 - 1) * 8;
                    System.arraycopy(bArr4, i8, bArr6, this.iv.length, 8);
                    int i9 = (i5 * i6) + i7;
                    int i10 = i4;
                    while (i9 != 0) {
                        int i11 = i4;
                        int length = this.iv.length - i10;
                        bArr6[length] = (byte) (bArr6[length] ^ ((byte) i9));
                        i9 >>>= 8;
                        i10++;
                        i4 = i11;
                    }
                    this.engine.processBlock(bArr6, 0, bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr5, 0, 8);
                    System.arraycopy(bArr6, 8, bArr4, i8, 8);
                    i7--;
                    i4 = i4;
                }
            }
        }
        if (i5 != i4) {
            if (!Arrays.constantTimeAreEqual(bArr5, this.iv)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        } else if (!Arrays.constantTimeAreEqual(bArr5, this.iv)) {
            System.arraycopy(bArr, i, bArr5, 0, this.iv.length);
            byte[] bArr8 = this.iv;
            System.arraycopy(bArr, i + bArr8.length, bArr4, 0, i2 - bArr8.length);
            int i12 = 5;
            while (true) {
                bArr2 = this.iv;
                if (i12 < 0) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr6, 0, bArr2.length);
                System.arraycopy(bArr4, 0, bArr6, this.iv.length, 8);
                int i13 = (i5 * i12) + 1;
                int i14 = 1;
                while (i13 != 0) {
                    int length2 = this.iv.length - i14;
                    bArr6[length2] = (byte) (((byte) i13) ^ bArr6[length2]);
                    i13 >>>= 8;
                    i14++;
                }
                this.engine.processBlock(bArr6, 0, bArr6, 0);
                System.arraycopy(bArr6, 0, bArr5, 0, 8);
                System.arraycopy(bArr6, 8, bArr4, 0, 8);
                i12--;
            }
            if (!Arrays.constantTimeAreEqual(bArr5, bArr2)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i2 < 8) {
            throw new DataLengthException("wrap data must be at least 8 bytes");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        this.engine.init(this.wrapCipherMode, this.param);
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, this.iv.length, i2);
        if (i3 == 1) {
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[this.iv.length + 8];
        for (int i4 = 0; i4 != 6; i4++) {
            for (int i5 = 1; i5 <= i3; i5++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                int i6 = i5 * 8;
                System.arraycopy(bArr3, i6, bArr4, this.iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i7 = (i3 * i4) + i5;
                int i8 = 1;
                while (i7 != 0) {
                    int length = this.iv.length - i8;
                    bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                    i7 >>>= 8;
                    i8++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i6, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z) {
        this.iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.engine = blockCipher;
        this.wrapCipherMode = !z;
    }
}
