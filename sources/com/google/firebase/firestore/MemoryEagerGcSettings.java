package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public final class MemoryEagerGcSettings implements MemoryGarbageCollectorSettings {

    public static class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MemoryEagerGcSettings.class == obj.getClass();
    }

    public final String toString() {
        return "MemoryEagerGcSettings{}";
    }
}
