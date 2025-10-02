package com.google.firebase.perf.util;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class StorageUnit {
    public static final StorageUnit e;
    public static final StorageUnit f;
    public static final /* synthetic */ StorageUnit[] g;
    public final long d;

    /* JADX INFO: Fake field, exist only in values array */
    StorageUnit EF0;

    /* renamed from: com.google.firebase.perf.util.StorageUnit$1, reason: invalid class name */
    public enum AnonymousClass1 extends StorageUnit {
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$2, reason: invalid class name */
    public enum AnonymousClass2 extends StorageUnit {
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$3, reason: invalid class name */
    public enum AnonymousClass3 extends StorageUnit {
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$4, reason: invalid class name */
    public enum AnonymousClass4 extends StorageUnit {
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$5, reason: invalid class name */
    public enum AnonymousClass5 extends StorageUnit {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("TERABYTES", 0, 1099511627776L);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("GIGABYTES", 1, llqqqql.a0061aaaaa);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("MEGABYTES", 2, llqqqql.c0063c0063c00630063);
        e = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("KILOBYTES", 3, llqqqql.c00630063c0063c0063);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("BYTES", 4, 1L);
        f = anonymousClass5;
        g = new StorageUnit[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
    }

    public StorageUnit(String str, int i, long j) {
        this.d = j;
    }

    public static StorageUnit valueOf(String str) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, str);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) g.clone();
    }

    public final long a(long j) {
        return (j * this.d) / llqqqql.c00630063c0063c0063;
    }
}
