package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f26343a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar) {
        super(0);
        this.f26343a = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s sVar = this.f26343a.f26350a.f26352a;
        return CollectionsKt.c0(sVar.c, sVar.d);
    }
}
