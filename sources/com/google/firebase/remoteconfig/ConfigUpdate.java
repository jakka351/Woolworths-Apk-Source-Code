package com.google.firebase.remoteconfig;

import com.google.auto.value.AutoValue;
import java.util.HashSet;
import java.util.Set;

@AutoValue
/* loaded from: classes6.dex */
public abstract class ConfigUpdate {
    public static ConfigUpdate a(HashSet hashSet) {
        return new AutoValue_ConfigUpdate(hashSet);
    }

    public abstract Set b();
}
