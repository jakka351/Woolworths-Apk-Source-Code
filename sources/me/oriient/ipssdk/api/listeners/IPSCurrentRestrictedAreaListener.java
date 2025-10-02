package me.oriient.ipssdk.api.listeners;

import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSRestrictedArea;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/api/listeners/IPSCurrentRestrictedAreaListener;", "", "onCurrentRestrictedAreaChange", "", "restrictedArea", "Lme/oriient/ipssdk/api/models/IPSRestrictedArea;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IPSCurrentRestrictedAreaListener {
    void onCurrentRestrictedAreaChange(@Nullable IPSRestrictedArea restrictedArea);
}
