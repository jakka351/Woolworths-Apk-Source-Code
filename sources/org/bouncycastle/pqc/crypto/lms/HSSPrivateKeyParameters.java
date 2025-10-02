package org.bouncycastle.pqc.crypto.lms;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes8.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;
    private final int l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j, long j2) throws IllegalArgumentException {
        super(true);
        this.index = 0L;
        this.l = i;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j;
        this.indexLimit = j2;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(b.m(obj, "cannot parse "));
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream);
            dataInputStream.close();
            return hSSPrivateKeyParameters;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 == null) {
                throw th;
            }
            dataInputStream3.close();
            throw th;
        }
    }

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.l == hSSPrivateKeyParameters.l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i) {
        HSSPrivateKeyParameters hSSPrivateKeyParametersMakeCopy;
        synchronized (this) {
            try {
                long j = i;
                if (getUsagesRemaining() < j) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j2 = this.index;
                this.index = j + j2;
                hSSPrivateKeyParametersMakeCopy = makeCopy(new HSSPrivateKeyParameters(this.l, new ArrayList(getKeys()), new ArrayList(getSig()), j2, j2 + j, true));
                resetKeyToIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hSSPrivateKeyParametersMakeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i = l - 1;
                lMSPrivateKeyParameters = getKeys().get(i);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i];
                int i2 = 0;
                while (i2 < i) {
                    int i3 = i2 + 1;
                    lMSSignedPubKeyArr[i2] = new LMSSignedPubKey(sig.get(i2), keys.get(i3).getPublicKey());
                    i2 = i3;
                }
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e) {
            throw new IllegalStateException(a.k(e, new StringBuilder("unable to encode signature: ")), e);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() throws IOException {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<LMSSignature> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                composerBool.bytes(it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    public long getIndexLimit() {
        return this.indexLimit;
    }

    public synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i = 0; i < size; i++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i);
            lMSParametersArr[i] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.l, getRootKey().getPublicKey());
    }

    public LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    public synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.indexLimit - this.index;
    }

    public int hashCode() {
        int iHashCode = (this.sig.hashCode() + ((this.keys.hashCode() + (((this.l * 31) + (this.isShard ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.indexLimit;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.index;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public synchronized void incIndex() {
        this.index++;
    }

    public boolean isShard() {
        return this.isShard;
    }

    public void replaceConsumedKey(int i) {
        int i2 = i - 1;
        LMOtsPrivateKey currentOTSKey = this.keys.get(i2).getCurrentOTSKey();
        int n = currentOTSKey.getParameter().getN();
        SeedDerive derivationFunction = currentOTSKey.getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[n];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[n];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i);
        arrayList.set(i, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i2, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i2), ((LMSPrivateKeyParameters) arrayList.get(i)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    public void resetKeyToIndex() throws IllegalArgumentException {
        boolean z;
        List<LMSPrivateKeyParameters> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((1 << sigParameters.getH()) - 1) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) keys.toArray(new LMSPrivateKeyParameters[keys.size()]);
        List<LMSSignature> list = this.sig;
        LMSSignature[] lMSSignatureArr = (LMSSignature[]) list.toArray(new LMSSignature[list.size()]);
        LMSPrivateKeyParameters rootKey = getRootKey();
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = LMS.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z = true;
        } else {
            z = false;
        }
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters = lMSPrivateKeyParametersArr[i2];
            int n = lMSPrivateKeyParameters.getOtsParameters().getN();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[n];
            SeedDerive seedDerive = new SeedDerive(lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret(), DigestUtil.getDigest(lMSPrivateKeyParameters.getOtsParameters()));
            seedDerive.setQ((int) jArr[i2]);
            seedDerive.setJ(-2);
            seedDerive.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[n];
            seedDerive.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z2 = i >= size + (-1) ? jArr[i] == ((long) lMSPrivateKeyParametersArr[i].getIndex()) : jArr[i] == ((long) (lMSPrivateKeyParametersArr[i].getIndex() - 1));
            if (!Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i].getI()) || !Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i].getMasterSecret())) {
                LMSPrivateKeyParameters lMSPrivateKeyParametersGenerateKeys = LMS.generateKeys(keys.get(i).getSigParameters(), keys.get(i).getOtsParameters(), (int) jArr[i], bArr, bArr2);
                lMSPrivateKeyParametersArr[i] = lMSPrivateKeyParametersGenerateKeys;
                lMSSignatureArr[i2] = LMS.generateSign(lMSPrivateKeyParametersArr[i2], lMSPrivateKeyParametersGenerateKeys.getPublicKey().toByteArray());
            } else if (z2) {
                i++;
            } else {
                lMSPrivateKeyParametersArr[i] = LMS.generateKeys(keys.get(i).getSigParameters(), keys.get(i).getOtsParameters(), (int) jArr[i], bArr, bArr2);
            }
            z = true;
            i++;
        }
        if (z) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    public void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j, long j2, boolean z) {
        super(true);
        this.index = 0L;
        this.l = i;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j;
        this.indexLimit = j2;
        this.isShard = z;
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }
}
