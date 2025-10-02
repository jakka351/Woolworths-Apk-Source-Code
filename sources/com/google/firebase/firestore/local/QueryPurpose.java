package com.google.firebase.firestore.local;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class QueryPurpose {
    public static final QueryPurpose d;
    public static final QueryPurpose e;
    public static final QueryPurpose f;
    public static final QueryPurpose g;
    public static final /* synthetic */ QueryPurpose[] h;

    static {
        QueryPurpose queryPurpose = new QueryPurpose("LISTEN", 0);
        d = queryPurpose;
        QueryPurpose queryPurpose2 = new QueryPurpose("EXISTENCE_FILTER_MISMATCH", 1);
        e = queryPurpose2;
        QueryPurpose queryPurpose3 = new QueryPurpose("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        f = queryPurpose3;
        QueryPurpose queryPurpose4 = new QueryPurpose("LIMBO_RESOLUTION", 3);
        g = queryPurpose4;
        h = new QueryPurpose[]{queryPurpose, queryPurpose2, queryPurpose3, queryPurpose4};
    }

    public static QueryPurpose valueOf(String str) {
        return (QueryPurpose) Enum.valueOf(QueryPurpose.class, str);
    }

    public static QueryPurpose[] values() {
        return (QueryPurpose[]) h.clone();
    }
}
