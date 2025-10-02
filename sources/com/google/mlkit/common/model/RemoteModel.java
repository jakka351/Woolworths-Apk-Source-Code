package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;

/* loaded from: classes6.dex */
public abstract class RemoteModel {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumMap f15975a;

    static {
        new EnumMap(BaseModel.class);
        f15975a = new EnumMap(BaseModel.class);
    }

    public static String a() {
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f15975a.get(null)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RemoteModel) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null);
    }

    public final String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModel");
        zzqVarZzb.zza("modelName", null);
        zzqVarZzb.zza("baseModel", null);
        zzqVarZzb.zza("modelType", null);
        return zzqVarZzb.toString();
    }
}
