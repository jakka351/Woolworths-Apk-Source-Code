package me.oriient.internal.services.uploadingManager.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpResponse;

/* loaded from: classes7.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f25654a = new j();

    public j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpResponse.EmptyResponse it = (HttpResponse.EmptyResponse) obj;
        Intrinsics.h(it, "it");
        return Unit.f24250a;
    }
}
