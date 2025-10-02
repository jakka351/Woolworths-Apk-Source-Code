package com.google.crypto.tink.mac;

import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class MacWrapper implements PrimitiveWrapper<Mac> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15006a = Logger.getLogger(MacWrapper.class.getName());

    /* loaded from: classes6.dex */
    public static class WrappedMac implements Mac {

        /* renamed from: a, reason: collision with root package name */
        public final PrimitiveSet f15007a;
        public final byte[] b = {0};

        public WrappedMac(PrimitiveSet primitiveSet) {
            this.f15007a = primitiveSet;
        }

        @Override // com.google.crypto.tink.Mac
        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            PrimitiveSet primitiveSet = this.f15007a;
            for (PrimitiveSet.Entry entry : primitiveSet.a(bArrCopyOfRange)) {
                try {
                    if (entry.d.equals(OutputPrefixType.LEGACY)) {
                        ((Mac) entry.f14982a).a(bArrCopyOfRange2, Bytes.a(bArr2, this.b));
                    } else {
                        ((Mac) entry.f14982a).a(bArrCopyOfRange2, bArr2);
                    }
                    return;
                } catch (GeneralSecurityException e) {
                    MacWrapper.f15006a.info("tag prefix matches a key, but cannot verify: " + e.toString());
                }
            }
            Iterator it = primitiveSet.a(CryptoFormat.f14969a).iterator();
            while (it.hasNext()) {
                try {
                    ((Mac) ((PrimitiveSet.Entry) it.next()).f14982a).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // com.google.crypto.tink.Mac
        public final byte[] b(byte[] bArr) {
            PrimitiveSet primitiveSet = this.f15007a;
            return primitiveSet.b.d.equals(OutputPrefixType.LEGACY) ? Bytes.a(primitiveSet.b.a(), ((Mac) primitiveSet.b.f14982a).b(Bytes.a(bArr, this.b))) : Bytes.a(primitiveSet.b.a(), ((Mac) primitiveSet.b.f14982a).b(bArr));
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedMac(primitiveSet);
    }
}
