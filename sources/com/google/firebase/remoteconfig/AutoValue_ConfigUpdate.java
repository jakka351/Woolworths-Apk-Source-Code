package com.google.firebase.remoteconfig;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15754a;

    public AutoValue_ConfigUpdate(HashSet hashSet) {
        this.f15754a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public final Set b() {
        return this.f15754a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f15754a.equals(((ConfigUpdate) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15754a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f15754a + "}";
    }
}
