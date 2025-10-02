package me.oriient.navigation.common.models;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z) {
        super(0);
        this.f26257a = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f26257a);
    }
}
