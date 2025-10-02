package me.oriient.ipssdk.common.services.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCancelable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/CancellableRestRequest;", "Lme/oriient/ipssdk/api/models/IPSCancelable;", "request", "Lme/oriient/ipssdk/common/services/rest/RestRequest;", "(Lme/oriient/ipssdk/common/services/rest/RestRequest;)V", "cancel", "", "getId", "", "isCanceled", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CancellableRestRequest implements IPSCancelable {

    @NotNull
    private final RestRequest request;

    public CancellableRestRequest(@NotNull RestRequest request) {
        Intrinsics.h(request, "request");
        this.request = request;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public void cancel() {
        this.request.cancel();
    }

    @NotNull
    public final String getId() {
        return this.request.getId();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public boolean isCanceled() {
        return this.request.isCanceled();
    }
}
