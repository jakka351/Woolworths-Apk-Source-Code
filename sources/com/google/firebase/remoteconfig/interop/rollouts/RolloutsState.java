package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.auto.value.AutoValue;
import java.util.HashSet;
import java.util.Set;

@AutoValue
/* loaded from: classes6.dex */
public abstract class RolloutsState {
    public static RolloutsState a(HashSet hashSet) {
        return new AutoValue_RolloutsState(hashSet);
    }

    public abstract Set b();
}
