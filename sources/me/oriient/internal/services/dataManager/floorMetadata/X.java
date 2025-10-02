package me.oriient.internal.services.dataManager.floorMetadata;

import com.caverock.androidsvg.SVG;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class X extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloorMetadata f25152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(FloorMetadata floorMetadata) {
        super(1);
        this.f25152a = floorMetadata;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SVG image = (SVG) obj;
        Intrinsics.h(image, "image");
        return new FloorMetadataWithSvgImage(this.f25152a, image);
    }
}
