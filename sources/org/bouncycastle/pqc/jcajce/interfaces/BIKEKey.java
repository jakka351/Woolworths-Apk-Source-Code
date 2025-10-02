package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec;

/* loaded from: classes8.dex */
public interface BIKEKey extends Key {
    BIKEParameterSpec getParameterSpec();
}
