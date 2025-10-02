package com.squareup.sqldelight;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/sqldelight/Transacter;", "", "Transaction", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface Transacter {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/Transacter$Transaction;", "Lcom/squareup/sqldelight/TransactionCallbacks;", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Transaction implements TransactionCallbacks {
        public boolean e;

        /* renamed from: a, reason: collision with root package name */
        public final long f19030a = Thread.currentThread().getId();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final LinkedHashMap d = new LinkedHashMap();
        public boolean f = true;

        public abstract void a(boolean z);

        public abstract Transaction b();
    }

    void transaction(boolean z, Function1 function1);

    Object transactionWithResult(boolean z, Function1 function1);
}
