package org.bouncycastle.pqc.crypto.picnic;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes8.dex */
public class LowmcConstantsL3 extends LowmcConstants {
    public LowmcConstantsL3() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(LowmcConstants.class.getResourceAsStream("lowmcL3.bin.properties")));
            this.linearMatrices = LowmcConstants.readArray(dataInputStream);
            this.roundConstants = LowmcConstants.readArray(dataInputStream);
            this.keyMatrices = LowmcConstants.readArray(dataInputStream);
            this.linearMatrices_full = LowmcConstants.readArray(dataInputStream);
            this.keyMatrices_full = LowmcConstants.readArray(dataInputStream);
            this.keyMatrices_inv = LowmcConstants.readArray(dataInputStream);
            this.linearMatrices_inv = LowmcConstants.readArray(dataInputStream);
            this.roundConstants_full = LowmcConstants.readArray(dataInputStream);
            this.LMatrix = new KMatrices(30, BERTags.PRIVATE, 6, this.linearMatrices);
            this.KMatrix = new KMatrices(31, BERTags.PRIVATE, 6, this.keyMatrices);
            this.RConstants = new KMatrices(30, 1, 6, this.roundConstants);
            this.LMatrix_full = new KMatrices(4, BERTags.PRIVATE, 6, this.linearMatrices_full);
            this.LMatrix_inv = new KMatrices(4, BERTags.PRIVATE, 6, this.linearMatrices_inv);
            this.KMatrix_full = new KMatrices(5, BERTags.PRIVATE, 6, this.keyMatrices_full);
            this.KMatrix_inv = new KMatrices(1, BERTags.PRIVATE, 6, this.keyMatrices_inv);
            this.RConstants_full = new KMatrices(4, 1, 6, this.roundConstants_full);
        } catch (IOException e) {
            throw Exceptions.illegalStateException("unable to load Picnic properties: " + e.getMessage(), e);
        }
    }
}
