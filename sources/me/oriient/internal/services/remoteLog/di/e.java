package me.oriient.internal.services.remoteLog.di;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.powerManager.PowerManagerAndroid;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(0);
        this.f25531a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PowerManagerAndroid(this.f25531a);
    }
}
