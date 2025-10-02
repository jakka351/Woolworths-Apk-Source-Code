package me.oriient.navigation.ondevice;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NdkBridgeImpl f26354a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(NdkBridgeImpl ndkBridgeImpl, String str, List list, int i) {
        super(0);
        this.f26354a = ndkBridgeImpl;
        this.b = str;
        this.c = list;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NavigationError.AlgoCoreError {
        NavigationOutput navigationOutputFindRouteInBuildingNative = this.f26354a.findRouteInBuildingNative(new NavigationInput(this.b, (NavigationWaypoint[]) this.c.toArray(new NavigationWaypoint[0]), this.d));
        if (navigationOutputFindRouteInBuildingNative != null) {
            return navigationOutputFindRouteInBuildingNative;
        }
        throw new NavigationError.AlgoCoreError("Ndk Failure");
    }
}
