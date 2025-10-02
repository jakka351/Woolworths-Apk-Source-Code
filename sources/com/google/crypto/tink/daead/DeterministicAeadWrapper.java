package com.google.crypto.tink.daead;

import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class DeterministicAeadWrapper implements PrimitiveWrapper<DeterministicAead> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14994a = Logger.getLogger(DeterministicAeadWrapper.class.getName());

    public static class WrappedDeterministicAead implements DeterministicAead {

        /* renamed from: a, reason: collision with root package name */
        public PrimitiveSet f14995a;

        @Override // com.google.crypto.tink.DeterministicAead
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            PrimitiveSet primitiveSet = this.f14995a;
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it = primitiveSet.a(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return ((DeterministicAead) ((PrimitiveSet.Entry) it.next()).f14982a).a(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        DeterministicAeadWrapper.f14994a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it2 = primitiveSet.a(CryptoFormat.f14969a).iterator();
            while (it2.hasNext()) {
                try {
                    return ((DeterministicAead) ((PrimitiveSet.Entry) it2.next()).f14982a).a(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public final byte[] b(byte[] bArr, byte[] bArr2) {
            PrimitiveSet primitiveSet = this.f14995a;
            return Bytes.a(primitiveSet.b.a(), ((DeterministicAead) primitiveSet.b.f14982a).b(bArr, bArr2));
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        WrappedDeterministicAead wrappedDeterministicAead = new WrappedDeterministicAead();
        wrappedDeterministicAead.f14995a = primitiveSet;
        return wrappedDeterministicAead;
    }
}
