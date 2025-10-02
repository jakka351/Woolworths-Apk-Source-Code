package org.sqlite.core;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.sql.SQLException;
import org.sqlite.BusyHandler;
import org.sqlite.Function;
import org.sqlite.ProgressHandler;
import org.sqlite.core.DB;

/* loaded from: classes8.dex */
public final class NativeDB extends DB {
    public static boolean k;

    static {
        if (!"The Android Project".equals(System.getProperty("java.vm.vendor"))) {
            k = false;
        } else {
            System.loadLibrary("sqlitejdbc");
            k = true;
        }
    }

    public static byte[] t(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 is not supported", e);
        }
    }

    public static String u(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            return Charset.forName("UTF-8").decode(byteBuffer).toString();
        } catch (UnsupportedCharsetException e) {
            throw new RuntimeException("UTF-8 is not supported", e);
        }
    }

    public native synchronized void _close() throws SQLException;

    public native synchronized int _exec_utf8(byte[] bArr) throws SQLException;

    public native synchronized void _open_utf8(byte[] bArr, int i) throws SQLException;

    @Override // org.sqlite.core.DB
    public final int a(String str, String str2) {
        return backup(t(str), t(str2), null);
    }

    @Override // org.sqlite.core.DB
    public final synchronized int b(int i, long j, String str) {
        return bind_text_utf8(j, i, t(str));
    }

    public native synchronized int backup(byte[] bArr, byte[] bArr2, DB.ProgressObserver progressObserver) throws SQLException;

    @Override // org.sqlite.core.DB
    public native synchronized int bind_blob(long j, int i, byte[] bArr);

    @Override // org.sqlite.core.DB
    public native synchronized int bind_double(long j, int i, double d);

    @Override // org.sqlite.core.DB
    public native synchronized int bind_int(long j, int i, int i2);

    @Override // org.sqlite.core.DB
    public native synchronized int bind_long(long j, int i, long j2);

    @Override // org.sqlite.core.DB
    public native synchronized int bind_null(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized int bind_parameter_count(long j);

    public native synchronized int bind_text_utf8(long j, int i, byte[] bArr);

    public native synchronized void busy_handler(BusyHandler busyHandler);

    public native synchronized void busy_timeout(int i);

    @Override // org.sqlite.core.DB
    public final synchronized String c(int i, long j) {
        return u(column_name_utf8(j, i));
    }

    @Override // org.sqlite.core.DB
    public native synchronized int changes();

    @Override // org.sqlite.core.DB
    public native synchronized int clear_bindings(long j);

    public native synchronized void clear_progress_handler() throws SQLException;

    @Override // org.sqlite.core.DB
    public native synchronized byte[] column_blob(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized int column_count(long j);

    public native synchronized ByteBuffer column_decltype_utf8(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized double column_double(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized int column_int(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized long column_long(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized boolean[][] column_metadata(long j);

    public native synchronized ByteBuffer column_name_utf8(long j, int i);

    public native synchronized ByteBuffer column_table_name_utf8(long j, int i);

    public native synchronized ByteBuffer column_text_utf8(long j, int i);

    @Override // org.sqlite.core.DB
    public native synchronized int column_type(long j, int i);

    public native synchronized int create_function_utf8(byte[] bArr, Function function, int i, int i2);

    public native synchronized int destroy_function_utf8(byte[] bArr, int i);

    @Override // org.sqlite.core.DB
    public final synchronized String e(int i, long j) {
        return u(column_table_name_utf8(j, i));
    }

    public native synchronized int enable_load_extension(boolean z);

    public native synchronized ByteBuffer errmsg_utf8();

    @Override // org.sqlite.core.DB
    public final synchronized String f(int i, long j) {
        return u(column_text_utf8(j, i));
    }

    @Override // org.sqlite.core.DB
    public native synchronized int finalize(long j);

    public native synchronized void free_functions();

    @Override // org.sqlite.core.DB
    public final synchronized String h() {
        return u(errmsg_utf8());
    }

    @Override // org.sqlite.core.DB
    public native void interrupt();

    public native ByteBuffer libversion_utf8();

    public native synchronized int limit(int i, int i2) throws SQLException;

    @Override // org.sqlite.core.DB
    public final synchronized long p(String str) {
        return prepare_utf8(t(str));
    }

    public native synchronized long prepare_utf8(byte[] bArr) throws SQLException;

    @Override // org.sqlite.core.DB
    public final synchronized int r(String str, String str2) {
        return restore(t(str), t(str2), null);
    }

    public native synchronized void register_progress_handler(int i, ProgressHandler progressHandler) throws SQLException;

    @Override // org.sqlite.core.DB
    public native synchronized int reset(long j);

    public native synchronized int restore(byte[] bArr, byte[] bArr2, DB.ProgressObserver progressObserver) throws SQLException;

    public native synchronized void result_blob(long j, byte[] bArr);

    public native synchronized void result_double(long j, double d);

    public native synchronized void result_error_utf8(long j, byte[] bArr);

    public native synchronized void result_int(long j, int i);

    public native synchronized void result_long(long j, long j2);

    public native synchronized void result_null(long j);

    public native synchronized void result_text_utf8(long j, byte[] bArr);

    public native synchronized void set_commit_listener(boolean z);

    public native synchronized void set_update_listener(boolean z);

    public native synchronized int shared_cache(boolean z);

    @Override // org.sqlite.core.DB
    public native synchronized int step(long j);

    @Override // org.sqlite.core.DB
    public native synchronized int total_changes();

    public native synchronized byte[] value_blob(Function function, int i);

    public native synchronized double value_double(Function function, int i);

    public native synchronized int value_int(Function function, int i);

    public native synchronized long value_long(Function function, int i);

    public native synchronized ByteBuffer value_text_utf8(Function function, int i);

    public native synchronized int value_type(Function function, int i);
}
