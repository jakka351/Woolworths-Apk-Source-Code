package org.sqlite.jdbc4;

import java.sql.Statement;
import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteException;
import org.sqlite.jdbc3.JDBC3Statement;

/* loaded from: classes8.dex */
public class JDBC4Statement extends JDBC3Statement implements Statement {
    public boolean k;

    public JDBC4Statement(SQLiteConnection sQLiteConnection) {
        super(sQLiteConnection);
        this.k = false;
    }

    @Override // java.sql.Statement, java.lang.AutoCloseable
    public final void close() throws SQLiteException {
        d();
        this.k = true;
    }

    @Override // java.sql.Statement
    public final boolean isClosed() {
        return this.k;
    }

    @Override // java.sql.Statement
    public final boolean isPoolable() {
        return false;
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return cls.isInstance(this);
    }

    @Override // java.sql.Statement
    public final void setPoolable(boolean z) {
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return cls.cast(this);
    }
}
