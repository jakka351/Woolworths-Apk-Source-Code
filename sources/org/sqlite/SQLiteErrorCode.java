package org.sqlite;

import YU.a;

/* loaded from: classes8.dex */
public enum SQLiteErrorCode {
    UNKNOWN_ERROR(-1, "unknown error"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_OK(0, "Successful result"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_ERROR(1, "SQL error or missing database"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_INTERNAL(2, "Internal logic error in SQLite"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_PERM(3, " Access permission denied"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_ABORT(4, " Callback routine requested an abort"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_BUSY(5, " The database file is locked"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_LOCKED(6, " A table in the database is locked"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_NOMEM(7, " A malloc() failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_READONLY(8, " Attempt to write a readonly database"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_INTERRUPT(9, " Operation terminated by sqlite3_interrupt()"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR(10, " Some kind of disk I/O error occurred"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CORRUPT(11, " The database disk image is malformed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_NOTFOUND(12, " NOT USED. Table or record not found"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_FULL(13, " Insertion failed because database is full"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CANTOPEN(14, " Unable to open the database file"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_PROTOCOL(15, " NOT USED. Database lock protocol error"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_EMPTY(16, " Database is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_SCHEMA(17, " The database schema changed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_TOOBIG(18, " String or BLOB exceeds size limit"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT(19, " Abort due to constraint violation"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_MISMATCH(20, " Data type mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_MISUSE(21, " Library used incorrectly"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_NOLFS(22, " Uses OS features not supported on host"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_AUTH(23, " Authorization denied"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_FORMAT(24, " Auxiliary database format error"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_RANGE(25, " 2nd parameter to sqlite3_bind out of range"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_NOTADB(26, " File opened that is not a database file"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_ROW(100, " sqlite3_step() has another row ready"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_DONE(101, " sqlite3_step() has finished executing"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_BUSY_RECOVERY(261, " Another process is busy recovering a WAL mode database file following a crash"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_LOCKED_SHAREDCACHE(262, " Contention with a different database connection that shares the cache"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_READONLY_RECOVERY(264, " The database file needs to be recovered"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_READ(266, " I/O error in the VFS layer while trying to read from a file on disk"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CORRUPT_VTAB(267, " Content in the virtual table is corrupt"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_CHECK(275, " A CHECK constraint failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_ABORT_ROLLBACK(516, " The transaction that was active when the SQL statement first started was rolled back"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_BUSY_SNAPSHOT(517, " Another database connection has already written to the database"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_READONLY_CANTLOCK(520, " The shared-memory file associated with that database is read-only"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_SHORT_READ(522, " The VFS layer was unable to obtain as many bytes as was requested"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CANTOPEN_ISDIR(526, " The file is really a directory"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_COMMITHOOK(531, " A commit hook callback returned non-zero"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_READONLY_ROLLBACK(776, "  Hot journal needs to be rolled back"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_WRITE(778, " I/O error in the VFS layer while trying to write to a file on disk"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CANTOPEN_FULLPATH(782, " The operating system was unable to convert the filename into a full pathname"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_FOREIGNKEY(787, " A foreign key constraint failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_READONLY_DBMOVED(1032, " The database file has been moved since it was opened"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_FSYNC(1034, " I/O error in the VFS layer while trying to flush previously written content"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CANTOPEN_CONVPATH(1038, " cygwin_conv_path() system call failed while trying to open a file"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_FUNCTION(1043, " Error reported by extension function"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_DIR_FSYNC(1290, " I/O error in the VFS layer while trying to invoke fsync() on a directory"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_NOTNULL(1299, " A NOT NULL constraint failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_TRUNCATE(1546, " I/O error in the VFS layer while trying to truncate a file to a smaller size"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_PRIMARYKEY(1555, " A PRIMARY KEY constraint failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_FSTAT(1802, " I/O error in the VFS layer while trying to invoke fstat()"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_TRIGGER(1811, " A RAISE function within a trigger fired, causing the SQL statement to abort"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_UNLOCK(2058, " I/O error within xUnlock"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_UNIQUE(2067, " A UNIQUE constraint failed"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_RDLOCK(2314, " I/O error within xLock"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_VTAB(2323, " Error reported by application-defined virtual table"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_DELETE(2570, " I/O error within xDelete"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_CONSTRAINT_ROWID(2579, " rowid is not unique"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_NOMEM(3082, " Unable to allocate sufficient memory"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_ACCESS(3338, " I/O error within the xAccess"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_CHECKRESERVEDLOCK(3594, " I/O error within xCheckReservedLock"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_LOCK(3850, " I/O error in the advisory file locking logic"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_CLOSE(4106, " I/O error within xClose"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_SHMOPEN(4618, " I/O error within xShmMap while trying to open a new shared memory segment"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_SHMSIZE(4874, " I/O error within xShmMap while trying to resize an existing shared memory segment"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_SHMMAP(5386, " I/O error within xShmMap while trying to map a shared memory segment"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_SEEK(5642, " I/O error while trying to seek a file descriptor"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_DELETE_NOENT(5898, " The file being deleted does not exist"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_MMAP(6154, " I/O error while trying to map or unmap part of the database file"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_GETTEMPPATH(6410, " Unable to determine a suitable directory in which to place temporary files"),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_IOERR_CONVPATH(6666, " cygwin_conv_path() system call failed");

    public final int d;
    public final String e;

    SQLiteErrorCode(int i, String str) {
        this.d = i;
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return a.i("[", name(), "] ", this.e);
    }
}
