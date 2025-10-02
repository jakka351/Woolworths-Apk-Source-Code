package me.oriient.ipssdk.realtime.services.rest;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.api.models.IPSLocationTag;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import me.oriient.ipssdk.ips.IPSContentSearchPage;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH&J<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J<\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H&J8\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u001b"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/ContentRestService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "fetch", "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "page", "Lme/oriient/ipssdk/ips/IPSContentSearchPage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;", "getAllRegions", "buildingId", "", "user", "Lme/oriient/ipssdk/base/auth/User;", "userSessionId", "Lme/oriient/ipssdk/realtime/services/rest/IRegionsListener;", "getLocationTagsById", "locationTagIds", "", "Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;", "Lme/oriient/ipssdk/api/models/IPSLocationTag;", "getRegionsById", "regionsIds", "Lme/oriient/ipssdk/api/models/IPSRegion;", "search", "pageSize", "", "filter", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ContentRestService extends DiProvidable {
    @NotNull
    RestRequest fetch(@NotNull IPSContentSearchPage page, @NotNull IPSContentSearchListener listener);

    @NotNull
    RestRequest getAllRegions(@NotNull String buildingId, @NotNull User user, @NotNull String userSessionId, @NotNull IRegionsListener listener);

    @NotNull
    RestRequest getLocationTagsById(@NotNull String buildingId, @NotNull List<String> locationTagIds, @NotNull User user, @NotNull String userSessionId, @NotNull IPSGetByIdListener<IPSLocationTag> listener);

    @NotNull
    RestRequest getRegionsById(@NotNull String buildingId, @NotNull List<String> regionsIds, @NotNull User user, @NotNull String userSessionId, @NotNull IPSGetByIdListener<IPSRegion> listener);

    @NotNull
    RestRequest search(@NotNull String buildingId, int pageSize, @NotNull String filter, @NotNull User user, @NotNull String userSessionId, @NotNull IPSContentSearchListener listener);
}
