package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;

/* loaded from: classes8.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i;
        Class cls;
        int i2;
        if (!this.initialized) {
            initializeDefault();
        }
        int i3 = this.numLayer;
        byte[][][] bArr = new byte[i3][][];
        byte[][][] bArr2 = new byte[i3 - 1][][];
        Treehash[][] treehashArr = new Treehash[i3][];
        Treehash[][] treehashArr2 = new Treehash[i3 - 1][];
        Vector[] vectorArr = new Vector[i3];
        Vector[] vectorArr2 = new Vector[i3 - 1];
        Vector[][] vectorArr3 = new Vector[i3][];
        boolean z = true;
        Vector[][] vectorArr4 = new Vector[i3 - 1][];
        int i4 = 0;
        while (true) {
            i = this.numLayer;
            cls = Byte.TYPE;
            if (i4 >= i) {
                break;
            }
            int i5 = this.heightOfTrees[i4];
            boolean z2 = z;
            int[] iArr = new int[2];
            iArr[z2 ? 1 : 0] = this.mdLength;
            iArr[0] = i5;
            bArr[i4] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i6 = this.heightOfTrees[i4];
            treehashArr[i4] = new Treehash[i6 - this.K[i4]];
            if (i4 > 0) {
                int i7 = i4 - 1;
                int[] iArr2 = new int[2];
                iArr2[z2 ? 1 : 0] = this.mdLength;
                iArr2[0] = i6;
                bArr2[i7] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i7] = new Treehash[this.heightOfTrees[i4] - this.K[i4]];
            }
            vectorArr[i4] = new Vector();
            if (i4 > 0) {
                vectorArr2[i4 - 1] = new Vector();
            }
            i4++;
            z = z2 ? 1 : 0;
        }
        boolean z3 = z;
        int[] iArr3 = new int[2];
        iArr3[z3 ? 1 : 0] = this.mdLength;
        iArr3[0] = i;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i8 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[z3 ? 1 : 0] = this.mdLength;
        iArr4[0] = i8;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i9 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[z3 ? 1 : 0] = this.mdLength;
        iArr5[0] = i9;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i10 = 0;
        while (true) {
            i2 = this.numLayer;
            if (i10 >= i2) {
                break;
            }
            System.arraycopy(this.currentSeeds[i10], 0, bArr5[i10], 0, this.mdLength);
            i10++;
            bArr5 = bArr5;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr5;
        byte[][] bArr7 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[z3 ? 1 : 0] = this.mdLength;
        iArr6[0] = i2 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i11 = this.numLayer - 1;
        while (i11 >= 0) {
            GMSSRootCalc gMSSRootCalcGenerateCurrentAuthpathAndRoot = i11 == this.numLayer + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i11], bArr6[i11], i11) : generateCurrentAuthpathAndRoot(bArr7[i11 + 1], vectorArr[i11], bArr6[i11], i11);
            int i12 = 0;
            while (i12 < this.heightOfTrees[i11]) {
                System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getAuthPath()[i12], 0, bArr[i11][i12], 0, this.mdLength);
                i12++;
                i11 = i11;
            }
            int i13 = i11;
            vectorArr3[i13] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i13] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRoot(), 0, bArr7[i13], 0, this.mdLength);
            i11 = i13 - 1;
        }
        int i14 = this.numLayer - 2;
        while (i14 >= 0) {
            int i15 = i14 + 1;
            GMSSRootCalc gMSSRootCalcGenerateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i14], bArr6[i15], i15);
            int i16 = 0;
            while (i16 < this.heightOfTrees[i15]) {
                System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getAuthPath()[i16], 0, bArr2[i14][i16], 0, this.mdLength);
                i16++;
                i14 = i14;
                gMSSRootCalcGenerateNextAuthpathAndRoot = gMSSRootCalcGenerateNextAuthpathAndRoot;
            }
            int i17 = i14;
            GMSSRootCalc gMSSRootCalc = gMSSRootCalcGenerateNextAuthpathAndRoot;
            vectorArr4[i17] = gMSSRootCalc.getRetain();
            treehashArr2[i17] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i17], 0, this.mdLength);
            System.arraycopy(bArr6[i15], 0, this.nextNextSeeds[i17], 0, this.mdLength);
            i14 = i17 - 1;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr7[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i) {
        byte[] bArrVerify;
        int i2 = this.mdLength;
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i2];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i == this.numLayer - 1) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
        } else {
            this.currentRootSigs[i] = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i]).Verify(bArr, this.currentRootSigs[i]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = this.heightOfTrees[i];
            if (i5 >= (1 << i6)) {
                break;
            }
            if (i5 == i3 && i4 < i6 - this.K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i4);
                i3 *= 2;
                i4++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i5++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i2 = 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.heightOfTrees[i];
            if (i3 >= (1 << i5)) {
                break;
            }
            if (i3 == i2 && i4 < i5 - this.K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i4);
                i2 *= 2;
                i4++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i3++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i, SecureRandom secureRandom) {
        initialize(i <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i = 0; i < this.numLayer; i++) {
            random.nextBytes(this.currentSeeds[i]);
            this.gmssRandom.nextSeed(this.currentSeeds[i]);
        }
        this.initialized = true;
    }
}
