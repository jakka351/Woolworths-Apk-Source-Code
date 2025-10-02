package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class QuirkSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f493a;
    public final Set b;
    public final Set c;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f494a = true;
        public HashSet b;
        public HashSet c;
    }

    public QuirkSettings(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.f493a = z;
        this.b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.f493a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        return this.f493a == quirkSettings.f493a && Objects.equals(this.b, quirkSettings.b) && Objects.equals(this.c, quirkSettings.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f493a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f493a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
