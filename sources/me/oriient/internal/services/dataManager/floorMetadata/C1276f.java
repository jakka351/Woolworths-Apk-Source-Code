package me.oriient.internal.services.dataManager.floorMetadata;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.Outcome;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1276f implements RequestListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f25159a;

    public C1276f(SafeContinuation safeContinuation) {
        this.f25159a = safeContinuation;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(GlideException glideException, Object model, Target target, boolean z) {
        Intrinsics.h(model, "model");
        Intrinsics.h(target, "target");
        StringBuilder sb = new StringBuilder("Floor image loading failed: ");
        sb.append(glideException != null ? glideException.getMessage() : null);
        this.f25159a.resumeWith(new Outcome.Failure(new InternalError(sb.toString())));
        return true;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onResourceReady(Object obj, Object model, Target target, DataSource dataSource, boolean z) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.h(resource, "resource");
        Intrinsics.h(model, "model");
        Intrinsics.h(target, "target");
        Intrinsics.h(dataSource, "dataSource");
        this.f25159a.resumeWith(new Outcome.Success(resource));
        return true;
    }
}
