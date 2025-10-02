package me.oriient.internal.services.uploadingManager;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;

/* loaded from: classes7.dex */
public final class O extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final O f25624a = new O();

    public O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        return Boolean.valueOf(queries.count().executeAsOne().longValue() == 0);
    }
}
