package me.oriient.internal.services.dataManager.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpContent;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25403a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z, boolean z2) {
        super(1);
        this.f25403a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder invoke = (RequestBuilder) obj;
        Intrinsics.h(invoke, "$this$invoke");
        invoke.setUrl(this.f25403a);
        invoke.setPrintResponseBodyToLog(this.b);
        if (this.c) {
            invoke.setContentType(HttpContent.CONTENT_NONE);
        }
        return Unit.f24250a;
    }
}
