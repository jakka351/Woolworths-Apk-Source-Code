package me.oriient.positioningengine.ondevice.ml;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\ba\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/ml/MlModel;", "", "", "getInputSize", "()I", "", "rawInput", "", "predict", "([F)[D", "", "close", "()V", "Companion", "me/oriient/positioningengine/ondevice/ml/a", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MlModel {

    @NotNull
    public static final a Companion = a.f26452a;

    @NotNull
    public static final String MODEL_FILE_SUFFIX = "config";

    void close();

    int getInputSize();

    @NotNull
    double[] predict(@NotNull float[] rawInput);
}
