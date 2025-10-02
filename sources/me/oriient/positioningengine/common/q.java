package me.oriient.positioningengine.common;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.positioningengine.ondevice.calibration.database.CalibrationInfoSqlDatabase;

/* loaded from: classes8.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f26389a = new q();

    public q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CalibrationInfoSqlDatabase.Companion companion = CalibrationInfoSqlDatabase.INSTANCE;
        return new me.oriient.positioningengine.ondevice.calibration.g(companion.invoke(new AndroidSqliteDriver(companion.getSchema(), ((ContextProvider) DiKt.getDi().get(Reflection.f24268a.b(ContextProvider.class), null)).getContext(), "me.oriient.positioningengine.ondevice.calibration")));
    }
}
