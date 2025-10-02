package org.bouncycastle.crypto.constraints;

import java.util.Set;

/* loaded from: classes8.dex */
class Utils {
    public static void addAliases(Set<String> set) {
        if (set.contains("RC4")) {
            set.add("ARC4");
        } else if (set.contains("ARC4")) {
            set.add("RC4");
        }
    }
}
