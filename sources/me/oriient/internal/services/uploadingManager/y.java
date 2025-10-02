package me.oriient.internal.services.uploadingManager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.rest.DataUploaderRest;

/* loaded from: classes7.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f25663a = new y();

    public y() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataUploaderRest.FileUploadDestinationData it = (DataUploaderRest.FileUploadDestinationData) obj;
        Intrinsics.h(it, "it");
        return Unit.f24250a;
    }
}
