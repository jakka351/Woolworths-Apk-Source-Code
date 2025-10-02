package me.oriient.internal.services.sensorsManager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SensorsManagerImpl sensorsManagerImpl, Looper looper) {
        super(looper);
        Intrinsics.h(looper, "looper");
        this.f25566a = sensorsManagerImpl;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        Intrinsics.h(msg, "msg");
        this.f25566a.processEventsBatch();
    }
}
