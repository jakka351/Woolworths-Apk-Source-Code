package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FileDescriptorLocalUriFetcher extends LocalUriFetcher<ParcelFileDescriptor> {
    public FileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final void e(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(a.m(uri, "FileDescriptor is null for: "));
    }
}
