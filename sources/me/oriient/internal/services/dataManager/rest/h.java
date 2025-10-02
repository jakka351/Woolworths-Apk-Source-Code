package me.oriient.internal.services.dataManager.rest;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpResponse;

/* loaded from: classes7.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function1 function1) {
        super(1);
        this.f25406a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpResponse.StringResponse stringResponse = (HttpResponse.StringResponse) obj;
        Intrinsics.h(stringResponse, "stringResponse");
        return this.f25406a.invoke(stringResponse.getString());
    }
}
