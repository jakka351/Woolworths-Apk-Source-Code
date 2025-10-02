package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
final class AutoValue_RolloutsState extends RolloutsState {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15782a;

    public AutoValue_RolloutsState(HashSet hashSet) {
        this.f15782a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    public final Set b() {
        return this.f15782a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f15782a.equals(((RolloutsState) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15782a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15782a + "}";
    }
}
