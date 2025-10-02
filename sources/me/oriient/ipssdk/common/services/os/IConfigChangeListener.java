package me.oriient.ipssdk.common.services.os;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/common/services/os/IConfigChangeListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "onConfigChanged", "", MlModel.MODEL_FILE_SUFFIX, "(Ljava/lang/Object;)V", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IConfigChangeListener<T> {
    void onConfigChanged(T config);
}
