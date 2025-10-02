package me.oriient.ipssdk.common.utils;

import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.common.R;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/common/utils/SdkBuildData;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "<init>", "()V", "", "a", "I", "getDefaultConfigResId", "()I", "defaultConfigResId", "", "configSdkType", "Ljava/lang/String;", "getConfigSdkType", "()Ljava/lang/String;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SdkBuildData implements DiProvidable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int defaultConfigResId = R.raw.local_config_defaults;

    @NotNull
    public final String getConfigSdkType() {
        return "Common";
    }

    public final int getDefaultConfigResId() {
        return this.defaultConfigResId;
    }
}
