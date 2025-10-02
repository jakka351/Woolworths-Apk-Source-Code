package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public final class SqlTypesSupport {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f15965a;
    public static final DefaultDateTypeAdapter.DateType b;
    public static final DefaultDateTypeAdapter.DateType c;
    public static final TypeAdapterFactory d;
    public static final TypeAdapterFactory e;
    public static final TypeAdapterFactory f;

    /* renamed from: com.google.gson.internal.sql.SqlTypesSupport$1, reason: invalid class name */
    public class AnonymousClass1 extends DefaultDateTypeAdapter.DateType<Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public final java.util.Date c(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* renamed from: com.google.gson.internal.sql.SqlTypesSupport$2, reason: invalid class name */
    public class AnonymousClass2 extends DefaultDateTypeAdapter.DateType<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public final java.util.Date c(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f15965a = z;
        if (z) {
            b = new AnonymousClass1(Date.class);
            c = new AnonymousClass2(Timestamp.class);
            d = SqlDateTypeAdapter.b;
            e = SqlTimeTypeAdapter.b;
            f = SqlTimestampTypeAdapter.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
