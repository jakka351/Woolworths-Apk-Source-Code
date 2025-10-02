package org.sqlite.jdbc4;

import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLFeatureNotSupportedException;
import org.sqlite.jdbc3.JDBC3DatabaseMetaData;

/* loaded from: classes8.dex */
public class JDBC4DatabaseMetaData extends JDBC3DatabaseMetaData {
    @Override // java.sql.DatabaseMetaData
    public final boolean autoCommitFailureClosesAllResultSets() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getClientInfoProperties() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getFunctions(String str, String str2, String str3) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.DatabaseMetaData
    public final RowIdLifetime getRowIdLifetime() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.DatabaseMetaData
    public final ResultSet getSchemas(String str, String str2) throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Wrapper
    public final boolean isWrapperFor(Class cls) {
        return cls.isInstance(this);
    }

    @Override // java.sql.DatabaseMetaData
    public final boolean supportsStoredFunctionsUsingCallSyntax() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override // java.sql.Wrapper
    public final Object unwrap(Class cls) {
        return cls.cast(this);
    }
}
