package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f26345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar) {
        super(0);
        this.f26345a = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s sVar = this.f26345a.f26350a.f26352a;
        return CollectionsKt.c0(sVar.c, sVar.d);
    }
}
