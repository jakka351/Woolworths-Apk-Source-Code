package me.oriient.ipssdk.realtime;

import kotlin.Metadata;
import me.oriient.ipssdk.realtime.utils.RealtimeBuildData;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/RealtimeBuildDataImpl;", "Lme/oriient/ipssdk/realtime/utils/RealtimeBuildData;", "()V", "configSdkType", "", "getConfigSdkType", "()Ljava/lang/String;", "defaultConfigResId", "", "getDefaultConfigResId$annotations", "getDefaultConfigResId", "()I", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealtimeBuildDataImpl implements RealtimeBuildData {
    public static /* synthetic */ void getDefaultConfigResId$annotations() {
    }

    @Override // me.oriient.ipssdk.realtime.utils.RealtimeBuildData
    @NotNull
    public String getConfigSdkType() {
        return "Regular";
    }

    @Override // me.oriient.ipssdk.realtime.utils.RealtimeBuildData
    public int getDefaultConfigResId() {
        return R.raw.remote_config;
    }
}
