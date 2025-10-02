package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class KeysetManager {

    /* renamed from: a, reason: collision with root package name */
    public final Keyset.Builder f14979a;

    public KeysetManager(Keyset.Builder builder) {
        this.f14979a = builder;
    }

    public static int d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public final synchronized KeysetHandle a() {
        Keyset keyset;
        keyset = (Keyset) this.f14979a.p1();
        if (keyset.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new KeysetHandle(keyset);
    }

    public final synchronized boolean b(int i) {
        Iterator it = Collections.unmodifiableList(((Keyset) this.f14979a.e).getKeyList()).iterator();
        while (it.hasNext()) {
            if (((Keyset.Key) it.next()).getKeyId() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized Keyset.Key c(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeyData keyDataE;
        int iD;
        try {
            keyDataE = Registry.e(keyTemplate);
            synchronized (this) {
                iD = d();
                while (b(iD)) {
                    iD = d();
                }
            }
            return (Keyset.Key) builderNewBuilder.p1();
        } catch (Throwable th) {
            throw th;
        }
        OutputPrefixType outputPrefixType = keyTemplate.getOutputPrefixType();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            outputPrefixType = OutputPrefixType.TINK;
        }
        Keyset.Key.Builder builderNewBuilder = Keyset.Key.newBuilder();
        builderNewBuilder.m(keyDataE);
        builderNewBuilder.o(iD);
        builderNewBuilder.q(KeyStatusType.ENABLED);
        builderNewBuilder.p(outputPrefixType);
        return (Keyset.Key) builderNewBuilder.p1();
    }
}
