package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.positioning.PositioningMetadataProviderImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.k4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1677k4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1677k4 f26101a = new C1677k4();

    public C1677k4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PositioningMetadataProviderImpl();
    }
}
