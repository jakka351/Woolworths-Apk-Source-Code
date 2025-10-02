package au.com.woolworths.feature.shared.receipt.details.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shared.receipt.details.FileDownloader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SharedEReceiptDetailsModule_ProvideFileDownloaderFactory implements Factory<FileDownloader> {
    public static FileDownloader a(SharedEReceiptDetailsModule sharedEReceiptDetailsModule, OkHttpClient okHttpClient, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new FileDownloader(okHttpClient, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
