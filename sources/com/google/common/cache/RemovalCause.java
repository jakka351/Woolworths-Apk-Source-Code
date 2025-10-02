package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public abstract class RemovalCause {
    public static final RemovalCause d;
    public static final RemovalCause e;
    public static final RemovalCause f;
    public static final RemovalCause g;
    public static final RemovalCause h;
    public static final /* synthetic */ RemovalCause[] i;

    static {
        RemovalCause removalCause = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.1
            @Override // com.google.common.cache.RemovalCause
            public final boolean a() {
                return false;
            }
        };
        d = removalCause;
        RemovalCause removalCause2 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.2
            @Override // com.google.common.cache.RemovalCause
            public final boolean a() {
                return false;
            }
        };
        e = removalCause2;
        RemovalCause removalCause3 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.3
            @Override // com.google.common.cache.RemovalCause
            public final boolean a() {
                return true;
            }
        };
        f = removalCause3;
        RemovalCause removalCause4 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.4
            @Override // com.google.common.cache.RemovalCause
            public final boolean a() {
                return true;
            }
        };
        g = removalCause4;
        RemovalCause removalCause5 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.5
            @Override // com.google.common.cache.RemovalCause
            public final boolean a() {
                return true;
            }
        };
        h = removalCause5;
        i = new RemovalCause[]{removalCause, removalCause2, removalCause3, removalCause4, removalCause5};
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) i.clone();
    }

    public abstract boolean a();
}
