package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface TransferListener {
    void b(DataSpec dataSpec, boolean z);

    void c(DataSpec dataSpec, boolean z);

    void d(DataSpec dataSpec, boolean z, int i);

    void g(DataSpec dataSpec, boolean z);
}
