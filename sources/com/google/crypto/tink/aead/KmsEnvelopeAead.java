package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class KmsEnvelopeAead implements Aead {
    public static final byte[] c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final KeyTemplate f14991a;
    public final Aead b;

    public KmsEnvelopeAead(KeyTemplate keyTemplate, Aead aead) {
        this.f14991a = keyTemplate;
        this.b = aead;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        KeyTemplate keyTemplate = this.f14991a;
        byte[] byteArray = Registry.d(keyTemplate).toByteArray();
        byte[] bArrA = this.b.a(byteArray, c);
        String typeUrl = keyTemplate.getTypeUrl();
        ByteString byteString = ByteString.e;
        byte[] bArrA2 = ((Aead) Registry.c(typeUrl, ByteString.i(0, byteArray.length, byteArray), Aead.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrB = this.b.b(bArr3, c);
            String typeUrl = this.f14991a.getTypeUrl();
            Logger logger = Registry.f14983a;
            ByteString byteString = ByteString.e;
            return ((Aead) Registry.c(typeUrl, ByteString.i(0, bArrB.length, bArrB), Aead.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
