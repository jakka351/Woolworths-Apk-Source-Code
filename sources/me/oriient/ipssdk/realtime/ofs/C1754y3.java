package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.PositioningKotlinHelper;

/* renamed from: me.oriient.ipssdk.realtime.ofs.y3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1754y3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PositioningKotlinHelper f26179a;
    public final /* synthetic */ IPSCompletionListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754y3(PositioningKotlinHelper positioningKotlinHelper, IPSCompletionListener iPSCompletionListener) {
        super(0);
        this.f26179a = positioningKotlinHelper;
        this.b = iPSCompletionListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PositioningKotlinHelper.access$getLogger(this.f26179a).d("PositioningKotlinHelper", "onMaxRetriesReached() called");
        ELog eLogAccess$getELog = PositioningKotlinHelper.access$getELog(this.f26179a);
        IPSError iPSError = this.f26179a.e;
        Pair pair = new Pair("errorCode", iPSError != null ? Integer.valueOf(iPSError.getCode()) : null);
        IPSError iPSError2 = this.f26179a.e;
        eLogAccess$getELog.e("PositioningKotlinHelper", "start positioning max retries reached", MapsKt.j(pair, new Pair("errorMessage", iPSError2 != null ? iPSError2.getMessage() : null)));
        IPSCompletionListener iPSCompletionListener = this.b;
        IPSError error = this.f26179a.e;
        if (error == null) {
            error = new Error("start positioning failed", 0, 1);
        }
        iPSCompletionListener.onError(error);
        return Unit.f24250a;
    }
}
