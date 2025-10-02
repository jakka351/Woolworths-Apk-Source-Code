package me.oriient.internal.services.dataManager.floorMetadata;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class B extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloorMetadata f25134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(FloorMetadata floorMetadata) {
        super(1);
        this.f25134a = floorMetadata;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap image = (Bitmap) obj;
        Intrinsics.h(image, "image");
        return new FloorMetadataWithImage(this.f25134a, image);
    }
}
