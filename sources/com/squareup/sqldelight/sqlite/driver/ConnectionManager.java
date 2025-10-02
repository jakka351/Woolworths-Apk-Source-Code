package com.squareup.sqldelight.sqlite.driver;

import com.squareup.sqldelight.Transacter;
import java.sql.Connection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/ConnectionManager;", "", "Transaction", "sqldelight-jdbc-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface ConnectionManager {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/sqlite/driver/ConnectionManager$Transaction;", "Lcom/squareup/sqldelight/Transacter$Transaction;", "sqldelight-jdbc-driver"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Transaction extends Transacter.Transaction {
        @Override // com.squareup.sqldelight.Transacter.Transaction
        public final void a(boolean z) {
            if (!z) {
                throw null;
            }
            throw null;
        }

        @Override // com.squareup.sqldelight.Transacter.Transaction
        public final Transacter.Transaction b() {
            return null;
        }
    }

    void a(Connection connection);

    void b(Transaction transaction);

    void c(Connection connection);

    void d(Connection connection);
}
