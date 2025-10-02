package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
class SQLiteSchema {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f15518a;
    public final LocalSerializer b;

    public SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f15518a = sQLiteDatabase;
        this.b = localSerializer;
    }

    public final void a(String[] strArr, Runnable runnable) {
        String strO = YU.a.o(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean zD = d(str);
            if (i == 0) {
                z = zD;
            } else if (zD != z) {
                String strH = YU.a.h("Expected all of ", strO, " to either exist or not, but ");
                throw new IllegalStateException(z ? androidx.constraintlayout.core.state.a.l(YU.a.s(strH), strArr[0], " exists and ", str, " does not") : androidx.constraintlayout.core.state.a.l(YU.a.s(strH), strArr[0], " does not exist and ", str, " does"));
            }
        }
        if (z) {
            Logger.a("SQLiteSchema", YU.a.h("Skipping migration because all of ", strO, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    public final void b(int i) {
        boolean[] zArr;
        Cursor cursorE;
        final boolean[] zArr2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final int i2 = 6;
        final int i3 = 3;
        final int i4 = 1;
        if (i < 1) {
            a(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i4) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase = this.e.f15518a;
                            sQLiteDatabase.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase2.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
            a(new String[]{"targets", "target_globals", "target_documents"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i3) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase = this.e.f15518a;
                            sQLiteDatabase.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase2.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
            a(new String[]{"remote_documents"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i2) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase = this.e.f15518a;
                            sQLiteDatabase.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase2.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase2.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
        }
        SQLiteDatabase sQLiteDatabase = this.f15518a;
        if (i < 3 && i != 0) {
            if (d("targets")) {
                sQLiteDatabase.execSQL("DROP TABLE targets");
            }
            if (d("target_globals")) {
                sQLiteDatabase.execSQL("DROP TABLE target_globals");
            }
            if (d("target_documents")) {
                sQLiteDatabase.execSQL("DROP TABLE target_documents");
            }
            a(new String[]{"targets", "target_globals", "target_documents"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i3) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
        }
        if (i < 4) {
            if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "target_globals") != 1) {
                sQLiteDatabase.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
            }
            if (!c("target_globals", "target_count")) {
                sQLiteDatabase.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
            }
            long jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "targets");
            ContentValues contentValues = new ContentValues();
            contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
            sQLiteDatabase.update("target_globals", contentValues, null, null);
        }
        if (i < 5 && !c("target_documents", "sequence_number")) {
            sQLiteDatabase.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
        final int i5 = 2;
        if (i < 6) {
            new SQLitePersistence.Query(sQLiteDatabase, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").c(new Consumer(this) { // from class: com.google.firebase.firestore.local.w
                public final /* synthetic */ SQLiteSchema b;

                {
                    this.b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) throws SQLException {
                    switch (i5) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.b;
                            Cursor cursor = (Cursor) obj;
                            int i6 = cursor.getInt(0);
                            try {
                                Target.Builder builder = (Target.Builder) Target.c0(cursor.getBlob(1)).toBuilder();
                                builder.p();
                                Target.O((Target) builder.e);
                                sQLiteSchema.f15518a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) builder.m()).toByteArray(), Integer.valueOf(i6)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i6));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.b;
                            Cursor cursor2 = (Cursor) obj;
                            int i7 = cursor2.getInt(0);
                            try {
                                sQLiteSchema2.f15518a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{sQLiteSchema2.b.d(Target.c0(cursor2.getBlob(1))).f15522a.b(), Integer.valueOf(i7)});
                                return;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i7));
                                throw null;
                            }
                        default:
                            Cursor cursor3 = (Cursor) obj;
                            String string = cursor3.getString(0);
                            long j = cursor3.getLong(1);
                            SQLiteSchema sQLiteSchema3 = this.b;
                            SQLitePersistence.Query query = new SQLitePersistence.Query(sQLiteSchema3.f15518a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query.a(string, Long.valueOf(j));
                            query.c(new o(1, sQLiteSchema3, string));
                            return;
                    }
                }
            });
        }
        final int i6 = 0;
        if (i < 7) {
            cursorE = new SQLitePersistence.Query(sQLiteDatabase, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").e();
            try {
                Long lValueOf = cursorE.moveToFirst() ? Long.valueOf(cursorE.getLong(0)) : null;
                cursorE.close();
                Assert.b(lValueOf != null, "Missing highest sequence number", new Object[0]);
                final long jLongValue = lValueOf.longValue();
                final SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
                SQLitePersistence.Query query = new SQLitePersistence.Query(sQLiteDatabase, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?");
                query.a(100);
                do {
                    zArr2 = new boolean[]{false};
                    query.c(new Consumer() { // from class: com.google.firebase.firestore.local.v
                        @Override // com.google.firebase.firestore.util.Consumer
                        public final void accept(Object obj) {
                            zArr2[0] = true;
                            SQLiteStatement sQLiteStatement = sQLiteStatementCompileStatement;
                            sQLiteStatement.clearBindings();
                            sQLiteStatement.bindString(1, ((Cursor) obj).getString(0));
                            sQLiteStatement.bindLong(2, jLongValue);
                            Assert.b(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
                        }
                    });
                } while (zArr2[0]);
            } finally {
            }
        }
        if (i < 8) {
            a(new String[]{"collection_parents"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i6) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
            MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex = new MemoryIndexManager.MemoryCollectionParentIndex();
            SQLiteStatement sQLiteStatementCompileStatement2 = sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
            Cursor cursorE2 = new SQLitePersistence.Query(sQLiteDatabase, "SELECT path FROM remote_documents").e();
            while (cursorE2.moveToNext()) {
                try {
                    ResourcePath resourcePath = (ResourcePath) EncodedPath.a(cursorE2.getString(0)).o();
                    if (memoryCollectionParentIndex.a(resourcePath)) {
                        String strE = resourcePath.e();
                        ResourcePath resourcePath2 = (ResourcePath) resourcePath.o();
                        sQLiteStatementCompileStatement2.clearBindings();
                        sQLiteStatementCompileStatement2.bindString(1, strE);
                        sQLiteStatementCompileStatement2.bindString(2, EncodedPath.b(resourcePath2));
                        sQLiteStatementCompileStatement2.execute();
                    }
                } finally {
                    if (cursorE2 == null) {
                        throw th;
                    }
                    try {
                        cursorE2.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            cursorE2.close();
            cursorE = new SQLitePersistence.Query(sQLiteDatabase, "SELECT path FROM document_mutations").e();
            while (cursorE.moveToNext()) {
                try {
                    ResourcePath resourcePath3 = (ResourcePath) EncodedPath.a(cursorE.getString(0)).o();
                    if (memoryCollectionParentIndex.a(resourcePath3)) {
                        String strE2 = resourcePath3.e();
                        ResourcePath resourcePath4 = (ResourcePath) resourcePath3.o();
                        sQLiteStatementCompileStatement2.clearBindings();
                        sQLiteStatementCompileStatement2.bindString(1, strE2);
                        sQLiteStatementCompileStatement2.bindString(2, EncodedPath.b(resourcePath4));
                        sQLiteStatementCompileStatement2.execute();
                    }
                } finally {
                }
            }
            cursorE.close();
        }
        if (i < 9) {
            boolean zC = c("remote_documents", "read_time_seconds");
            boolean zC2 = c("remote_documents", "read_time_nanos");
            Assert.b(zC == zC2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
            if (zC && zC2) {
                new SQLitePersistence.Query(sQLiteDatabase, "SELECT target_id, target_proto FROM targets").c(new Consumer(this) { // from class: com.google.firebase.firestore.local.w
                    public final /* synthetic */ SQLiteSchema b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.firebase.firestore.util.Consumer
                    public final void accept(Object obj) throws SQLException {
                        switch (i6) {
                            case 0:
                                SQLiteSchema sQLiteSchema = this.b;
                                Cursor cursor = (Cursor) obj;
                                int i62 = cursor.getInt(0);
                                try {
                                    Target.Builder builder = (Target.Builder) Target.c0(cursor.getBlob(1)).toBuilder();
                                    builder.p();
                                    Target.O((Target) builder.e);
                                    sQLiteSchema.f15518a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) builder.m()).toByteArray(), Integer.valueOf(i62)});
                                    return;
                                } catch (InvalidProtocolBufferException unused) {
                                    Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i62));
                                    throw null;
                                }
                            case 1:
                                SQLiteSchema sQLiteSchema2 = this.b;
                                Cursor cursor2 = (Cursor) obj;
                                int i7 = cursor2.getInt(0);
                                try {
                                    sQLiteSchema2.f15518a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{sQLiteSchema2.b.d(Target.c0(cursor2.getBlob(1))).f15522a.b(), Integer.valueOf(i7)});
                                    return;
                                } catch (InvalidProtocolBufferException unused2) {
                                    Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i7));
                                    throw null;
                                }
                            default:
                                Cursor cursor3 = (Cursor) obj;
                                String string = cursor3.getString(0);
                                long j = cursor3.getLong(1);
                                SQLiteSchema sQLiteSchema3 = this.b;
                                SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema3.f15518a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                                query2.a(string, Long.valueOf(j));
                                query2.c(new o(1, sQLiteSchema3, string));
                                return;
                        }
                    }
                });
            } else {
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
            }
        }
        if (i == 9) {
            new SQLitePersistence.Query(sQLiteDatabase, "SELECT target_id, target_proto FROM targets").c(new Consumer(this) { // from class: com.google.firebase.firestore.local.w
                public final /* synthetic */ SQLiteSchema b;

                {
                    this.b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) throws SQLException {
                    switch (i6) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.b;
                            Cursor cursor = (Cursor) obj;
                            int i62 = cursor.getInt(0);
                            try {
                                Target.Builder builder = (Target.Builder) Target.c0(cursor.getBlob(1)).toBuilder();
                                builder.p();
                                Target.O((Target) builder.e);
                                sQLiteSchema.f15518a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) builder.m()).toByteArray(), Integer.valueOf(i62)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i62));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.b;
                            Cursor cursor2 = (Cursor) obj;
                            int i7 = cursor2.getInt(0);
                            try {
                                sQLiteSchema2.f15518a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{sQLiteSchema2.b.d(Target.c0(cursor2.getBlob(1))).f15522a.b(), Integer.valueOf(i7)});
                                return;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i7));
                                throw null;
                            }
                        default:
                            Cursor cursor3 = (Cursor) obj;
                            String string = cursor3.getString(0);
                            long j = cursor3.getLong(1);
                            SQLiteSchema sQLiteSchema3 = this.b;
                            SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema3.f15518a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query2.a(string, Long.valueOf(j));
                            query2.c(new o(1, sQLiteSchema3, string));
                            return;
                    }
                }
            });
        }
        if (i < 11) {
            new SQLitePersistence.Query(sQLiteDatabase, "SELECT target_id, target_proto FROM targets").c(new Consumer(this) { // from class: com.google.firebase.firestore.local.w
                public final /* synthetic */ SQLiteSchema b;

                {
                    this.b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) throws SQLException {
                    switch (i4) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.b;
                            Cursor cursor = (Cursor) obj;
                            int i62 = cursor.getInt(0);
                            try {
                                Target.Builder builder = (Target.Builder) Target.c0(cursor.getBlob(1)).toBuilder();
                                builder.p();
                                Target.O((Target) builder.e);
                                sQLiteSchema.f15518a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) builder.m()).toByteArray(), Integer.valueOf(i62)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i62));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.b;
                            Cursor cursor2 = (Cursor) obj;
                            int i7 = cursor2.getInt(0);
                            try {
                                sQLiteSchema2.f15518a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{sQLiteSchema2.b.d(Target.c0(cursor2.getBlob(1))).f15522a.b(), Integer.valueOf(i7)});
                                return;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.a("Failed to decode Query data for target %s", Integer.valueOf(i7));
                                throw null;
                            }
                        default:
                            Cursor cursor3 = (Cursor) obj;
                            String string = cursor3.getString(0);
                            long j = cursor3.getLong(1);
                            SQLiteSchema sQLiteSchema3 = this.b;
                            SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema3.f15518a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query2.a(string, Long.valueOf(j));
                            query2.c(new o(1, sQLiteSchema3, string));
                            return;
                    }
                }
            });
        }
        if (i < 12) {
            final int i7 = 7;
            a(new String[]{"bundles", "named_queries"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i7) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
        }
        if (i < 13) {
            if (!c("remote_documents", "path_length")) {
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
            }
            SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteDatabase, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?");
            query2.a(100);
            SQLiteStatement sQLiteStatementCompileStatement3 = sQLiteDatabase.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
            do {
                zArr = new boolean[]{false};
                query2.c(new o(2, zArr, sQLiteStatementCompileStatement3));
            } while (zArr[0]);
        }
        if (i < 14) {
            final int i8 = 8;
            a(new String[]{"document_overlays"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i8) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
            final int i9 = 4;
            a(new String[]{"data_migrations"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i9) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
            sQLiteDatabase.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{"BUILD_OVERLAYS"});
        }
        if (i < 15) {
            sQLiteDatabase.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
        }
        if (i < 16) {
            final int i10 = 2;
            a(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i10) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
        }
        if (i < 17) {
            final int i11 = 5;
            a(new String[]{"globals"}, new Runnable(this) { // from class: com.google.firebase.firestore.local.u
                public final /* synthetic */ SQLiteSchema e;

                {
                    this.e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws SQLException {
                    switch (i11) {
                        case 0:
                            this.e.f15518a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                        case 1:
                            SQLiteDatabase sQLiteDatabase2 = this.e.f15518a;
                            sQLiteDatabase2.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            sQLiteDatabase2.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            sQLiteDatabase2.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                        case 2:
                            SQLiteDatabase sQLiteDatabase22 = this.e.f15518a;
                            sQLiteDatabase22.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            sQLiteDatabase22.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            sQLiteDatabase22.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 3:
                            SQLiteDatabase sQLiteDatabase3 = this.e.f15518a;
                            sQLiteDatabase3.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            sQLiteDatabase3.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            sQLiteDatabase3.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            sQLiteDatabase3.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 4:
                            this.e.f15518a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                            break;
                        case 5:
                            this.e.f15518a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                        case 6:
                            this.e.f15518a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        case 7:
                            SQLiteDatabase sQLiteDatabase4 = this.e.f15518a;
                            sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            SQLiteDatabase sQLiteDatabase5 = this.e.f15518a;
                            sQLiteDatabase5.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            sQLiteDatabase5.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            sQLiteDatabase5.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                    }
                }
            });
        }
        Logger.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i), 17, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final boolean c(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f15518a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final boolean d(String str) {
        new SQLitePersistence.Query(this.f15518a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").a(str);
        return !r0.d();
    }
}
