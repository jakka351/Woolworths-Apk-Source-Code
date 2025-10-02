package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithSvgImage;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* renamed from: me.oriient.ipssdk.realtime.ofs.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1709q0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1709q0 f26131a = new C1709q0();

    public C1709q0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FloorMetadataWithSvgImage it = (FloorMetadataWithSvgImage) obj;
        Intrinsics.h(it, "it");
        return CoreLogic.access$createFloorMapFromSVG(CoreLogic.INSTANCE, it);
    }
}
