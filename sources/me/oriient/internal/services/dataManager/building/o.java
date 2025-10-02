package me.oriient.internal.services.dataManager.building;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25111a;
    public final /* synthetic */ BuildingsSearchResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, BuildingsSearchResult buildingsSearchResult) {
        super(0);
        this.f25111a = str;
        this.b = buildingsSearchResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f25111a), new Pair("numResults", Integer.valueOf(this.b.getResults().size())));
    }
}
