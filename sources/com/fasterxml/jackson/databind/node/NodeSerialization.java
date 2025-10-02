package com.fasterxml.jackson.databind.node;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes4.dex */
class NodeSerialization implements Serializable, Externalizable {
    public byte[] d;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i;
        byte[] bArrE;
        int i2 = objectInput.readInt();
        if (i2 <= 100000) {
            bArrE = new byte[i2];
            objectInput.readFully(bArrE, 0, i2);
        } else {
            ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder((BufferRecycler) null, 100000);
            byteArrayBuilder.reset();
            byte[] bArr = byteArrayBuilder.g;
            loop0: while (true) {
                i = 0;
                do {
                    int iMin = Math.min(bArr.length - i, i2);
                    objectInput.readFully(bArr, 0, iMin);
                    i2 -= iMin;
                    i += iMin;
                    if (i2 == 0) {
                        break loop0;
                    }
                } while (i != bArr.length);
                byteArrayBuilder.a();
                bArr = byteArrayBuilder.g;
            }
            byteArrayBuilder.h = i;
            bArrE = byteArrayBuilder.e();
        }
        this.d = bArrE;
    }

    public Object readResolve() {
        try {
            return InternalNodeMapper.a(this.d);
        } catch (IOException e) {
            throw new IllegalArgumentException(a.k(e, new StringBuilder("Failed to JDK deserialize `JsonNode` value: ")), e);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.d.length);
        objectOutput.write(this.d);
    }
}
