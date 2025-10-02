package org.bouncycastle.pqc.jcajce.provider.bike;

import java.security.Key;
import java.security.spec.KeySpec;
import java.util.concurrent.Flow;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static String a(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static String b(KeySpec keySpec, StringBuilder sb, String str) {
        sb.append(keySpec.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static /* bridge */ /* synthetic */ void c(Flow.Subscriber subscriber) {
        throw null;
    }
}
