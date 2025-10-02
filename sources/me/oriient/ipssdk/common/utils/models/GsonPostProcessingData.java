package me.oriient.ipssdk.common.utils.models;

import YU.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/GsonPostProcessingData;", "", "buildingId", "", "(Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GsonPostProcessingData {

    @Nullable
    private final String buildingId;

    public GsonPostProcessingData(@Nullable String str) {
        this.buildingId = str;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof GsonPostProcessingData)) {
            return false;
        }
        String str = ((GsonPostProcessingData) other).buildingId;
        if (str == null && this.buildingId == null) {
            return true;
        }
        String str2 = this.buildingId;
        return str2 != null && str2.equals(str);
    }

    @Nullable
    public final String getBuildingId() {
        return this.buildingId;
    }

    public int hashCode() {
        String str = this.buildingId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return a.o(new StringBuilder("GsonPostProcessingData{buildingId='"), this.buildingId, "'}");
    }
}
