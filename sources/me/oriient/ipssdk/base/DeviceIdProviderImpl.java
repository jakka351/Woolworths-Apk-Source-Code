package me.oriient.ipssdk.base;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/base/DeviceIdProviderImpl;", "Lme/oriient/internal/infra/utils/core/DeviceIdProvider;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "Companion", "me/oriient/ipssdk/base/a", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DeviceIdProviderImpl implements DeviceIdProvider {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    public DeviceIdProviderImpl() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((ContextProvider) DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(ContextProvider.class)).getD()).getContext());
        Intrinsics.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        if (defaultSharedPreferences.contains("ips_device_id")) {
            String string = defaultSharedPreferences.getString("ips_device_id", "corrupted");
            this.deviceId = string != null ? string : "corrupted";
        } else {
            this.deviceId = androidx.constraintlayout.core.state.a.h("toString(...)");
            defaultSharedPreferences.edit().putString("ips_device_id", getDeviceId()).apply();
        }
    }

    @Override // me.oriient.internal.infra.utils.core.DeviceIdProvider
    @NotNull
    public String getDeviceId() {
        return this.deviceId;
    }
}
