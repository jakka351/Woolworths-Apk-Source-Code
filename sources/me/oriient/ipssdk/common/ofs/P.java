package me.oriient.ipssdk.common.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes2.dex */
public final class P extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25728a;
    public final /* synthetic */ Outcome.Failure b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String str, Outcome.Failure failure) {
        super(0);
        this.f25728a = str;
        this.b = failure;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f25728a), new Pair("errorMessage", ((OriientError) this.b.getValue()).getMessage()));
    }
}
