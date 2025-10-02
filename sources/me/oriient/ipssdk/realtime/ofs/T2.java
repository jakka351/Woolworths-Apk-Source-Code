package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.api.models.IPSError;

/* loaded from: classes8.dex */
public final class T2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26012a;
    public final /* synthetic */ IPSError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(String str, IPSError iPSError) {
        super(0);
        this.f26012a = str;
        this.b = iPSError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26012a), new Pair("errorMessage", this.b.getMessage()));
    }
}
