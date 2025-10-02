package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
class RegistryEciesAeadHkdfDemHelper implements EciesAeadHkdfDemHelper {
    public RegistryEciesAeadHkdfDemHelper(KeyTemplate keyTemplate) throws GeneralSecurityException {
        String typeUrl = keyTemplate.getTypeUrl();
        if (typeUrl.equals(AeadConfig.b)) {
            try {
                AesGcmKeyFormat from = AesGcmKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.b());
                from.getKeySize();
                return;
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!typeUrl.equals(AeadConfig.f14987a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(typeUrl));
        }
        try {
            AesCtrHmacAeadKeyFormat from2 = AesCtrHmacAeadKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.b());
            from2.getAesCtrKeyFormat().getKeySize();
            from2.getHmacKeyFormat().getKeySize();
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
        }
    }
}
