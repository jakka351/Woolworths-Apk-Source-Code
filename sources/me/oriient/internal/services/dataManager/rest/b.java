package me.oriient.internal.services.dataManager.rest;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpResponse;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1) {
        super(1);
        this.f25401a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpResponse.BytesResponse bytesResponse = (HttpResponse.BytesResponse) obj;
        Intrinsics.h(bytesResponse, "bytesResponse");
        return this.f25401a.invoke(bytesResponse.getBytes());
    }
}
