package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class AeadWrapper implements PrimitiveWrapper<Aead> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14989a = Logger.getLogger(AeadWrapper.class.getName());

    public static class WrappedAead implements Aead {

        /* renamed from: a, reason: collision with root package name */
        public final PrimitiveSet f14990a;

        public WrappedAead(PrimitiveSet primitiveSet) {
            this.f14990a = primitiveSet;
        }

        @Override // com.google.crypto.tink.Aead
        public final byte[] a(byte[] bArr, byte[] bArr2) {
            PrimitiveSet primitiveSet = this.f14990a;
            return Bytes.a(primitiveSet.b.a(), ((Aead) primitiveSet.b.f14982a).a(bArr, bArr2));
        }

        @Override // com.google.crypto.tink.Aead
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            PrimitiveSet primitiveSet = this.f14990a;
            if (length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it = primitiveSet.a(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return ((Aead) ((PrimitiveSet.Entry) it.next()).f14982a).b(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        AeadWrapper.f14989a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it2 = primitiveSet.a(CryptoFormat.f14969a).iterator();
            while (it2.hasNext()) {
                try {
                    return ((Aead) ((PrimitiveSet.Entry) it2.next()).f14982a).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedAead(primitiveSet);
    }
}
