package com.scandit.datacapture.core.internal.sdk.capture;

import android.content.res.AssetManager;
import com.scandit.datacapture.core.O3;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/capture/AssetResourceLoader;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeResourceLoader;", "", "Lcom/scandit/datacapture/core/internal/sdk/capture/ResourceId;", "identifier", "", "load", "Landroid/content/res/AssetManager;", "assets", "<init>", "(Landroid/content/res/AssetManager;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AssetResourceLoader extends NativeResourceLoader {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f18666a;

    public AssetResourceLoader(@NotNull AssetManager assets) {
        Intrinsics.h(assets, "assets");
        this.f18666a = assets;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeResourceLoader
    @NotNull
    public byte[] load(@NotNull String identifier) throws IOException {
        Intrinsics.h(identifier, "identifier");
        try {
            InputStream it = this.f18666a.open(identifier);
            try {
                Intrinsics.g(it, "it");
                byte[] bArrB = ByteStreamsKt.b(it);
                it.close();
                return bArrB;
            } finally {
            }
        } catch (Exception unused) {
            O3.a("Failed to load assets `" + identifier + "`.");
            return new byte[0];
        }
    }
}
