package me.oriient.internal.services.uploadingManager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class G extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderItem f25616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(DataUploaderItem dataUploaderItem) {
        super(1);
        this.f25616a = dataUploaderItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries it = (DbUploadItemQueries) obj;
        Intrinsics.h(it, "it");
        it.deleteItem(this.f25616a.getId());
        return Unit.f24250a;
    }
}
