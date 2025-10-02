package com.dynatrace.android.compose;

import YU.a;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/SwipeableComposeCallback;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwipeableComposeCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14150a;

    static {
        boolean z = Global.f14077a;
        f14150a = "dtxSwipeableCompose";
    }

    public static void a(SwipeableState swipeableState) {
        float fA;
        String string;
        MutableState mutableState = swipeableState.c;
        if (Global.b.get()) {
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
            Object d = snapshotMutableStateImpl.getD();
            MutableFloatState mutableFloatState = swipeableState.e;
            Float f = (Float) ((SnapshotMutableStateImpl) swipeableState.h).getD();
            if (f != null) {
                fA = f.floatValue();
            } else {
                float fFloatValue = mutableFloatState.getD().floatValue();
                Float fB = SwipeableKt.b(snapshotMutableStateImpl.getD(), swipeableState.b());
                fA = SwipeableKt.a(fFloatValue, fB != null ? fB.floatValue() : mutableFloatState.getD().floatValue(), swipeableState.b().keySet(), (Function2) ((SnapshotMutableStateImpl) swipeableState.m).getD(), BitmapDescriptorFactory.HUE_RED, Float.POSITIVE_INFINITY);
            }
            Object d2 = swipeableState.b().get(Float.valueOf(fA));
            if (d2 == null) {
                d2 = snapshotMutableStateImpl.getD();
            }
            SwipeableInfo swipeableInfo = new SwipeableInfo(d, d2, swipeableState);
            if (Global.f14077a) {
                Utility.h(f14150a, "onUA: " + swipeableInfo);
            }
            String strA = SemanticsManager.a();
            if (strA != null) {
                StringBuilder sbU = a.u("Swipe ", strA, " to ");
                String strA2 = swipeableInfo.a();
                sbU.append(StringsKt.a0(JwtParser.SEPARATOR_CHAR, strA2, strA2));
                sbU.append(' ');
                sbU.append(String.valueOf(d2));
                string = sbU.toString();
            } else {
                StringBuilder sb = new StringBuilder("Swipe to ");
                String strA3 = swipeableInfo.a();
                sb.append(StringsKt.a0(JwtParser.SEPARATOR_CHAR, strA3, strA3));
                sb.append(' ');
                sb.append(String.valueOf(d2));
                string = sb.toString();
            }
            DTXAutoActionWrapper dTXAutoActionWrapperA = userActionFactoryImpl.a(measurementProviderImpl.a(), string);
            dTXAutoActionWrapperA.g("state class", swipeableInfo.a());
            dTXAutoActionWrapperA.g("fromState", String.valueOf(d));
            dTXAutoActionWrapperA.g("toState", String.valueOf(d2));
            dTXAutoActionWrapperA.g("type", "swipe");
            dTXAutoActionWrapperA.h();
        }
    }
}
