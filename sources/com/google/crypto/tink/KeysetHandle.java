package com.google.crypto.tink;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm;
import com.google.crypto.tink.integration.android.SharedPrefKeysetReader;
import com.google.crypto.tink.integration.android.SharedPrefKeysetWriter;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Hex;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class KeysetHandle {

    /* renamed from: a, reason: collision with root package name */
    public final Keyset f14978a;

    public KeysetHandle(Keyset keyset) {
        this.f14978a = keyset;
    }

    public static final KeysetHandle c(SharedPrefKeysetReader sharedPrefKeysetReader, AndroidKeystoreAesGcm androidKeystoreAesGcm) throws InvalidProtocolBufferException, GeneralSecurityException {
        EncryptedKeyset from = EncryptedKeyset.parseFrom(sharedPrefKeysetReader.a(), ExtensionRegistryLite.b());
        if (from == null || from.getEncryptedKeyset().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            Keyset from2 = Keyset.parseFrom(androidKeystoreAesGcm.b(from.getEncryptedKeyset().w(), new byte[0]), ExtensionRegistryLite.b());
            if (from2 == null || from2.getKeyCount() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            return new KeysetHandle(from2);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final KeysetInfo a() {
        return Util.a(this.f14978a);
    }

    public final Object b(Class cls) throws GeneralSecurityException {
        byte[] bArrArray;
        Logger logger = Registry.f14983a;
        int i = Util.f14986a;
        Keyset keyset = this.f14978a;
        int primaryKeyId = keyset.getPrimaryKeyId();
        Iterator<Keyset.Key> it = keyset.getKeyList().iterator();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            KeyStatusType keyStatusType = KeyStatusType.ENABLED;
            if (!zHasNext) {
                if (i2 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z && !z2) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                PrimitiveSet primitiveSet = new PrimitiveSet(cls);
                for (Keyset.Key key : keyset.getKeyList()) {
                    if (key.getStatus() == keyStatusType) {
                        Object objC = Registry.c(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), cls);
                        if (key.getStatus() != keyStatusType) {
                            throw new GeneralSecurityException("only ENABLED key is allowed");
                        }
                        int iOrdinal = key.getOutputPrefixType().ordinal();
                        if (iOrdinal == 1) {
                            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(key.getKeyId()).array();
                        } else if (iOrdinal == 2) {
                            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(key.getKeyId()).array();
                        } else if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(key.getKeyId()).array();
                        } else {
                            bArrArray = CryptoFormat.f14969a;
                        }
                        PrimitiveSet.Entry entry = new PrimitiveSet.Entry(objC, bArrArray, key.getStatus(), key.getOutputPrefixType(), key.getKeyId());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(entry);
                        String str = new String(entry.a(), PrimitiveSet.d);
                        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        ConcurrentHashMap concurrentHashMap = primitiveSet.f14981a;
                        List list = (List) concurrentHashMap.put(str, listUnmodifiableList);
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(entry);
                            concurrentHashMap.put(str, Collections.unmodifiableList(arrayList2));
                        }
                        if (key.getKeyId() != keyset.getPrimaryKeyId()) {
                            continue;
                        } else {
                            if (entry.c != keyStatusType) {
                                throw new IllegalArgumentException("the primary entry has to be ENABLED");
                            }
                            if (primitiveSet.a(entry.a()).isEmpty()) {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                            primitiveSet.b = entry;
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap2 = Registry.e;
                Class cls2 = primitiveSet.c;
                PrimitiveWrapper primitiveWrapper = (PrimitiveWrapper) concurrentHashMap2.get(cls2);
                if (primitiveWrapper != null) {
                    return primitiveWrapper.b(primitiveSet);
                }
                throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
            }
            Keyset.Key next = it.next();
            if (next.getStatus() == keyStatusType) {
                if (!next.hasKeyData()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.getKeyId())));
                }
                if (next.getOutputPrefixType() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.getKeyId())));
                }
                if (next.getStatus() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.getKeyId())));
                }
                if (next.getKeyId() == primaryKeyId) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (next.getKeyData().getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
    }

    public final void d(SharedPrefKeysetWriter sharedPrefKeysetWriter, AndroidKeystoreAesGcm androidKeystoreAesGcm) throws GeneralSecurityException, IOException {
        Keyset keyset = this.f14978a;
        byte[] bArrA = androidKeystoreAesGcm.a(keyset.toByteArray(), new byte[0]);
        try {
            if (!Keyset.parseFrom(androidKeystoreAesGcm.b(bArrA, new byte[0]), ExtensionRegistryLite.b()).equals(keyset)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            EncryptedKeyset.Builder builderNewBuilder = EncryptedKeyset.newBuilder();
            builderNewBuilder.m(ByteString.i(0, bArrA.length, bArrA));
            builderNewBuilder.o(Util.a(keyset));
            if (!sharedPrefKeysetWriter.f15004a.putString(sharedPrefKeysetWriter.b, Hex.b(((EncryptedKeyset) builderNewBuilder.p1()).toByteArray())).commit()) {
                throw new IOException("Failed to write to SharedPreferences");
            }
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final String toString() {
        return Util.a(this.f14978a).toString();
    }
}
