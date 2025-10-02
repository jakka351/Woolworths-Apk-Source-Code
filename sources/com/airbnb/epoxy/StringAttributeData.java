package com.airbnb.epoxy;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class StringAttributeData {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StringAttributeData) {
            return Arrays.equals((Object[]) null, (Object[]) null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode((Object[]) null);
    }
}
