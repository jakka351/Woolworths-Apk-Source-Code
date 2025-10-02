package com.scandit.datacapture.core.internal.sdk.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\n\u001a\u00020\u00032%\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bH\u0016J/\u0010\u000b\u001a\u00020\u00032%\u0010\t\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bH\u0016J\u000f\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManagerImpl;", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "shouldSaveBattery", "", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "deregisterContextListeners$scandit_capture_core", "()V", "deregisterContextListeners", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "isListeningToPowerEvents", "()Z", "getShouldEnableBatterySaving", "shouldEnableBatterySaving", "<init>", "(Landroid/content/Context;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BatterySavingManagerImpl implements BatterySavingManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    static final /* synthetic */ KProperty[] j;
    private static BatterySavingManager k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;
    private boolean b;
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$1 c;
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$2 d;
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$3 e;
    private final Set f;
    private final PowerManager g;
    private final BatterySavingManagerImpl$powerReceiver$1 h;
    private final PowerManager.OnThermalStatusChangedListener i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManagerImpl$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "sharedInstance", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized BatterySavingManager sharedInstance(@NotNull Context context) {
            BatterySavingManager batterySavingManagerImpl;
            Intrinsics.h(context, "context");
            batterySavingManagerImpl = BatterySavingManagerImpl.k;
            if (batterySavingManagerImpl == null) {
                batterySavingManagerImpl = new BatterySavingManagerImpl(context);
                BatterySavingManagerImpl.k = batterySavingManagerImpl;
            }
            return batterySavingManagerImpl;
        }

        private Companion() {
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        j = new KProperty[]{reflectionFactory.e(new MutablePropertyReference1Impl(reflectionFactory.b(BatterySavingManagerImpl.class), "_isBatterySavingEnabled", "get_isBatterySavingEnabled()Z")), reflectionFactory.e(new MutablePropertyReference1Impl(reflectionFactory.b(BatterySavingManagerImpl.class), "_isPowerSaveEnabled", "get_isPowerSaveEnabled()Z")), reflectionFactory.e(new MutablePropertyReference1Impl(reflectionFactory.b(BatterySavingManagerImpl.class), "_isRunningHot", "get_isRunningHot()Z"))};
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$powerReceiver$1] */
    @VisibleForTesting
    public BatterySavingManagerImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.context = context;
        final Boolean bool = Boolean.FALSE;
        this.c = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                BatterySavingManagerImpl.access$notifyBatterySavingChange(this, newValue.booleanValue());
            }
        };
        this.d = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                boolean zBooleanValue = newValue.booleanValue();
                BatterySavingManagerImpl batterySavingManagerImpl = this;
                batterySavingManagerImpl.c.setValue(batterySavingManagerImpl, BatterySavingManagerImpl.j[0], Boolean.valueOf(zBooleanValue | batterySavingManagerImpl.e.getValue(batterySavingManagerImpl, BatterySavingManagerImpl.j[2]).booleanValue()));
            }
        };
        this.e = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                boolean zBooleanValue = newValue.booleanValue();
                BatterySavingManagerImpl batterySavingManagerImpl = this;
                batterySavingManagerImpl.c.setValue(batterySavingManagerImpl, BatterySavingManagerImpl.j[0], Boolean.valueOf(zBooleanValue | batterySavingManagerImpl.d.getValue(batterySavingManagerImpl, BatterySavingManagerImpl.j[1]).booleanValue()));
            }
        };
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.g(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f = setNewSetFromMap;
        this.g = (PowerManager) context.getSystemService(PowerManager.class);
        this.h = new BroadcastReceiver() { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$powerReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context2, @Nullable Intent intent) {
                BatterySavingManagerImpl batterySavingManagerImpl = this.f18662a;
                PowerManager powerManager = batterySavingManagerImpl.g;
                batterySavingManagerImpl.d.setValue(batterySavingManagerImpl, BatterySavingManagerImpl.j[1], Boolean.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false));
                BatterySavingManagerImpl.access$cleanup(this.f18662a);
            }
        };
        this.i = Build.VERSION.SDK_INT >= 29 ? new PowerManager.OnThermalStatusChangedListener() { // from class: com.scandit.datacapture.core.internal.sdk.battery.b
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i) {
                BatterySavingManagerImpl.a(this.f18664a, i);
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BatterySavingManagerImpl this$0, int i) {
        Intrinsics.h(this$0, "this$0");
        this$0.e.setValue(this$0, j[2], Boolean.valueOf(i >= 3));
        if (this$0.f.isEmpty()) {
            this$0.deregisterContextListeners$scandit_capture_core();
        }
    }

    public static final void access$cleanup(BatterySavingManagerImpl batterySavingManagerImpl) {
        if (batterySavingManagerImpl.f.isEmpty()) {
            batterySavingManagerImpl.deregisterContextListeners$scandit_capture_core();
        }
    }

    public static final void access$notifyBatterySavingChange(BatterySavingManagerImpl batterySavingManagerImpl, boolean z) {
        Iterator it = batterySavingManagerImpl.f.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(z));
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public boolean addListener(@NotNull Function1<? super Boolean, Unit> listener) {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        PowerManager powerManager2;
        Intrinsics.h(listener, "listener");
        if (!this.f.add(listener)) {
            return false;
        }
        if (this.f.size() == 1) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        PowerManager powerManager3 = this.g;
                        boolean zIsPowerSaveMode = powerManager3 != null ? powerManager3.isPowerSaveMode() : false;
                        BatterySavingManagerImpl$special$$inlined$distinctObservable$2 batterySavingManagerImpl$special$$inlined$distinctObservable$2 = this.d;
                        KProperty<?>[] kPropertyArr = j;
                        batterySavingManagerImpl$special$$inlined$distinctObservable$2.setValue(this, kPropertyArr[1], Boolean.valueOf(zIsPowerSaveMode));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 29 && (powerManager2 = this.g) != null) {
                            setValue(this, kPropertyArr[2], Boolean.valueOf(powerManager2.getCurrentThermalStatus() >= 3));
                        }
                        this.context.registerReceiver(this.h, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                        if (i >= 29 && (onThermalStatusChangedListener = this.i) != null && (powerManager = this.g) != null) {
                            powerManager.addThermalStatusListener(onThermalStatusChangedListener);
                        }
                        this.b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        listener.invoke(Boolean.valueOf(getShouldEnableBatterySaving()));
        return true;
    }

    @VisibleForTesting
    public final synchronized void deregisterContextListeners$scandit_capture_core() {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        try {
            if (this.b) {
                this.context.unregisterReceiver(this.h);
                if (Build.VERSION.SDK_INT >= 29 && (onThermalStatusChangedListener = this.i) != null && (powerManager = this.g) != null) {
                    powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
                }
                this.b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public boolean getShouldEnableBatterySaving() {
        return getValue(this, j[0]).booleanValue();
    }

    /* renamed from: isListeningToPowerEvents, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public boolean removeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.h(listener, "listener");
        boolean zRemove = this.f.remove(listener);
        if (zRemove && this.f.isEmpty()) {
            deregisterContextListeners$scandit_capture_core();
        }
        return zRemove;
    }
}
