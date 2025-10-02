package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* renamed from: me.oriient.ipssdk.realtime.ofs.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1720s0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1720s0 f26142a = new C1720s0();

    public C1720s0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FloorMetadataWithImage it = (FloorMetadataWithImage) obj;
        Intrinsics.h(it, "it");
        return CoreLogic.access$createFloorMapFromBitmap(CoreLogic.INSTANCE, it);
    }
}
