package me.oriient.internal.services.remoteLog.di;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.networkManager.NetworkManagerAndroid;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.f25529a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new NetworkManagerAndroid(this.f25529a, null, 2, null);
    }
}
