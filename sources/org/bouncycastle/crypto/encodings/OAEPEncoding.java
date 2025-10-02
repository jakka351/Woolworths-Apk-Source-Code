package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.mgf1Hash.reset();
        int i4 = 0;
        while (i4 < i3 / digestSize) {
            Pack.intToBigEndian(i4, bArr4, 0);
            this.mgf1Hash.update(bArr, i, i2);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * digestSize, digestSize);
            i4++;
        }
        int i5 = digestSize * i4;
        if (i5 < i3) {
            Pack.intToBigEndian(i4, bArr4, 0);
            this.mgf1Hash.update(bArr, i, i2);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i, i2);
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        int length = (outputBlockSize - ((this.defHash.length * 2) + 1)) >> 31;
        if (bArrProcessBlock.length <= outputBlockSize) {
            System.arraycopy(bArrProcessBlock, 0, bArr4, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
        } else {
            System.arraycopy(bArrProcessBlock, 0, bArr4, 0, outputBlockSize);
            length |= 1;
        }
        byte[] bArr5 = this.defHash;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ bArrMaskGeneratorFunction1[i3]);
            i3++;
        }
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length2 = this.defHash.length; length2 != outputBlockSize; length2++) {
            bArr4[length2] = (byte) (bArr4[length2] ^ bArrMaskGeneratorFunction12[length2 - this.defHash.length]);
        }
        int i4 = 0;
        while (true) {
            bArr3 = this.defHash;
            if (i4 == bArr3.length) {
                break;
            }
            length |= bArr4[bArr3.length + i4] ^ bArr3[i4];
            i4++;
        }
        int i5 = -1;
        for (int length3 = bArr3.length * 2; length3 != outputBlockSize; length3++) {
            i5 += (((-(bArr4[length3] & 255)) & i5) >> 31) & length3;
        }
        if (((i5 >> 31) | length | (bArr4[i5 + 1] ^ 1)) != 0) {
            Arrays.fill(bArr4, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i6 = i5 + 2;
        int i7 = outputBlockSize - i6;
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr4, i6, bArr6, 0, i7);
        Arrays.fill(bArr4, (byte) 0);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (i2 > getInputBlockSize()) {
            throw new DataLengthException("input data too long");
        }
        int length = (this.defHash.length * 2) + getInputBlockSize() + 1;
        byte[] bArr2 = new byte[length];
        int i3 = length - i2;
        System.arraycopy(bArr, i, bArr2, i3, i2);
        bArr2[i3 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length2 = this.defHash.length;
        byte[] bArr4 = new byte[length2];
        this.random.nextBytes(bArr4);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, length2, length - this.defHash.length);
        for (int length3 = this.defHash.length; length3 != length; length3++) {
            bArr2[length3] = (byte) (bArr2[length3] ^ bArrMaskGeneratorFunction1[length3 - this.defHash.length]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
        byte[] bArr5 = this.defHash;
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr2, bArr5.length, length - bArr5.length, bArr5.length);
        for (int i4 = 0; i4 != this.defHash.length; i4++) {
            bArr2[i4] = (byte) (bArr2[i4] ^ bArrMaskGeneratorFunction12[i4]);
        }
        return this.engine.processBlock(bArr2, 0, length);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.random = cipherParameters instanceof ParametersWithRandom ? ((ParametersWithRandom) cipherParameters).getRandom() : CryptoServicesRegistrar.getSecureRandom();
        this.engine.init(z, cipherParameters);
        this.forEncryption = z;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i, i2) : decodeBlock(bArr, i, i2);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.defHash = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.defHash, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }
}
