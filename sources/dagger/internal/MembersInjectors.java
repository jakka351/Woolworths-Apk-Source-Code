package dagger.internal;

import dagger.MembersInjector;

/* loaded from: classes7.dex */
public final class MembersInjectors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOpMembersInjector implements MembersInjector<Object> {
        public static final /* synthetic */ NoOpMembersInjector[] d = {new NoOpMembersInjector("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoOpMembersInjector EF5;

        public static NoOpMembersInjector valueOf(String str) {
            return (NoOpMembersInjector) Enum.valueOf(NoOpMembersInjector.class, str);
        }

        public static NoOpMembersInjector[] values() {
            return (NoOpMembersInjector[]) d.clone();
        }
    }
}
