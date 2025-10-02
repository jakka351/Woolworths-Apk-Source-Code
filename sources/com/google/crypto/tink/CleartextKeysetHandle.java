package com.google.crypto.tink;

import com.google.crypto.tink.integration.android.SharedPrefKeysetReader;
import com.google.crypto.tink.integration.android.SharedPrefKeysetWriter;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Hex;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class CleartextKeysetHandle {
    public static KeysetHandle a(SharedPrefKeysetReader sharedPrefKeysetReader) throws InvalidProtocolBufferException, GeneralSecurityException {
        Keyset from = Keyset.parseFrom(sharedPrefKeysetReader.a(), ExtensionRegistryLite.b());
        if (from == null || from.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new KeysetHandle(from);
    }

    public static void b(KeysetHandle keysetHandle, SharedPrefKeysetWriter sharedPrefKeysetWriter) throws IOException {
        if (!sharedPrefKeysetWriter.f15004a.putString(sharedPrefKeysetWriter.b, Hex.b(keysetHandle.f14978a.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
