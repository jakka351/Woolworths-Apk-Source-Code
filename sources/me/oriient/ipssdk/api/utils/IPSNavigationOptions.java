package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

@Keep
/* loaded from: classes2.dex */
public class IPSNavigationOptions {
    private static final int ACCESSIBLE_ONLY = 1;

    @NonNull
    private final Set<Integer> options;

    @Keep
    public static class Builder {

        @NonNull
        private final Set<Integer> options = new HashSet();

        @NonNull
        public Builder accessibleOnly() {
            this.options.add(1);
            return this;
        }

        public IPSNavigationOptions build() {
            return new IPSNavigationOptions(0, this.options);
        }
    }

    public /* synthetic */ IPSNavigationOptions(int i, Set set) {
        this(set);
    }

    @NonNull
    public Set<Integer> getOptions() {
        return this.options;
    }

    @NonNull
    public String toString() {
        return "IPSNavigationOptions{options=" + this.options + '}';
    }

    private IPSNavigationOptions(@NonNull Set<Integer> set) {
        this.options = set;
    }
}
