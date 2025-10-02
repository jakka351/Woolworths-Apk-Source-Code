package org.bouncycastle.math.ec;

/* loaded from: classes8.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i);

    ECPoint lookupVar(int i);
}
