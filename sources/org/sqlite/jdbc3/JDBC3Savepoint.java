package org.sqlite.jdbc3;

import YU.a;
import java.sql.Savepoint;

/* loaded from: classes8.dex */
public class JDBC3Savepoint implements Savepoint {

    /* renamed from: a, reason: collision with root package name */
    public final int f26908a;
    public final String b;

    public JDBC3Savepoint(int i) {
        this.f26908a = i;
        this.b = null;
    }

    @Override // java.sql.Savepoint
    public final int getSavepointId() {
        return this.f26908a;
    }

    @Override // java.sql.Savepoint
    public final String getSavepointName() {
        String str = this.b;
        return str == null ? a.d(this.f26908a, "SQLITE_SAVEPOINT_") : str;
    }

    public JDBC3Savepoint(int i, String str) {
        this.f26908a = i;
        this.b = str;
    }
}
