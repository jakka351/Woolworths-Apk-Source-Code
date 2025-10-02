package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.ipssdk.realtime.ofs.u3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1734u3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734u3(int i) {
        super(0);
        this.f26156a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.i(new Pair("value", Integer.valueOf(this.f26156a)));
    }
}
