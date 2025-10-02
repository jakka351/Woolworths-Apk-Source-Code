package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.proximity.local.WalkingDistanceLocalProximityLocationResolver;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class S4 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalkingDistanceLocalProximityLocationResolver f26008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(WalkingDistanceLocalProximityLocationResolver walkingDistanceLocalProximityLocationResolver) {
        super(1);
        this.f26008a = walkingDistanceLocalProximityLocationResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NavigationError error = (NavigationError) obj;
        Intrinsics.h(error, "error");
        WalkingDistanceLocalProximityLocationResolver.access$getLogger(this.f26008a).e("WalkingDistanceLocalPro", "failed to calculate routes", error);
        return new SdkError.General(error.getMessage());
    }
}
