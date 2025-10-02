package com.google.crypto.tink;

import YU.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class KmsClients {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f14980a = new CopyOnWriteArrayList();

    public static KmsClient a(String str) throws GeneralSecurityException {
        Iterator it = f14980a.iterator();
        while (it.hasNext()) {
            KmsClient kmsClient = (KmsClient) it.next();
            if (kmsClient.a(str)) {
                return kmsClient;
            }
        }
        throw new GeneralSecurityException(a.A("No KMS client does support: ", str));
    }
}
