package me.oriient.navigation.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.services.dataModel.navigation.NavigationConfigResponse;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfigResponse;

/* renamed from: me.oriient.navigation.common.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1782x implements InterfaceC1781w {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f26270a;
    public final MutableStateFlow b;

    public C1782x() {
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        this.f26270a = StateFlowKt.a(new NavigationConfigResponse((Boolean) null, d, (Boolean) null, d2, d3, d4, d5, d6, (Boolean) null, d7, d8, 2047, (DefaultConstructorMarker) null).toNavigationConfig());
        byte b = 0 == true ? 1 : 0;
        byte b2 = 0 == true ? 1 : 0;
        byte b3 = 0 == true ? 1 : 0;
        this.b = StateFlowKt.a(new TurnByTurnConfigResponse(d, (Double) b2, d2, d3, d4, d5, d6, (Double) b3, d7, d8, (Double) null, (Double) b, (Double) null, (Double) null, (Double) null, 32767, (DefaultConstructorMarker) null).toTurnByTurnConfig());
    }
}
