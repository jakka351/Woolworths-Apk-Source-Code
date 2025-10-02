package com.scandit.datacapture.core.internal.sdk.battery;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0006\u001a\u00020\u00032%\u0010\u0007\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\rH&J/\u0010\u000e\u001a\u00020\u00032%\u0010\u0007\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "", "shouldEnableBatterySaving", "", "getShouldEnableBatterySaving", "()Z", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "shouldSaveBattery", "", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingListener;", "removeListener", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BatterySavingManager {
    boolean addListener(@NotNull Function1<? super Boolean, Unit> listener);

    boolean getShouldEnableBatterySaving();

    boolean removeListener(@NotNull Function1<? super Boolean, Unit> listener);
}
