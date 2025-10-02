package me.oriient.internal.services.dataManager.building;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* renamed from: me.oriient.internal.services.dataManager.building.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1239g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25103a;
    public final /* synthetic */ OriientError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239g(String str, OriientError oriientError) {
        super(0);
        this.f25103a = str;
        this.b = oriientError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f25103a), new Pair("errorMessage", this.b.getMessage()));
    }
}
