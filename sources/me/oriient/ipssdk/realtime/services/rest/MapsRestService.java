package me.oriient.ipssdk.realtime.services.rest;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/MapsRestService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getAllMapEntitiesJava", "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "user", "Lme/oriient/ipssdk/base/auth/User;", "userSessionId", "", "mapId", "floorId", "floorOrder", "", "buildingId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/realtime/services/rest/IRegionsTriggersListener;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MapsRestService extends DiProvidable {
    @NotNull
    RestRequest getAllMapEntitiesJava(@NotNull User user, @NotNull String userSessionId, @NotNull String mapId, @NotNull String floorId, int floorOrder, @NotNull String buildingId, @NotNull IRegionsTriggersListener listener);
}
