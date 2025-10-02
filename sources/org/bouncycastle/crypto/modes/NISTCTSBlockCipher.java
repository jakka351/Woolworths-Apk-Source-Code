package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes8.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i, BlockCipher blockCipher) {
        this.type = i;
        this.cipher = CBCBlockCipher.newInstance(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (this.bufOff + i > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i2 = this.bufOff;
        int i3 = i2 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (i2 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i4 = this.type;
                if (i4 == 2 || i4 == 3) {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i3);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i3 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i + blockSize, i3);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i + blockSize, i3);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, i3);
                    System.arraycopy(this.buf, this.bufOff - i3, bArr3, 0, i3);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i + i3, blockSize);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i2 > blockSize) {
                int i5 = this.type;
                if (i5 == 3 || (i5 == 2 && (this.buf.length - i2) % blockSize != 0)) {
                    BlockCipher blockCipher = this.cipher;
                    if (blockCipher instanceof CBCModeCipher) {
                        ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(this.buf, 0, bArr2, 0);
                    }
                    for (int i6 = blockSize; i6 != this.bufOff; i6++) {
                        int i7 = i6 - blockSize;
                        bArr4[i7] = (byte) (bArr2[i7] ^ this.buf[i6]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i3);
                    this.cipher.processBlock(bArr2, 0, bArr, i);
                } else {
                    ((CBCModeCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i3 != blockSize) {
                        System.arraycopy(bArr4, i3, bArr2, i3, blockSize - i3);
                    }
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, blockSize);
                    for (int i8 = 0; i8 != i3; i8++) {
                        bArr4[i8] = (byte) (bArr4[i8] ^ this.buf[i8]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i + blockSize, i3);
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i9 = this.bufOff;
        reset();
        return i9;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        int i2 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
            byte[] bArr3 = this.buf;
            int i4 = this.blockSize;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.bufOff = this.blockSize;
            i3 = iProcessBlock;
        }
        byte[] bArr4 = this.buf;
        int i5 = this.bufOff;
        this.bufOff = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i4 = this.bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            this.bufOff = blockSize;
            i2 -= i5;
            i += i5;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, this.buf, this.bufOff, blockSize);
                iProcessBlock += this.cipher.processBlock(this.buf, 0, bArr2, i3 + iProcessBlock);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i6 = iProcessBlock;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return i6;
    }
}
