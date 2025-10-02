package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.common.services.elog.SdkELog;

/* renamed from: me.oriient.ipssdk.common.ofs.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1555m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1555m f25760a = new C1555m();

    public C1555m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SdkELog(ELog.Type.LOG);
    }
}
