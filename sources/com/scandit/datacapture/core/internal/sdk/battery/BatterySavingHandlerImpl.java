package com.scandit.datacapture.core.internal.sdk.battery;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.source.BatterySavingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\n\u001a\u00020\u00072)\u0010\t\u001a%\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\bH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandlerImpl;", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "shouldSaveBattery", "", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingListener;", "cameraBatterySavingListener", "setListener", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "batterySavingMode", "setBatterySavingMode", "getShouldSaveBattery", "()Z", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "batterySavingManager", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BatterySavingHandlerImpl implements BatterySavingHandler {

    /* renamed from: a, reason: collision with root package name */
    private final BatterySavingManager f18657a;
    private BatterySavingMode b;
    private Function1 c;
    private final Function1 d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatterySavingMode.values().length];
            try {
                iArr[BatterySavingMode.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatterySavingMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatterySavingMode.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BatterySavingHandlerImpl(@NotNull BatterySavingManager batterySavingManager) {
        Intrinsics.h(batterySavingManager, "batterySavingManager");
        this.f18657a = batterySavingManager;
        this.b = BatterySavingMode.OFF;
        this.d = new a(this);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public boolean getShouldSaveBattery() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return this.f18657a.getShouldEnableBatterySaving();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public void setBatterySavingMode(@NotNull BatterySavingMode batterySavingMode) {
        Intrinsics.h(batterySavingMode, "batterySavingMode");
        this.b = batterySavingMode;
        int i = WhenMappings.$EnumSwitchMapping$0[batterySavingMode.ordinal()];
        if (i == 1) {
            this.f18657a.removeListener(this.d);
            Function1 function1 = this.c;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.f18657a.addListener(this.d);
        } else {
            this.f18657a.removeListener(this.d);
            Function1 function12 = this.c;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public void setListener(@Nullable Function1<? super Boolean, Unit> cameraBatterySavingListener) {
        this.c = cameraBatterySavingListener;
        if (cameraBatterySavingListener != null) {
            cameraBatterySavingListener.invoke(Boolean.valueOf(getShouldSaveBattery()));
        }
    }
}
