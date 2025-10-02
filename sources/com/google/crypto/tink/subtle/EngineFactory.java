package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EngineWrapper;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class EngineFactory<T_WRAPPER extends EngineWrapper<T_ENGINE>, T_ENGINE> {
    public static final Logger c = Logger.getLogger(EngineFactory.class.getName());
    public static final ArrayList d;
    public static final EngineFactory e;
    public static final EngineFactory f;
    public static final EngineFactory g;
    public static final EngineFactory h;
    public static final EngineFactory i;
    public static final EngineFactory j;

    /* renamed from: a, reason: collision with root package name */
    public final EngineWrapper f15156a;
    public final List b = d;

    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } catch (Exception unused) {
            d = new ArrayList();
        }
        e = new EngineFactory(new EngineWrapper.TCipher());
        f = new EngineFactory(new EngineWrapper.TMac());
        g = new EngineFactory(new EngineWrapper.TSignature());
        h = new EngineFactory(new EngineWrapper.TMessageDigest());
        i = new EngineFactory(new EngineWrapper.TKeyPairGenerator());
        j = new EngineFactory(new EngineWrapper.TKeyFactory());
    }

    public EngineFactory(EngineWrapper engineWrapper) {
        this.f15156a = engineWrapper;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            EngineWrapper engineWrapper = this.f15156a;
            if (!zHasNext) {
                return engineWrapper.a(str, null);
            }
            try {
                return engineWrapper.a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
