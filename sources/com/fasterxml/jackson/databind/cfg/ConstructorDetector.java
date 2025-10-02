package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ConstructorDetector implements Serializable {
    public static final ConstructorDetector d = new ConstructorDetector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SingleArgConstructor {
        public static final /* synthetic */ SingleArgConstructor[] d = {new SingleArgConstructor("DELEGATING", 0), new SingleArgConstructor("PROPERTIES", 1), new SingleArgConstructor("HEURISTIC", 2), new SingleArgConstructor("REQUIRE_MODE", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        SingleArgConstructor EF5;

        public static SingleArgConstructor valueOf(String str) {
            return (SingleArgConstructor) Enum.valueOf(SingleArgConstructor.class, str);
        }

        public static SingleArgConstructor[] values() {
            return (SingleArgConstructor[]) d.clone();
        }
    }
}
