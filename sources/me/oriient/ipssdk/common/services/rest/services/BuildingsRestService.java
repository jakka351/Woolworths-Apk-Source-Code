package me.oriient.ipssdk.common.services.rest.services;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.services.rest.RestRequest;
import me.oriient.ipssdk.common.utils.IBuildingsSearchListener;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/services/BuildingsRestService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "searchBuildingByNameJava", "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "user", "Lme/oriient/ipssdk/base/auth/User;", "userSessionId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/common/utils/IBuildingsSearchListener;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BuildingsRestService extends DiProvidable {
    @NotNull
    RestRequest searchBuildingByNameJava(@NotNull User user, @NotNull String userSessionId, @NotNull String name, @NotNull IBuildingsSearchListener listener);
}
