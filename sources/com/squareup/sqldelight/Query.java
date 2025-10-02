package com.squareup.sqldelight;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.internal.QueryLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0001\u001eJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/squareup/sqldelight/Query;", "", "RowType", "", "notifyDataChanged", "()V", "Lcom/squareup/sqldelight/Query$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lcom/squareup/sqldelight/Query$Listener;)V", "removeListener", "", "executeAsList", "()Ljava/util/List;", "executeAsOne", "()Ljava/lang/Object;", "executeAsOneOrNull", "", "queries", "Ljava/util/List;", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "mapper", "Lkotlin/jvm/functions/Function1;", "getMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/squareup/sqldelight/internal/QueryLock;", "listenerLock", "Lcom/squareup/sqldelight/internal/QueryLock;", "listeners", "Listener", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Query<RowType> {

    @NotNull
    private final QueryLock listenerLock;

    @NotNull
    private final List<Listener> listeners;

    @NotNull
    private final Function1<SqlCursor, RowType> mapper;

    @NotNull
    private final List<Query<?>> queries;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/Query$Listener;", "", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Listener {
        void a();
    }

    public Query(List queries, Function1 mapper) {
        Intrinsics.h(queries, "queries");
        Intrinsics.h(mapper, "mapper");
        this.queries = queries;
        this.mapper = mapper;
        this.listenerLock = new QueryLock();
        this.listeners = new CopyOnWriteArrayList();
    }

    public final void addListener(@NotNull Listener listener) {
        Intrinsics.h(listener, "listener");
        synchronized (this.listenerLock) {
            try {
                if (this.listeners.isEmpty()) {
                    this.queries.add(this);
                }
                this.listeners.add(listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract SqlCursor execute();

    @NotNull
    public final List<RowType> executeAsList() {
        ArrayList arrayList = new ArrayList();
        SqlCursor sqlCursorExecute = execute();
        while (sqlCursorExecute.next()) {
            try {
                arrayList.add(getMapper().invoke(sqlCursorExecute));
            } finally {
            }
        }
        CloseableKt.a(sqlCursorExecute, null);
        return arrayList;
    }

    @NotNull
    public final RowType executeAsOne() {
        RowType rowtypeExecuteAsOneOrNull = executeAsOneOrNull();
        if (rowtypeExecuteAsOneOrNull != null) {
            return rowtypeExecuteAsOneOrNull;
        }
        throw new NullPointerException(Intrinsics.m(this, "ResultSet returned null for "));
    }

    @Nullable
    public final RowType executeAsOneOrNull() {
        SqlCursor sqlCursorExecute = execute();
        try {
            if (!sqlCursorExecute.next()) {
                CloseableKt.a(sqlCursorExecute, null);
                return null;
            }
            RowType rowtype = (RowType) getMapper().invoke(sqlCursorExecute);
            if (sqlCursorExecute.next()) {
                throw new IllegalStateException(Intrinsics.m(this, "ResultSet returned more than 1 row for ").toString());
            }
            CloseableKt.a(sqlCursorExecute, null);
            return rowtype;
        } finally {
        }
    }

    @NotNull
    public final Function1<SqlCursor, RowType> getMapper() {
        return this.mapper;
    }

    public final void notifyDataChanged() {
        synchronized (this.listenerLock) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).a();
            }
        }
    }

    public final void removeListener(@NotNull Listener listener) {
        Intrinsics.h(listener, "listener");
        synchronized (this.listenerLock) {
            this.listeners.remove(listener);
            if (this.listeners.isEmpty()) {
                this.queries.remove(this);
            }
        }
    }
}
