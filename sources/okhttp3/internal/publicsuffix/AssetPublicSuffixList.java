package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.PlatformRegistry;
import okio.Okio;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public static final String g;
    public final String f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        g = "PublicSuffixDatabase.list";
    }

    public AssetPublicSuffixList() {
        this(0);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final Source b() throws IOException {
        AssetManager assets;
        PlatformRegistry.f26753a.getClass();
        Platform.f26752a.getClass();
        Object obj = Platform.b;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        Context d = contextAwarePlatform != null ? contextAwarePlatform.getD() : null;
        if (d == null || (assets = d.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(this.f);
        Intrinsics.g(inputStreamOpen, "open(...)");
        return Okio.h(inputStreamOpen);
    }

    public AssetPublicSuffixList(int i) {
        String path = g;
        Intrinsics.h(path, "path");
        this.f = path;
    }
}
