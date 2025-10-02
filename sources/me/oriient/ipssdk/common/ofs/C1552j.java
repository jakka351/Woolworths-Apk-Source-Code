package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1552j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1552j f25755a = new C1552j();

    public C1552j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BuildingsRestServiceImpl();
    }
}
