package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import java.util.List;

@KeepForSdk
/* loaded from: classes6.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public abstract List d(MLTaskInput mLTaskInput);
}
