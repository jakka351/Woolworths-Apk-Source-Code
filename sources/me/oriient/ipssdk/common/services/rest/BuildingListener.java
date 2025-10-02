package me.oriient.ipssdk.common.services.rest;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import me.oriient.ipssdk.common.utils.models.Building;
import me.oriient.ipssdk.common.utils.models.Failable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/BuildingListener;", "Lme/oriient/ipssdk/common/utils/models/Failable;", "onResult", "", lqlqqlq.m006Dm006Dm006Dm, "Lme/oriient/ipssdk/common/utils/models/Building;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BuildingListener extends Failable {
    void onResult(@NotNull Building result);
}
