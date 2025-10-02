package me.oriient.internal.services.sensorsManager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes7.dex */
public final class V extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsDataProviderImpl f25562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(SensorsDataProviderImpl sensorsDataProviderImpl, Looper looper) {
        super(looper);
        this.f25562a = sensorsDataProviderImpl;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f25562a.processEventsBatch();
    }
}
