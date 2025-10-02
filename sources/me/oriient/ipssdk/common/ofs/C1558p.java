package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.common.services.elog.ELogIOManagerImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1558p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1558p f25763a = new C1558p();

    public C1558p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ELogIOManagerImpl();
    }
}
