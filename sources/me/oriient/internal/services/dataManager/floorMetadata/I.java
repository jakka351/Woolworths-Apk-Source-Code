package me.oriient.internal.services.dataManager.floorMetadata;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloorMetadata f25140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(FloorMetadata floorMetadata) {
        super(1);
        this.f25140a = floorMetadata;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap image = (Bitmap) obj;
        Intrinsics.h(image, "image");
        return new FloorMetadataWithImage(this.f25140a, image);
    }
}
