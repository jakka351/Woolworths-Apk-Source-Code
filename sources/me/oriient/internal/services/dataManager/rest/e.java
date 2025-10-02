package me.oriient.internal.services.dataManager.rest;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OriientError f25404a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OriientError oriientError, int i, String str) {
        super(0);
        this.f25404a = oriientError;
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f25404a.getMessage()), new Pair("errorCode", Integer.valueOf(this.b)), new Pair("destinationUrl", this.c), new Pair("restMethod", "GET"));
    }
}
