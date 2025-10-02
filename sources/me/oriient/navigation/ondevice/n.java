package me.oriient.navigation.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationError f26293a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NavigationError navigationError, String str) {
        super(0);
        this.f26293a = navigationError;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f26293a.getMessage()), new Pair("buildingId", this.b));
    }
}
