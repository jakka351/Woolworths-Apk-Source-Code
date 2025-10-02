package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.db.SqlCursor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b extends Query {

    /* renamed from: a, reason: collision with root package name */
    public final long f26333a;
    public final /* synthetic */ s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, long j, f mapper) {
        super(sVar.d, mapper);
        Intrinsics.h(mapper, "mapper");
        this.b = sVar;
        this.f26333a = j;
    }

    @Override // com.squareup.sqldelight.Query
    public final SqlCursor execute() {
        return this.b.b.s0(-1073576620, "SELECT filePath FROM DbNavGraph WHERE lastReadTimeStampMillis < ?", 1, new a(this));
    }

    public final String toString() {
        return "NavGraphDatabase.sq:getExpiredNavGraphFilePaths";
    }
}
