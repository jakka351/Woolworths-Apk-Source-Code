package me.oriient.internal.services.dataManager.floorMetadata;

import com.bumptech.glide.load.model.GlideUrl;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1273c extends GlideUrl {

    /* renamed from: a, reason: collision with root package name */
    public final String f25156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1273c(URL url, String key) {
        super(url);
        Intrinsics.h(url, "url");
        Intrinsics.h(key, "key");
        this.f25156a = key;
    }

    @Override // com.bumptech.glide.load.model.GlideUrl
    public final String getCacheKey() {
        return this.f25156a;
    }
}
