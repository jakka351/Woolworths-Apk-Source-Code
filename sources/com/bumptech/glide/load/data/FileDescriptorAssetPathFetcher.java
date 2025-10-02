package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FileDescriptorAssetPathFetcher extends AssetPathFetcher<AssetFileDescriptor> {
    public FileDescriptorAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public final void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public final Object f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
