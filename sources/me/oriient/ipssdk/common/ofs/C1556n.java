package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.MetricImpl;
import me.oriient.ipssdk.common.services.elog.SdkELog;

/* renamed from: me.oriient.ipssdk.common.ofs.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1556n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1556n f25761a = new C1556n();

    public C1556n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new MetricImpl(new SdkELog(ELog.Type.METRIC));
    }
}
