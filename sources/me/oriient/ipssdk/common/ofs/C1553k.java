package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1553k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1553k f25756a = new C1553k();

    public C1553k() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LiveGeofenceManagerImpl();
    }
}
