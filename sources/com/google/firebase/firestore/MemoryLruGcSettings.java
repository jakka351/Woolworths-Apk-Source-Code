package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public final class MemoryLruGcSettings implements MemoryGarbageCollectorSettings {

    public static class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryLruGcSettings.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) 0;
    }

    public final String toString() {
        return "MemoryLruGcSettings{cacheSize=0}";
    }
}
